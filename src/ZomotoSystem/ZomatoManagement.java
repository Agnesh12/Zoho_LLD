package ZomotoSystem;

import java.util.*;

public class ZomatoManagement {
    ArrayList<Order> orders = new ArrayList<>();
    ArrayList<Food> foods = new ArrayList<>();
    ArrayList<User> users = new ArrayList<>();
    String adminName = "Admin";
    String password = "Admin123";
    ZomatoManagement() {
        foods.add(new Food(1, "VegetarianBriyani","Veg", true));
        foods.add(new Food(2, "PaneerButterMasala", "Veg", true));
        foods.add(new Food(3, "ChickenBiryani", "Non-Veg", true));
        foods.add(new Food(4, "MuttonCurry", "Non-Veg", true));
        foods.add(new Food(5, "MasalaDosa", "Veg", true));
        foods.add(new Food(6, "FishFry", "Non-Veg", true));
        foods.add(new Food(7, "VegFriedRice", "Veg", true));
        foods.add(new Food(8, "PrawnMasala", "Non-Veg", true));
        foods.add(new Food(9, "CholeBhature", "Veg", true));
        foods.add(new Food(10, "EggCurry", "Non-Veg", true));

    }

    public void AdminRole() {
        System.out.println("Enter The Admin Name");
        Scanner tempScan = new Scanner(System.in);
        String newAdmin = tempScan.next();
        System.out.println("Enter The Admin Password");
        String newAdminPassword = tempScan.next();
        if(newAdmin.equalsIgnoreCase(adminName) && password.equalsIgnoreCase(newAdminPassword)) {
            System.out.println("Admin Logged In Successfully");
            AdminMenu();
        }
    }
    public void UserRole() {
        Scanner tempScan = new Scanner(System.in);
        System.out.println("Enter The User_Id");
        int user_Id = tempScan.nextInt();
        System.out.println("Enter The User_Name");
        String userName = tempScan.next();
        System.out.println("Enter The User Password");
        String user_Password = tempScan.next();
       if(users.contains(user_Id)) {
           System.out.println("User LoggedIn Successfully");
           UserMenu();
       }
       else {
           users.add(new User(user_Id, userName, user_Password));
           System.out.println("User Login Created");
           UserMenu();
       }
    }
    public void AdminMenu() {
        System.out.println("Welcome to Admin Menu");
        while(true) {
            System.out.println("1.Add Food");
            System.out.println("2.Update Food");
            System.out.println("3. Remove Food");
            System.out.println("4. Display Food Records");
            System.out.println("5. Display Members");
            Scanner tempScan = new Scanner(System.in);
            int adminChoice = tempScan.nextInt();
            switch(adminChoice) {
                case 1:
                    System.out.println("Enter The food");
                    System.out.println("Enter The Food Id");
                    int food_id = tempScan.nextInt();
                    System.out.println("Enter The Food Name");
                    String food_name = tempScan.next();
                    System.out.println("Enter The Variety");
                    String food_Variety = tempScan.next();
                    AddFood(food_id,food_name, food_Variety);
                    break;
                case 2:
                    System.out.println("Enter The Food To Update");
                    System.out.println("Enter The Food Id To Remove");
                    int update_Id = tempScan.nextInt();
                    UpdateFood(update_Id);
                    break;
                case 3:
                    System.out.println("Enter The Food To Remove");
                    System.out.println("Enter The Remove Id");
                    int remove_Id = tempScan.nextInt();
                    RemoveFood(remove_Id);
                    break;
                case 4:
                    System.out.println("Display Food Stock");
                    DisplayFoods();
                    break;
                case 5:
                    System.out.println("Display Members");
                    DisplayMembers();
                    break;
                case 6:
                    System.out.println("Exiting......");
                    System.exit(0);
                    break;
            }
        }
    }
    public void DisplayFoods() {
        System.out.println("Display All Food Stocks");
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.printf("%-5s %-20s %-10s\n","Food_Id", "Food_Name", "Food_Variety");
        System.out.println("----------------------------------------------------------------------------------------------");
        for(Food food : foods) {
            System.out.printf("%-5d %-20s %-10s\n", food.food_Id, food.food_name, food.variety);
        }
        System.out.println("----------------------------------------------------------------------------------------------");
    }
    public void DisplayMembers() {
        System.out.println("Display All Members");
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.printf("%-5s %-15s\n", "User_Id", "UserName");
        System.out.println("----------------------------------------------------------------------------------------------");
        for(User user : users) {
            System.out.printf("%-5d %-15s\n", user.user_id, user.Username);
        }

        System.out.println("----------------------------------------------------------------------------------------------");
    }
    public void AddFood(int food_Id, String food_name, String Variety) {
        foods.add(new Food(food_Id, food_name, Variety,true));
    }
    public void RemoveFood(int remove_id) {
        Food food1 = null;
        for(Food  food : foods) {
            if(food.food_Id == remove_id) {
                food1 = food;
                break;
            }
        }
        foods.remove(food1);
    }
    public void UpdateFood(int update_id) {
        for(Food food : foods) {
            if(food.food_Id == update_id) {
                System.out.println("Enter The Food Name");
                Scanner tempScan = new Scanner(System.in);
                String food_name = tempScan.next();
                food.food_name = food_name;
                System.out.println("Enter The Food Variety");
                String food_variety = tempScan.next();
                food.variety = food_variety;
            }
        }
    }
    public void UserMenu() {
        Scanner tempScan = new Scanner(System.in);

        while(true) {
            System.out.println("Enter The UserFood Choice");
            System.out.println("Welcome To User Menu");
            System.out.println("1.Display Food Stocks");
            System.out.println("2.FoodOrder");
            System.out.println("3.FoodRemove");
            System.out.println("4.Orders");
            System.out.println("5.Exit");
            int UserChoice = tempScan.nextInt();
            switch(UserChoice) {
                case 1:
                    DisplayFoods();
                    break;
                case 2:
                    System.out.println("Order The Food");
                    OrderFood();
                    break;
                case 3:
                    System.out.println("Enter The Order Id To Remove");
                    int RemoveOrderId = tempScan.nextInt();
                    RemoveOrder(RemoveOrderId);
                    break;
                case 4:
                    System.out.println("Show All The Records");
                    ShowOrderRecords();
                    break;
                case 5:
                    System.out.println("Exiting....");
                    System.exit(0);
                    break;
            }
        }
    }
    public void OrderFood() {
        Scanner tempScan = new Scanner(System.in);
        System.out.println("Enter The Food Id");
        int order_Id = tempScan.nextInt();
        System.out.println("Enter The Food Name");
        String OrderFoodName = tempScan.next();
        System.out.println("Enter The Food Variety");
        String FoodVariety = tempScan.next();
        for(Food food : foods) {
            if(food.isAvailable && food.food_Id == order_Id) {
                orders.add(new Order(order_Id, OrderFoodName, FoodVariety));
                food.isAvailable = false;
            }
        }
        System.out.println("Ordered Successfully");
    }
    public void RemoveOrder(int RemoveOrderId) {
        Order order1 = null;
        for(Order order : orders) {
            if(order.order_id == RemoveOrderId) {
                order1 = order;
            }
        }
        orders.remove(order1);
    }
    public void ShowOrderRecords() {
        System.out.println("----------------------------------------------------------");
        System.out.printf("%-5s %-15s %-10s\n", "Order_Id", "Food Name", "Food Variety");
        System.out.println("----------------------------------------------------------");
        for(Order order : orders) {
            System.out.printf("%-5d %-15s %-10s\n", order.order_id, order.foodName, order.variety);
        }
        System.out.println("----------------------------------------------------------");
    }
}
