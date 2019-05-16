
package business;

import java.time.LocalDate;


public class student {
    private int studentId;
    private String name;
    private String address;

    public student(int studentId, String name, String address) {
        this.studentId = studentId;
        this.name = name;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
