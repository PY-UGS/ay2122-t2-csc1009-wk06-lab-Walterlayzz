import java.util.HashMap;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> link = new LinkedList<>();
        for (int i = 1; i <= 11; i+=2) {
            link.add(i);
        }

        LinkedListInt ll = new LinkedListInt();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer to insert: ");
        int value = input.nextInt();

        System.out.println("List before insertion: \n" + link);
        ll.addAndSort(link, value);
        System.out.println("List after insertion: \n" + link);


        ll.swapValues(link, 1, 5);
        System.out.println("\nAfter swapping index 1 and 5: \n" + link);

        // Generate a list of 500 random integers
        LinkedList<Integer> randList = new LinkedList<>();
        for (int i = 1; i <= 500; i++) {
            Random r = new Random();
            int randomInt = r.nextInt((9999-1000) + 1) + 1000;
            randList.add(randomInt);
        }

        Random r = new Random();
        int randomInt = r.nextInt((9999-1000) + 1) + 1000;

        System.out.println("\nList of 500 random integer: ");
        System.out.println(randList);
        System.out.println("The position of the random int " + randomInt + " is: " + ll.findValue(randList, randomInt));


        System.out.println("\n\n===========================");
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int index = 0;
        for (int i = 1; i <= 11; i+=2) {
            hashMap.put(index, i);
            index++;
        }

        HashMapInt hm = new HashMapInt();
        System.out.println("Enter an integer to add into hashMap: ");
        int hashValue = input.nextInt();
        System.out.println("Hashmap before insertion: \n" + hashMap);
        hm.addAndSort(hashMap, hashValue);
        System.out.println("Hashmap after insertion: \n" + hashMap);

        hm.swapValue(hashMap, 1, 5);
        System.out.println("\nAfter swapping index 1 and 5: \n" + hashMap);

        HashMap<Integer, Integer> randomHashMap = new HashMap<>();
        for (int i = 0; i < 500; i++){
            int hashRandomInt = r.nextInt((9999-1000) + 1) + 1000;
            randomHashMap.put(i, hashRandomInt);
        }
        int hashRandomValue = r.nextInt((9999-1000) + 1) + 1000;

        System.out.println("\nList of 500 random integer: ");
        System.out.println(randomHashMap);
        System.out.println("The position of the random int " + hashRandomValue + " is: " + hm.findValue(randomHashMap, hashRandomValue));
    }
}
