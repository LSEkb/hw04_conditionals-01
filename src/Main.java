public class Main {
    public static void main(String[] args) {



        // task 1

        int age = 10;
        if (age >= 18) {
            System.out.println("Если возраст человека равен, " + age + " то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен, " + age +
                    " то возраст совершеннолетия еще не наступил и нужно немного подождать.");
        }


        // task 2
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


        // task 3
        int velocity = 45;
        if (velocity > 60) {
            System.out.println("Если скорость " + velocity + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + velocity + ", то можно ездить спокойно");
        }
    }
}