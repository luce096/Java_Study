package was.practice;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class QueryStringTest {

    // QueryString 객체 생성 테스트
    @Test
    void createTest() {
        QueryString queryString = new QueryString("operand1", "11");

        // 객체가 null이 아닌지 확인
        assertThat(queryString).isNotNull();
    }
}
