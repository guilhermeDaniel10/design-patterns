public interface ITrainFactory {
    Train createTrain(TrainType type, String name, Integer passengerStrength, Integer trainNumber);
}
