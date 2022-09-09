package Model;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextReader <T>{
    public void textReader(T object){
        try(FileReader reader = new FileReader("notes3.txt"))
        {
            String readText;
            readText = String.valueOf(reader.read());
            System.out.println(readText);
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
