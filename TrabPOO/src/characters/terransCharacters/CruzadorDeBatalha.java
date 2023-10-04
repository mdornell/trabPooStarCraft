package characters.terransCharacters;

import characters.abstractsCharacters.TerransMecanico;

public class CruzadorDeBatalha extends TerransMecanico{

    public CruzadorDeBatalha(String nome, int idade, double peso) {
        super(nome, idade, peso);
        this.setEnergia(1000);
    }
    
}
