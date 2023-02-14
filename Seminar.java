package Lesson4;

import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.*;

public class Seminar {
    public static void main(String[] args) {
        ex4();
        ex5();
    }

    private static void ex4() {
        final int SIZE = 1_000_000;
        Random random = new Random();

        ArrayList<Integer> arrayList = new ArrayList<>();
        long start = System.currentTimeMillis();

        for (int i = 0; i < SIZE; i++) {
            arrayList.add(0, 1);
        }
        System.out.println("ArrayList: " + (System.currentTimeMillis() - start));


        LinkedList<Integer> linkedList = new LinkedList<>();
        start = System.currentTimeMillis();

        for (int i = 0; i < SIZE; i++) {
            linkedList.add(0, 1);
        }
        System.out.println("LinkedList: " + (System.currentTimeMillis() - start));
    }


    private static void ex5() {
        Scanner in = new Scanner(System.in);
        LinkedList<String> wordsList = new LinkedList<>();
        Collections.addAll(wordsList, "apple", "orange", "banana", "tomato", "strawberry", "melon");
        int num = 0;


        while (true) {
            System.out.println();
            System.out.print("Введите строку: ");
            String inputString = in.nextLine();

            if (inputString.length() == 0) {
                System.out.println("Строка не должна быть пустой");
                continue;
            }
            if (inputString.equals("print~all")) {
                for (int i = 0; i < wordsList.size(); i++) {
                    String wordFromList = wordsList.get(i);
                    if (wordFromList == null) {
                        System.out.printf("%2d) -%n", i + 1);
                    } else {
                        System.out.printf("%2d) %s%n", i + 1, wordFromList);
                    }
                }
                continue;
            }
            if (!inputString.contains("~")) {
                System.out.println("Строка не содержит тильду");
                continue;
            }

            String[] parts = inputString.split("\\~");
            String word = parts[0];
            try {
                num = Integer.parseInt(parts[1]);
            } catch (NumberFormatException e) {
                System.out.println("Выражение не содержит числа");
                continue;
            }

            if (word.equals("print")) {
                String wordFromList = wordsList.get(num - 1);
                if (wordFromList == null || num < 0 || num > wordsList.size() + 1) {
                    System.out.printf("По текущему индексу %d не найдено значений%n", num);
                } else {
                    System.out.printf("Под номером %d находится слово: %s%n", num, wordFromList);
                }
            } else if (num >= wordsList.size() + 1) {
                for (int i = wordsList.size(); i < num - 1; i++) {
                    wordsList.add(null);
                }
                wordsList.add(word);
                System.out.printf("Слово %s добавлено на позицию %d%n", word, num);
            } else {
                String oldWord = wordsList.get(num - 1);
                wordsList.set(num - 1, word);
                if (oldWord == null) {
                    System.out.printf("Слово %s добавлено на позицию %d%n", word, num);
                } else {
                    System.out.printf("Слово %s заменило на позиции %d слово %s%n", word, num, oldWord);
                }
            }
        }
    }
}
