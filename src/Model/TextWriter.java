package Model;

import java.io.FileWriter;
import java.io.IOException;

public class TextWriter <T> {
    public void textWriter(T object) {
        try (FileWriter writer = new FileWriter("notes3.txt", false)) {

            writer.write((String) object);
            // запись по символам
            writer.append('\n');
            writer.append('E');

            writer.flush();
        }
        catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}
