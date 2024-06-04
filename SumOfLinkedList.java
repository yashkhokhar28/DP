import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class SumOfLinkedList {
    public static void main(String[] args) {
        System.out.println("Enter Size : ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        LinkedList<Integer> linkedList1 = takeInput(size);
        LinkedList<Integer> linkedList2 = takeInput(size);
        LinkedList<Character> linkedList3 = sumOfLinkedList(linkedList1, linkedList2);
        Collections.reverse(linkedList3);
        System.out.println(linkedList3);
        scanner.close();
    }

    static LinkedList<Integer> takeInput(int size) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            System.out.println("Enter " + (i + 1) + " Element : ");
            int element = scanner.nextInt();
            linkedList.add(element);
        }
        Collections.reverse(linkedList);
        return linkedList;
    }

    static LinkedList<Character> sumOfLinkedList(LinkedList<Integer> linkedList1, LinkedList<Integer> linkedList2) {
        String string1 = "";
        String string2 = "";
        for (int i = 0; i < linkedList1.size(); i++) {
            string1 += linkedList1.get(i);
        }
        for (int i = 0; i < linkedList2.size(); i++) {
            string2 += linkedList2.get(i);
        }
        int sum = Integer.parseInt(string1) + Integer.parseInt(string2);
        String sumString = String.valueOf(sum);
        LinkedList<Character> linkedList = new LinkedList<>();
        for (int i = 0; i < sumString.length(); i++) {
            linkedList.add(sumString.charAt(i));
        }
        return linkedList;
    }
}
