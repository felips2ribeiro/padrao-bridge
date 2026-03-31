package bridge;

public class PlataformaMobile implements IPlataforma {
    @Override
    public String exibirVideo(String titulo) {
        return "Reproduzindo '" + titulo + "' no aplicativo Android/iOS.";
    }

    @Override
    public String baixarVideo() {
        return "Fazendo download do vídeo para visualização offline.";
    }
}
