//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        byte cat = 3;
        System.out.println ("Значение переменной с типом byte равно " + cat);
        short dog = 130;
        System.out.println ("Значение переменной с типом short равно " + dog);
        int monkey = 50000;
        System.out.println ("Значение переменной с типом int равно " + monkey);
        long house = 1200000;
        System.out.println ("Значение переменной с типом long равно " + house);
        float apple = 4.06f;
        System.out.println ("Значение переменной с типом float равно " + apple);
        double fish = 76.123;
        System.out.println ("Значение переменной с типом double равно " + fish);


        float one = 27.12f;
        System.out.println (one);
        long two = 987678965549L;
        System.out.println (two);
        double three = 2.786;
        System.out.println (three);
        short s1 = 569;
        System.out.println (s1);
        short s2 = -159;
        System.out.println (s2);
        short s3 = 27897;
        System.out.println (s3);
        byte b1 = 67;
        System.out.println (b1);

        byte lP = 23;
        byte aS = 27;
        byte eA = 30;
        int students = lP + aS + eA;
        System.out.println (students);
        short lists = 480;
        int listOnOneStudent = lists / students;
        System.out.println ("На каждого ученика рассчитано " + listOnOneStudent + " листов бумаги");


        byte bottles = 16;
        byte time1 = 2;
        byte time2 = 20;
        int efficience1 = bottles / time1 * time2;
        System.out.println ("За 20 минут машина произвела " + efficience1 + " штук бутылок");
        short time3 = 24 * 60;
        int efficience2 = bottles / time1 * time3;
        System.out.println ("За сутки машина произвела " + efficience2 + " штук бутылок");
        short time4 = 24 * 60 * 3;
        int efficience3 = bottles / time1 * time4;
        System.out.println ("За 3 дня машина произвела " + efficience3 + " штук бутылок");
        int time5 = 24 * 60 * 30;
        int efficience4 = bottles / time1 * time5;
        System.out.println ("За 1 месяц машина произвела " + efficience4 + " штук бутылок");


        byte cans = 120;
        byte onOneClassWhiteColor = 2;
        byte onOneClassBrownColor = 4;
        int colorOnOneClass = onOneClassWhiteColor + onOneClassBrownColor;
        int classroom = cans / colorOnOneClass;
        int whiteColors = classroom * onOneClassWhiteColor;
        int brownColors = classroom * onOneClassBrownColor;
        System.out.println ( "В школе где " + classroom + " классов, нужно " + whiteColors + " банок белой краски " + "и " + brownColors + " банок коричневой краски");


        byte bananas = 5;
        byte massOneBanana = 80;
        int massBananas = bananas * massOneBanana;
        short milk = 200;
        byte milkOnOneGlass = 100;
        int massMilkOnOneGlass = 105;
        int massMilk = milk / milkOnOneGlass * massMilkOnOneGlass;
        byte iceCreamBloks = 2;
        byte oneBlok = 100;
        int massIceCream = iceCreamBloks * oneBlok;
        byte eggs = 4;
        byte massOneEgg = 70;
        int massEggs = eggs * massOneEgg;
        int massProductGr = massBananas + massMilk + massIceCream + massEggs;
        float massProguctKg = massProductGr / 1000F;
        System.out.println ("Масса продуктов составляет " + massProductGr + "гр или " + massProguctKg + "кг");


        byte loseWeight = 7;
        short massOneDay1 = 250;
        int loseWeightInGr = loseWeight * 1000;
        int days250Gr = loseWeightInGr / massOneDay1;
        System.out.println("Если в день терять " + massOneDay1 + "гр, то потребуется " + days250Gr + " дней");
        short massOneDay2 = 500;
        int days500Gr = loseWeightInGr / massOneDay2;
        System.out.println("Если в день терять " + massOneDay2 + "гр, то потребуется " + days500Gr + " дней");
        float massOneDay3 = (massOneDay1 + massOneDay2) / 2F;
        float daysMedium = loseWeightInGr / massOneDay3;
        System.out.println ("Если в день терять " + massOneDay3 + "гр, то потребуется " + daysMedium + " дней");

        int zpMasha = 67760;
        byte salaryIncrease = 100 + 10;
        int newZpMasha = zpMasha * salaryIncrease / 100;
        byte monthsIInAYear = 12;
        int salaryDifferenceMasha = (newZpMasha * 12) - (zpMasha * 12);
        System.out.println ("Маша теперь получает " + newZpMasha + " рублей. Годовой доход вырос на " + salaryDifferenceMasha + " рублей");
        int zpDenis = 83690;
        int newZpDenis = zpDenis * salaryIncrease / 100;
        int salaryDifferenceDenis = (newZpDenis * 12) - (zpDenis * 12);
        System.out.println ("Денис теперь получает " + newZpDenis + " рублей. Годовой доход вырос на " + salaryDifferenceDenis + " рублей");
        int zpKristina = 76230;
        int newZpKristina = zpKristina * salaryIncrease / 100;
        int salaryDifferenceKristina = (newZpKristina * 12) - (zpKristina * 12);
        System.out.println ("Кристина теперь получает " + newZpKristina + " рублей. Годовой доход вырос на " + salaryDifferenceKristina + " рублей");





    }


}