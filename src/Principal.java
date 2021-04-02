public class Principal {
    public static void main(String[] args){ 
        int valor = 50; 
        
        Valor classeValor = new Valor(valor); 
               
        classeValor.somar(40); // nao altera o valor
        classeValor.multiplicar(40); // nao altera o valor
        classeValor.testar(); // imprime
        System.out.println(" ");


        int[] vetor = new int[]{1, 2, 3, 4};

        int [] vetor2 = vetor;

        Referencia classReferencia = new Referencia ();

        for(int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }
        System.out.println(" ");

        classReferencia.multiplicar(vetor2);

        for(int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }

        Pessoa pessoaA = new Pessoa ("Carlos");
        System.out.println(pessoaA.getNome());

        Pessoa pessoaB = pessoaA;

        pessoaB.setNome("Ana\n");

        System.out.println(pessoaA.getNome());


    

        




 
        
        
        /*
        Referencia classeReferencia = new Referencia(1000); // Instanciando a classe Referencia
        classeReferencia.peso(); // exercicio 2 da classe referencia

        int[] valorReferencia = new int[]{5, 4, 3, 2, 1}; // referencia

        classeReferencia.somar(valorReferencia); // altera o valor
        for (int i = 0; i < valorReferencia.length; i++){
            System.out.println("Método testar da classe Referencia, valor da variavel: " +valorReferencia[i]);
        }  
        System.out.println(" ");

        classeReferencia.multiplicar(valorReferencia); // altera o valor
        for (int i = 0; i < valorReferencia.length; i++){
            System.out.println("Método multiplicar da classe Referencia, valor da variavel: " +valorReferencia[i]);
        }   */     
    }       
}
