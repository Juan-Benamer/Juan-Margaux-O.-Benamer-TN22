import java.util.Scanner;
 
class VehicleInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Brand: ");
        String brand = scanner.nextLine();
 
        System.out.print("Model: ");
        String model = scanner.nextLine();
 
        System.out.print("Plate number: ");
        String plateNumber = scanner.nextLine();
 
        System.out.print("Manufacturing year: ");
        int year = scanner.nextInt();
 
        System.out.print("Engine displacement (L): ");
        double engine = scanner.nextDouble();
 
        System.out.println("Brand: " + brand + ", Model: " + model + ", Plate: " + plateNumber + ", Year: " + year + ", Engine: " + engine + " L");
    }
}