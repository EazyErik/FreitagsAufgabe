import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswortAufgabeTest {

    @Test
    void shouldBeTrueIfPasswordHasMoreThan8Characters() {

        //given

        boolean expected = true;
        String password = "MySecretPassword";

        //when

        boolean actual = PasswortAufgabe.checkPasswordLength(password);

        //then

        Assertions.assertEquals(expected,actual);



    }

    @Test
    void shouldBeFalseIfPasswordHasLessThan8Characters() {

        //given

        boolean expected = false;
        String password = "ErikBu";

        //when

        boolean actual = PasswortAufgabe.checkPasswordLength(password);

        //then

        Assertions.assertEquals(expected,actual);



    }

    @Test

    void shouldBeTrueIfPasswordContainsNumbers() {
        //given

        String password = "Hallo123";
        boolean expected = false;

        //when

        boolean actual = PasswortAufgabe.checkForNumbers(password);

        //then

        Assertions.assertEquals(expected,actual);
    }
    @Test
    void shouldBeFalseIfPasswordContainsNoNumbers() {
        //given

        String password = "Hallo123";
        boolean expected = false ;

        //when

        boolean actual = PasswortAufgabe.checkForNumbers(password);

        //then

        Assertions.assertEquals(expected,actual);
    }

    @Test
    void shouldBeTrueIfPasswordContainsSmallAndBigLetters() {

        //given
        String password = "SoNNe";
        boolean expected = true;

        //when
        boolean actual = PasswortAufgabe.checkForSmallAndBigLetters(password);

        //then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void shouldBeTrueIfPasswordIsValid() {
        //given

        String password = "Elefant24735";
        String expected = "valid";

        //then

        String actual = PasswortAufgabe.checkPassword(password);

        //when

        Assertions.assertEquals(expected,actual);

    }
    @Test
    void shouldAskUserToEnterBigLetter() {
        //given

        String password = "elefant24735";
        String expected = "you should enter small AND big letters";

        //then

       String actual = PasswortAufgabe.checkPassword(password);

        //when

        Assertions.assertEquals(expected,actual);

    }
    @Test
    void shouldAskUserToEnterSmallLetters() {
        //given

        String password = "ELEFANT24735";
        String expected = "you should enter small AND big letters";

        //then

        String actual = PasswortAufgabe.checkPassword(password);

        //when

        Assertions.assertEquals(expected,actual);

    }

    @Test
    void shouldAskUserToEnterNumbers() {
        //given

        String password = "Elefanten";
        String expected = "you should enter NUMBERS";

        //then

        String actual = PasswortAufgabe.checkPassword(password);

        //when

        Assertions.assertEquals(expected,actual);

    }
    @Test
    void shouldAskUserToEnterAtLeast8Characters() {
        //given

        String password = "Erik14";
        String expected = "wrong length, should have at least 8 characters";

        //then

        String actual = PasswortAufgabe.checkPassword(password);

        //when

        Assertions.assertEquals(expected,actual);

    }
}