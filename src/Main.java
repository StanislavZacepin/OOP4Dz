import Entity.FileTask;
import Entity.Priority;
import Model.CompareByFileTask;
import Model.TextReader;
import Model.TextWriter;

import java.sql.Date;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        FileTask fileTask = new FileTask(1,"Алакрик Зальтцман", Priority.PriorityImmediateExecution
                , new Date(92,10,10),"Покрасить арбалет");

        FileTask fileTask1 = new FileTask(2,"Алакрик Зальтцман1", Priority.PriorityMedium
                , new Date(92,10,10),"Покрасить арбалет");

        FileTask fileTask2 = new FileTask(3,"Алакрик Зальтцман2", Priority.PriorityIsLow
                , new Date(92,10,10),"Покрасить арбалет");


        List<FileTask> fileTaskList = Arrays.asList(fileTask2,fileTask,fileTask1);
        for (FileTask task : fileTaskList) {
            System.out.println(task.getId());
        }

        CompareByFileTask compareByFileTask= new CompareByFileTask();
        fileTaskList.sort(compareByFileTask);

        for (FileTask task : fileTaskList) {
            System.out.println(task.getId());
        }

        TextWriter textWriter = new TextWriter();
        textWriter.textWriter(fileTask);

        TextReader textReader = new TextReader();
        textReader.textReader("notes3.txt");

    }
}
