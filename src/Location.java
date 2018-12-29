import java.util.List;

public class Location {
    public final List<Integer> coords;
    public final Integer distance;

    public Location(List<Integer> coords, Integer distance) {
        this.coords = coords;
        this.distance = distance;
    }

}
