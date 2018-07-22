package asses;

public class AgentShipment extends Shipment {

  public AgentShipment(String name, String source, String destination, Double price, Double referalFee) {
    super(name, source, destination, price);
    this.referalFee = referalFee;
  }

  private Double referalFee;

  public Double getReferalFee() {
    return referalFee;
  }

  public void setReferalFee(Double referalFee) {
    this.referalFee = referalFee;
  }

  double calculateShipmentAmount() {

    return getPrice() + getReferalFee();

  }
}
