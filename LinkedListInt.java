import java.util.*;

public class LinkedListInt {

    public void addAndSort(LinkedList<Integer> list, int value) {
        int index = 0;
        for(int i = 0; i < list.size(); i++) {
            if (value >= list.get(i)) {
                index = i+1;
            }
        }
        list.add(index, value);
    }

    public void swapValues(LinkedList<Integer> list, int indexOne, int indexTwo) {
        int firstTerm = list.get(indexOne);
        int secondTerm = list.get(indexTwo);
        list.set(indexOne, secondTerm);
        list.set(indexTwo, firstTerm);
    }

    public int findValue(LinkedList<Integer> randList, int searchVal) {
        if (randList.contains(searchVal)) {
            return randList.indexOf(searchVal);
        }
        else {
            return -1;
        }
    }
}

