public class CommuterTrain extends BaseTrain {
    public CommuterTrain(String name, Integer passengerStrength, Integer trainNumber) {
        super(name, passengerStrength, trainNumber);
    }

    @Override
    public String assemble() {
        return String.format("CommuterTrain Created\nName: %s; PassengerStrength: %d; TrainNumber: %d", this.getName(), this.getPassengerStrength(), this.getPassengerStrength());
    }
}
