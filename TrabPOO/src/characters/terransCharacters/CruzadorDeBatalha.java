package characters.terransCharacters;

import characters.abstracts.TerransMechanic;

public class CruzadorDeBatalha extends TerransMechanic{

    public CruzadorDeBatalha(String nome, int idade, double peso) {
        super(nome, idade, peso);
        this.setEnergia(1000);
    }
    
}
