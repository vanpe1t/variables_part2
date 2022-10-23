import jdk.swing.interop.SwingInterOpUtils;

public class Main {
    public static void main(String[] args) {

        //Задача 1
        System.out.println("Задача 1");

        int varInt_t1 = 1;
        byte varByte_t1 = 1;
        short varShort_t1 = 1;
        long varLong_t1 = 1;
        float varFloat_t1 = 1f;
        double varDouble_t1 = 1.0;

        System.out.println("Значение переменной varInt c типом int равно " + varInt_t1);
        System.out.println("Значение переменной byte c типом int равно " + varByte_t1);
        System.out.println("Значение переменной short c типом int равно " + varShort_t1);
        System.out.println("Значение переменной long c типом int равно " + varLong_t1);
        System.out.println("Значение переменной float c типом int равно " + varFloat_t1);
        System.out.println("Значение переменной double c типом int равно " + varDouble_t1);


        //Задача 2
        //27.12 ,  987 678 965 549 , 2,786 , false, 569 , -159 , 27897 , 67.

        System.out.println();
        System.out.println("Задача 2");

        float varFloat_t2 = 27.12f;
        long varLong_t2 = 987678965549L;
        double varDouble_t2 = 2.785;
        boolean varBoolean_t2 = false;
        short varShort_t2_1 = 569;
        short varShort_t2_2 = -159;
        short varShort_t2_3 = 27897;
        byte varByte_t2 = 67;


        //Задача 3
        System.out.println();
        System.out.println("Задача 3");

        short firstClassPupils = 23;
        short secondClassPupils= 27;
        short thirdClassPupils = 30;
        short amountOfPapers = 480;
        int papersForEach = amountOfPapers / (firstClassPupils + secondClassPupils + thirdClassPupils);

        System.out.println("На каждого ученика рассчитано " + papersForEach + " листов бумаги.");
        System.out.println();


        //Задача 4
        System.out.println();
        System.out.println("Задача 4");

        short bottlesPer2min = 16;
        double bottlesPer1min = bottlesPer2min / 2.0;
        double bottlesFor20min = bottlesPer1min * 20;
        double bottlesFor1hour = bottlesPer1min * 60;
        double bottlesFor1day = bottlesFor1hour * 24;
        double bottlesFor3day = bottlesFor1day * 3;
        //Примем, что в месяце у нас в среднем 30 дней
        double bottlesFor1month = bottlesFor1day * 30;

        System.out.println("За 20 минут машины произвела бутылок " + bottlesFor20min + " штук.");
        System.out.println("За сутки машины произвела бутылок " + bottlesFor1day + " штук.");
        System.out.println("За 3 дня машины произвела бутылок " + bottlesFor3day + " штук.");
        System.out.println("За месяц машины произвела бутылок " + bottlesFor1month + " штук.");

        //Задача 5
        System.out.println();
        System.out.println("Задача 5");

        short totalCansAmount = 120;
        short whitePaintCansForClass = 2;
        short brownPaintCansForClass = 4;
        int totalPaintCansForClass = whitePaintCansForClass + brownPaintCansForClass;
        int totalClassAmount = totalCansAmount / totalPaintCansForClass;
        int totalWhiteCans = whitePaintCansForClass * totalClassAmount;
        int totalBrownCans = brownPaintCansForClass * totalClassAmount;

        System.out.println("В школе, где " + totalClassAmount + " классов, нужно " + totalWhiteCans
        + " банок белой краски и " + totalBrownCans + " банок коричневой краски.");

        //Задача 6
        System.out.println();
        System.out.println("Задача 6");

        short gramsPerBanana = 80;
        short gramsPer100Milk = 105;
        short gramsOfPackIceCream = 100;
        short gramsPerEgg = 70;

        int gramsTotalBanana = gramsPerBanana * 5;
        int gramsTotalMilk = gramsPer100Milk * 2;
        int gramsTotalIceCream = gramsOfPackIceCream * 2;
        int gramsTotalEggs = gramsPerEgg * 4;

        int gramsTotalWeight = gramsTotalBanana + gramsTotalMilk + gramsTotalIceCream + gramsTotalEggs;
        double kgTotalWeight = gramsTotalWeight / 1000.0;

        System.out.println("Общий вес спортивного завтрака составляет : " + kgTotalWeight + " kg.");

        //Задача 7
        System.out.println();
        System.out.println("Задача 7");

        byte kgTotalLoseWeight = 7;
        int gramsTotalLoseWeight = kgTotalLoseWeight * 1000;
        double daysPer250grams = gramsTotalLoseWeight / 250.0;
        double daysPer500grams = gramsTotalLoseWeight / 500.0;
        double averageDaysToLoseWeight = (daysPer250grams + daysPer500grams) / 2.0;

        System.out.println("Для того чтобы спортсмен потерял 7 кг. по текущей программе в среднеим понадобится "
        + averageDaysToLoseWeight + " дней.");

        //Задача 8
        System.out.println();
        System.out.println("Задача 8");

        double salaryMasha = 67760;
        double salaryDenis = 83690;
        double salaryKristina = 76230;

        double newSalaryMasha = salaryMasha + salaryMasha * 0.1;
        double newSalaryDenis = salaryDenis + salaryDenis * 0.1 ;
        double newSalaryKristina = salaryKristina + salaryKristina * 0.1;

        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + (newSalaryMasha - salaryMasha) + " рублей");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + (newSalaryDenis - salaryDenis) + " рублей");
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на " + (newSalaryKristina - salaryKristina) + " рублей");


    }
}