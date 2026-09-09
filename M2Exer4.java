import java.util.Scanner;
 
class HotelGuest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Guest name: ");
        String guestName = scanner.nextLine();
 
        System.out.print("Room number: ");
        int roomNumber = scanner.nextInt();
 
        System.out.print("Number of nights: ");
        int nights = scanner.nextInt();
 
        System.out.print("Room rate: ");
        double roomRate = scanner.nextDouble();
 
        System.out.println("Guest: " + guestName + ", Room: " + roomNumber + ", Nights: " + nights + ", Room Rate: PHP " + roomRate);
    }
}
