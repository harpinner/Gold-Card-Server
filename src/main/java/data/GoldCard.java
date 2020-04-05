package data;



import javax.persistence.*;
import java.util.Date;

/**
 * this is a data class representing a gold card
 */
@Entity(name = "gold_cards")
public class GoldCard {
    /**
     * This is the id of the goldCard in the database
     */
    @Id
    private int id;
    /**
     * The Details of how this gold card was earned
     */
    @Column(name = "description")
    private String Description;

    /**
     * The Student who Earned this Gold card
     */
    @ManyToOne
    @JoinColumn(name =  "student_id",foreignKey = @ForeignKey( name = "STUDENT_ID_FK"))
    private Student student;
    /**
     * The Date of when the gold card was issued
     */
    private Date issueDate;

    /**
     * <p>The getter for the id variable
     * </p>
     * @return the id variable
     */
    public int getId() {
        return id;
    }

    /**
     * <p>the setter for the id variable
     * </p>
     * @param id the id
     */
    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }
}
