import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class JUnitQuiz {
    @Test
    public void junitQuiz1() {
        String name1 = "홍길동";
        String name2 = "홍길동";
        String name3 = "홍길은";

        assertThat(name1).isNotNull();
        assertThat(name2).isNotNull();
        assertThat(name3).isNotNull(); // name 1 ~ 3 이 null이 아닌지 검증

        assertThat(name1).isEqualTo(name2); // name1, name2 가 같은지 확인

        assertThat(name1).isNotEqualTo(name3); // name1, name3 가 다른지 확인
    }

    @Test
    public void junitQuiz2() {
        int num1 = 15;
        int num2 = 0;
        int num3 = -5;

        assertThat(num1).isPositive(); // 양수인지 검증
        assertThat(num2).isZero(); // 0인지 검증
        assertThat(num3).isNegative(); // 음수인지 검증
        assertThat(num1).isGreaterThan(num2); // num1이 num2보다 큰지 검증
        assertThat(num3).isLessThan(num2); // num3가 num2보다 작은지 검증
    }
}
