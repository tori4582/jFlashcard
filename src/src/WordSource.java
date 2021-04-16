package src;

import java.io.*;

public class WordSource {
    
    private static final String SOURCE_DIR = "vocab.dat";
    
    private File wordsource ;
    private FileWriter fw;
    private FileReader fr;
    private BufferedWriter writer;
    private BufferedReader reader;
    
    
    
    public WordSource(){
        wordsource = new File(SOURCE_DIR);
    }
    
    public WordList importWords() throws IOException{
        WordList inputWords = new WordList();
        String inputString;
        try {
            fr     = new FileReader(wordsource);
            reader = new BufferedReader(fr);
        } catch (FileNotFoundException e) {
            wordsource.createNewFile();
        }
        while ((inputString = reader.readLine()) != null) {
            System.out.println("Readed : " + inputString);
            String[] token = inputString.split("@");
            inputWords.addWord(new Vocabulary(token[0], token[1]));
        }
        reader.close();
        fr.close();
        return inputWords;
    }
    
    public void flush() throws IOException{
        writer.flush();
    }
    
    
    public void writeList(WordList l) throws IOException{
        
        fw     = new FileWriter(wordsource);
        writer = new BufferedWriter(fw);
        
        for (Vocabulary v : l.toWords()){
            writer.write(v.toString());
        }
        
        writer.close();
        fw.close();
        
    }
    
    public void blockStream() throws IOException {
         reader.close();
         writer.close();
         fw.close();
         fr.close();
    }
    
    
}
