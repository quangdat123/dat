
package business;

import java.time.LocalDate;


public class student {
    private int studentId;
    private String name;
    private LocalDate BirthDaY;

    public student(int studentId, String name, LocalDate BirthDaY) {
        this.studentId = studentId;
        this.name = name;
        this.BirthDaY = BirthDaY;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDaY() {
        return BirthDaY;
    }

    public void setBirthDaY(LocalDate BirthDaY) {
        this.BirthDaY = BirthDaY;
    }
    
}
