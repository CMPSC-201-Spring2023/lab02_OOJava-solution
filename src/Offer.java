/**
* Offer class that creates an offer
* It has two constructors and two methods - credit and getBalance.
* @author Janyl Jumadinova
*/
public class Offer {
  // INSTANCE VARIABLES:
  private int offerId;
  private String offerText;

  /**
  * Constructor: specify starting balance, too.
  */
  public Offer(int id, String text) {
    offerId = id;
    offerText = text;
  }

  /** Mutator (set) method to change the offer text.
  */
  public void setOffer(String newOffer) {
    offerText = newOffer;
  }

  /** Accessor method to retrieve the offer.
  */
  public String getOfferText() {
    return offerText;
  }

  /** Accessor method to retrieve the offer id.
  */
  public int getOfferId() {
    return offerId;
  }
}
