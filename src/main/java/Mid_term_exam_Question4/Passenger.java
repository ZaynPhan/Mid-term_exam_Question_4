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
    public Passenger inputPassengerInfo() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input your personal infomation!");

        System.out.print("- Full name: ");
        this.fullName = input.nextLine();
        System.out.println();

        System.out.print("- Gender: ");
        this.gender = input.nextLine();
        System.out.println();

        System.out.print("- Age: ");
        this.age = input.nextInt();
        System.out.println();

        System.out.println("=====Ticket list=====");
        Ticket ticket = new Ticket();
        Ticket[] listTicket = ticket.inputListTicket();

        return new Passenger(fullName, gender, age, listTicket);
    }


    //Xuất thông tin khách hàng kèm vé
    public String printPassengerInfo() {
        Ticket ticket = new Ticket();
        return "Name: " + getFullName() + "\tGender: " + getGender() +
                "\tAge: " + getAge() + "\n" + ticket.printListTicket();
    }

    //Xuất danh sách hành khách
    public String printListPassenger(Passenger[] listPassenger) {
        Passenger passenger = new Passenger();
        Ticket ticket = new Ticket();
        String list = " ";
        for (int i = 0; i < listPassenger.length; i++) {
            passenger = listPassenger[i];
            list = list + (i+1) + ". " + passenger.getFullName() + " " + passenger.getGender() + " " +
                    passenger.getAge() + "Total ticket fee: " + ticket.getPrice() + "\n" + ticket.printListTicket() + "\n";
        }
        return list;
    }



//    public Passenger[] sortByDescendingPrice(int quantity) {
//        Passenger[] listPassenger = new Passenger[quantity];
//
//        for (int i = 0; i < listPassenger.length; i++) {
//            if (listPassenger[i].getTotalPrice() > listPassenger[i].getTotalPrice(listPassenger)) {
//                Passenger temp = listPassenger[i];
//                listPassenger[i] = listPassenger[i + 1];
//                listPassenger[i + 1] = temp;
//            }
//        }
//        return listPassenger;
//    }



}
