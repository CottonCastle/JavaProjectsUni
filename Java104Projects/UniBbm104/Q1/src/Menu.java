import java.util.Objects;
import java.util.Scanner;

public class Menu {

    //Using scanner class to read input
    private final Scanner scanner = new Scanner(System.in);

    private Bus bus;

    Menu(Bus bus) {
        this.bus = bus;
    }

    void mainMenu() {
        System.out.print(
                "1-Book a seat\n" +
                "2-Cancel booking\n" +
                "3-Print all passengers\n" +
                "4-Print available seats\n" +
                "5-Print all seats\n" +
                "6-Search passenger\n" +
                "7-Exit\n" +
                "Enter your choice: "
        );

        int choice = scanner.nextInt();
        methodManager(choice);
    }

    void methodManager(int choice) {
        switch (choice) {
            case 1:
                bookSeat();
                break;
            case 2:
                cancelBooking();
                break;
            case 3:
                printPassengers();
                break;
            case 4:
                printAvailableSeats();
                break;
            case 5:
                printAllSeats();
                break;
            case 6:
                searchPassengers();
                break;
            case 7:
                exit();
                break;
        }
    }

    void bookSeat() {
        System.out.print("Enter seat id: ");
        int seatID = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter surname: ");
        String surname = scanner.nextLine();
        System.out.print("Enter gender: ");
        String gender = scanner.nextLine();
        System.out.print("Enter country code: ");
        String countryCode = scanner.nextLine();
        System.out.print("Enter code: ");
        String code = scanner.nextLine();
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter type: ");
        String type = scanner.nextLine();

        Seat targetSeat = bus.getSeats()[seatID - 1];

        if(targetSeat.isStatus()) {
            if (!Objects.equals(countryCode, "") && Objects.equals(code, "")) {
                targetSeat.setStatus(false);
                targetSeat.setPassenger(
                        new Passenger(
                                name, surname, gender,
                                new Phone(
                                        countryCode, code, number, type
                                )
                        )
                );
            } else {
                targetSeat.setStatus(false);
                targetSeat.setPassenger(
                        new Passenger(
                                name, surname, gender,
                                new Phone(
                                        number, type
                                )
                        )
                );
            }
        } else {
            System.out.println("The seat has already reserved!");
        }

        mainMenu();
    }

    void cancelBooking() {
        scanner.nextLine();
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter surname: ");
        String surname = scanner.nextLine();
        for (Seat seat: bus.getSeats()) {
            if (!(seat.getPassenger() == null)) {
                if (seat.getPassenger().getName().equals(name) && seat.getPassenger().getSurname().equals(surname)) {
                    seat.setPassenger(null);
                    seat.setStatus(true);
                } else {
                    System.out.println("Invalid Name");
                }
            }
        }
        mainMenu();
    }

    void printPassengers() {
        for (Seat seat: bus.getSeats()) {
            if (!seat.isStatus()) {
                int seatID = seat.getSeatID();
                seat.display();
                seat.getPassenger().display();
            }
        }
        mainMenu();
    }

    void printAvailableSeats() {
        System.out.println("Currently Available seats:");
        for (Seat seat: bus.getSeats()) {
            if (seat.isStatus()) {
                seat.display();
            }
        }
        mainMenu();
    }

    void printAllSeats() {
        for (Seat seat: bus.getSeats()) {
            int seatID = seat.getSeatID();
            if (seat.isStatus()) {
                System.out.println(String.format("Seat: %d Status: Available", seatID));
            } else {
                System.out.println(String.format("Seat: %d Status: Reserved", seatID));
            }
        }
        mainMenu();
    }

    void searchPassengers() {
        scanner.nextLine();
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter surname: ");
        String surname = scanner.nextLine();
        for (Seat seat: bus.getSeats()) {
            if (!(seat.getPassenger() == null)) {
                if (seat.getPassenger().getName().equals(name) && seat.getPassenger().getSurname().equals(surname)) {
                    seat.getPassenger().display();
                }
            }
        }
        mainMenu();
    }

    void exit() {}
}
