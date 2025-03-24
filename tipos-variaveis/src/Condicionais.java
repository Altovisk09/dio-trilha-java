public class Condicionais {
    public static void main(String[]args){
        boolean condicional = true;

        if(condicional){
            System.out.println("verdadeira");
        }else{
            System.out.println("falso");
        };

        String validacao = condicional == true ? "verdadeira" : "falso";
        System.out.println(validacao);

        int opcao = 2;
        switch (opcao) {
            case 1:
                System.out.println("Opção 1 selecionada");
                break;
            case 2:
                System.out.println("Opção 2 selecionada");
                break;
            case 3:
                System.out.println("Opção 3 selecionada");
                break;
            default:
                System.out.println("Opção inválida");
        }
    };
}
