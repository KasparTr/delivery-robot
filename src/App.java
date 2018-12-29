import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<Integer>> allLocations = new ArrayList<>();
        allLocations.add(Arrays.asList(1,1));
        allLocations.add(Arrays.asList(0,7));
        allLocations.add(Arrays.asList(1,2));
        allLocations.add(Arrays.asList(3,4));
        allLocations.add(Arrays.asList(1,-1));


        List<List<Integer>> result = solution.ClosestXdestinations(allLocations.size(), allLocations, 2);
        for(List<Integer> shortestLocations: result){
            System.out.println(shortestLocations);
        }

    }
}
