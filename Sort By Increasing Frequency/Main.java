import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        // Insert Your Code Here. Here are the steps to get started: 
        // Step-I: Define the input format using the examples from the problem description. 
        // Step-II: Parse input from standard in. 
        // Step-III: Write your algorithm to generate the required output. 
        // Note: In case of any issues use #feedback channel on Discord. 
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        String[] strArr = str.substring(1, str.length() - 1).split(",");
        Map<Integer, Integer> map = new TreeMap<>();
        for(int i = 0 ; i < strArr.length ; ++i) {
            int x = Integer.valueOf(strArr[i]);
            if(map.containsKey(x)) {
                map.put(x, map.get(x) + 1);
            } else {
                map.put(x, 1);
            }
        }
        Map<Integer, List<Integer> > listMap = new TreeMap<>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(listMap.containsKey(entry.getValue())) {
                listMap.get(entry.getValue()).add(entry.getKey());
            } else {
                List<Integer> l = new ArrayList<>();
                l.add(entry.getKey());
                listMap.put(entry.getValue(), l);
            }
        }
        List<Integer> res = new ArrayList<>();
        for(Map.Entry<Integer, List<Integer> > entry : listMap.entrySet()) {
            Collections.sort(entry.getValue(), Collections.reverseOrder());
            for(Integer v : entry.getValue()) {
                for(int i = 0 ; i < entry.getKey() ; ++i) {
                    res.add(v);
                }
            }
        }
        System.out.print("[");
        for(int i = 0 ; i < res.size() ; ++i) {
            System.out.print(res.get(i));
            if(i < res.size() - 1) {
                System.out.print(",");
            }
        }
        System.out.print("]");
        return;
    }
}

