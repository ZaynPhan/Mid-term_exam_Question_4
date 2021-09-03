package Mid_term_exam_Question4;

import java.util.Scanner;

public class Passenger {
    private String fullName, gender;
    private int age;
    private Ticket[] listTicket;

    public Passenger() {

    }

    public Passenger(String fullName, String gender, int age, Ticket[] listTicket) {
        this.fullName = fullName;
        this.gender = gender;
        this.age = age;
        this.listTicket = listTicket;
    }

    public String getFullName() {
        return this.fullName;
    }

    public String getGender() {
        return this.gender;
    }

    public int getAge() {
        return this.age;
    }

    public Ticket[] getListTicket() {
        return this.listTicket;
    }

    //Nhập thông tin hành khách
    public void inputPassengerInfo() {
        Scanner input = new Scanner(System.in);

        System.out.print("- Full name: ");
        this.fullName = input.nextLine();

        System.out.print("- Gender: ");
        this.gender = input.nextLine();

        System.out.print("- Age: ");
        this.age = input.nextInt();

        System.out.println("=====Ticket list=====");
        System.out.print("Quantity of ticket: ");
        int quantityOfTicket = input.nextInt();
        Ticket[] listTicket = new Ticket[quantityOfTicket];
        if (quantityOfTicket > 0) {
            for (int i = 0; i < quantityOfTicket; i++) {
                System.out.println("Ticket " + (i + 1));
                listTicket[i] = new Ticket();
                listTicket[i].inputTicket();
            }
        }
        this.listTicket = listTicket;
    }

    //Xuất thông tin khách hàng
    public String printPassengerInfo() {
        String passengerInfo = "";
        passengerInfo += "Full name: " + this.fullName + "\nGender: " + this.gender + "\nAge: " + this.age + "\n=====Ticket list=====\n";
        for (int i = 0; i < this.listTicket.length; i++) {
            passengerInfo += (i + 1) + " " + this.listTicket[i].printTiket();
        }
        return passengerInfo;
    }

    //Tính tổng tiền vé mỗi người
    public int totalTicketFee() {
        int totalFee = 0;
        for (int i = 0; i < this.listTicket.length; i++) {
            totalFee += this.listTicket[i].getPrice();
        }
        return totalFee;
    }

    //Nhập danh sách khách hàng
    public static Passenger[] inputListPassenger(int n) {
        Passenger[] listPassenger = new Passenger[n];
        for (int i = 0; i < n; i++) {
            System.out.println("ID = " + (i + 1));
            listPassenger[i] = new Passenger();
            listPassenger[i].inputPassengerInfo();
        }
        return listPassenger;
    }

    //Xuất danh sách hành khách
    public static void printListPassenger(Passenger[] listPassenger) {
        for (int i = 0; i < listPassenger.length; i++) {
            System.out.println(i + ". " + listPassenger[i].printPassengerInfo());
            System.out.println("Total ticket fee: " + listPassenger[i].totalTicketFee());
            System.out.println();
        }
    }

    //Sắp xếp danh sách hành khách theo chiều giảm dần của Tổng tiền.
    public static void sortPassengerByAscendingTotalFee(Passenger[] listPassenger) {
        for (int i = 0; i < listPassenger.length - 1; i++) {
            for (int j = i + 1; j < listPassenger.length; j++) {
                if (listPassenger[j].totalTicketFee() > listPassenger[i].totalTicketFee()) {
                    Passenger tmp = listPassenger[i];
                    listPassenger[i] = listPassenger[j];
                    listPassenger[j] = tmp;
                }
            }
        }

        for (int i = 0; i < listPassenger.length; i++) {
            System.out.println("Customer " + (i + 1));
            System.out.println(listPassenger[i].printPassengerInfo());
        }
    }
}
