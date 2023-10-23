package control;
import java.lang.Math;
import java.util.LinkedList;

import characters.abstracts.Guerreiro;

public class Battlefield {

    private int numAleatorio(){
        int num = (int)((Math.random()*50)+1);
        
        return num;
    }

    public void batalha(LinkedList<Guerreiro> lado1, LinkedList<Guerreiro> lado2, int num){
        if(!lado1.isEmpty() && !lado2.isEmpty()){

            Guerreiro guerreiro1 = lado1.get(0);
            Guerreiro guerreiro2 = lado2.get(0);

            atacarPrimeiro(num, guerreiro1, guerreiro2, lado1, lado2);
            //atacarFila(){}
            //moverFinalDaFila(){}
        }
    }

    private int atacarPrimeiro(int num, Guerreiro primeiroAtacar, Guerreiro segundoAtacar, LinkedList<Guerreiro> lado1, LinkedList<Guerreiro> lado2){
        if(num < 25){
        // Se o número gerado for menor, o guerreiro da fila é o primeiro a atacar
        }else{
        //Se não, o guerreiro da segunda fila é o primeiro a atacar
        }   
        return 0;
    }

//    public void moverFinalDaFila(){
     
//     }
    // public void atacarFila(){
    //     if(primeiroAtacar.getEnergia() > 0){
    //         primeiroAtacar.atacar(segundoAtacar, lado1, lado2)
    //     }
    // }   

}
