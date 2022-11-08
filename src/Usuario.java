public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTV = new SmartTv();
        
        System.out.println("Canal Atual : " +smartTV.canal);
        
        smartTV.mudarCanal(13);
        
        System.out.println("Canal Atual : " +smartTV.canal);

        SmartTv.diminuirVolume();
        SmartTv.diminuirVolume();
        SmartTv.diminuirVolume();
        SmartTv.aumentarVolume();
        System.out.println("Volume Atual : " +SmartTv.Volume);
        
        System.out.println("TV Ligada ?" +SmartTv.ligada);
        System.out.println("Canal Atual : " +smartTV.canal);
        System.out.println("volume Atual : " +SmartTv.Volume);

        smartTV.ligar ();
        System.out.println("Novo Status → TV ligada ?" + SmartTv.ligada);

        smartTV.desligar ();
        System.out.println("Novo Status → TV ligada ?" + SmartTv.ligada);
    } 
}
