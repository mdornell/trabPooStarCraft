package characters.terransCharacters;

import java.util.LinkedList;

import characters.abstracts.Guerreiro;
import characters.abstracts.Terrans;
import characters.nature.Natureza;
import characters.nature.Organic;

public class Ambunave extends Terrans{

    public Ambunave(String nome, int idade, double peso, Natureza type) {
        super(nome, idade, peso, type);
    }

    @Override
    public void atacar(Guerreiro champion, LinkedList<Guerreiro> lado1, LinkedList<Guerreiro> lado2){
        int remedio = 50;
        for (Guerreiro Individuo : lado1){
            if(champion.getType() instanceof Organic){
                Individuo.regenerat(remedio);
            }
        }
    }
    
}

/*
 * Cruzador de Batalha: unidade Terrana mais poderosa e “nasce” com 1000 pontos
 * de energia (é a única unidade Terrana que não “nasce” com 100 pontos de
 * energia). Possui um feixe de energia concentrada que automaticamente elimina o
 * adversário, independente se sua energia. Como precisa concentrar energia utiliza
 * esse feixe depois de fazer dois ataques comuns (que retiram 50 pontos de
 * energia). Após um ataque de feixe precisa fazer novamente dois ataques comuns
 * para fazer um novo ataque de feixe.
 */