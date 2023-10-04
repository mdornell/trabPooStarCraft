package characters.abstractsCharacters;

public abstract class Mecanico extends Guerreiro{

    public Mecanico(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    @Override
    public void regenerat(int lifeUp) {

    }
}
