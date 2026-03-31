package bridge;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Testando Sistema de Streaming (Bridge Pattern) ===\n");

        IPlataforma web = new PlataformaWeb();
        IPlataforma mobile = new PlataformaMobile();

        System.out.println("--- Cenário 1: Plano Gratuito na Web ---");
        Plano plano1 = new PlanoGratuito(web);
        System.out.println(plano1.assistir("O Poderoso Chefão"));
        System.out.println(plano1.baixar());
        System.out.println();

        System.out.println("--- Cenário 2: Plano Premium no Mobile ---");
        Plano plano2 = new PlanoPremium(mobile);
        System.out.println(plano2.assistir("Interstellar"));
        System.out.println(plano2.baixar());
        System.out.println();

        System.out.println("--- Cenário 3: Trocando de Plataforma (Premium na Web) ---");
        plano2.setPlataforma(web);
        System.out.println(plano2.assistir("Interstellar"));
        System.out.println(plano2.baixar());
    }
}
