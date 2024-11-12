public class Stookketel implements Vervuiler {
    private float CONorm;

    public Stookketel() {
    }

    public Stookketel(float CONorm) {
        setCONorm(CONorm);
    }

    public float getCONorm() {
        return CONorm;
    }

    public final void setCONorm(float CONorm) {
        if (CONorm > 0.0)
            this.CONorm = CONorm;
    }

    @Override
    public double berekenVervuiling() {
        return CONorm * 100;
    }
}
