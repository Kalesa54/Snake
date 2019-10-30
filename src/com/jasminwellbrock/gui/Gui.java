package com.jasminwellbrock.gui;

import javax.swing.*;

public class Gui {
    // Graphical User Interface
    JFrame jf;
    // Draw Objekt wird erstellt
    Draw d;
    // Variablen für Höhe und Breite
    public static int width = 800, height = 600;
    //Variablen um das Spielfeld einzugrenzen; width/ -170, damit das Spielfeld etwa in der Mitte des Fensters ist
    public static int xOff = 130, yOff = 20;

    public void create() {
        jf = new JFrame("snake");
        //Höhe und Breite des Fensters
        jf.setSize(width, height);
        // Schließen des Fensters durch x anklicken
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Fenster wird beim Hauptbildschirm in der Mitte geöffnet
        jf.setLocationRelativeTo(null);

        // es wird kein Layout verwendet!! später auskommentieren der Zeile
        jf.setLayout(null);

        //Fenstergröße lässt sich nicht verändern
        jf.setResizable(false);

        d = new Draw();
        // Feld von links oben nach rechts unten
        d.setBounds(0,0, width, height);
        // sichtbar
        d.setVisible(true);
        // Draw Objekt dem JFrame hinzufügen
        jf.add(d);
        // Fokus auf die Tastatureingabe um die Tastatur einzulesen
        jf.requestFocus();
        // JFrame ist sichtbar
        jf.setVisible(true);
    }
}
