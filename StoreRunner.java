import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {

    // Creates a Scanner object - feel free to delete if not using!
    Scanner input = new Scanner(System.in);

    Icecream ice = new Icecream();
    
    IcecreamCone iC = new IcecreamCone();

    IcecreamBowl iB = new IcecreamBowl();
    
    System.out.println("Hello welcom to my Icecream shop would you like a cone or a bowl?");
    System.out.println("1 = cone");
    System.out.println("2 = bowl");

    int Icecream = input.nextInt();
    
    if (Icecream == 1) { 

    System.out.println("Icecream in a cone");

      System.out.println("Is the cone covered in chocolate? true/false");
      
      boolean newIcecreamCone = input.nextBoolean();
      
      iC.setChocolateCovered(newIcecreamCone);

      System.out.println("How Many Scoops?");
      
      int newScoops = input.nextInt();
      
      iC.setScoops(newScoops);

      System.out.println("what is the flavor?");

      String newFlavor = input.next();

      iC.setFlavor(newFlavor);

      System.out.println("what is the Topping?");

      String newTopping = input.next();

      iC.setTopping(newTopping);

      System.out.println("Whats the price?");
      
      double newPrice = input.nextDouble();
      
      iC.setPrice(newPrice);

      System.out.println("Your Order: ");
      
      System.out.println(iC);
      
    }
    
     if (Icecream == 2) {
    
       System.out.println("Icecream in a bowl");
      
      System.out.println("Is the Icecream to go? true/false");
      
      boolean newIcecreamBowl = input.nextBoolean();
      
      iB.setIsToGo(newIcecreamBowl);

      System.out.println("Do you want a spoon? true/false");
      
      boolean newSpoon = input.nextBoolean();
      
      iB.setSpoon(newSpoon);

      System.out.println("what is the flavor?");

      String newFlavor = input.next();

      iB.setFlavor(newFlavor);

      System.out.println("what is the Topping?");

      String newTopping = input.next();

      iB.setTopping(newTopping);

      System.out.println("Whats the price?");
      
      double newPrice = input.nextDouble();
      
      iB.setPrice(newPrice);

      System.out.println("Your Order: ");
      
      System.out.println(iB);
  
        }
   

    // Closes the Scanner object
    input.close();
    
  }
}
