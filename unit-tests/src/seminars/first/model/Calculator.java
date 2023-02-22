//package seminars.first.model;
//
//public class Calculator {
//    public static void main(String[] args){
//
//    }
//    public static int calculation(int firstOperand, int secondOperand, char operator) {
//        int result;
//
//        switch (operator) {
//            case '+':
//                result = firstOperand + secondOperand;
//                break;
//            case '-':
//                result = firstOperand - secondOperand;
//                break;
//            case '*':
//                result = firstOperand * secondOperand;
//                break;
//            case '/':
//                if (secondOperand != 0) {
//                    result = firstOperand / secondOperand;
//                    break;
//                } else {
//                    throw new ArithmeticException("Division by zero is not possible");
//                }
//            default:
//                throw new IllegalStateException("Unexpected value operator: " + operator);
//        }
//        return result;
//    }
//
//    public static double squareRootExtraction(double number) {
//        if (number == 0) {
//            throw new ArithmeticException("It is not possible to extract the root from 0");
//        }
//        if (number < 0) {
//            throw new ArithmeticException("It is impossible to extract the root from negative numbers");
//        }
//
//        double t;
//        double squareRoot = number / 2;
//        do {
//            t = squareRoot;
//            squareRoot = (t + (number / t)) / 2;
//        }
//        while ((t - squareRoot) != 0);
//        return squareRoot;
//
//        // или просто return Math.sqrt(number);
//    }
//
//    /**
//     * @param purchaseAmount сумма покупки
//     * @param discountAmount размер скидки
//     * @return возвращает сумму покупки с учетом скидки
//     */
//    public static double calculatingDiscount(double purchaseAmount, int discountAmount) {
//        return 0;
//    }
//}
import static org.assertj.core.api.Assertions.*;

public  Calculator {
public static void main(String[] args) {
        calculatingDiscount(200, 25);

        // Test();
        }

public static void Test() {
        assertThat(calculatingDiscount(100, 10)).isEqualTo(90);// Положительная проверка
        assertThat(calculatingDiscount(2000, 120));                    //Проверка скидки > 100%
        assertThat(calculatingDiscount(-100, 25));                     //Проверка отрицательной цены
        assertThat(calculatingDiscount(100, -25));                     //Проверка отрицательной скидки
        assertThat(calculatingDiscount(0, 10));                        //Проверка нулевой цены
        }

public static double calculatingDiscount(double price, double discount) {
        double res;
        if (discount > 100) {
        throw new ArithmeticException("Скидка не может быть > 100%");
        } else if (price <= 0) {
        throw new ArithmeticException("Цена должна быть > 0");
        } else if (discount < 0) {
        throw new ArithmeticException("Скидка не может быть < 0");
        } else
        res = price * (100 - discount) / 100;
        System.out.println("Сумма " + price + " со скидкой " + discount + " %  составляет - " + res);
        return res;
        }
        }





