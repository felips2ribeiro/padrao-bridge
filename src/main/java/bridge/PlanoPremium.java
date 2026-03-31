package bridge;

public class PlanoPremium extends Plano {
    public PlanoPremium(IPlataforma plataforma) {
        super(plataforma);
    }

    @Override
    public String assistir(String titulo) {
        return "[Plano Premium] " + plataforma.exibirVideo(titulo) + " (Qualidade 4K Master)";
    }

    @Override
    public String baixar() {
        return "[Plano Premium] " + plataforma.baixarVideo();
    }
}
