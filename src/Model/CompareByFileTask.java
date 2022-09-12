package Model;

import Entity.FileTask;
import Entity.Priority;

import java.util.Comparator;

public class CompareByFileTask implements Comparator<FileTask> {
    @Override
    public int compare(FileTask o1, FileTask o2) {

            return  o1.getPriority() == Priority.PriorityImmediateExecution ? o1.getId() : o2.getId();

    }
}
