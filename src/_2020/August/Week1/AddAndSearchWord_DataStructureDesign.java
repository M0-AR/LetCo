package _2020.August.Week1;

public class AddAndSearchWord_DataStructureDesign {
    public static void main(String[] args) {

    }
}


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