package com.jasminwellbrock.actions;

import com.jasminwellbrock.game.Dir;
import com.jasminwellbrock.game.Snake;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {

    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        switch (keyEvent.getKeyCode()) {
            // Taste W drücken
            case KeyEvent.VK_W:
                // wenn wir uns nicht nach unten bewegen und der Time für die Bewegung abgelaufen ist
                if (!(Snake.head.getDir() == Dir.DOWN) && !Snake.waitToMove) {
                    Snake.head.setDir(Dir.UP);
                    // warten bis der Head tatsächlich nach oben gelaufen ist
                    Snake.waitToMove = true;
                }
                break;
            case KeyEvent.VK_A:
                // wenn wir uns nicht nach unten bewegen und der Time für die Bewegung abgelaufen ist
                if (!(Snake.head.getDir() == Dir.RIGHT) && !Snake.waitToMove) {
                    Snake.head.setDir(Dir.LEFT);
                    // warten bis der Head tatsächlich nach links gelaufen ist
                    Snake.waitToMove = true;
                }
                break;
            case KeyEvent.VK_S:
                // wenn wir uns nicht nach unten bewegen und der Time für die Bewegung abgelaufen ist
                if (!(Snake.head.getDir() == Dir.UP) && !Snake.waitToMove) {
                    Snake.head.setDir(Dir.DOWN);
                    // warten bis der Head tatsächlich nach unten gelaufen ist
                    Snake.waitToMove = true;
                }
                break;
            case KeyEvent.VK_D:
                // wenn wir uns nicht nach unten bewegen und der Time für die Bewegung abgelaufen ist
                if (!(Snake.head.getDir() == Dir.LEFT) && !Snake.waitToMove) {
                    Snake.head.setDir(Dir.RIGHT);
                    // warten bis der Head tatsächlich nach rechts gelaufen ist
                    Snake.waitToMove = true;
                }
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {

    }
}
