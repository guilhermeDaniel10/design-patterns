public class LocomotivTrain extends BaseTrain {
    public LocomotivTrain(String name, Integer passengerStrength, Integer trainNumber) {
        super(name, passengerStrength, trainNumber);
    }

    @Override
    public String assemble() {
        return String.format("LocomotivTrain Created\nName: %s; PassengerStrength: %d; TrainNumber: %d", this.getName(), this.getPassengerStrength(), this.getPassengerStrength());
    }
}
