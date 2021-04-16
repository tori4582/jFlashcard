
package src;

import java.util.ArrayList;
import java.util.Random;

public class WordList {
    
    private ArrayList<Vocabulary> wordlist        = new ArrayList();
    private ArrayList<Vocabulary> checkedWordList = new ArrayList();
    
    private Random random = new Random();
    
    public void addWord(Vocabulary v){
        wordlist.add(v);
    }
    
    public void clearChecked(){
        checkedWordList.clear();
    }
    
    public Vocabulary nextWord() {
        
        if (checkedWordList.size() == wordlist.size()) clearChecked();
        
        Vocabulary v = null;
        
        int state = 0; //not found
        
        while (state == 0){

            int ran_result = random.nextInt(wordlist.size());
            
            v = wordlist.get(ran_result);

            if (!checkedWordList.contains(v)) {
                state = 1;
                checkedWordList.add(v);
            } 
        }
        return v;
    }
    
    public boolean isEmpty() {
        return wordlist.isEmpty();
    }
    
    public ArrayList<Vocabulary> toWords() {
        return wordlist;
    }
    
    @Override
    public String toString(){
        String t = "";
        for (Vocabulary v : wordlist) {
            t = t + v.toString();
        }
        return t;
    }
    
}
