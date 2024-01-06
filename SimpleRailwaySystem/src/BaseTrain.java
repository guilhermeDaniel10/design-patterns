public abstract class BaseTrain implements Train {
    private String name;

    private Integer passengerStrength;

    private Integer trainNumber;

    public BaseTrain(String name, Integer passengerStrength, Integer trainNumber) {
        this.name = name;
        this.passengerStrength = passengerStrength;
        this.trainNumber = trainNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPassengerStrength() {
        return passengerStrength;
    }

    public void setPassengerStrength(Integer passengerStrength) {
        this.passengerStrength = passengerStrength;
    }

    public Integer getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(Integer trainNumber) {
        this.trainNumber = trainNumber;
    }
}
