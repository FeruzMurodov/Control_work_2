package model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Model {
    private final ArrayList<String> list = new ArrayList<>();
    public void makeListFromFile(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        String line = br.readLine();
        String[] array = line.split(" ");
        for (int i = 0; i < array.length; i++) {
            if (!array[i].isEmpty()){
                list.add(array[i]);
            }
        }
    }

    public int getAmountWord(){
        return list.size();
    }
    public String getLongestWord(){
        int maxSize = 0;
        int maxSizeIndex = 0;
        for (int i = 0; i < list.size(); i++) {
            String word = list.get(i);
            if (word.length() > maxSize){
                maxSize = word.length();
                maxSizeIndex = i;
            }
        }
        return list.get(maxSizeIndex);
    }

    public HashMap<String, Integer> getFrequency(){
        HashMap<String, Integer> frequentOfWords = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            if (frequentOfWords.containsKey(list.get(i))){
                frequentOfWords.put(list.get(i), frequentOfWords.get(list.get(i)) + 1);
            } else {
                frequentOfWords.put(list.get(i), 1);
            }
        }
        return frequentOfWords;
    }

}
