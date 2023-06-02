public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
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


    public static void task4() {
        System.out.println("Задача 4");
        // task 4 code
        int age = 42;
        if (age < 2) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора спать");
        } else if (age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        } else if (age <= 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        } else if (age < 24) {
            System.out.println("Если возраст человека равен " + age + ", то его место в университете");
        } else if (age < 60) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора на работу");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то ему пора отдыхать");
        }

    }


    public static void task5() {
        System.out.println("Задача 5");
        // task 5 code
        int age = 14;
        if (age >= 5 && age < 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослых");
        } else if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельяз кататься на аттракционе");
        } else {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослых");
        }
    }


    public static void task6() {
        System.out.println("Задача 6");
        // task 6 code
        int seatPlaces = 60;
        int totalPlaces = 102;
        int passenger = 80;
        if (passenger >= totalPlaces) {
            System.out.println("В вагоне нет мест");
        } else if (passenger < seatPlaces) {
            System.out.println("В вагоне есть сидячие места");
        } else {
            System.out.println("В вагоне есть стоячие места");
        }


    }


    public static void task7() {
        System.out.println("Задача 7");
        // task 7 code
        // решение для частного случая, когда все три числа не равны друг другу
        int one = 14;
        int two = 20;
        int three = 18;

        if (one > two) {
            if (one > three) {
                System.out.println("Большее из трех чисел " + one + ", " + two + ", " + three + " - число " + one);
            } else {
                System.out.println("Большее из трех чисел " + one + ", " + two + ", " + three + " - число " + three);
            }
        } else if (two > three) {
            System.out.println("Большее из трех чисел " + one + ", " + two + ", " + three + " - число " + two);
        } else {
            System.out.println("Большее из трех чисел " + one + ", " + two + ", " + three + " - число " + three);
        }
    }
}




