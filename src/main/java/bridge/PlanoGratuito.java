package bridge;

public class PlanoGratuito extends Plano {
    public PlanoGratuito(IPlataforma plataforma) {
        super(plataforma);
    }

    @Override
    public String assistir(String titulo) {
        return "[Plano Gratuito] " + plataforma.exibirVideo(titulo) + " (Exibindo anúncios...)";
    }

    @Override
    public String baixar() {
        return "[Plano Gratuito] Erro: Upgrade para Premium necessário para baixar.";
    }
}
