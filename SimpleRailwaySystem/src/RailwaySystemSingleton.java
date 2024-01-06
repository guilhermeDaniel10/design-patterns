import java.util.HashSet;
import java.util.Set;

public class RailwaySystemSingleton {
    private static RailwaySystemSingleton single_instance = null;

    private Set<Train> trains = new HashSet<>();

    private Set<Station> stations = new HashSet<>();

    private Set<Route> routes = new HashSet<>();

    private RailwaySystemSingleton() {

    }

    public static synchronized RailwaySystemSingleton getInstance() {
        if (single_instance == null) {
            single_instance = new RailwaySystemSingleton();
        }

        return single_instance;
    }

    public boolean addTrain(TrainType type, String name, Integer passengerStrength, Integer trainNumber) {
        Train train = new TrainFactory().createTrain(type, name, passengerStrength, trainNumber);

        return trains.add(train);
    }

    public boolean addStation(String name, String address) {
        return stations.add(new Station(name, address));
    }

    public boolean addRoute(Station source, Station destination) {
        return routes.add(new Route(source, destination));
    }

    public String toString() {
        String railwayInformation = "";
        for (Train t : trains) {
            railwayInformation += "\n" + t.assemble();
        }

        for (Station s : stations) {
            railwayInformation += "\n" + s.toString();
        }

        for (Route r : routes) {
            railwayInformation += "\n" + r.toString();
        }

        return railwayInformation;
    }
}
