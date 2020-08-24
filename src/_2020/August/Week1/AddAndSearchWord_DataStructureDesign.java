package _2020.August.Week1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AddAndSearchWord_DataStructureDesign {
    public static void main(String[] args) {

    }
}

// this mine
class WordDictionary {
    String[] words;
    int pointer;
    /** Initialize your data structure here. */
    public WordDictionary() {
        words = new String[50000];
    }

    /** Adds a word into the data structure. */
    public void addWord(String word) {
        words[pointer++] = word;
    }

    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {
        for(int i = 0; i < pointer; i++) {
            if(words[i].length() != word.length())
                continue;

            for(int j = 0; j < word.length(); j++) {
                if(j == word.length()-1 && word.charAt(j) == '.')
                    return true;
                if(word.charAt(j) == '.')
                    continue;
                else if(word.charAt(j) != words[i].charAt(j))
                    break;
                if(j == word.length()-1)
                    return true;
            }
        }
        return false;
    }
}

class WordDictionary1 {

    /** Initialize your data structure here. */

    private Map<Integer, List<String>> map;
    public WordDictionary1() {

        map = new HashMap<>();

    }

    /** Adds a word into the data structure. */
    public void addWord(String word) {

        if(map.containsKey(word.length())) {

            map.get(word.length()).add(word);

        } else {
            List<String> list = new ArrayList<>();
            list.add(word);
            map.put(word.length(),list);
        }

    }

    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {

        // System.out.println("Hey There !! From search");
        // System.out.println(map);

        if(map.containsKey(word.length())) {

            List<String> tempList = map.get(word.length());

            for(String str: tempList) {
                if(compareWords(word,str)) {
                    return true;
                }
            }

            return false;

        } else {
            return false;
        }

    }

    private boolean compareWords(String word, String dictWord) {


        for(int c=0;c<word.length();c++) {
            if(word.charAt(c)=='.') {
                continue;
            }

            if(word.charAt(c)!=dictWord.charAt(c)) {
                return false;
            }
        }

        return true;


    }
}


