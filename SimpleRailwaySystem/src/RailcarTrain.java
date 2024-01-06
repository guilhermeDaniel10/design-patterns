public class RailcarTrain extends BaseTrain {
    public RailcarTrain(String name, Integer passengerStrength, Integer trainNumber) {
        super(name, passengerStrength, trainNumber);
    }

    @Override
    public String assemble() {
        return String.format("RailcarTrain Created\nName: %s; PassengerStrength: %d; TrainNumber: %d", this.getName(), this.getPassengerStrength(), this.getPassengerStrength());
    }
}
