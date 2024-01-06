public class GetPlanFactory {

    public Plan getPlan(PlanType planType) {
        if (planType == null) {
            return null;
        }

        switch (planType) {
            case DOMESTIC:
                return new DomesticPlan();
            case COMMERCIAL:
                return new CommercialPlan();
            case INSTITUTIONAL:
                return new InstitutionalPlan();
            default:
                return null;
        }
    }
}
