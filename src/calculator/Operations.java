package calculator;
public class Operations {

    public float operation(float number1, float number2, String operator) {
        float ret = 0;
        switch (operator) {
            case "+":
                ret = number1 + number2;
                break;
            case "-":
                ret = number1 - number2;
                break;
            case "*":
                ret = number1 * number2;
                break;
            case "/":
                if (number2 == 0) {
                    System.out.println(Constants.DIVISION_ERROR);
                }
                ret = number1 / number2;
                break;
            default:
                System.out.println(String.format(Constants.INVALID_OPERATOR, operator));
        }
        return ret;
    }

    public float operation2(float result, float number2, String operator) {
        float ret = 0;
        switch (operator) {
            case "+":
                ret = result + number2;
                break;
            case "-":
                ret = result - number2;
                break;
            case "*":
                ret = result * number2;
                break;
            case "/":
                if (number2 == 0) {
                    System.out.println(Constants.DIVISION_ERROR);
                }
                ret = result / number2;
                break;
            default:
                System.out.println(String.format(Constants.INVALID_OPERATOR, operator));
        }
        return ret;
    }

}
