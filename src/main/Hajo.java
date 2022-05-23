package main;
public class Hajo {
    private int [] pozicio;

    public Hajo(int [] pozicio) {
        this.pozicio = pozicio;
    }


    
    
    
    public String talalat (int poz) {
        int i =0;
        
        while (i< pozicio.length && !(pozicio[i]==poz)){
            i++;
        }
        
        return i < pozicio.length ? "Talált" : "Nem talált";
        
    }
}
