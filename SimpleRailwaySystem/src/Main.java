public class Main {
    public static void main(String[] args) {
        RailwaySystemSingleton system = RailwaySystemSingleton.getInstance();

        system.addTrain(TrainType.LOCOMOTIV, "Locomotiv", 10, 1);
        system.addTrain(TrainType.LOCOMOTIV, "Locomotiv1", 20, 2);
        system.addTrain(TrainType.LOCOMOTIV, "Locomotiv2", 30, 3);
        system.addTrain(TrainType.LOCOMOTIV, "Locomotiv3", 40, 4);
        system.addTrain(TrainType.LOCOMOTIV, "Locomotiv4", 50, 5);

        system.addStation("SH", "Senhora da Hora");
        system.addStation("VISO", "Viso");
        system.addStation("7BICAS", "Sete Bicas");

        System.out.println(system.toString());
    }
}