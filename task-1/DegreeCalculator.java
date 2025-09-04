import java.util.HashMap;

public class DegreeCalculator {
    private HashMap <String, DegreeData> degreeMap;

    public DegreeCalculator() {
        degreeMap = new HashMap<>();
        degreeMap.put("bsc", new DegreeData("BSc", 4));
        degreeMap.put("phd", new DegreeData("PhD", 6));
        degreeMap.put("msc", new DegreeData("MSc", 9));
    }
    public int yearsToCompleteDegree(String type) {
        String key = type.toLowerCase();
        if (degreeMap.containsKey(key)) {
            return degreeMap.get(key).getYears();
        }
        return 0;
    }

    public String degreeName(String type) {
        String key = type.toLowerCase();
        if (degreeMap.containsKey(key)) {
            return degreeMap.get(key).getName();
        }
        return "Invalid degree name.";
    }
}
