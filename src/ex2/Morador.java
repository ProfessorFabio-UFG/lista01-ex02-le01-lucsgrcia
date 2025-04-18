package ex2;

public class Morador {

    String nome, dataNascimento, cpf, celular;
    char sexo;
    int apartamento, bloco;
    int codigoAcesso = (int)(Math.random() * 1000 + 1000);

    public Morador(String nome, String dataNascimento, char sexo, String cpf, String celular, int apartamento, int bloco) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.cpf = cpf;
        this.celular = celular;
        this.apartamento = apartamento;
        this.bloco = bloco;
    }

    @Override
    public String toString() {
        return "Morador" +
                "\nNome: " + nome +
                "\nData de Nascimento: " + dataNascimento +
                "\nSexo: " + sexo +
                "\nCPF: " + cpf +
                "\nCelular: " + celular +
                "\nApartamento: " + apartamento +
                "\nBloco: " + bloco +
                "\nCodigo de Acesso: " + codigoAcesso;
    }
}
