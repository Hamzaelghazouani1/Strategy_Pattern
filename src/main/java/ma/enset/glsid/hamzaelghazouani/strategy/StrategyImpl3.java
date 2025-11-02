package ma.enset.glsid.hamzaelghazouani.strategy;

public class StrategyImpl3 implements IStrategy {
    @Override
    public void appliquer() {
        System.out.println("Début de la stratégie 3...");
        System.out.println("Processus spécifique pour l'algorithme 3...");
        System.out.println("Fin de la stratégie 3.");
    }
}
