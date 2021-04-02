public class Referencia {
    private int numero;

    public void multiplicar(int[] numero){ // Método 2       
        for(int i = 0; i < numero.length; i++){
            numero[i] *= 10;
        }
    }

    public void peso(int[] numero) {
        int[] peso = new int[]{50, 60, 70, 80};
        int[] kilo = peso;
        for (int i = 0; i < kilo.length; i++){
            kilo [i] -= 20;
            System.out.println("Peso: " +kilo[i]);
        }        
        System.out.println(" ");
    }

    public void somar(int[] numero){
        System.out.println("Somando 10:");
        for (int i = 0; i < numero.length; i++){
            System.out.println(numero[i]);
            numero[i] += 10;
            System.out.println(numero[i]);
        }          
    }        
}
