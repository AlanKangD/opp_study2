package org.example;

import java.util.List;

public class GradeCalculator {
    private final List<Couse> couses;

    public GradeCalculator(List<Couse> couses) {
        this.couses = couses;
    }

    public double calculateGrade() {
        double multiplidCreditAndCouresGrade = 0;
        for (Couse couse : couses) {
            multiplidCreditAndCouresGrade += couse.multipleCreditAndCouresGrade();
        }

        int totalCompletedCredit = couses.stream()
                .mapToInt(Couse::getCredit)
                .sum();
        return multiplidCreditAndCouresGrade / totalCompletedCredit;
    }
}
