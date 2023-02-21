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

//        int[] resultArray = new int[arr_len]; // Созадаём пустой список нужного размера

//        String[] planets = {"Mercury", "Venera", "Earth", "Mars", "Jupyter", "Saturn", "Uran", "Neptun", "Pluton"};
//
//            ArrayList<String> resultList = new ArrayList<>();
//            FillList(planets);
//            OutPutList(list);
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
            System.out.print(Integer + " ");
        }
        System.out.println();
}
        public static void FillPlanets() {
            String[] AllPlanets = new String[]{"Earth", "Mars", "Jupiter", "UrAN"};
            List<String> planetList = new ArrayList<>();
            for (int i = 0; i < 10; i++){
                planetList.add(AllPlanets[(int) (Math.random() * AllPlanets.length)]);
            }
            for (String string : planetList) {
                System.out.println(string + " ");
            }
            System.out.println();
        }
    }