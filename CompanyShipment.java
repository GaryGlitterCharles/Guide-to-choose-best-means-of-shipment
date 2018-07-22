package asses;

public class CompanyShipment extends Shipment {

  public CompanyShipment(String name, String source, String destination, Double price, Double luxuryTax,
      Double corporateTax) {
    super(name, source, destination, price);
    this.luxuryTax = luxuryTax;
    this.corporateTax = corporateTax;
  }

  private Double luxuryTax;
  private Double corporateTax;

  public Double getLuxuryTax() {
    return luxuryTax;
  }

  public void setLuxuryTax(Double luxuryTax) {
    this.luxuryTax = luxuryTax;
  }

  public Double getCorporateTax() {
    return corporateTax;
  }

  public void setCorporateTax(Double corporateTax) {
    this.corporateTax = corporateTax;
  }

  double calculateShipmentAmount() {
    Double total = ((getPrice() * getLuxuryTax()) / 100) + ((getPrice() * getCorporateTax()) / 100);
    Double finalTotal = getPrice() + total;

    return finalTotal;

  }
}
