public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligadaa ?" + smartTv.ligada);
        System.out.println("Canal Atual : " + smartTv.canal);
        System.out.println("Volume Atual : " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> TV Ligada ? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> Tv Ligada ? " + smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("O novo volume agora é: " + smartTv.volume);

        System.out.println("Canal Atual: " + smartTv.canal);

        smartTv.mudarCanal(13);

        System.out.println("Canal Atual: " + smartTv.canal);
    }
}
