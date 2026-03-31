package bridge;

public abstract class Plano {
    protected IPlataforma plataforma;

    public Plano(IPlataforma plataforma) {
        this.plataforma = plataforma;
    }

    public void setPlataforma(IPlataforma plataforma) {
        this.plataforma = plataforma;
    }

    public abstract String assistir(String titulo);
    public abstract String baixar();
}
