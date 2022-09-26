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

        //Задача 6
        System.out.println("Задача 6");

         byte kolbananov = 5;
         byte weightOfOneBanana= 80;
         int bananaWeight = kolbananov*weightOfOneBanana;
         int kolmilk = 200;
         int milk = kolmilk/100;
         byte weight100Milk = 105;
         int totalMilkWeight = milk*weight100Milk;
         byte iceCreamBriquettes = 2;
         byte weightOfOneBriquette = 100;
         int totalWeightOfIceCream = iceCreamBriquettes*weightOfOneBriquette;
         byte totalEggs = 4;
         byte weightOfOneEgg = 70;
         int totalWeightEgg = totalEggs*weightOfOneEgg;
         int weightSportsBreakfast = bananaWeight+totalMilkWeight+totalWeightOfIceCream+totalWeightEgg;
         float oneKg = 1000f;
        float allBreakfastSportsInKilograms = weightSportsBreakfast/oneKg;
        System.out.println("Вес спорт завтрака " +allBreakfastSportsInKilograms+ " кг");

        //Задача 7
        System.out.println("Задача 7");

        byte needToReset = 7;
        int oneKilograms = 1000;
        int kilogramsInGrams = needToReset*oneKilograms;
        int inADayYouNeedToLose1 = 250;
        int inADayYouNeedToLose2 = 500;
        int itTakesDays1 = kilogramsInGrams/inADayYouNeedToLose1;
        int itTakesDays2 = kilogramsInGrams/inADayYouNeedToLose2;
        int Grams = inADayYouNeedToLose1+inADayYouNeedToLose2;
        int averageNumberOfGrams = Grams/2;
        int averageNumberOfDays = kilogramsInGrams/averageNumberOfGrams;
        System.out.println("Если спортсмен будет терять каждый день по " +inADayYouNeedToLose1+ " грамм, то он похудеет за " +itTakesDays1+ " дней, если спортсмен будет терять каждый день по " +inADayYouNeedToLose2+ " грамм, то он похудеет за " +itTakesDays2+ " дней, а если спортсмен будет терять каждый день по " +averageNumberOfGrams+ " грамм, то он похудеет за " +averageNumberOfDays+ " дней");

        //Задача 8
        System.out.println("Задача 8");

        int mashaSincome = 67760;
        int denisSincome = 83690;
        int kristinaSincome = 76230;
        byte percentageIncrease = 10;
        int mashaSpromotion = mashaSincome/100*percentageIncrease;
        int denisSpromotion = denisSincome/100*percentageIncrease;
        int kristinaSpromotion = kristinaSincome/100*percentageIncrease;
        int mashasNewIncome = mashaSincome+mashaSpromotion;
        int denisNewIncome = denisSincome+denisSpromotion;
        int kristinaNewIncome = kristinaSincome+kristinaSpromotion;
        System.out.println("Маша теперь получает " +mashasNewIncome+ " рублей.Годовой доход вырос на " +mashaSpromotion+ " рублей. Денис теперь получает " +denisNewIncome+ " рублей.Годовой доход вырос на " +denisSpromotion+ " рублей. Кристина теперь получает " +kristinaNewIncome+ " рублей. Годовой доход вырос на " +kristinaSpromotion+ " рублей");

    }
}