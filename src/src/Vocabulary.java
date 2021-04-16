
package src;

public class Vocabulary {
    private String word;
    private String meaning;
    
    public Vocabulary(String word, String meaning){
        this.word    = word;
        this.meaning = meaning;
    }
    
    public String getWord(){
        return this.word;
    }
    
    public String getMeaning() {
        return this.meaning;
    }
    
    public void setWord(String word) {
        this.word = word;
    }
    
    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }
    
    @Override
    public String toString(){
        return word + "@" + meaning + "\n";
    }
    
}
