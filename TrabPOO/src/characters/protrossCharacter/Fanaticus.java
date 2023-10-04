package characters.protrossCharacter;

import characters.abstractsCharacters.ProtossOrganico;

public class Fanaticus extends ProtossOrganico{

    public Fanaticus(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }
    
    @Override
    public void setEnergia(int energia) {
        if(energia > 200){
            super.setEnergia(200);
        }else{
            super.setEnergia(energia);
        }
    }
}
