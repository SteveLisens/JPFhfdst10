public class Vrachtwagen  extends Voertuig implements Vervuiler{

    private float maxLading = 100000.0F;
    public Vrachtwagen(){
    }

   public Vrachtwagen(String polishouder, float kostprijs, int pk,
                      float gemVerbruik, String nummerplaat, float maxLading){
        super(polishouder,kostprijs,pk,gemVerbruik,nummerplaat);
        setMaxLading(maxLading);
   }

   public float getMaxLading(){
        return maxLading;
   }
   public final void setMaxLading(float maxLading){
        if (maxLading >0.0F)
            this.maxLading = maxLading;
   }

   @Override
    public String toString(){
        return super.toString() + " ; " + maxLading;
   }

   @Override
    public void toon() {
        System.out.println("\nVRACHTWAGEN");
        super.toon();
        System.out.println("Max Lading: " + maxLading);
   }

   @Override
    public double getKyotoScore() {
        return (getGemVerbruik() * getMaxLading() / (maxLading / 1000.0F) );
   }

    @Override
    public double berekenVervuiling() {
        return getKyotoScore() * 20.0F;
    }
}
