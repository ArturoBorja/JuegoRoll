package com.example.juegoroll;

import java.util.ArrayList;
import java.util.List;

public class Npc {
    double vida;
    double mana;
    double regenera;
    double sanacion;
    double energia;
    double fuerza;
    double intelecto;
    double experiencia;
    List<Equipo> equipo;
    List<Ataque> ataque;
    List<Habilidad> habilidad;

    public Npc () {
        vida = 10;
        mana = 0;
        regenera = 0;
        sanacion = 0.1;
        energia = 100;
        fuerza = 5;
        intelecto = 5;
        experiencia = 0;
        equipo = new ArrayList < Equipo > ();
        Equipo trapos = new Equipo();
        equipo.add(trapos);
        ataque=new ArrayList<Ataque>();
        Ataque punetazo=new Ataque();
        ataque.add(punetazo);
        habilidad=new ArrayList<Habilidad>();

    }


}
