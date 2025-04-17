public class Main {
    public static void main(String[] args) {

        Programmer programmer = new Programmer("Ayana", "Java developer", "Peaksoft");
        System.out.println(programmer);
        programmer.learn();
        programmer.walk();
        programmer.eat();
        programmer.coding();

        System.out.println("=================");

        Dancer dancer = new Dancer("Anjelika", "dancer", "Groovy jazz");
        System.out.println(dancer);
        dancer.learn();
        dancer.walk();
        dancer.eat();
        dancer.dancing();

        System.out.println("=================");

        Singer singer = new Singer("Adelya", "singer", "SEREBRO");
        System.out.println(singer);
        singer.learn();
        singer.walk();
        singer.eat();
        singer.playGuitar();

    }
}