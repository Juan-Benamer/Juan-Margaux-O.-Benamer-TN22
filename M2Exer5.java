import java.util.Scanner;
 
class PhoneRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Brand: ");
        String brand = scanner.nextLine();
 
        System.out.print("Model: ");
        String model = scanner.nextLine();
 
        System.out.print("RAM (GB): ");
        int ram = scanner.nextInt();
 
        System.out.print("Storage (GB): ");
        int storage = scanner.nextInt();
 
        System.out.print("Price: ");
        double price = scanner.nextDouble();
 
        System.out.println("Brand: " + brand + ", Model: " + model + ", RAM: " + ram + "GB, Storage: " + storage + "GB, Price: PHP " + price);
    }
}
