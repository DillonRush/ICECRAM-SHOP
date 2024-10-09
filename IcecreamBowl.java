
public class IcecreamBowl extends Icecream {

private boolean isToGo;
private boolean spoon;


public IcecreamBowl() {
    isToGo = false;
    spoon = true;
}

 public IcecreamBowl(String flavor, String topping, double price, boolean isToGo, boolean spoon) {
    super(flavor, topping, price);
    this.isToGo = isToGo;
    this.spoon = spoon;
  }


public boolean getIsToGo() {
    return isToGo;
  }


public boolean getSpoon() {
    return spoon;
  }


public void setIsToGo(boolean newIsToGo) {
    isToGo = newIsToGo;
  }

public void setSpoon(boolean newSpoon) {
    spoon = newSpoon;
}

 public String toString() {
    return super.toString() + "\nIs To Go: " + isToGo + "\nSpoon: " + spoon;
  }


}
