package control;

import java.util.LinkedList;
import domain.abstracts.Guerreiro;
import domain.nagasCharacters.Servo;
import domain.terransCharacters.Ambunave;

public class Battlefield {

    // Método para simular a batalha entre dois grupos de guerreiros
    public void battle(LinkedList<Guerreiro> lado1, LinkedList<Guerreiro> lado2) {
        // Exibe informações gerais antes da batalha
        infos(lado1, lado2);

        // Loop da batalha continua enquanto ambos os lados têm guerreiros
        while (!lado1.isEmpty() && !lado2.isEmpty()) {
            // Gera um número aleatório para determinar a ordem de ataque
            int aleatorio = (int) ((Math.random() * 50) + 1);

            // Obtém os guerreiros da frente de cada fila
            Guerreiro guerreiro1 = lado1.get(0);
            Guerreiro guerreiro2 = lado2.get(0);

            // Determina qual guerreiro ataca primeiro com base no número aleatório
            verQuemAtacaPrimeiro(aleatorio, guerreiro1, guerreiro2, lado1, lado2);

            // Move os guerreiros atacantes para o final de suas respectivas filas e
            // verifica se estão mortos
            moverGuerreiroDaFilaEVerificar(guerreiro1, lado1);
            moverGuerreiroDaFilaEVerificar(guerreiro2, lado2);
           
            if(continuarBatalha(lado1, lado2)){
                // System.out.println("A batalha terminou em empate !!!");
                break;
            }
        }
        // Verifica o vencedor da batalha e exibe informações sobre o guerreiro
        // vitorioso ou declara um empate
        verificarVencedor(lado1, lado2);
    }

    // Método para exibir informações gerais antes da batalha
    public void infos(LinkedList<Guerreiro> lado1, LinkedList<Guerreiro> lado2) {
        // a) Calcula a soma dos pesos
        double pesos[] = somarPeso(lado1, lado2);
        System.out.println("Pesos das tropas :");
        System.out.println("Terrans e Protoss pesam : " + pesos[0] + " unidades");
        System.out.println("Zergs e Nagas pesam : " + pesos[1] + " unidades");

        // b) Encontra o guerreiro mais velho
        Guerreiro maiorIdade = maisVelho(lado1, lado2);
        System.out.println("\nO Guerreiro mais velho é :");
        System.out.println("Nome : " + maiorIdade.getNome());
        System.out.println("Idade : " + maiorIdade.getIdade());
        System.out.println("Classe : " + maiorIdade.toString());
    }

    // Método privado para determinar a ordem de ataque com base no número aleatório
    private void verQuemAtacaPrimeiro(int ordemDeAtaque, Guerreiro guerreiro1, Guerreiro guerreiro2,
            LinkedList<Guerreiro> lado1, LinkedList<Guerreiro> lado2) {
        // Verifica se o número aleatório gerado é menor que 25

        if (ordemDeAtaque < 25) {
            // Se o número gerado for menor que 25, o guerreiro da primeira fila
            // (guerreiro1) ataca primeiro
            atacarCadaUm(guerreiro1, guerreiro2, lado1, lado2, true);
            atacarCadaUm(guerreiro2, guerreiro1, lado1, lado2, false);
        } else {
            // Se o número gerado for maior ou igual a 25, o guerreiro da segunda fila
            // (guerreiro2) ataca primeiro
            atacarCadaUm(guerreiro2, guerreiro1, lado1, lado2, true);
            atacarCadaUm(guerreiro1, guerreiro2, lado1, lado2, false);
        }

        
    }

    // Método privado para simular o ataque de um guerreiro a outro
    private boolean atacarCadaUm(Guerreiro guerreiroAtacante, Guerreiro guerreiroSofredor, LinkedList<Guerreiro> lado1,
            LinkedList<Guerreiro> lado2, boolean order) {
        boolean codigo = true;

        if (guerreiroAtacante.getEnergia() > 0) {
            guerreiroAtacante.atacar(guerreiroSofredor, lado1, lado2, order);
        }
        return codigo;
    }

