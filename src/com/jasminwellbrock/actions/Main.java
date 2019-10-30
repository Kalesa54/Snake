package com.jasminwellbrock.actions;

import com.jasminwellbrock.clocks.GameClock;
import com.jasminwellbrock.gui.Gui;

public class Main {

    public static void main(String[] args) {
        // neues Objekt der Klasse Gui erzeugen
        Gui g = new Gui();
        GameClock gc = new GameClock();
        // aufrufen der Methode create
        g.create();
        // statrten der GameClock
        gc.start();

    }
}
