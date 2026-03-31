package bridge;

public class PlataformaWeb implements IPlataforma {
    @Override
    public String exibirVideo(String titulo) {
        return "Reproduzindo '" + titulo + "' no navegador web (Player HTML5).";
    }

    @Override
    public String baixarVideo() {
        return "Erro: Download não permitido diretamente no navegador.";
    }
}
