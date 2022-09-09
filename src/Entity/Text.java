package Entity;

import java.sql.Date;

public abstract class Text implements CommunicationText {

    private Integer id;
    private String fio;
    private Priority priority;
    private Date date;
    private String task;



    public String getText() {
        return task;
    }

    public void setText(String task) {
        this.task = task;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
