public class SmartTv {
    public static final String volume = null;
    
    static boolean ligada=false;
    int canal=1;
    static int Volume = 25;

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    
    public void aumentarCanal(){
        canal++;
    }
    
    public void diminuirCanal(){
        canal--;
    }
    
    
    public static void aumentarVolume(){
        Volume++;
        System.out.println("Aumentando o volume para:");
        //Volume = Volume + 1;
        
    }
    public static void diminuirVolume(){
        Volume--;
        System.out.println("Diminuindo o volume para:");
        //Volume = Volume + 1;
    }
    
    public void ligar(){
        ligada=true;
    }
    
    public void desligar(){
        ligada=false;
    }
}