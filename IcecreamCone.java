
public class IcecreamCone extends Icecream {

private int scoops;
private boolean chocolateCovered;


public IcecreamCone() {
  scoops = 1;  
  chocolateCovered = false;
}

 public IcecreamCone(String flavor, String topping, double price, int scoops, boolean chocolateCovered) {
    super(flavor, topping, price);
    this.scoops = scoops;
    this.chocolateCovered = chocolateCovered;
  }


public int getScoops() {
    return scoops;
  }


  
public boolean getChocolateCovered () {
    return chocolateCovered;
  }

  
  public void setScoops (int newScoops) {
    scoops = newScoops; 
  }

  
public void setChocolateCovered (boolean newChocolateCovered) {
    chocolateCovered = newChocolateCovered;
  } 



 public String toString() {
    return super.toString() + "\nNumber of scoops: " + scoops + "\nChocolate Covered: " + chocolateCovered;
  }

  
}
