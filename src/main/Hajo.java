package main;

import java.util.Random;

public class Hajo {
    private int [] pozicio = new int [3];

    public Hajo(int [] pozicio) {
        setPozicio(pozicio);
    }

    public void setPozicio(int[] pozicio) {
        Random rnd = new Random();
        
        int kezdoPoz = rnd.nextInt(3)+1;
        for (int i = 0; i < pozicio.length; i++) {
            this.pozicio[i] = kezdoPoz;
            kezdoPoz++;
        }

    }

    

    
    
    
    public String talalat (int poz) {
        int i =0;
        
        while (i< pozicio.length && !(pozicio[i]==poz)){
            i++;
        }
        
        return i < pozicio.length ? "Talált" : "Nem talált";
        
    }
    
    
    
}
