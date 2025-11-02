package ma.enset.glsid.hamzaelghazouani.strategy;

public class StrategyImpl1 implements IStrategy {
    @Override
    public void appliquer() {
        System.out.println("Début de la stratégie 1...");
        System.out.println("Exécution de l'algorithme 1...");
        System.out.println("Fin de la stratégie 1.");
    }
}
