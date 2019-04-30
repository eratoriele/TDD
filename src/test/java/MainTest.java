import org.junit.*;

import static org.junit.Assert.*;

public class MainTest{
    private final Main m_TEST = new Main();

    @Test
    public void testGrades12() {
        String returnedVal = m_TEST.grades(12);
        assertEquals("Excellent", returnedVal);
    }

    @Test
    public void testGrades10() {
        String returnedVal = m_TEST.grades(10);
        assertEquals("Very Good", returnedVal);
    }
    @Test
    public void testGrades7() {
        String returnedVal = m_TEST.grades(7);
        assertEquals("Good", returnedVal);
    }
    @Test
    public void testGrades4() {
        String returnedVal = m_TEST.grades(4);
        assertEquals("Fair", returnedVal);
    }
    @Test
    public void testGrades2() {
        String returnedVal = m_TEST.grades(2);
        assertEquals("Adequete", returnedVal);
    }
    @Test
    public void testGrades00() {
        String returnedVal = m_TEST.grades(0);
        assertEquals("Inadequete", returnedVal);
    }
    @Test
    public void testGrades_3() {
        String returnedVal = m_TEST.grades(-3);
        assertEquals("Fail", returnedVal);
    }
    @Test
    public void testGrades5() {
        String returnedVal = m_TEST.grades(5);
        assertEquals("Not an appliable integer", returnedVal);
    }

}