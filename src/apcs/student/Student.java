package apcs.student;
/**
 * This class models a single Student and their scores on two tests.
 *
 * @author Shriya Biddala
 *
 */

public class Student {
    private String name = "";
    private int id = 0;
    private double score1 = -1.0;
    private double score2 = -1.0;
    private double average1 = -1.0;
    private double max = -1.0;
    private double test1 = -1.0;
    private double test2 = -1.0;

    /**
     * Creates a new instance of Student with the specified id number.
     * @param studentid the student id
     */
    //constructor1
    public Student(int studentid){
        id = studentid;
    }
    //constructor 2
    public Student(String studentname, int studentid, double test1, double test2){
       name = studentname;
       id = studentid;
       score1 = test1;
       score2 = test2;
    }

    public String getName() {
        return name;
    }
    public void setName(String stuname){
        name = stuname;
    }

    public int getId() {
        return id;
    }

    public double getScore(int test) {
       if (test == 1){
           return score1;
       } else if (test == 2){
           return score2;
       } else {
           return -1.0;
       }
    }

    /**
     * Updates a test score for a Student.
     * Preconditions:
     * - the test number must be 1 or 2
     * - the score must be 0.0 through 100.0
     *
     * @param test The test number to update
     * @param score The new score
     */
    public void setScore(int test, double score){
        if (test != 1 && test != 2){
            throw new IllegalArgumentException("The test number must be a 1 or 2.");
        }
        if (score < 0.0 || score > 100.0){
            throw new IllegalArgumentException("Invalid; The score must be in between the range of 0.0 and 100.0.");
        }
        if (test == 1) {
            score1 = score;
        } else if (test == 2){
            score2 = score;
        } else {
            System.out.println("You haven't taken your test yet!");
        }
    }

    /**
     * Calculates and returns the average of any tests taken
     * @return The average test score of -1.0 if none have been taken yet
     */
    public double getAverage() {
        if (score1 > 0 && score2 > 0) {
            average1 = (score1 + score2) / 2;
        } else if (score1 < 0 || score2 < 0) {
            if (score1 < 0) {
                average1 = score2;
            } else if (score2 < 0) {
                average1 = score1;
            }
        } else {
            average1 = -1.0;
        }
        return average1;
    }

    public double getMaximum() {
        if (score1 > score2){
           max = score1;
        } else if (score1 < score2){
            max = score2;
        }
        return max;
    }

    public String toString() {
        String info = "Student Name: " + name + " Student Id: " + id + " Test 1: " + score1 + " Test 2: " + score2;
        return info;
    }

    public boolean equals(Student other) {
        if (id == other.id) {
            return true;
        } else {
            return false;
        }
    }


}
