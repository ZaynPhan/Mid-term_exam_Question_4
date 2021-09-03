package Mid_term_exam_Question4;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //Nhập số lượng hành khách
        Scanner input = new Scanner(System.in);
        System.out.print("Quantity of passenger: ");
        int quantity = input.nextInt();

        //Nhập thông tin danh sách hành khách theo số lượng
        System.out.println("Please input your personal infomation!");
        Passenger[] listPassenger = Passenger.inputListPassenger(quantity);

        //Hiển thị thông tin danh sách hành khách theo thứ tự nhập
        System.out.println("===> Full list passenger");
        Passenger.printListPassenger(listPassenger);

        //Hiển thị thông tin danh sách hành khách theo giảm dần tổng giá vé
        System.out.println("=======> List passenger sorted by ascending total ticket fee");
        Passenger[] sortedList = listPassenger;
        Passenger.sortPassengerByAscendingTotalFee(sortedList);
    }
}
