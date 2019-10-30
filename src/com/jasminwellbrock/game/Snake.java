package com.jasminwellbrock.game;

import java.util.ArrayList;

public class Snake {
    // Warten Variable um zu verhindern, dass zu schnelle Tasteneingabe eine Kollision verursacht
    public static boolean waitToMove = false;
    // Head Klase mit Namen head (statisch damit sie nur einmal aufgerufen werden kann und es nur einen Head gibt)
    public static Head head = new Head(7,7);
    // ArrayList für die Schwanzstücke
    public static ArrayList<Tail> tails = new ArrayList<Tail>();

    public static void addTail(){
        if (tails.size() <1){
            tails.add(new Tail(head.getX(), head.getY()));
        } else{
            tails.add(new Tail(tails.get(tails.size()-1).x ,tails.get(tails.size()-1).y));
        }
    }

    public static void move(){

    }
}
