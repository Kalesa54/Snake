package com.jasminwellbrock.gui;

import javax.swing.*;
import java.awt.*;

// Vererbung: Klasse Draw wird um den Inhalt der Klasse JLabel erweitert (der Inhalt wird "vererbt")
public class Draw extends JLabel {
// Paint Komponente vom JLabel wird überschrieben um damit zu zeichnen (overriding)
    protected void paintComponent(Graphics g){
        // der Konstruktor der Klasse JComponent wird aufgerufen und
        super.paintComponent(g);
        // Graphics2D Objekt gecastet
        Graphics2D g2d = (Graphics2D) g;
        // Antialiasing ausschalten
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);

        // Hintergrund zeichnen
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(0,0, Gui.width, Gui.height);

        // Gittermuster hinzufügen
        g.setColor(Color.GRAY);
        for(int x= 0; x<16; x++){
            for (int y = 0; y <16; y++){
                g.drawRect(x * 32 + Gui.xOff, y * 32 + Gui.yOff, 32, 32);
            }
        }

        // Draw Border
        g.setColor(Color.BLACK);
        // Schwarzer Rahmen um das Spielfeld
        g.drawRect(Gui.xOff, Gui.yOff, 512,512);

        repaint();

    }

}
