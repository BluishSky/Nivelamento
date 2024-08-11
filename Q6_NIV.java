// ANÁLISE E PROJETO DE SOFTWARE ORIENTADO A OBJETOS-P01-2024-2
//
// ALUNO: VINÍCIUS SANTOS SILVA
// RGA: 2022.1904.014-0
//
// QUESTÃO 6 - NIVELAMENTO
//

public class Pessoa {
    protected String nome;
    protected String cpf;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
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

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
    }
}

public class Cliente extends Pessoa {
    private double saldo;

    public Cliente(String nome, String cpf, double saldo) {
        super(nome, cpf);
        this.saldo = saldo;
    }

    // Getters e Setters
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Saldo: " + saldo);
    }
}

public class Funcionario extends Pessoa {
    protected double salario;
    protected String setor;

    public Funcionario(String nome, String cpf, double salario, String setor) {
        super(nome, cpf);
        this.salario = salario;
        this.setor = setor;
    }

    // Getters e Setters
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Salário: " + salario);
        System.out.println("Setor: " + setor);
    }
}

public class Gerente extends Funcionario {
    private int qtdSubordinados;

    public Gerente(String nome, String cpf, double salario, String setor, int qtdSubordinados) {
        super(nome, cpf, salario, setor);
        this.qtdSubordinados = qtdSubordinados;
    }

    // Getters e Setters
    public int getQtdSubordinados() {
        return qtdSubordinados;
    }

    public void setQtdSubordinados(int qtdSubordinados) {
        this.qtdSubordinados = qtdSubordinados;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Quantidade de Subordinados: " + qtdSubordinados);
    }
}
