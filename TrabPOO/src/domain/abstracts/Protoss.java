package domain.abstracts;

import domain.nature.Natureza;

public abstract class Protoss extends Guerreiro{

    public Protoss(String nome, int idade, double peso, Natureza type) {
        super(nome, idade, peso, type);
    }

    protected void recuperaçãoGelada(Guerreiro protoss){
        int regereracao = (int) ((protoss.getEnergia())*0.05);
        protoss.regenerat(regereracao);
    }
}

/*
 * Protons possuem a “recuperação gelada”. Toda vez que atacam e estão com menos
 * de 50% da energia inicial recuperam 5% da sua energia.
 */
