import java.util.*;

public class Solution
{
    /**
     * Return an ordered list of delivery locations that forms the shortest path possible by:
     *  1) Creates a list of Location objects that hold the coordinates and distance to that location from the source.
     *  2) Sorts the result from point 1 by distances
     *  3) Returns a list of location coordinates as there are needed deliveries
     *      (These form the shortest path from the source to the locatons).
     * @param numDestinations
     * @param allLocations
     * @param numDeliveries
     * @return
     */
    public List<List<Integer>> ClosestXdestinations(int numDestinations,
                                                    List<List<Integer>> allLocations,
                                                    int numDeliveries)
    {
        List<List<Integer>> shortestLocationPath= new ArrayList<>();
        if(numDestinations<=0 || allLocations.size() == 0 || numDeliveries <=0) return shortestLocationPath;

        // Add the source (Truck location)
        List<Integer> sourceCoords = new ArrayList<>();
        sourceCoords.add(0);
        sourceCoords.add(0);

        // Create location (holds distance and coordinates) for each location in 'allLocations'
        Location[] locations = new Location[numDestinations];
        for(int i=0; i < allLocations.size(); i++){
            List<Integer> locCoords = allLocations.get(i);
            locations[i] = new Location(locCoords, calcDistanceBetweenCoords(sourceCoords, locCoords));
        }

        // Sort the locations based on distance, so that closest come first
        Arrays.sort(locations, new DistanceComparator());


        // Return as many location coordinates as there are deliveries in 'numDeliveries'
        for(int i = 0; i<numDeliveries; i++)
            shortestLocationPath.add(locations[i].coords);

        return shortestLocationPath;
    }

    // Calculates the euclidean distance from source coordinate to destination coordinate
    private int calcDistanceBetweenCoords(List<Integer> source, List<Integer> dest){
        int deltaX = dest.get(0) - source.get(0);
        int deltaY = dest.get(1) - source.get(1);
        return (int)(Math.sqrt(deltaX) + Math.sqrt(deltaY));
    }


}