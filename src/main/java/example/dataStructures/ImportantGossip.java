package example.dataStructures;

import java.util.*;
// Lösung von Max Uphoff
public class ImportantGossip {

    private static List<String> importantGossip(String[] words) {
        // count
        Map<String, Integer> counter = new HashMap<>();
        for (String word :
                words) {
            var val = counter.getOrDefault(word, 0);
            counter.put(word, ++val);
        }

        // sort
        List<Map.Entry<String, Integer>> list = new ArrayList<>(counter.entrySet());
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        // cap
        List<String> result = new LinkedList<>();
        for (int i = 0; i < Math.min(list.size(), 5); i++) {
            result.add(list.get(i).getKey());
        }
        return result;
    }

//    static List<String> importantGossip(String... words){
//        Map<String, Integer> wordCount = new HashMap<>( words.length );
//        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
//        ArrayList<Integer> list = new ArrayList<>();
//
//        for(int i = 0; i < words.length; i++){
//            if(wordCount.containsKey(words[i])){
//                int amount = wordCount.get(words[i]) + 1;
//                wordCount.put(words[i], amount);
//            }
//            else {
//                wordCount.put(words[i], 1);
//            }
//        }
//
//        for (Map.Entry<String, Integer> entry : wordCount.entrySet()){
//            list.add(entry.getValue());
//        }
//        Collections.sort(list);
//        for(int num : list){
//            for (Map.Entry<String, Integer> entry : wordCount.entrySet()){
//                if(entry.getValue().equals(num)){
//                    sortedMap.put(entry.getKey(), num);
//                }
//            }
//        }
//        List<String> result = new ArrayList<>();
//            result.add(sortedMap.entrySet().toString());
//        return result;
//    }

    public static void main(String[] args) {
        String[] words = {"Baby Shark", "Corona", "Baby Yoda", "Corona", "Baby Yoda", "Tiger King",
                "David Bowie", "Kylie Jenner", "Kardashian", "Love Island", "Bachelorette",
                "Baby Yoda", "Tiger King", "Billie Eilish", "Corona"
        };
        System.out.println( importantGossip( words ) );
    }
}
