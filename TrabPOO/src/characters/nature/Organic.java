package characters.nature;

public class Organic extends Natureza{
    
    private int brotoVeneno = 0;

    public Organic(){
        
    }

    public int getBrotoVeneno() {
        return brotoVeneno;
    }

    private void setBrotoVeneno(int brotoVeneno) {
        this.brotoVeneno = brotoVeneno;
    }

    public void envenenar(){
        setBrotoVeneno(getBrotoVeneno() + 1);
    }
}
