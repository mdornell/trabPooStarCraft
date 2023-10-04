package characters.terransCharacters;

import characters.abstracts.TerransOrganic;

public class Soldado extends TerransOrganic {

    public Soldado(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    @Override
    public void setEnergia(int energia) {
        if(energia > 100){
            super.setEnergia(100);
        }else{
            super.setEnergia(energia);
        }
    }

    
    
}
