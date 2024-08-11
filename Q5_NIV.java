// ANÁLISE E PROJETO DE SOFTWARE ORIENTADO A OBJETOS-P01-2024-2
//
// ALUNO: VINÍCIUS SANTOS SILVA
// RGA: 2022.1904.014-0
//
// QUESTÃO 5 - NIVELAMENTO
//

public class Cliente {
    private String nome;
    private String cpf;
    private List<ContaCorrente> contasCorrentes;
    private List<ContaPoupanca> contasPoupanca;
    private List<Dependente> dependentes;

    // Construtor
    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.contasCorrentes = new ArrayList<>();
        this.contasPoupanca = new ArrayList<>();
        this.dependentes = new ArrayList<>();
    }

    // Métodos para adicionar contas e dependentes
    public void adicionarContaCorrente(ContaCorrente conta) {
        contasCorrentes.add(conta);
    }

    public void adicionarContaPoupanca(ContaPoupanca conta) {
        contasPoupanca.add(conta);
    }

    public void adicionarDependente(Dependente dependente) {
        dependentes.add(dependente);
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<ContaCorrente> getContasCorrentes() {
        return contasCorrentes;
    }

    public List<ContaPoupanca> getContasPoupanca() {
        return contasPoupanca;
    }

    public List<Dependente> getDependentes() {
        return dependentes;
    }
}


public class ContaCorrente {
    private String numero;
    private double saldo;
    private List<AplicacaoPreFixada> aplicacoesPreFixadas;

    // Construtor
    public ContaCorrente(String numero) {
        this.numero = numero;
        this.saldo = 0.0;
        this.aplicacoesPreFixadas = new ArrayList<>();
    }

    // Métodos para depósito, saque, transferências e aplicações
    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void transferir(ContaCorrente destino, double valor) {
        if (saldo >= valor) {
            sacar(valor);
            destino.depositar(valor);
        } else {
            System.out.println("Saldo insuficiente para transferir.");
        }
    }

    public void adicionarAplicacao(AplicacaoPreFixada aplicacao) {
        aplicacoesPreFixadas.add(aplicacao);
    }

    // Getters e Setters
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<AplicacaoPreFixada> getAplicacoesPreFixadas() {
        return aplicacoesPreFixadas;
    }
}
