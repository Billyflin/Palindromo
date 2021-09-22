import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromoTest {
    Palindromo p;

    @BeforeEach
    void setUp() {
        p=new Palindromo();
    }

    @AfterEach
    void tearDown() {
        p=null;
    }

    @Test
    void esPalindromo() {
    }
    @Test
    public void esPalindromo1() {
        assertTrue(p.esPalindromo("anitalavalatina"));
    }
    @Test
    public void esPalindromo2() {
        assertTrue(p.esPalindromo("AnitaLavaLaTina"));
    }
    @Test
    public void esPalindromo3() {
        assertTrue(p.esPalindromo("anita lava la tina"));
    }
    @Test
    public void esPalindromo4() {
        assertTrue(p.esPalindromo("010010"));
    }
    @Test
    public void esPalindromo5() {
        assertTrue(p.esPalindromo("%#@#%"));
    }

    // "aca", "acas", "h"
    @Test
    public void esPalindromo6() {
        assertTrue(p.esPalindromo("aca"));
    }
    @Test
    public void esPalindromo7() {
        assertFalse(p.esPalindromo("acas"));
    }
    @Test
    public void esPalindromo8() {
        assertFalse(p.esPalindromo("h"));
    }

    // Casos del paso 4
    @Test
    public void esPalindromo9() {
        assertFalse(p.esPalindromo("200"));
    }
    @Test
    public void esPalindromo10() {
        assertFalse(p.esPalindromo(""));
    }
    @Test
    public void esPalindromo11() {
        assertTrue(p.esPalindromo("aaabccbaaa"));
    }
    @Test
    public void esPalindromo12() {
        assertFalse(p.esPalindromo("ahabccbaaa"));
    }
    @Test
    public void esPalindromo13() {
        assertTrue(p.esPalindromo("La tele letal"));
    }

    // Casos adicionales de la versión final
    @Test
    public void esPalindromo14() {
        assertFalse(p.esPalindromo(" "));
    }
    @Test
    public void esPalindromo15() {
        assertFalse(p.esPalindromo("E"));
    }
    @Test
    public void esPalindromo16() {
        assertTrue(p.esPalindromo("Ají traga la lagartija"));
    }
    @Test
    public void esPalindromo17() {
        assertTrue(p.esPalindromo("ýáöèïeoay"));
    }
    @Test
    public void esPalindromo18() {
        assertTrue(p.esPalindromo("aaabccbaaa"));
    }
    @Test
    public void esPalindromo19() {
        assertTrue(p.esPalindromo("La tele letal"));
    }
    @Test
    public void esPalindromo20() {
        assertFalse(p.esPalindromo(""));
    }
    @Test
    public void esPalindromo21() {
        assertFalse(p.esPalindromo("ahabccbaaa"));
    }

}