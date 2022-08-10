public class Main {
    public static void main(String[] args) {
        MagicBox<String> magicBox = new MagicBox<>();
        System.out.println(magicBox.add("Hi"));
        System.out.println(magicBox.add("Hello"));
        System.out.println(magicBox.add("Привет"));
//        magicBox.pick();
        System.out.println(magicBox.add("Вітання"));
        System.out.println(magicBox.add("Прывітанне"));
        System.out.println(magicBox.add("Ahoj"));
        System.out.println(magicBox.pick());


        MagicBox<Integer> magicBox2 = new MagicBox<>();
        System.out.println(magicBox2.add(10));
        System.out.println(magicBox2.add(5));
        System.out.println(magicBox2.add(1));
//        magicBox.pick();
        System.out.println(magicBox2.add(4));
        System.out.println(magicBox2.add(7));
        System.out.println(magicBox2.add(6));
        System.out.println(magicBox2.pick());
    }
}
