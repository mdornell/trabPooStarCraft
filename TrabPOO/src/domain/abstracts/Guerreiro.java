// package domain.abstracts;

// import java.util.LinkedList;
// import domain.nature.Natureza;

// public abstract class Guerreiro {
//     private String nome;
//     private int idade;
//     private double peso;
//     private int energia = 100;
//     private static int energiaMaxima;
//     private Natureza type;

//     public Guerreiro(String nome, int idade, double peso, Natureza type) {
//         this.nome = nome;
//         this.idade = idade;
//         this.peso = peso;
//         this.type = type;
//     }

//     public String getNome() {
//         return nome;
//     }
//     public int getIdade() {
//         return idade;
//     }
//     public double getPeso() {
//         return peso;
//     }
//     public int getEnergia() {
//         return energia;
//     }
//     public int getEnenergiaMaxima() {
//         return energiaMaxima;
//     }
//     public Natureza getType() {
//         return type;
//     }

//     public void setNome(String nome) {
//         this.nome = nome;
//     }
//     public void setIdade(int idade) {
//         this.idade = idade;
//     }
//     public void setPeso(double peso) {
//         this.peso = peso;
//     }
//     protected void setEnergia(int energia) {
//         this.energia = energia;
//     }
//     protected void setEnenergiaMaxima(int energiaMaxima) {
//         Guerreiro.energiaMaxima = energiaMaxima;
//     }
//     public void setType(Natureza type) {
//         this.type = type;
//     }

//     public void regenerat(int lifeUp){
//         this.setEnergia(energia + lifeUp);
//     }

//     public void sofrerDano(int damage){
//         this.setEnergia(energia - damage);
//     }

//     @Override
//     public String toString() {
//         return " ";
//     }

    

//     public abstract void atacar(Guerreiro champion, LinkedList<Guerreiro> lado1, LinkedList<Guerreiro> lado2, boolean order);  
    
// }


package domain.abstracts;

import java.util.LinkedList;
import domain.nature.Natureza;

// Declaração da classe abstrata Guerreiro
public abstract class Guerreiro {
    // Atributos da classe Guerreiro
    private String nome; // Nome do guerreiro
    private int idade;   // Idade do guerreiro
    private double peso; // Peso do guerreiro
    private int energia = 100; // Nível de energia atual (inicializado com 100)
    private static int energiaMaxima; // Nível máximo de energia (compartilhado por todos os guerreiros)
    private Natureza type; // Objeto que representa a natureza do guerreiro

    // Construtor da classe Guerreiro
    public Guerreiro(String nome, int idade, double peso, Natureza type) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.type = type;
    }

    // Métodos getters para acessar os atributos
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }

    public int getEnergia() {
        return energia;
    }

    public int getEnergiaMaxima() {
        return energiaMaxima;
    }

    public Natureza getType() {
        return type;
    }

    // Métodos setters para modificar os atributos
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    protected void setEnergia(int energia) {
        this.energia = energia;
    }

    protected void setEnergiaMaxima(int energiaMaxima) {
        Guerreiro.energiaMaxima = energiaMaxima;
    }

    public void setType(Natureza type) {
        this.type = type;
    }

    // Método para regenerar a energia do guerreiro
    public void regenerar(int lifeUp) {
        this.setEnergia(energia + lifeUp);
    }

    // Método para reduzir a energia do guerreiro devido a danos
    public void sofrerDano(int damage) {
        this.setEnergia(energia - damage);
    }

    @Override
    public String toString() {
        return " "; // Sobrescrita do método toString, retorna uma string vazia
    }

    // Método abstrato que deve ser implementado por subclasses
    public abstract void atacar(Guerreiro champion, LinkedList<Guerreiro> lado1, LinkedList<Guerreiro> lado2, boolean order);
}

