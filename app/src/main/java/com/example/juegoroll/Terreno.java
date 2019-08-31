package com.example.juegoroll;

import java.util.ArrayList;
import java.util.List;

public class Terreno {
    int enx;
    int eny;
    double dado;
    boolean paso;
    Npc protector;
    List<Equipo> tesoro;
    public Terreno(int x, int y){
        enx=x;
        eny=y;
        dado=(Math.random() * 10) + 1;
        if (dado>8){
            paso=false;
        }else{
            paso=true;
        }
        if(paso){
            if(dado>7){
                tesoro = new ArrayList<Equipo>();
            }
        }else{

        }

    }
}
