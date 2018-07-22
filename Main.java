package asses;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the shipment name :");
    String shipperName = sc.next();
    System.out.println("Enter the source :");
    String source = sc.next();
    System.out.println("Enter the destination :");
    String destination = sc.next();
    System.out.println("Enter the price :");
    Double price = sc.nextDouble();
    System.out.println("1. Agent");
    System.out.println("2. Company");
    System.out.println("Enter your choice :");
    int choise = sc.nextInt();
    if (choise == 1) {
      System.out.println("Enter the referal fee :");
      Double referalfee = sc.nextDouble();
      AgentShipment agentshipment = new AgentShipment(shipperName, source, destination, price, referalfee);
      DecimalFormat df = new DecimalFormat("#0.00");
      System.out.format("%-15s %-15s %-15s %s\n", "Name", "Source", "Destination", "Total Amount");
      System.out.format("%-15s %-15s %-15s %s", shipperName, source, destination,
          df.format(agentshipment.calculateShipmentAmount()));
    } else if (choise == 2) {
      System.out.println("Enter the luxury tax and corporate tax:");
      Double luxurytax = sc.nextDouble();
      Double corporatetax = sc.nextDouble();
      CompanyShipment companyshipment = new CompanyShipment(shipperName, source, destination, price, luxurytax,
          corporatetax);
      DecimalFormat df = new DecimalFormat("#0.00");
      System.out.format("%-15s %-15s %-15s %s\n", "Name", "Source", "Destination", "Total Amount");
      System.out.format("%-15s %-15s %-15s %s", shipperName, source, destination,
          df.format(companyshipment.calculateShipmentAmount()));
    }
    sc.close();

  }

}
