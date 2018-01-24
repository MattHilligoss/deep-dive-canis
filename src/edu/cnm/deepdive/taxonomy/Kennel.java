/*
 * Kennel.java 
 */
package edu.cnm.deepdive.taxonomy;

/**
 * This class exercises the {@link Canis}, {@link CanisLupus}, and {@link CanisLupusFamiliaris},
 * classes to demonstrate inheritance and polymorphism. This models
 * binomial taxonomy of genus and species, as well as sub-species.
 * 
 * @author Owner
 *
 */
public class Kennel {

  /**
   * Runs a test of using the {@link CanisLupus} and
   * {@link CanisLupusFamiliaris} classes. Command line
   * arguments are ignored.
   * @param args    Command line arguments (ignored).
   */
  public static void main(String[] args) {
    CanisLupus whiteFang = new CanisLupus();
    CanisLupus spot = new CanisLupusFamiliaris(false);
    CanisLupus fido = new  CanisLupusFamiliaris(true);
    System.out.println("white Fang");
    showOff(whiteFang);
    System.out.println("spot");
    showOff(spot);
    System.out.println("fido");
    showOff(fido);
  }

  /**
   * 
   * Invokes a number of methods on the {@link CanisLupus}
   * instance passed it as a parameter. If the instance
   * type is actually {@link CanisLupusFamiliaris}, then
   * the{@link CanisLupusFamiliaris#isGoodBoy()} method 
   * is also invoked.
   * @param wolf instance exercised.
   */
  public static void showOff(CanisLupus wolf) {
    wolf.describe();
    wolf.hunt();
  wolf.speak();
  if (wolf instanceof CanisLupusFamiliaris) {
    System.out.printf("Is a good boy: %b%n" , ((CanisLupusFamiliaris) wolf) .isGoodBoy()) ;
  }
  
  }

}
