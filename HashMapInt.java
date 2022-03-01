import java.util.HashMap;
import java.util.Map;

public class HashMapInt {
    public void addAndSort(HashMap<Integer, Integer> hashMap, int value) {
        hashMap.put(hashMap.size(), value);
        for (int i = hashMap.size()-1; i > 0 ; i--) {
            if (hashMap.get(i) < hashMap.get(i-1)) {
                swapValue(hashMap, i, i-1);
            }
        }
    }

    public void swapValue(HashMap<Integer, Integer> hashMap, int hashIndexOne, int hashIndexTwo) {
        int hashValueOne = hashMap.get(hashIndexOne);
        int hashValueTwo = hashMap.get(hashIndexTwo);
        hashMap.replace(hashIndexOne, hashValueTwo);
        hashMap.replace(hashIndexTwo, hashValueOne);
    }

    public int findValue(HashMap<Integer, Integer> hashMap, int hashSearchVal) {
        for(Map.Entry<Integer, Integer> map : hashMap.entrySet()) {
            if (map.getValue() == hashSearchVal) {
                return (map.getKey());
            }
        }
        return -1;
    }
}
