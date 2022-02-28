import exception.FimeNaoHabilitadoException;
import exception.SerieNaoHabilitadaException;
import model.Filme;
import service.GradeDeFilmesProxy;
import service.SerieProxy;

public class Principal {
    public static void main(String[] args) {

        // Parte 1:

        Filme f1 = new Filme("Madagascar", "https://mad.com", "BR");
        Filme f2 = new Filme("Os Pinguins de Madagascar", "https://penguin.com", "AR");
        Filme f3 = new Filme("Madagascar 2", "https://mad2.net", "CO");

        GradeDeFilmesProxy gradeDeFilmes = new GradeDeFilmesProxy(21);
        gradeDeFilmes.addFilme(f1);
        gradeDeFilmes.addFilme(f2);
        gradeDeFilmes.addFilme(f3);

        try {
            System.out.println(gradeDeFilmes.getFilme("Os Pinguins de Madagascar").getLink());
        } catch (FimeNaoHabilitadoException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(gradeDeFilmes.getFilme("Madagascar").getLink());
        } catch (FimeNaoHabilitadoException e) {
            System.out.println(e.getMessage());
        }

        // Parte 2

        SerieProxy serie = new SerieProxy();

        try {
            System.out.println(serie.getSerie("serie1"));
            System.out.println(serie.getSerie("serie2"));
            System.out.println(serie.getSerie("serie3"));
            System.out.println(serie.getSerie("serie4"));
            System.out.println(serie.getSerie("serie5"));
        } catch (SerieNaoHabilitadaException e) {
            System.out.println(e.getMessage());
        }


    }
}
