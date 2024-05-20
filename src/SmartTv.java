public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void aumentarCanal(){
        canal++;
    }
    public void dimunuirCanal(){
        canal--;
    }

    public void aumentarVolume(){
        //volume++ (Acrescenta + 1)
        volume = volume + 1;
    }
    public void diminuirVolume(){
        //volume-- (Decrecenta - 1)
        volume = volume- 1;
    }

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;

    }
}
