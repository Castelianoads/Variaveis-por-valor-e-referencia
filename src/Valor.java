public class Valor {
    private int numero;

    public Valor(int numero) {
        this.numero = numero;
    }
   
    public void testar() { // Método testar
        System.out.println("Método somar da classe Valor, valor da variavel: " +numero);
        System.out.println("Método multiplicar da classe valor, valor da variavel: " +numero);
    }

    public void somar(int numero) { // Metodo 1
        numero = 9000;
    }

    public void multiplicar(int numero) { // Metodo 2
        numero = 8000;
    }
}
