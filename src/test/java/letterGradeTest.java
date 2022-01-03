import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class letterGradeTest {
    @Test
    void GradeA_lower_bound() {char ans = letterGrade.func(90);assertEquals(ans ,'A');}
    @Test
    void GradeA_upper_bound() {char ans = letterGrade.func(100);assertEquals(ans ,'A');}
    @Test
    void GradeB_lower_bound() {char ans = letterGrade.func(80);assertEquals(ans ,'B');}
    @Test
    void GradeB_upper_bound() {char ans = letterGrade.func(89);assertEquals(ans ,'B');}
    @Test
    void GradeC_lower_bound() {char ans = letterGrade.func(70);assertEquals(ans ,'C');}
    @Test
    void GradeC_upper_bound() {char ans = letterGrade.func(79);assertEquals(ans ,'C');}
    @Test
    void GradeD_lower_bound() {char ans = letterGrade.func(60);assertEquals(ans ,'D');}
    @Test
    void GradeD_upper_bound() {char ans = letterGrade.func(69);assertEquals(ans ,'D');}
    @Test
    void GradeF_lower_bound() {char ans = letterGrade.func(0);assertEquals(ans ,'F');}
    @Test
    void GradeF_upper_bound() {char ans = letterGrade.func(59);assertEquals(ans ,'F');}
    @Test
    void GradeX_lower_bound() {char ans = letterGrade.func(-1);assertEquals(ans ,'X');}
    @Test
    void GradeX_upper_bound() {char ans = letterGrade.func(101);assertEquals(ans ,'X');}
    @Test
    void GradeA() {
        char ans = letterGrade.func(95);
        assertEquals(ans ,'A');
    }
    @Test
    void GradeB() {
        char ans = letterGrade.func(85);
        assertEquals(ans ,'B');
    }
    @Test
    void GradeC() {
        char ans = letterGrade.func(75);
        assertEquals(ans ,'C');
    }
    @Test
    void GradeD() {
        char ans = letterGrade.func(65);
        assertEquals(ans ,'D');
    }
    @Test
    void GradeF() {
        char ans = letterGrade.func(55);
        assertEquals(ans ,'F');
    }
    @Test
    void GradeX() {
        char ans = letterGrade.func(150);
        assertEquals(ans ,'X');
    }
}