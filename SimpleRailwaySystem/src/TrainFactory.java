public class TrainFactory implements ITrainFactory {
    @Override
    public Train createTrain(TrainType type, String name, Integer passengerStrength, Integer trainNumber) {
        switch (type) {
            case LOCOMOTIV:
                return new LocomotivTrain(name, passengerStrength, trainNumber);
            case COMMUTER:
                return new CommuterTrain(name, passengerStrength, trainNumber);
            case RAILCAR:
                return new RailcarTrain(name, passengerStrength, trainNumber);
            default:
                return null;
        }
    }
}
