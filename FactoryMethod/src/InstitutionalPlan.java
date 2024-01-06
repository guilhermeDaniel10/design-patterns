public class InstitutionalPlan extends Plan {
    @Override
    void getRate() {
        rate = 5.50;
    }

    @Override
    String planInformation() {
        return "Institutional Plan Created";
    }
}
