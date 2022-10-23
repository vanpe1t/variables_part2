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

        System.out.println("");
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
        System.out.println("");
        System.out.println("Задача 3");

        var firstClassPupils = 23;
        var secondClassPupils= 27;
        var thirdClassPupils = 30;
        var amountOfPapers = 480;
        var papersForEach = amountOfPapers / (firstClassPupils + secondClassPupils + thirdClassPupils);

        System.out.println("На каждого ученика рассчитано " + papersForEach + " листов бумаги.");
        System.out.println("");


        //Задача 4
        System.out.println("");
        System.out.println("Задача 4");

        var bottlesPer2min = 16;
        var bottlesPer1min = bottlesPer2min / 2;
        var bottlesFor20min = bottlesPer1min * 20;
        var bottlesFor1hour = bottlesPer1min * 60;
        var bottlesFor1day = bottlesFor1hour * 24;
        var bottlesFor3day = bottlesFor1day * 3;
        //Примем, что в месяце у нас в среднем 30 дней
        var bottlesFor1month = bottlesFor1day * 30;

        System.out.println("За 20 минут машины произвела бутылок " + bottlesFor20min + " штук.");
        System.out.println("За сутки машины произвела бутылок " + bottlesFor1day + " штук.");
        System.out.println("За 3 дня машины произвела бутылок " + bottlesFor3day + " штук.");
        System.out.println("За месяц машины произвела бутылок " + bottlesFor1month + " штук.");

        //Задача 5
        System.out.println("");
        System.out.println("Задача 5");

        var totalCansAmount = 120;
        var whitePaintCansForClass = 2;
        var brownPaintCansForClass = 4;
        var totalPaintCansForClass = whitePaintCansForClass + brownPaintCansForClass;
        var totalClassAmount = totalCansAmount / totalPaintCansForClass;
        var totalWhiteCans = whitePaintCansForClass * totalClassAmount;
        var totalBrownCans = brownPaintCansForClass * totalClassAmount;

        System.out.println("В школе, где " + totalClassAmount + " классов, нужно " + totalWhiteCans
                + " банок белой краски и " + totalBrownCans + " банок коричневой краски.");

        //Задача 6
        System.out.println("");
        System.out.println("Задача 6");

        var gramsPerBanana = 80;
        var gramsPer100Milk = 105;
        var gramsOfPackIceCream = 100;
        var gramsPerEgg = 70;

        var gramsTotalBanana = gramsPerBanana * 5;
        var gramsTotalMilk = gramsPer100Milk * 2;
        var gramsTotalIceCream = gramsOfPackIceCream * 2;
        var gramsTotalEggs = gramsPerEgg * 4;

        var gramsTotalWight = gramsTotalBanana + gramsTotalMilk + gramsTotalIceCream + gramsTotalEggs;
        var kgTotalWight = gramsTotalWight / 1000.0;

        System.out.println("Общий вес спортивного завтрака составляет : " + kgTotalWight + " kg.");



    }
}