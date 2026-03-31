package bridge;

public class PlataformaWeb implements IPlataforma {
    @Override
    public String exibirVideo(String titulo) {
        return "Assistindo '" + titulo + "' pelo navegador.";
    }

    @Override
    public String baixarVideo() {
        return "Erro: Navegador não permite download.";
    }
}
