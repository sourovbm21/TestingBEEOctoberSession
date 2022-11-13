package AccessModifier;

import java.time.Instant;
import java.time.Period;
import java.util.Date;

public class ClassTwo {




    public static void main(String[] args) {
        // classname referencevariable = new classname();

        ClassOne classOne = new ClassOne();
       // classOne.x;
        classOne.sum();
        classOne.four(1,"s",true,2.3);
        //classOne.sum1();
        classOne.three(1,"sssdfgsdhsghnthnsrgs",true);
        System.out.println(classOne.x);




    }


}
