package com.example.juegoroll;

import android.content.Context;

import java.util.regex.Pattern;

public class Equipo {
    String nombre;
    double peso;
    double dado;
    double dano;
    double defenza;
    double vida;
    double mana;
    double regenera;
    double sanacion;
    double energia;
    double fuerza;
    double intelecto;
    int turno;
    public Equipo(){
        nombre="cosa";
        peso=2;
        turno=0;
        dado=0;
        dano=0;
        defenza=1;
        vida = 0;
        mana = 0;
        regenera = 0;
        sanacion = 0;
        energia = 0;
        fuerza = 0;
        intelecto = 0;
    }
    public void CrearTesoro(Context ctx) {
        dado = (int) (Math.random() * 9) + 1;
        if (dado < 7) {
            CrearArma(ctx);
        } else if (dado < 10) {
            CrearArmadura(ctx);
        } else {
            Consumible(ctx);
        }
    }

    public void CrearArma(Context ctx){
        String[] arma = ctx.getString(R.string.arma).split(Pattern.quote("#"));
        dado=(int) (Math.random() * (arma.length-1)) + 0;
        nombre=arma[(int)dado];
        String[] material=ctx.getString(R.string.material).split(Pattern.quote("#"));
        dado=(int) (Math.random() * (material.length-1)) + 0;
        dano=dado;
        if(dado<5){
            peso=dado+1;
        }else{
            peso=6-dado;
        }

        nombre=nombre+" de "+material[(int)dado];
        dado=(int) (Math.random() * 9) + 1;
        if (dado<8){

        }else {
            String[] quien = ctx.getString(R.string.quien).split(Pattern.quote("#"));
            dado = (int) (Math.random() * (quien.length - 1)) + 0;
            nombre = nombre + " de " + quien[(int) dado];
            dano=dano+dado;
        }
    }
    public void CrearArmadura(Context ctx){
        String[] armadura = ctx.getString(R.string.armadura).split(Pattern.quote("#"));
        dado=(int) (Math.random() * (armadura.length-1)) + 0;
        nombre=armadura[(int)dado];
        String[] material=ctx.getString(R.string.material).split(Pattern.quote("#"));
        dado=(int) (Math.random() * (material.length-1)) + 0;
        nombre=nombre+" de "+material[(int)dado];
        dado=(int) (Math.random() * 9) + 1;
        if (dado<8){

        }else {
            String[] quien = ctx.getString(R.string.quien).split(Pattern.quote("#"));
            dado = (int) (Math.random() * (quien.length - 1)) + 0;
            nombre = nombre + " de " + quien[(int) dado];
        }
    }
    public void Consumible(Context ctx){
        String[] consumible = ctx.getString(R.string.consumible).split(Pattern.quote("#"));
        dado=(int) (Math.random() * (consumible.length-1)) + 0;
        nombre=consumible[(int)dado];
        dado=(int) (Math.random() * 9) + 1;
        if (dado<8){

        }else {
            String[] quien = ctx.getString(R.string.quien).split(Pattern.quote("#"));
            dado = (int) (Math.random() * (quien.length - 1)) + 0;
            nombre = nombre + " de " + quien[(int) dado];
        }
    }
}
