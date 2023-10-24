package control;

import java.util.LinkedList;

import characters.abstracts.Guerreiro;

public class BattlefieldMarco {

    public void infos(LinkedList<Guerreiro> lado1, LinkedList<Guerreiro> lado2){
        // a) (5 pontos) Determine a soma dos pesos dos lados (isso deve ser feito antes das batalhas):
        double pesos[] = somarPeso(lado1, lado2);
        System.out.println("Pesos das tropas :");
        System.out.println("Terrans e Protoss pesam : "+ pesos[0] +" unidades");
        System.out.println("Zergs e Nagas pesam : "+ pesos[1] +" unidades");

        //b) (5 pontos) A maior idade dentre todos os guerreiros (de ambos lados) (isso deve ser feito antes das batalhas):
        Guerreiro maiorIdade = maisVelho(lado1, lado2);
        System.out.println("\nO Guerreiro mais velho é :");
        System.out.println("Nome : " + maiorIdade.getNome());
        System.out.println("Idade : " + maiorIdade.getIdade());
        System.out.println("Classe : " + maiorIdade.toString()) ;

    }
    
    public void battle(LinkedList<Guerreiro> lado1, LinkedList<Guerreiro> lado2){
        while(!lado1.isEmpty() && !lado2.isEmpty()){
            int aleatorio = (int)((Math.random() * 50) + 1);
            
            Guerreiro guerreiro1 = lado1.get(0);
            Guerreiro guerreiro2 = lado2.get(0);
            
            verQuemAtacaPrimeiro(aleatorio, guerreiro1, guerreiro2, lado1, lado2);
            
            moverGuerreiroDaFilaEVerificar(guerreiro1,lado1);
            moverGuerreiroDaFilaEVerificar(guerreiro2,lado2);          
        } 
        verificarVencedor(lado1,lado2);
    }    

    private void verQuemAtacaPrimeiro(int ordemDeAtaque, Guerreiro guerreiro1, Guerreiro guerreiro2, LinkedList<Guerreiro> lado1, LinkedList<Guerreiro> lado2){
        // boolean permissao;
        // if(ordemDeAtaque < 25){
        //     permissao = atacarCadaUm(guerreiro1,guerreiro2,lado1,lado2,true);
        //     if(permissao){
        //         atacarCadaUm(guerreiro2,guerreiro1,lado1,lado2,false);
        //     }
        // }else{
        //     atacarCadaUm(guerreiro2,guerreiro1,lado1,lado2,true);
        //     atacarCadaUm(guerreiro1,guerreiro2,lado1,lado2,false);
        // }

        // Verifica se o número aleatório gerado (num) é menor que 25
        if(ordemDeAtaque < 25){
            // Se o número gerado for menor que 25, o guerreiro da primeira fila (guerreiro1) ataca primeiro
            atacarCadaUm(guerreiro1, guerreiro2, lado1, lado2, true);
            atacarCadaUm(guerreiro1, guerreiro2, lado1, lado2, false);
        }else{
            // Se o número gerado for maior ou igual a 25, o guerreiro da segunda fila (guerreiro2) ataca primeiro
            atacarCadaUm(guerreiro1, guerreiro2, lado1, lado2, true);
            atacarCadaUm(guerreiro1, guerreiro2, lado1, lado2, false);
        }   
    }
    
    private boolean atacarCadaUm(Guerreiro guerreiroAtacante, Guerreiro guerreiroSofredor, LinkedList<Guerreiro> lado1, LinkedList<Guerreiro> lado2, boolean order){
        boolean codigo = true;
        if(guerreiroAtacante.getEnergia() > 0){
            // codigo = 
            guerreiroAtacante.atacar(guerreiroSofredor, lado1, lado2,order);
        }
        return codigo;
    }
    
    private void moverGuerreiroDaFilaEVerificar(Guerreiro guerreiro,LinkedList<Guerreiro> fila){      
        fila.remove(guerreiro);
        if(guerreiro.getEnergia() > 0){
            fila.add(guerreiro);
        }
        if(fila.isEmpty()){
            System.out.println("ULTIMO GUERREIO MORTO: DADOS");
            System.out.println();
            System.out.println("NOME: "+guerreiro.getNome());
            System.out.println("IDADE: "+guerreiro.getIdade());
            System.out.println("PESO: "+guerreiro.getPeso());
            System.out.println();
        }
        verificarLista(fila);
    }
    
    private void verificarVencedor(LinkedList<Guerreiro> fila1, LinkedList<Guerreiro> fila2){
        if(!fila1.isEmpty()){
            System.out.println("Terrans e Protoss venceram.");
            System.out.println();
            System.out.println("GUERREIO VITORIOSO: DADOS");
            System.out.println("NOME: "+fila1.getLast().getNome());
            System.out.println("IDADE: "+fila1.getLast().getIdade());
            System.out.println("PESO: "+fila1.getLast().getPeso());
        }
        if(!fila2.isEmpty()){
            System.out.println("Zergs e Nagas venceram.");
            System.out.println();
            System.out.println("GUERREIO VITORIOSO: DADOS");
            System.out.println("NOME: "+fila2.getLast().getNome());
            System.out.println("IDADE: "+fila2.getLast().getIdade());
            System.out.println("PESO: "+fila2.getLast().getPeso()); 
        }
    }
    
    public double[] somarPeso(LinkedList<Guerreiro> lado1, LinkedList<Guerreiro> lado2){
        double somas[] = new double[2];
        double soma1 = 0,soma2 = 0;
        
        for(Guerreiro g : lado1){
            soma1 += g.getPeso();
        }
        somas[0] = soma1;
        for(Guerreiro g2 : lado2){
            soma2 += g2.getPeso();
        }
        somas[1] = soma2;
        return somas;
    }
    
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
    
    private void verificarLista(LinkedList<Guerreiro> fila){
        int tamanho = fila.size() - 1;
        for(int x = 0; tamanho >= 0 && x <= tamanho; x++){
            if(fila.get(x).getEnergia() <= 0){
                Guerreiro soldado = fila.get(x);
                fila.remove(soldado);
                tamanho = fila.size() - 1;
                x = 0;
            }
        }    
    }
}
