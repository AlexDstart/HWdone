public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var papper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(papper);
        System.out.println("Задача 2");
        dog = dog + 4;
        cat = cat + 4;
        papper = papper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(papper);;
        dog = dog - 3.5;
        cat = cat - 1.6;
        papper = papper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(papper);
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        System.out.println("Задача 6");
        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        System.out.println("Общий вес боксеров " + (boxerWeight2 + boxerWeight1));
        System.out.println("Разница в весе " + (boxerWeight2 - boxerWeight1));
        System.out.println("Задача 7");
        System.out.println("Разница в весе (1 способ) " + (boxerWeight2 - boxerWeight1));
        System.out.println("Разница в весе (2 способ) " + (boxerWeight2 % boxerWeight1));


    }
}