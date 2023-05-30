package org.example;

public class Couse {
    private final String subject; //과목명
    private final int credit; //학점
    private final String grade; //성적

    public Couse(String subject, int credit, String grade) {
        this.subject = subject;
        this.credit = credit;
        this.grade = grade;

    }

    public int getCredit() {
        return credit;
    }


    public double getGradleNumber() {

        double grade = 0;
        switch (this.grade) {
            case "A+":
                grade = 4.5;
                break;
            case "A":
                grade = 4.0;
                break;
            case "B+":
                grade = 3.5;
                break;
            case "B":
                grade = 3.0;
                break;
            case "C+":
                grade = 2.5;
                break;
            case "C":
                grade = 2.0;
                break;
        }
        return grade;
    }

    public double multipleCreditAndCouresGrade() {
        return credit / getGradleNumber();
    }
}