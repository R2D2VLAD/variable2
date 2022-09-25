public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");

        int apples = 555;
        System.out.println("Значение переменной apples с типом int равно " + apples);
        byte bananas = 100;
        System.out.println("Значение переменной bananas с типом byte равно " + bananas);
        short watch = 200;
        System.out.println("Значение переменной watch с типом short равно " + watch);
        long table = 1000000L;
        System.out.println("Значение переменной table с типом long равно " + table);
        float cup = 13f;
        System.out.println("Значение переменной cup с типом float равно " + cup);
        double cookies = 14.3;
        System.out.println("Значение переменной cookies с типом double равно " + cookies);

        //Задача 2
        System.out.println("Задача 2");

        int plate = -159;
        System.out.println(plate);
        byte sugarWeight = 67;
        System.out.println(sugarWeight);
        short fish = 569;
        System.out.println(fish);
        long populationOfTheCity = 987678965549L;
        System.out.println(populationOfTheCity);
        float weightOfPeas = 2.786f;
        System.out.println(weightOfPeas);
        double voltage = 27.12;
        System.out.println(voltage);
        char hieroglyph = 27897;
        System.out.println(hieroglyph);
        boolean VladsNameIsDanya = false;
        System.out.println(VladsNameIsDanya);

        //Задача 3
        System.out.println("Задача 3");

        byte a = 23;
        byte b = 27;
        byte c = 30;
        int d = a + b + c;
        int e = 480/d;
        System.out.println("На каждого ученика расчитано " + e + " листов бумаги");

        //Задача 4
        System.out.println("Задача 4");

        byte numberOfBottles = 16;
        byte time = 2;
        int in1Minute = numberOfBottles/time;
        int time1 = 20*in1Minute;
        System.out.println("За 20 минут, машина произвела " +time1+ " бутылок");
        int time2 = 24*60*in1Minute;
        System.out.println("За сутки, машина произвела " +time2+ " бутылок");
        int time3 = 72*60*in1Minute;
        System.out.println("За 3 дня, машина произвела " +time3+ " бутылок");
        int time4 = 720*60*in1Minute;
        System.out.println("За 1 месяц, машина произвела " +time4+ " бутылок");

        //Задача 5
        System.out.println("Задача 5");

        byte totalCans = 120;
        byte white = 2;
        byte brown = 4;
        int cansPerClass = white+brown;
        int totalClasses = totalCans/cansPerClass;
        int totalWhitePaint = white*totalClasses;
        int totalBrownPaint = brown*totalClasses;
        System.out.println("В школе, где " +totalClasses+ " классов, нужно " +totalWhitePaint+ " банок белой краски и " +totalBrownPaint+ " банок коричневой краски");

    }
}