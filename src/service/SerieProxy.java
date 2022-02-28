package service;

import exception.SerieNaoHabilitadaException;

public class SerieProxy implements ISerie{
    private int qtdViews = 0;

    @Override
    public String getSerie(String nome) throws SerieNaoHabilitadaException {
        Serie serie = new Serie();
        if (qtdViews < 4) {
            qtdViews++;
            return serie.getSerie(nome);
        } else {
            throw new SerieNaoHabilitadaException("Excede o número de reproduções permitidas");
        }
    }
}
