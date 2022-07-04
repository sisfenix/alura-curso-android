package br.com.alura.agenda.model;

public class Aluno {
    private final String strNome;
    private final String strTelefone;
    private final String strEmail;

    public Aluno(String strNome, String strTelefone, String strEmail) {
        this.strNome = strNome;
        this.strTelefone = strTelefone;
        this.strEmail = strEmail;
    }

    public String getStrNome() {
        return strNome;
    }

    public String getStrTelefone() {
        return strTelefone;
    }

    public String getStrEmail() {
        return strEmail;
    }
}
