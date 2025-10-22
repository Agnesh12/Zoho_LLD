package VirtualGiftCardSystem;

import java.util.Scanner;

public class GiftCardSystem {
    public static void main(String[] args) {
        Scanner tempScan = new Scanner(System.in);
        GiftSystem giftSystem = new GiftSystem();
        while(true) {
            System.out.println("------------------------Welcome To Virtual Gift Card System---------------------------");
            System.out.println("1.Display Account Details");
            System.out.println("2.Display Card Details Summary");
            System.out.println("3.Display Transaction Details");
            System.out.println("4.Create Customer");
            System.out.println("5.Create And Close Gift");
            System.out.println("6.Block And UnBlock Gift Card");
            System.out.println("7. Exit");
            System.out.println("Enter The Task To Perform");
            int user_Choice = tempScan.nextInt();
            switch (user_Choice) {
                case 1:
                    giftSystem.DisplayAccountDetails();
                    break;
                case 2:
                    System.out.println("Enter The Customer Id To Check Gift Cards");
                    int customer_Id = tempScan.nextInt();
                    giftSystem.CardDetailsSummary(customer_Id);
                    break;
                case 3:
                    System.out.println("Enter The Customer Id");
                    int customerId = tempScan.nextInt();
                    giftSystem.TransactionDetails(customerId);
                    break;
                case 4:
                  //  giftSystem.createCustomer();
                    break;
                case 5:
                   // giftSystem.CreateAndCloseGift();
                    break;
                case 6:
                   // giftSystem.BlockAndUnBlockGift();
                    break;
                case 7:
                    System.out.println("You Leaved The Virtual Gift Card System");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choice || Make Different Choice");
                    break;
            }
        }
    }
}
