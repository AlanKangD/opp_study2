package org.example;

import org.assertj.core.api.FactoryBasedNavigableListAssert;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 *
 평균학점 계산 방법 = (학점수×교과목 평점)의 합계/수강신청 총학점 수
 MVC패턴(Model-View-Controller) 기반으로 구현한다.
 일급 컬렉션 사용
 */
public class GradeCalculatorTest {

    @Test
    void calculateGradeTest() {
        List<Couse> couses = List.of(new Couse("OOP" , 3, "A+"),
                new Couse("자료구조" , 3, "A+"));

        GradeCalculator gradeCalculator = new GradeCalculator(couses);
        double gradleResult =  gradeCalculator.calculateGrade();

        assertThat(gradleResult).isEqualTo(4.5);

    }
}
