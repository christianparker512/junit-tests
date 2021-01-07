import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;
public class StudentTest {
    @Test
    public void testCreateStudent(){
        Student gabriel = new Student(1L, "Gabriel");
        Student pia = null;
        assertNull(pia);
        assertNotNull(gabriel);
    }
    @Test
    public void testStudentFields(){
        Student gabriel = new Student(1L, "Gabriel");
        assertSame(1L, gabriel.getId());
        assertSame("Gabriel", gabriel.getName());
        assertSame(0, gabriel.getGrades().size());
    }

    @Test
    public void testAddGrade(){
        Student gabriel = new Student(1L, "Gabriel");
        gabriel.addGrade(100);
        assertSame(100, gabriel.getGrades().get(0));
        gabriel.addGrade(80);
        assertSame(80, gabriel.getGrades().get(1));
    }

    @Test
    public void testAverageGrade(){
        Student gabriel = new Student(1L, "fer");
        gabriel.addGrade(100);
        gabriel.addGrade(80);
        assertEquals(90,gabriel.getGradeAverage(), 0);
    }
}