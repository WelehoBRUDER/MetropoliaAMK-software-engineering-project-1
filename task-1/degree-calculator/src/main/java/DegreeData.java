import java.util.HashMap;

public class DegreeData extends HashMap {
    private String name;
    private int years;

    public DegreeData(String name, int years) {
        this.name = name;
        this.years = years;
    }

    public String getName() {
        return name;
    }

    public int getYears() {
        return years;
    }
}
