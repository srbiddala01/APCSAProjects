package apcs.student;

public class Student {
    private String name;
    private int id;
    private double score1;
    private double score2;
    private double av1;
    private double max;

    //constructor1
    public void Student(int studentid){
        id = studentid;
    }
    //constructor 2
    public void Student(String studentname, int studentid, double test1, double test2){
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

    public void setScore1(int test, double score){
        if (test == 1){
            score1 = score;
        } else if (test == 2){
            score2 = score;
        } else {
            System.out.println("You have not taken your test yet");
        }
    }

    public double getAverage() {
        av1 = (score1 + score2)/2;
        return av1;
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
        String info = "Student Name: " + name + " Student Id: " + id + " Student's Test Score Average: " + av1;
        return info;
    }

    public boolean equals(Student other) {
        if (score1 == other.score1 && score2 == other.score2) {
            return true;
        } else {
            return false;
        }
    }
}
