public class CommercialPlan extends Plan {
    @Override
    void getRate() {
        rate = 7.5;
    }

    @Override
    String planInformation() {
        return "Commercial Plan created";
    }
}
