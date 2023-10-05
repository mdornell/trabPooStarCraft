package characters.abstracts;

public abstract class Guerreiro {
    private String nome;
    private int idade;
    private double peso;
    private int energia = 100;

    public Guerreiro(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public double getPeso() {
        return peso;
    }
    public int getEnergia() {
        return energia;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    protected void setEnergia(int energia) {
        this.energia = energia;
    }

    public void regenerat(int lifeUp){
        this.setEnergia(energia + lifeUp);
    }

    public void sofrerDano(int damage){
        this.setEnergia(energia - damage);
    }

    @Override
    public String toString() {
        return " ";
    }

    // public abstract void atacar();
    
    
}
