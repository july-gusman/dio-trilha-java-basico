public class SmartTv {
   
     booLean ligada=false;
     int canal=1;
     int volume=25;

       public void aumentarVolume(){
          volume = volume +1;

       }
       public void diminuirVolume(){
          volume = volume -1;
       }

       public void ligar(){
        ligada=true;
     }
     public void desligar(){
        ligada=false;
     }

}