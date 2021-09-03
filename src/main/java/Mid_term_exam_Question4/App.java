package Mid_term_exam_Question4;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //Nhập số lượng hành khách
        Scanner input = new Scanner(System.in);
        System.out.print("Quantity of passenger: ");
        int quantity = input.nextInt();

        //Nhập thông tin danh sách hành khách theo số lượng
        Passenger passenger = new Passenger();
        Passenger[] listPassenger = new Passenger[quantity];
        for (int i = 0; i < listPassenger.length; i++) {
            listPassenger[i] = passenger.inputPassengerInfo();
        }

        //Hiển thị thông tin danh sách hành khách
        passenger.printListPassenger(listPassenger);



    }
}
