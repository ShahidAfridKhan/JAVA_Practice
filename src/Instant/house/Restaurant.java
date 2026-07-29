package Instant.house;

public class Restaurant {
    String Name;
    String FoodName;
    double FoodPrice;

    Restaurant(String Name,String FoodName,double FoodPrice){
        this.Name=Name;
        this.FoodName=FoodName;
        this.FoodPrice=FoodPrice;
    }
    public static void showMenu(){
        System.out.println("==================================");
        System.out.println("      WELCOME TO PARADISE");
        System.out.println("==================================");
        System.out.println("            MENU");
        System.out.println("----------------------------------");
        System.out.println("1. Chicken Biryani      ₹250");
        System.out.println("2. Mutton Biryani       ₹350");
        System.out.println("3. Veg Biryani          ₹180");
        System.out.println("4. Paneer Biryani       ₹220");
        System.out.println("5. Chicken Fried Rice   ₹200");
        System.out.println("6. Veg Fried Rice       ₹150");
        System.out.println("7. Butter Chicken       ₹280");
        System.out.println("8. Soft Drinks           ₹50");
        System.out.println("----------------------------------");
        System.out.println("Thank You! Visit Again 😊");
        System.out.println("==================================");
    }
    public static void prepareFood(){
        System.out.println("Preparing the food");
    }

}
