package org.example;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

//import static jdk.internal.logger.DefaultLoggerFinder.SharedLoggers.system;
//import static jdk.internal.org.jline.reader.impl.LineReaderImpl.CompletionType.List;

public class Main {
    public static void main(String[] args) {

//        List<Integer> list = new ArrayList<>();
//        FillSpisok(list);
//        OutPutSpisok(list);
        FillPlanetsList();


        }
        public static void FillSpisok(List<Integer> list) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int rand = random.nextInt(100);
            list.add(rand);
            }
        }
public static void OutPutSpisok(List<Integer> list) {
        list.sort(null);
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        System.out.println();
}
        public static void FillPlanetsList() {
            String[] AllPlanets = new String[]{"Earth", "Mars", "Jupiter", "Uran", "Pluton", "Saturn", "Venera"};
            List<String> planetList = new ArrayList<>();
            for (int i = 0; i < 1240; i++){
                planetList.add(AllPlanets[(int) (Math.random() * AllPlanets.length)]);
            }
//            for (String string : planetList) {
//                System.out.println(string + " ");
//            }
//            System.out.println("+++");

            planetList.sort(null);
            for (String string : planetList) {
                System.out.println(string + " ");
            }
            System.out.println("+++");
//            for (int i = 0; i < planetList.size(); i++){

            for (int i = 0; i < AllPlanets.length; i++) {
                int count = 0;
                for (int j = 0; j < planetList.size(); j++){
                if (planetList.get(j) == AllPlanets[i]) {
                    count++;
                }
            }
                System.out.println(count + "  x  " + AllPlanets[i]);
            }
        }
    }