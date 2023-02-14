package Lesson4;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        scannerCoollection();
    }

    private static void scannerCoollection() {
        Scanner scan = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();
        Collections.addAll(list);

        while (true) {
            System.out.println();
            System.out.print("Введите строку: ");
            String inputString = scan.nextLine();

            if (inputString.length() == 0) {
                System.out.println("Строка не должна быть пустой");
                continue;
            }

            if (inputString.equals("print")) {
                for (int i = 0; i < list.size(); i++) {
                    String newList = list.get(i);
                    String first = list.getFirst();
                    System.out.printf("Первый элемент LinkedList : %s %n", first);
                    String last = list.getLast();
                    System.out.printf("Первый элемент LinkedList : %s %n", last);
                    first = last;
                    last = first;
                    System.out.printf(newList);
                    if (inputString.equals("revert")) { // Как эту часть задачи сделать, я не додумалась.
                        for (int j = 0; j < list.size(); j++) {
                            newList.reverse().toString();
                            System.out.printf(newList);
                        }

                    }
                }
            }

        }

    }
}
