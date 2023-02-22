package seminars.first.hw;

import seminars.first.model.Hero;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import static org.assertj.core.api.Assertions.*;
//public class Shop {
//    private List<Product> products;
//
//    // Геттеры, сеттеры:
//    public List<Product> getProducts() {
//        return products;
//    }
//
//    public void setProducts(List<Product> products) {
//        this.products = products;
//    }
//
//    /**
//     * @return отсортированный по возрастанию и цене список продуктов
//     */
//    public List<Product> getSortedListProducts() {
//        return null;
//    }
//
//    /**
//     * @return самый дорогой продукт
//     */
//    public Product getMostExpensiveProduct() {
//        return null;
//    }
//}
//2) (*) Используя заготовки в коде с урока (в материалах к уроку) для приложения магазина написать функцию сортировки продуктов по стоимости и функцию вывода самого дорогого продукта (папка hw, сигнатуры методов лежат в классе Shop) и протестировать их:
//        1. Проверить, что магазин хранит верный список продуктов
//        a. количество продуктов
//        b. состав корзины


//class Main {
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//
//        String[] products = new String[]{"Хлеб  ", "Яблоки", "Молоко"};
//        int[] prices = new int[]{100, 200, 300};
//
//        int[] sum = new int[]{0, 0, 0};
//        int[] count = new int[]{0, 0, 0};
//
//        int productNumber = 0;
//        int productCount = 0;
//        int sumProducts = 0;
//
//        for (int i = 0; i < products.length; i++) {
//            System.out.println((i + 1) + ". " + products[i] + " - " + prices[i]);
//        }
//
//        while (true) {
//            System.out.println("Введите номер товара или end для выхода из программы");
//            String input = scanner.nextLine();
//            if ("end".equals (input))  {
//
//                break;
//            }
//            try {
//                String[] split = input.split(" ");
//
//                String a = split[0];//до пробела, чтобы получить номер продукта
//                productNumber = Integer.parseInt(a) - 1;
//
//                String b = split[1];//после пробела, чтобы получить количество
//                productCount = Integer.parseInt(b);
//
//                sum[productNumber] = prices[productNumber] * productCount;
//                count[productNumber] = productCount;
//
//            } catch (NumberFormatException e) {
//                System.out.println("Введите целое число");
//                continue;
//            }
//            if (productNumber > products.length){
//                System.out.println("Вы ввели неверный номер товара");
//                continue;
//            }
//        }
//        System.out.println(" ");
//        System.out.println("Ваша корзина:");
//        System.out.println("--------------------------------------------------------------------");
//        System.out.printf("%s %9s %6s %s\n", "Наименование товара | ", "Количество | ", "Цена/за.ед | ", "Общая " +
//                "стоимость");
//        System.out.println("--------------------------------------------------------------------");
//
//        for (int i = 0; i < 3; i++) {
//            if (count[i] != 0) {
//                System.out.printf("%s %19s %15s %14s\n", products[i], count[i], prices[i],
//                        sum[i]);
//            }
//            sumProducts += sum[i];
//        }
//        System.out.println("--------------------------------------------------------------------");
//        System.out.printf("%57s %d", "Итого: ", sumProducts);
//        System.out.println(" ");
//        System.out.println("Программа завершена.");
//    }
//}
