
public class Icecream {

private String flavor;
private String topping;
  private double price;     


 public Icecream() {
    this("vanilla", "none", 1.99);
  }

  
  public Icecream(String flavor, String topping, double price) {
    this.flavor = flavor;
    this.topping = topping;
    this.price = price;
  }


public String getFlavor() {
    return flavor;
  }



public String getTopping() {
    return topping;
  }


public double getPrice() {
    return price;
  }


public void setFlavor(String newFlavor) {
    flavor = newFlavor;
  }

public void setTopping(String newTopping) {
    topping = newTopping;
  }

public void setPrice(double newPrice) {
    price = newPrice;
  }


public String toString() {
    return "Flavor: " + flavor + "\nTopping: " + topping + "\nPrice: " + price;
  }
  


}
