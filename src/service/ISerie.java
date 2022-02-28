package service;

import exception.SerieNaoHabilitadaException;

public interface ISerie {
    abstract public String getSerie(String nome) throws SerieNaoHabilitadaException;
}
