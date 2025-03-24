public class Usuario {
    public static void main(String[]args){
        Tv tv = new Tv();

        System.out.println("Tv ligada: " +tv.ligada);
        System.out.println("Canal atual: " +tv.canal);
        System.out.println("Volume atual: " +tv.volume);

        tv.ligar();
        System.out.println("Tv ligada: " +tv.ligada);

        tv.aumentarVolume();
        tv.aumentarVolume();
        System.out.println("Volume atual: " +tv.volume);

        tv.aumentarCanal();
        tv.aumentarCanal();
        System.out.println("Canal atual: " +tv.canal);

        tv.mudarCanal(51);
        System.out.println("Canal atual: " +tv.canal);
    };
}
