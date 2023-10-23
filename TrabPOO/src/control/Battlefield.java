package control; // Declaração do pacote onde este arquivo Java está localizado.
import java.lang.Math; // Importa a classe Math do pacote java.lang para operações matemáticas.
import java.util.LinkedList; // Importa a classe LinkedList do pacote java.util para uso de listas encadeadas.
import characters.abstracts.Guerreiro; // Importa a classe abstrata Guerreiro de um pacote não especificado.

public class Battlefield {

    private int numAleatorio(){
        // Gera um número aleatório decimal entre 0 (inclusive) e 1 (exclusivo)
        double randomDecimal = Math.random();
    
        // Multiplica o número aleatório decimal por 50 para obter um valor entre 0 (inclusive) e 50 (exclusivo)
        double scaledRandom = randomDecimal * 50;
    
        // Adiciona 1 ao valor gerado para obter um número entre 1 (inclusive) e 51 (exclusivo)
        int num = (int)(scaledRandom) + 1;
    
        // Retorna o número aleatório gerado
        return num;
    }

    public void batalha(LinkedList<Guerreiro> lado1, LinkedList<Guerreiro> lado2){
        // Verifica se ambos os lados têm guerreiros para a batalha
        if(!lado1.isEmpty() && !lado2.isEmpty()){
            // Gera um número aleatório chamando a função numAleatorio()
            int num = numAleatorio();
    
            // Obtém o primeiro guerreiro de cada lado
            Guerreiro guerreiro1 = lado1.get(0);
            Guerreiro guerreiro2 = lado2.get(0);
    
            // Chama a função para realizar o ataque, passando o número aleatório, os guerreiros e as listas dos lados
            atacarPrimeiro(num, guerreiro1, guerreiro2, lado1, lado2);
    
            // Move o guerreiro1 para o final da fila (remove o guerreiro mais antigo do lado 1)
            moverFinalDaFila(guerreiro1, lado1);
    
            // Move o guerreiro2 para o final da fila (remove o guerreiro mais antigo do lado 2)
            moverFinalDaFila(guerreiro2, lado2);
        }
    }

    private int atacarPrimeiro(int num, Guerreiro guerreiro1, Guerreiro guerreiro2, LinkedList<Guerreiro> lado1, LinkedList<Guerreiro> lado2){
        // Verifica se o número aleatório gerado (num) é menor que 25
        if(num < 25){
            // Se o número gerado for menor que 25, o guerreiro da primeira fila (guerreiro1) ataca primeiro
            atacarFila(guerreiro1, guerreiro2, lado1, lado2, true);
            atacarFila(guerreiro2, guerreiro1, lado1, lado2, false);
        }else{
            // Se o número gerado for maior ou igual a 25, o guerreiro da segunda fila (guerreiro2) ataca primeiro
            atacarFila(guerreiro2, guerreiro1, lado1, lado2, true);
            atacarFila(guerreiro1, guerreiro2, lado1, lado2, false);
        }   
        return 0;
    }

    public void moverFinalDaFila(Guerreiro guerreiro, LinkedList<Guerreiro> fila){

        // Verifica se a energia do guerreiro é menor que 0
        if(guerreiro.getEnergia() < 0){
            // Se a energia for menor que 0, remove o guerreiro da fila
            fila.remove(guerreiro);
        }
        else{
            // Caso contrário, adiciona o guerreiro ao final da fila
            fila.addLast(guerreiro);
        }
    }    
    
    public void atacarFila(Guerreiro primeiroAtacar, Guerreiro segundoAtacar, LinkedList<Guerreiro> lado1, LinkedList<Guerreiro> lado2, boolean ordemAtaque){
        // Verifica se a energia do primeiro guerreiro é maior que 0
        if(primeiroAtacar.getEnergia() > 0){
            // Se a energia for maior que 0, chama a função atacar do primeiro guerreiro
            // para realizar um ataque no segundo guerreiro
            primeiroAtacar.atacar(segundoAtacar, lado1, lado2, ordemAtaque);
        }
    }
}
