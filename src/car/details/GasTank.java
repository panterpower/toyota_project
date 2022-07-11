package car.details;

public class GasTank {
    private double currentGasVolume;

    public GasTank(double currentGasVolume) {
        this.currentGasVolume = currentGasVolume;
    }

    public double getCurrentGasVolume() {
        return currentGasVolume;
    }

    public void setCurrentGasVolume(double currentGasVolume) {
        this.currentGasVolume = currentGasVolume;
    }
}
