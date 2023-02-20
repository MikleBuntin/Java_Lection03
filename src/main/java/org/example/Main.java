package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

//import static jdk.internal.logger.DefaultLoggerFinder.SharedLoggers.system;
//import static jdk.internal.org.jline.reader.impl.LineReaderImpl.CompletionType.List;

public class Main {
    public static void main(String[] args) {

//        int[] resultArray = new int[arr_len]; // Созадаём пустой список нужного размера

        String[] planets = {"Mercury", "Venera", "Earth", "Mars", "Jupyter", "Saturn", "Uran", "Neptun", "Pluton"};

            ArrayList<String> resultList = new ArrayList<>();
            FillList(planets[]);
//            OutPutList(list);
        }

        public static void FillList(String[] planetList){

//                    Запрашиваем размер списка
            Scanner iScanner = new Scanner(System.in);
            System.out.printf("Привет! ");
            System.out.printf("Введте размер числового массива: ");
            String input_text = iScanner.nextLine();
            int arr_len = Integer.parseInt(input_text);
            iScanner.close();
            Random random = new Random();

            for (int i = 0; i < arr_len;  i++){
                int rand = random.nextInt(planetList.toArray().length);
                list.add(list.get(rand));


            }
        }
        public static void OutPutList(List<Integer> list){
            list.sort(null);
            for (Integer integer : list) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }