public class RewardValue {
    private double cashValue;
    public static final double CONVERTION_RATE = 0.0035;

    public RewardValue(int milesValue) {
        this.cashValue = convertToCash(milesValue);
    }

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public double getCashValue() {
        return this.cashValue;
    }

    public  int getMilesValue() {
        return convertToMiles(this.cashValue);
    }

    public double convertToCash(int miles) {
        return miles * CONVERTION_RATE;
    }

    public int convertToMiles(double cashValue) {
        return (int)(cashValue / CONVERTION_RATE);
    }




}
