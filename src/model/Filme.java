package model;

public class Filme {
    private String nome, link, pais;

    public Filme(String nome, String link, String pais) {
        this.nome = nome;
        this.link = link;
        this.pais = pais;
    }

    public String getNome() {
        return nome;
    }

    public String getLink() {
        return link;
    }

    public String getPais() {
        return pais;
    }
}
