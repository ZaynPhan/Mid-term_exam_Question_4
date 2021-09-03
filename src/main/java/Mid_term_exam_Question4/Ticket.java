package Mid_term_exam_Question4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ticket {
    private String flightName;
    private LocalDateTime flightDate;
    private Double price;

    public Ticket(String flightName, LocalDateTime flightDate, Double price) {
        this.flightName = flightName;
        this.flightDate = flightDate;
        this.price = price;
    }

    public Ticket() {
    }

    public String getFlightName() {
        return flightName;
    }

    public LocalDateTime getFlightDate() {
        return flightDate;
    }

    public double getPrice() {
        return price;
    }

    //Nhập thông tin vé từ console
    public Ticket inputTicket() {
        Scanner input = new Scanner(System.in);

        //Tên chuyến bay
        System.out.print("- Flight name: ");
        this.flightName = input.nextLine();

        //Ngày giờ bay
        System.out.print("- Flight date (dd/MM/yyyy HH:mm): ");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        this.flightDate = LocalDateTime.parse(input.nextLine(), formatter);

        //Giá vé
        System.out.print("- Price: ");
        this.price = input.nextDouble();

        return new Ticket(flightName, flightDate, price);
    }

    //Xuất thông tin vé thành chuỗi (toString)
    public String printTiket() {
        return "Name: " + getFlightName() + "\tDate: " + getFlightDate().toString() + "\tPrice: " + getPrice() + "\n";
    }

    //Nhập danh sách vé
    public Ticket[] inputListTicket() {
        Scanner input = new Scanner(System.in);
        System.out.print("- Ticket quantity: ");
        int quantityTicket = input.nextInt();
        Ticket[] listTicket = new Ticket[quantityTicket];
        Ticket ticket = new Ticket();
        for (int i = 0; i < listTicket.length; i++) {
            listTicket[i] = ticket.inputTicket();
        }
        return listTicket;
    }

    //Xuất danh sách vé
    public String printListTicket() {
        Ticket ticket = new Ticket();
        String listTicket = " ";
        for (int i = 0; i < inputListTicket().length; i++) {
            ticket = inputListTicket()[i];
            listTicket = listTicket + (i + 1) + ". " + ticket.getFlightName() + " " +
                    ticket.getFlightDate().toString() + " " + ticket.getPrice() + "\n";
            System.out.println();
        }
        return listTicket;
    }

    //Tỉnh tổng tiền vé mỗi hành khách
    public Double getTotalPrice (Ticket[] listTicket){
        Double totalPrice = 0D;
        for (int i = 0; i < listTicket.length; i++) {
            totalPrice +=listTicket[i].getPrice();
        }
        return totalPrice;
    }
}

