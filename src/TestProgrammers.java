public class TestProgrammers {
    public static void main(String[] args) {
        Programmer programmer1 = new Programmer("Mario", 24, true);
        Programmer programmer2 = new Programmer("Sara",30,false);
        programmer1.drinkCoffe();
        programmer1.printDetails();
        programmer2.printDetails();
        programmer2.hasGlasses();
    }
}
