public class DegreeCalculator {
    public int yearsToCompleteDegree(String type) {
        String key = type.toLowerCase();
        switch (key) {
            case "bsc":
                return 4;
            case "phd":
                return 6;
            case "msc":
                return 9;
            default:
                return 0;
        }
    }

    public String degreeName(String type) {
        String key = type.toLowerCase();
        switch (key) {
            case "bsc":
                return "BSc";
            case "phd":
                return "PhD";
            case "msc":
                return "MSc";
            default:
                return "Invalid degree name.";
        }
    }
}
