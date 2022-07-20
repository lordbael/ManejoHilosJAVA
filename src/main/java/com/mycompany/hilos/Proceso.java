package com.mycompany.hilos;

import java.time.LocalDateTime;

public class Proceso extends Thread {
    
    LocalDateTime tiempo;

    public Proceso(String name) {
        super(name);
    }
    @Override
    public void run(){
        if (getName().equals("Tiempo")){
            
            for(;;){
                tiempo=LocalDateTime.now();
                System.out.println(tiempo.getHour());
            }
            
        }
    }

}
