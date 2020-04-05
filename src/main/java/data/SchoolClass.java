package data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "classes")
public class SchoolClass {
    @Id
    @GeneratedValue
    private int id;
    @Column(name = "subject")
    private String subject;
    @Column(name = "description")
    private String description;
    @ManyToOne
    @JoinColumn(name = "staff_id", foreignKey = @ForeignKey( name = "STAFF_ID_FK"))
    private Staff teacher;

    @JoinTable(
            name = "class_student",
            joinColumns = { @JoinColumn(name = "id") },
            inverseJoinColumns = { @JoinColumn(name = "id") })
    private Set<Student> Students = new HashSet<Student>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Staff getTeacher() {
        return teacher;
    }

    public void setTeacher(Staff teacher) {
        this.teacher = teacher;
    }

    public Set<Student> getStudents() {
        return Students;
    }

    public void setStudents(Set<Student> students) {
        Students = students;
    }

    public void addStudent(Student theStudent)
    {
        this.Students.add(theStudent);
    }

    public void removeStudent(Student theStudent)
    {
        this.Students.remove(theStudent);
    }
}
