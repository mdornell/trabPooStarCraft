package characters.abstracts;

public abstract class Mechanic extends Guerreiro{

    public Mechanic(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    @Override
    public void regenerat(int lifeUp) {

    }
}
