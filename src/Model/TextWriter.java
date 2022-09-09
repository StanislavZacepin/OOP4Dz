package Model;

import Entity.FileTask;
import Entity.Priority;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;

public class TextWriter <T> {
    public void textWriter(FileTask fileTask) {
        try (FileWriter writer = new FileWriter("notes3.txt", false)) {


             Integer id = fileTask.getId();
             String fio = fileTask.getFio();
             Priority priority = fileTask.getPriority();
             Date date = fileTask.getDate();
             String task = fileTask.getText();

            writer.write("id="+id +" fio="+fio +" priority="+priority +" date="+date +" task="+task);
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