    // Método privado para mover guerreiros para o final da fila e verificar se
    // estão mortos
    private void moverGuerreiroDaFilaEVerificar(Guerreiro guerreiro, LinkedList<Guerreiro> fila) {
        fila.remove(guerreiro);
        if (guerreiro.getEnergia() > 0) {
            fila.add(guerreiro);
        }
        if (fila.isEmpty()) {
            System.out.println("ÚLTIMO GUERREIRO MORTO: DADOS");
            System.out.println();
            System.out.println("NOME: " + guerreiro.getNome());
            System.out.println("IDADE: " + guerreiro.getIdade());
            System.out.println("PESO: " + guerreiro.getPeso());
            System.out.println();
        }
        verificarLista(fila);
    }

    // Método privado para verificar o vencedor da batalha
    private void verificarVencedor(LinkedList<Guerreiro> fila1, LinkedList<Guerreiro> fila2) {
        if(!fila1.isEmpty() && !fila2.isEmpty()){
            System.out.println("\nEmpate\n");
        }else if (!fila1.isEmpty()) {
            System.out.println("Terrans e Protoss venceram.");
            System.out.println();
            System.out.println("GUERREIRO VITORIOSO: DADOS");
            System.out.println("NOME: " + fila1.getLast().getNome());
            System.out.println("IDADE: " + fila1.getLast().getIdade());
            System.out.println("PESO: " + fila1.getLast().getPeso());
        }else if (!fila2.isEmpty()) {
            System.out.println("Zergs e Nagas venceram.");
            System.out.println();
            System.out.println("GUERREIRO VITORIOSO: DADOS");
            System.out.println("NOME: " + fila2.getLast().getNome());
            System.out.println("IDADE: " + fila2.getLast().getIdade());
            System.out.println("PESO: " + fila2.getLast().getPeso());
        }
    }

    // Método para calcular a soma dos pesos
    public double[] somarPeso(LinkedList<Guerreiro> lado1, LinkedList<Guerreiro> lado2) {
        double somas[] = new double[2];
        double soma1 = 0, soma2 = 0;

        for (Guerreiro g : lado1) {
            soma1 += g.getPeso();
        }
        somas[0] = soma1;
        for (Guerreiro g2 : lado2) {
            soma2 += g2.getPeso();
        }
        somas[1] = soma2;
        return somas;
    }

    // Método para encontrar o guerreiro mais velho
    public Guerreiro maisVelho(LinkedList<Guerreiro> lado1, LinkedList<Guerreiro> lado2) {
        Guerreiro GuerreiroMaisVelho = null; // Inicialize como nulo
        int maiorIdade = -1;

        for (Guerreiro g : lado1) {
            int idade = g.getIdade();
            if (idade > maiorIdade) {
                maiorIdade = idade;
                GuerreiroMaisVelho = g;
            }
        }

        for (Guerreiro g : lado2) {
            int idade = g.getIdade();
            if (idade > maiorIdade) {
                maiorIdade = idade;
                GuerreiroMaisVelho = g;
            }
        }

        return GuerreiroMaisVelho;
    }

    private boolean continuarBatalha(LinkedList<Guerreiro> fila1, LinkedList<Guerreiro> fila2) {
        int tamVet1 = fila2.size();
        int tamVet2 = fila1.size();
        int tamIdex = tamVet1 + tamVet2;
        boolean[] idex = new boolean[tamVet1 + tamVet2];
        int i;

        if ((!fila1.isEmpty() && (!fila2.isEmpty()))) {
            for (i = 0; i < tamVet1; i++) {
                if (fila2.get(i) instanceof Servo) {
                    idex[i] = true;
                }else{
                    idex[i] = false;
                }
            }
            for (int j = 0; j < tamVet2; j++) {
                if (fila1.get(j) instanceof Ambunave) {
                    idex[i] = true;
                    i++;
                }else{
                    idex[i] = false;
                }
            }
            
            i = 0;
            while(i < tamIdex) {
                if (idex[i] == true) {
                    i++;
                }else{
                    return false;
                }
            }
        }
        return true;
    }

    // Método privado para verificar e remover guerreiros sem energia da lista
    private void verificarLista(LinkedList<Guerreiro> fila) {
        int tamanho = fila.size() - 1;

        for (int x = 0; tamanho >= 0 && x <= tamanho; x++) {
            if (fila.get(x).getEnergia() <= 0) {
                Guerreiro soldado = fila.get(x);
                fila.remove(soldado);
                tamanho = fila.size() - 1;
                x = 0;
            }
        }
    }
}
