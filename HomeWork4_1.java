package Lesson4;

import java.util.LinkedList;

public class HomeWork4_1 {
    public static void main(String[] args) {
        int[] listFirst = {8, 4, 1, 9, 2, 5, 1, 3};
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (Integer temp : listFirst) {
            linkedList.add(temp);
        }

        int temp = 0;
        while (temp != linkedList.size() - 1) {
            linkedList.add(linkedList.size()-temp, linkedList.getFirst());
            linkedList.removeFirst();
            temp++;
        }


        System.out.println("Перевернутый список = " + linkedList);


    }
}
