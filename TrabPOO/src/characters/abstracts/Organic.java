package characters.abstracts;

public abstract class Organic extends Guerreiro{

    private int brotoVeneno = 0;

    public Organic(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    public int getBrotoVeneno() {
        return brotoVeneno;
    }

    protected void setBrotoVeneno(int brotoVeneno) {
        this.brotoVeneno = brotoVeneno;
    }

    public void envenedado(){
        this.setBrotoVeneno(brotoVeneno + 1);
    }
    
    
}
