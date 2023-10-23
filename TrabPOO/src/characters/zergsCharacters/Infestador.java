package characters.zergsCharacters;

import java.util.LinkedList;

import characters.abstracts.Guerreiro;
import characters.abstracts.Zergs;
import characters.nature.Natureza;
import characters.nature.Organic;
public class Infestador extends Zergs{

    public Infestador(String nome, int idade, double peso, Natureza type) {
        super(nome, idade, peso, type);
    }

    @Override
    public void atacar(Guerreiro champion, LinkedList<Guerreiro> lado1, LinkedList<Guerreiro> lado2, boolean order){
        //Fazer o primeiro a atacar

        //Segundo a atacar
        createZerg(lado2);
    }

    private void createZerg(LinkedList<Guerreiro> lista){
        Guerreiro novoZerg = new Zergnideo(getNome(), getIdade(), getPeso(),new Organic());
        lista.add(1, novoZerg);

    }
    
}

/*
 * Infestador: não possui ataque. Se for o primeiro a atacar, controla o adversário e
 * o faz atacar seus aliados (na sua própria fila), nesse caso o Infestador não sofre
 * ataque (no caso especifico da Ambunave ser o adversário, isso irá fazer com que
 * essa unidade recupere a energia de Zergs e Nagas - todas as unidades pois todas
 * são organicas, ou seja, não mecânicas). Se for o segundo a atacar, gera um
 * Zergnideo com seu nome (nome do Infestador), peso e idade, na sequencia vai
 * para o final da fila.
 */

