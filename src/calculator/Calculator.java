package calculator;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        float result = 0;


        while(true) {

            Scanner reader = new Scanner(System.in);
            Operations func = new Operations();

            if (result ==0) {
                System.out.println(Constants.ADD_NUMBER);
                float number1 = reader.nextFloat();

                System.out.println(Constants.OPERATOR);
                String operator = reader.next();

                System.out.println(Constants.ADD_NUMBER);
                float number2 = reader.nextFloat();



                result = func.operation(number1, number2, operator);

                System.out.println(String.format(Constants.RESULT, number1, operator, number2, result));
            }
            else{
                System.out.println(result);

                System.out.println(Constants.OPERATOR);
                String operator = reader.next();

                System.out.println(Constants.ADD_NUMBER);
                float number2 = reader.nextFloat();


                result = func.operation2(result, number2, operator);
                System.out.println(String.format(Constants.RESULT2, operator, number2, result));
            }

        }
    }
}
