package ZomotoSystem;

public class Food {
    int food_Id;
    String food_name;
    String variety;
    boolean isAvailable;
    Food(int food_Id, String food_name, String variety, boolean isAvailable) {
        this.food_Id = food_Id;
        this.food_name = food_name;
        this.variety = variety;
        this.isAvailable = isAvailable;
    }
}
