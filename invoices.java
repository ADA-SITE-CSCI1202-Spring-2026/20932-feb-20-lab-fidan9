import java.util.Scanner;

public class invoices { 

    static class Invoice {
        private String partNum;
        private String partDesc;
        private int quantity;
        private double price;

        public Invoice(String partNum, String partDesc, int quantity, double price) {
            this.partNum = partNum;
            this.partDesc = partDesc;
            this.quantity = quantity;
            this.price = price;
        }

        public double getAmount() {
            return quantity * price;
        }

        public String getPartNum() { return partNum; }
        public String getPartDesc() { return partDesc; }
        public int getQuantity() { return quantity; }
        public double getPrice() { return price; }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many invoices do you want to enter? ");
        int n = sc.nextInt();
        sc.nextLine(); 
        for (int i = 0; i < n; i++) {
            System.out.println("\nInvoice #" + (i + 1));

            System.out.print("Enter part number: ");
            String partNum = sc.nextLine();

            System.out.print("Enter part description: ");
            String partDesc = sc.nextLine();

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();

            System.out.print("Enter price per item: ");
            double price = sc.nextDouble();
            sc.nextLine(); 

            Invoice inv = new Invoice(partNum, partDesc, quantity, price);

            System.out.println("Part Number: " + inv.getPartNum());
            System.out.println("Part Description: " + inv.getPartDesc());
            System.out.println("Quantity: " + inv.getQuantity());
            System.out.println("Price per item: " + inv.getPrice());
            System.out.println("Invoice Amount: " + inv.getAmount());
        }

        sc.close();
    }
}