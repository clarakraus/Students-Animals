import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassValidatorTest {

    @Test
    void shouldFailIfTooShort(){
        //Given
        String testPw = "1234567bW";
        String expected = "Zu wenig Zeichen, bitte mindestens 10 Zeichen verwenden. ";
        //When
        String actual = PassValidator.passwordValidator(testPw);
        //Then
        assertEquals(expected,actual);
    }

    @Test
    void shouldFailWithoutNumbers(){
        //Given
        String testPw = "asdrfntlbW";
        String expected = "Mindestens eine Zahl verwenden. ";
        //When
        String actual = PassValidator.passwordValidator(testPw);
        //Then
        assertEquals(expected,actual);
    }



    @Test
    void shouldFailWithoutLetters(){
        //Given
        String testPw = "1234567890";
        String expected = "Mindestens einen Buchstaben verwenden. Mindestens einen Großbuchstaben verwenden. ";
        //When
        String actual = PassValidator.passwordValidator(testPw);
        //Then
        assertEquals(expected,actual);
    }

    @Test
    void shouldFailWithAllLowerCase(){
        //Given
        String testPw = "1awsderfgt";
        String expected = "Mindestens einen Großbuchstaben verwenden. ";
        //When
        String actual = PassValidator.passwordValidator(testPw);
        //Then
        assertEquals(expected,actual);
    }

    @Test
    void shouldFailWithAllUppercase(){
        //Given
        String testPw = "1AWSDFGTRE";
        String expected = "Mindestens einen Kleinbuchstaben verwenden. ";
        //When
        String actual = PassValidator.passwordValidator(testPw);
        //Then
        assertEquals(expected,actual);
    }

    @Test
    void shouldValidateGoodPassword(){
        //Given
        String testPw = "1234567bWjf";
        String expected = "1234567bWjf ist ein gutes Passwort.";
        //When
        String actual = PassValidator.passwordValidator(testPw);
        //Then
        assertEquals(expected,actual);
    }

    @Test
    void shouldValidateArray(){
        //Given
        String[] testPw = {"1234567bWjf","1AWSDFGTRE","1awsderfgt","asdrfntlbW"};
        String[] expected = {"1234567bWjf ist ein gutes Passwort.","Mindestens einen Kleinbuchstaben verwenden. ","Mindestens einen Großbuchstaben verwenden. ","Mindestens eine Zahl verwenden. "};
        //When
        String[] actual = PassValidator.passwordValidator(testPw);
        //Then
        assertArrayEquals(expected,actual);
    }



}