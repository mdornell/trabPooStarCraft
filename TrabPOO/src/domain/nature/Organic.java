// package domain.nature;

// public class Organic extends Natureza{
    
//     private int brotoVeneno = 0;

//     public Organic(){
        
//     }

//     public int getBrotoVeneno() {
//         return brotoVeneno;
//     }

//     private void setBrotoVeneno(int brotoVeneno) {
//         this.brotoVeneno = brotoVeneno;
//     }

//     public void envenenar(){
//         setBrotoVeneno(getBrotoVeneno() + 1);
//     }
// }

package domain.nature;

// Declaração da classe Organic que é uma subclasse de Natureza
public class Organic extends Natureza {

    // Atributo para rastrear a quantidade de brotos de veneno
    private int brotoVeneno = 0;

    // Construtor da classe Organic
    public Organic() {
        // Construtor vazio, não realiza nenhuma operação na criação de um objeto Organic
    }

    // Método getter para obter a quantidade de brotos de veneno
    public int getBrotoVeneno() {
        return brotoVeneno;
    }

    // Método privado para definir a quantidade de brotos de veneno
    private void setBrotoVeneno(int brotoVeneno) {
        this.brotoVeneno = brotoVeneno;
    }

    // Método para envenenar a natureza orgânica
    public void envenenar() {
        setBrotoVeneno(getBrotoVeneno() + 1); // Incrementa a quantidade de brotos de veneno
    }
}

