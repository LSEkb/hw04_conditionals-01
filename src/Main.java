public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    // во всех задачах подставлены произвольные данные переменных, для которых проверяется
    // выполнения условия - для проверки корректной работы и вывода в консоль

    public static void task1() {
        System.out.println("Задача 1");
        // task 1 code
        int age = 12;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age +
                    ", то возраст совершеннолетия еще не наступил и нужно немного подождать.");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        // task 2 code
        // в условиях нет данных отностельно случая, когда температура равна 5; можно включить в одну из веток,
        // поменяв знак со строгого неравенства на </>=, либо создать для этого случая третий вариант с другой
        // рекомендацией

        int temp = 7;
        if (temp < 5) {
            System.out.println("На улице холодно, " + temp + " градусов, нужно надеть шапку");
        }
        if (temp > 5) {
            System.out.println("Сегодня тепло, " + temp + " градусов, можно идти без шапки");
        }
    }


    public static void task3() {
        System.out.println("Задача 3");
        // task 3 code
        int velocity = 45;
        if (velocity > 60) {
            System.out.println("Если скорость " + velocity + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + velocity + ", то можно ездить спокойно");
        }
    }


    // task 4

}
