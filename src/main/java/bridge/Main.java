package bridge;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Testando Sistema de Streaming (Bridge Pattern) ===\n");

        IPlataforma web = new PlataformaWeb();
        IPlataforma mob = new PlataformaMobile();

        System.out.println("--- Teste 1 ---");
        Plano p1 = new PlanoGratuito(web);
        System.out.println(p1.assistir("O Poderoso Chefão"));
        System.out.println(p1.baixar());

        System.out.println("\n--- Teste 2 ---");
        Plano p2 = new PlanoPremium(mob);
        System.out.println(p2.assistir("Interstellar"));
        System.out.println(p2.baixar());

        System.out.println("\n--- Teste 3 ---");
        p2.setPlataforma(web);
        System.out.println(p2.assistir("Interstellar"));
        System.out.println(p2.baixar());
    }
}
