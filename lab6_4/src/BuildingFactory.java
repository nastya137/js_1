import java.util.HashMap;
import java.util.Map;


class BuildingFactory {
    private static final Map<String, IType> buildings = new HashMap<>();

    public static IType getBuilding(int i) {
        IType building = buildings.get(i);

        if (building == null) {
            building = new Building(i);
            buildings.put(building.knowType(), building);
            System.out.println("Creating " + i + " circle");
        }

        return building;
    }
}
