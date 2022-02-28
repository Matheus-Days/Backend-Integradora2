package service;

import model.Filme;

import java.util.ArrayList;

public class GradeDeFilmes implements IGradeDeFilmes{
    private ArrayList<Filme> listaFilmes = new ArrayList();

    public void addFilme(Filme f) {
        listaFilmes.add(f);
    }

    @Override
    public Filme getFilme(String nome) {
        for (Filme filme : listaFilmes) {
            if (filme.getNome().equalsIgnoreCase(nome)) {
                return filme;
            }
            }
        return null;
    }
}
