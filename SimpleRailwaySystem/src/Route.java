import java.util.Objects;

public class Route {

    private Station source;

    private Station destination;

    public Route(Station source, Station destination) {
        this.source = source;
        this.destination = destination;
    }

    public Station getSource() {
        return source;
    }

    public void setSource(Station source) {
        this.source = source;
    }

    public Station getDestination() {
        return destination;
    }

    public void setDestination(Station destination) {
        this.destination = destination;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Route)) return false;
        Route route = (Route) o;
        return Objects.equals(getSource(), route.getSource()) && Objects.equals(getDestination(), route.getDestination());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSource(), getDestination());
    }

    @Override
    public String toString() {
        return "Route{" +
                "source=" + source +
                ", destination=" + destination +
                '}';
    }
}
