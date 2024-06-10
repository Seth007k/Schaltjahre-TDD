import org.junit.jupiter.api.Test;
import java.util.Calendar;
import static org.junit.jupiter.api.Assertions.*;

class SchaltjahrTest {
                                // 12.10.23;  17.10.2023 korrigiert
    Schaltjahr schaltjahr = new Schaltjahr();
    @Test
    public void testIsSchaltjahr(){

        assertFalse(schaltjahr.isSchaltjahr(1000));
    }

    @Test
    public void testIsNotSchaltjahr(){
        assertFalse(schaltjahr.isSchaltjahr(2019));
    }

    @Test
    public void testIsSchaltjahr0(){
        assertTrue(schaltjahr.isSchaltjahr(400));
    }

    @Test
    public void testIsNegativeSchaltjahr(){
        assertTrue(schaltjahr.isSchaltjahr(-2000));
        assertFalse(schaltjahr.isSchaltjahr(-1700));
    }

    @Test
    public void testSchaltjahrTeilbarDurch4Und100AberNichtDurch400(){
        assertFalse(schaltjahr.isSchaltjahr(1900));
        assertFalse(schaltjahr.isSchaltjahr(2100));
        assertFalse(schaltjahr.isSchaltjahr(2200));
    }

    @Test
    public void testIsSchaltjahrBefore1582(){
        assertFalse(schaltjahr.isSchaltjahr(1500));
        assertTrue(schaltjahr.isSchaltjahr(1556));
        assertFalse(schaltjahr.isSchaltjahr(1499));
    }

    @Test
    public void testZukuenftigesJahrSchaltjahr(){
        int actualJahr = Calendar.getInstance().get(Calendar.YEAR);

        assertTrue(schaltjahr.isSchaltjahr(actualJahr + 1));
    }

    @Test
    public void testVergangenesJahrSchaltjahr(){
        int actualJahr = Calendar.getInstance().get(Calendar.YEAR);

        assertFalse(schaltjahr.isSchaltjahr(actualJahr - 1));
    }
}








