import java.util.Scanner;
 
class MenuItem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Food item: ");
        String foodItem = scanner.nextLine();
 
        System.out.print("Category: ");
        String category = scanner.nextLine();
 
        System.out.print("Price: ");
        double price = scanner.nextDouble();
 
        System.out.print("Serving size: ");
        int servingSize = scanner.nextInt();
 
        System.out.println("Item: " + foodItem + ", Category: " + category + ", Price: PHP " + price + ", Serving Size: " + servingSize);
    }
}
 