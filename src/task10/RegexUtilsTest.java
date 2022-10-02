package task10;

import static task10.RegexUtils.isDate;
import static task10.RegexUtils.isEmail;
import static task10.RegexUtils.isGUID;
import static task10.RegexUtils.isIP;
import static task10.RegexUtils.isMAC;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class RegexUtilsTest {
    @Test
    public void testGUID(){
        Assertions.assertTrue(isGUID("{e02fa0e4-01ad-090A-c130-0d05a0008ba0}"));
        Assertions.assertTrue(isGUID("e02fd0e4-00fd-090A-ca30-0d00a0038ba0"));
        Assertions.assertFalse(isGUID("02fa0e4-01ad-090A-c130-0d05a0008ba0}"));
        Assertions.assertFalse(isGUID("e02fd0e400fd090Aca300d00a0038ba0 40"));
    }

    @Test
    public void testMAC(){
        Assertions.assertTrue(isMAC("01:32:54:67:89:AB"));
        Assertions.assertTrue(isMAC("aE:dC:cA:56:76:54"));
        Assertions.assertFalse(isMAC("01:33:47:65:89:ab:cd"));
        Assertions.assertFalse(isMAC("01:23:45:67:89:Az"));
    }

    @Test
    public void testDate(){
        Assertions.assertTrue(isDate("29/02/2000"));
        Assertions.assertTrue(isDate("30/04/2003"));
        Assertions.assertTrue(isDate("01/01/2003"));
        Assertions.assertFalse(isDate("29/02/2001"));
        Assertions.assertFalse(isDate("30-04-2003"));
        Assertions.assertFalse(isDate("1/1/1899 "));
    }

    @Test
    public void testEmail(){
        Assertions.assertTrue(isEmail("mail@mail.ru"));
        Assertions.assertTrue(isEmail("valid@megapochta.com"));
        Assertions.assertTrue(isEmail("aa@aa.info"));
        Assertions.assertFalse(isEmail("bug@@@com.ru"));
        Assertions.assertFalse(isEmail("@val.ru"));
        Assertions.assertFalse(isEmail("Just Text2"));
        Assertions.assertFalse(isEmail("val@val"));
        Assertions.assertFalse(isEmail("val@val.a.a.a.a"));
        Assertions.assertFalse(isEmail("12323123@111[]][]"));
    }

    @Test
    public void testIP(){
        Assertions.assertTrue(isIP("127.0.0.1"));
        Assertions.assertTrue(isIP("255.255.255.0"));
        Assertions.assertTrue(isIP("192.168.0.1"));
        Assertions.assertFalse(isIP("1300.6.7.8"));
        Assertions.assertFalse(isIP("abc.def.gha.bcd"));
        Assertions.assertFalse(isIP("254.hzf.bar.10"));
    }
}