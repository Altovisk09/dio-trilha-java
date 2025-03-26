public class Repeticao {
    public static void main(String[]args){
        for(int x = 0; x <= 20; x++){
            System.out.println(x);
        };
        
        for(int x = 0; x <= 5; x++){
          
            if(x!=3 && x!=4){
                System.out.println("Numero: " + x);
            }else if(x == 4){
                break;
            }else{
                System.out.println("não vai dar não");
                continue;
            }
        };

        String array [] = {"pão","cebola","batata"};

        for(String item:array){
            System.out.println("Item: ".concat(item));
        };

        int dinheiro = 50;

        while (dinheiro > 0) {
            System.out.println("Dinheiro restante: " + dinheiro);
            dinheiro -= 10; 
            if(dinheiro <= 0){
                System.out.println("Nome foi pro serasa");
            }
        }

        String opcao = "pão";

        switch (opcao) {
            case "pão":
                System.out.println("Você escolheu pão.");
                break;
            case "cebola":
                System.out.println("Você escolheu cebola.");
                break;
            case "batata":
                System.out.println("Você escolheu batata.");
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        };
    };
}
