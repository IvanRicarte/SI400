/*
 (c) Ivan L M Ricarte
 */
package si400.demos;

/**
 *
 * @author Ivan L M Ricarte <ricarte@ft.unicamp.br>
 */
class Veiculo {

    private final int tipo;

    public Veiculo(int t) {
        tipo = t;
    }

    public void manter() {
        switch (tipo) {
            case 0: // Bicicleta
                System.out.println("Ajustar corrente");
                System.out.println("Alinhar aros");
                break;
            case 1: // Automóvel
                System.out.println("Trocar óleo");
                System.out.println("Fazer balanceamento");
                break;
        }
    }
    
    public void verificar() {
        switch (tipo) {
            case 0: // Bicicleta
                System.out.println("Checar folga na corrente");
                System.out.println("Verificar folga no guidão");
                break;
            case 1: // Automóvel
                System.out.println("Verificar nível do óleo");
                System.out.println("Verificar alinhamento da direção");
                break;
        }
    }
}

class Wxyz {
    
}