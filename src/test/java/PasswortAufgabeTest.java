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




}