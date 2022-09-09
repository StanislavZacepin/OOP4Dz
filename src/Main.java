import Entity.FileTask;
import Entity.Priority;
import Model.TextWriter;

import java.sql.Date;
import java.text.DateFormat;

public class Main {
    public static void main(String[] args) {

        FileTask fileTask = new FileTask(1,"Алакрик Зальтцман", Priority.PriorityImmediateExecution
                , new Date(1992,10,10),"Покрасить арбалет");
        TextWriter textWriter = new TextWriter();
        textWriter.textWriter(fileTask);

    }
}
