import java.util.Scanner;

class NumeroInvalidoException extends Exception{
    public NumeroInvalidoException(String mensagem){
        super(mensagem);  
    }
}
// calculadora de divisao
public class tryCatch {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        
        while (continuar) {
            try{
                System.out.println("\nDigite um numero");
                int numero1 = scanner.nextInt();
    
                if(numero1 > 10){
                    throw new NumeroInvalidoException("\no numero maximo permitido é 10");
                }
                
    
                System.out.println("Digite um divisor");
                int numero2 = scanner.nextInt();
    
                if (numero2 == 0) {
                    throw new ArithmeticException("\nErro: Divisão por zero não é permitida.");
                }
    
                
                double divisao = (double) numero1 / numero2;
    
                System.out.println("\nO resultado da divisao é " + divisao);
                
                System.out.println("\nDeseja realizar uma nova operação?");
                String resposta = scanner.next();

                if(!resposta.equalsIgnoreCase("s")){
                    continuar=false;
                }

            }catch(Exception e){
                System.out.println(e.getMessage());
            };
        }
        System.out.println("\nPrograma encerrado");
        scanner.close();
    };
}
