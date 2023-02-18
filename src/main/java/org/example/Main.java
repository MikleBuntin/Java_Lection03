package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//import static jdk.internal.logger.DefaultLoggerFinder.SharedLoggers.system;
//import static jdk.internal.org.jline.reader.impl.LineReaderImpl.CompletionType.List;

public class Main {
    public static void main(String[] args) {
//        Scanner iScanner = new Scanner(System.in);
////        System.out.printf("Привет! ");
//        System.out.printf("Введте размер числового массива: ");
//        String input_text = iScanner.nextLine();
//        int arr_len = Integer.parseInt(input_text);
//        iScanner.close();

//        int[] array = new int[arr_len];

//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * 100);
//            System.out.println("Array[i]: " + array[i]);

            List<Integer> list = new ArrayList<>();
            FillList(list);
            OutPutList(list);
        }

        public static void FillList(List<Integer> list){
            Random random = new Random();
            for (int i = 0; i < 10;  i++){
                int rand = random.nextInt(100);
                list.add(rand);
            }
        }
        public static void OutPutList(List<Integer> list){
            list.sort(null);
            for (Integer integer : list) {
                System.out.println(integer + ' ');
            }
            System.out.println();
        }

//        System.out.println("Hello world!");
    }