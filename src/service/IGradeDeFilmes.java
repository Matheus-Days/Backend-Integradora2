package service;

import exception.FimeNaoHabilitadoException;
import model.Filme;

public interface IGradeDeFilmes {
    public Filme getFilme(String nome) throws FimeNaoHabilitadoException;
}
