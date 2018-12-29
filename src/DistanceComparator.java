import java.util.Comparator;

public class DistanceComparator implements Comparator<Location> {
    @Override
    public int compare(Location o1, Location o2) {
        if(o1.distance > o2.distance) return 1;
        if(o1.distance < o2.distance) return -1;
        else return 0;
    }
}