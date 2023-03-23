/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicumpbo.classandobject;

/**
 *
 * @author ACER A515-45-R3RR
 */
class DrumKitTestDrive {

    public static void main(String[] args) {
        DrumKit d = new DrumKit();
        d.playSnare();
        d.playTopHat();
        d.snare = false;
    }
}


