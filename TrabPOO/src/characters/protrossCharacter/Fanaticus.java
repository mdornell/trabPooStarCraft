package characters.protrossCharacter;

import characters.abstracts.ProtossOrganic;

public class Fanaticus extends ProtossOrganic{

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
