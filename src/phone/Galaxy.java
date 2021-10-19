package phone;

public class Galaxy extends Phone implements Ringable {
	
	public Galaxy (String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
    	return String.format("\nGalaxy %s says %s", this.getVersionNumber(),this.getRingTone());
    }
    @Override
    public String unlock() {
    	return "\nUnlocking via fingerprint";
    }
    @Override
    public void displayInfo() {
    	System.out.format("\nIPhone %s from %s", this.getVersionNumber(), this.getCarrier());       
    }

}
