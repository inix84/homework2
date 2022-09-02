public class Main {
    public static void main(String[] args)
    {
        System.out.println("ЗАДАНИЕ 1");

        var dog = 8.0;
        System.out.println("значение dog с ЗАДАЧИ 1 ---> " + dog);
        dog = dog + 4;
        System.out.println("значение dog с ЗАДАЧИ 2 ---> " + dog);
        dog = dog - 3.5;
        System.out.println("значение dog с ЗАДАЧИ 3 ---> " + dog);
        System.out.println();

        var cat = 3.6;
        System.out.println("значение cat с ЗАДАЧИ 1 ---> " + cat);
        cat = cat + 4;
        System.out.println("значение cat с ЗАДАЧИ 2 ---> " + cat);
        cat = cat - 1.6;
        System.out.println("значение cat с ЗАДАЧИ 3 ---> " + cat);
        System.out.println();

        var paper = 763789;
        System.out.println("значение paper с ЗАДАЧИ 1 ---> " + paper);
        paper = paper + 4;
        System.out.println("значение paper с ЗАДАЧИ 2 ---> " + paper);
        paper = paper - 7639;
        System.out.println("значение paper с ЗАДАЧИ 3 ---> " + paper);
        System.out.println();

        System.out.println("ЗАДАНИЕ 2, задача 4");
        var friend = 19;
        System.out.println("значение friend начальное ---> " + friend);
        friend = friend + 2;
        System.out.println("значение friend увеличенное на 2 ---> " + friend);
        friend = friend /7;
        System.out.println("значение friend деленное на 7 ---> " + friend);
        System.out.println();

        System.out.println("ЗАДАНИЕ 2, задача 5");
        var frog = 3.5;
        System.out.println("значение frog начальное ---> " + frog);
        frog = frog *10;
        System.out.println("значение frog *10 ---> " + frog);
        frog = frog /3.5;
        System.out.println("значение frog деленное на 3.5 ---> " + frog);
        frog = frog +4;
        System.out.println("значение frog +4 ---> " + frog);
        System.out.println();

        System.out.println("ЗАДАНИЕ 3, задача 6");
        var weightOneBoxer = 78.2;
        var weightSecondBoxer = 82.7;
        var weightSumBoxer = weightOneBoxer+weightSecondBoxer;
        System.out.println("общий вес двух боксеров ---> " + weightSumBoxer);
        var weightDifferenceBoxer = weightSecondBoxer-weightOneBoxer;
        System.out.println("разница в весах этих боксеров ---> " + weightDifferenceBoxer);
        System.out.println();

        System.out.println("ЗАДАНИЕ 3, задача 7");
        var weightDifferenceBoxer2 = weightSecondBoxer%weightOneBoxer;
        System.out.println("Разница вычитанием ---> " + weightDifferenceBoxer);
        System.out.println("Разница остатком от деления ---> " + weightDifferenceBoxer2);

    }
}