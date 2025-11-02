package ma.enset.glsid.hamzaelghazouani.strategy;

public class DefaultStrategyImpl implements IStrategy {
    @Override
    public void appliquer() {
        System.out.println("Stratégie par défaut.");
        System.out.println("Aucun algorithme spécifique sélectionné.");
    }
}
