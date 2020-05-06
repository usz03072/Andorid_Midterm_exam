package net.skhu;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Exam3Memo implements Serializable {
    final static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    String title;
    String body;
    Date date;
    boolean checked;
    public Exam3Memo(String title, Date date) {
        this.title = title;
        this.date = date;
    }
    public Exam3Memo(String title, String body, Date date) {
        this.title = title;
        this.body = body;
        this.date = date;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }
    public boolean isChecked() {
        return checked;
    }
    public void setChecked(boolean checked) {
        this.checked = checked;
    }
}