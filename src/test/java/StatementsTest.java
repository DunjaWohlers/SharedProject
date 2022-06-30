import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatementsTest {

    @Test
    void biggerEqualsX (){
        // given
        int num = 31;
        int num2=59;

        // when
        boolean result = Statements.biggerEqualsX(num,num2);

        // then
        boolean expResult = true;
        Assertions.assertEquals(expResult, result);
    }



    @Test
    void fakultaet4(){
        //given
        int num=4;
        // when

        int result=Statements.fakultaet(num);
        // then

        int expected=4*3*2*1;
        Assertions.assertEquals(expected,result);
    }
    @Test
    void fakultaet10(){
        //given
        int num=10;
        // when

        int result=Statements.fakultaet(num);
        // then

        int expected=10*9*8*7*6*5*4*3*2*1;
        Assertions.assertEquals(expected,result);
    }
}
