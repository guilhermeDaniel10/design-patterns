public class Main {
    public static void main(String[] args) {
        GetPlanFactory factory = new GetPlanFactory();
        Plan plan = factory.getPlan(PlanType.COMMERCIAL);
        System.out.println(plan.planInformation());
    }
}