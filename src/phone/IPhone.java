package phone;

public class IPhone extends Phone implements Ringable {
	public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        return String.format("\nIPhone %s says %s", this.getVersionNumber(), this.getRingTone());
    }
    @Override
    public String unlock() {
        return "\nUnlocking via facial recognition";
    }
    @Override
    public void displayInfo() {
       System.out.format("\nIPhone %s from %s", this.getVersionNumber(), this.getCarrier());           
    }
    
    
    
}
