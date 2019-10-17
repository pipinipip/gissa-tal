package me.pipinipip;

import javax.swing.*;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Random random = new Random();
        int answer = random.nextInt(100);
        // skapande av ett random tal mellan 0 och 1 som sedan gångras med 100
        int points = 0;
        while(true) {
            String input = JOptionPane.showInputDialog("Gissa ett tal mellan 0 och 100");
            int tal = (int) Math.round(Double.parseDouble(input));
            // här avrundas decimaltal till nämaste tal eftersom malte skrev in ett decimaltal och crashade mitt program.
            if (tal == answer) {
                JOptionPane.showMessageDialog(null, String.format("Vinst\nDu fick %d poäng", points));
                break;
            } else if (tal < answer) {
                JOptionPane.showMessageDialog(null, "Gissa högre");
            } else {
                JOptionPane.showMessageDialog(null, "Gissa lägre");
            }
            points++;

        }

    }
}