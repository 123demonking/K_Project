/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author linac
 */
public class eComputation implements DisplayInfo {
    private String appliances;
    private int hours;
    private int watts;
    private String provider;

    public void eComputation(String appliances, int hours, int watts, String provider) {
        this.appliances = appliances;
        this.hours = hours;
        this.watts = watts;
        this.provider = provider;
    }

    public double calculateBill() {
        double rate = getProviderRate(provider);
        double kWh = watts / 1000.0 * hours;
        return Math.round(kWh * rate * 100.0) / 100.0;
    }

    private double getProviderRate(String provider) {
        return switch (provider) {
            case "Davao Light" -> 9.1354;
            case "LANECO" -> 12.9744;
            case "ZAMSURECO II" -> 9.9514;
            case "SUKELCO" -> 10.1253;
            case "SOCOTECO" -> 9.4278;
            case "ANECO" -> 11.5657;
            default -> 0.0;
        };
    }

    @Override
    public String DisplayInfo(double cost) { 
        StringBuilder sb = new StringBuilder();
        sb.append("Electricity Billing System\n");
        sb.append("\n");
        sb.append("Appliances: ").append(appliances).append("\n");
        sb.append("Watts: ").append(watts).append("\n");
        sb.append("Estimated Operating Hours: ").append(hours).append("\n");
        sb.append("Estimated Electricity Cost: Php").append(cost).append("\n");
        sb.append("Thank You Come Again\n");
        return sb.toString();
    }
    
}
