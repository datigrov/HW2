public class Main {
    public static void main(String[] args) {
        System.out.println("Hell o world!");

        var dog = 8.0;
        System.out.println("Собака " + dog);
        var cat = 3.6;
        System.out.println("Кот " + cat);
        var paper = 763789;
        System.out.println("Бумага " + paper);

        dog = dog + 4;
        System.out.println("Собака " + dog);
        cat = cat + 4;
        System.out.println("Кот " + cat);
        paper = paper + 4;
        System.out.println("Бумага " + paper);

        dog = dog - 3.5;
        System.out.println("Собака " + dog);
        cat = cat - 1.6;
        System.out.println("Кот " + cat);
        paper = paper - 7639;
        System.out.println("Бумага " + paper);


        var friend = 19;
        System.out.println("Друг " + friend);
        friend = friend + 2;
        System.out.println("Друг " + friend);
        friend = friend / 7;
        System.out.println("Друг " + friend);

        var frog = 3.5;
        System.out.println("Лягушка " + frog);
        frog = frog * 10;
        System.out.println("Лягушка " + frog);
        frog = frog / 3.5;
        System.out.println("Лягушка " + frog);
        frog = frog + 4;
        System.out.println("Лягушка " + frog);

        var firstBoxer = 78.2;
        System.out.println("Вес первого боксера " + firstBoxer + "кг!");
        var secondBoxer = 82.7;
        System.out.println("Вес второго боксера " + secondBoxer + "кг!");
        var weight = firstBoxer + secondBoxer;
        System.out.println("Общая масса боксеров " + weight + "кг!");
        var difference = secondBoxer - firstBoxer;
        System.out.println("Разница в массе боксеров " + difference + "кг!");
        difference = secondBoxer % firstBoxer;
        System.out.println("Разница в массе боксеров " + difference + "кг!");

        var hours = 640;
        System.out.println("Общее количество " + hours + " часов!");
        var standard = 8;
        System.out.println("Норма на сотрудника в день " + standard + " часов!");
        var employees = 640 / 8;
        System.out.println("Всего работников в компании " + employees + " человек!");
        employees = employees + 94;
        hours = employees * 8;
        System.out.println("Если в компании работает " + employees + " человек, то всего " + hours + " часов работы может быть поделено между сотрудниками!");
    }
}


