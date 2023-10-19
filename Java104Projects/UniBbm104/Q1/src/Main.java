public class Main {
    public static void main(String[] args) { // No exception handling since I thought it's not the main topic yet
        Bus bus = new Bus("06 HUBM 06", 42);
        Menu menu = new Menu(bus);
        menu.mainMenu();
    }
}