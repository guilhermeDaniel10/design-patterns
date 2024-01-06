public class DomesticPlan extends Plan {
    @Override
    void getRate() {
        rate = 3.50;
    }

    @Override
    String planInformation() {
        return "Domestic Plan Created";
    }
}
