package service;

import exception.FimeNaoHabilitadoException;
import model.Filme;

public class GradeDeFilmesProxy implements IGradeDeFilmes{
    private int ip;
    private GradeDeFilmes gradeDeFilmes = new GradeDeFilmes();

    public GradeDeFilmesProxy(int ip) {
        this.ip = ip;
    }

    public void addFilme(Filme f) {
        gradeDeFilmes.addFilme(f);
    }

    @Override
    public Filme getFilme(String nome) throws FimeNaoHabilitadoException {
        Filme filme = gradeDeFilmes.getFilme(nome);

        if(ip >= 0 && ip <= 49 && filme.getPais().equals("AR")) {
            return filme;
        }
        else if(ip >= 50 && ip <= 99 && filme.getPais().equals("BR")) {
            return filme;
        }
        else if(ip >= 100 && ip <= 149 && filme.getPais().equals("CO")) {
            return filme;
        }
        else {
            throw new FimeNaoHabilitadoException("Filme não disponível no seu país");
        }
    }
}
