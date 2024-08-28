import java.util.Random;

public class CityMap extends Map {
    public CityMap(int width, int height) {
        super(width, height);
    }

    // Factory Method Implementation
    @Override
    protected Tile createTile() {
        Random rand = new Random();
        int tileType = rand.nextInt(3);  // 0 = Road, 1 = Forest, 2 = Building

        switch (tileType) {
            case 0:
                return new Road();
            case 1:
                return new Forest();
            case 2:
                return new Building();
            default:
                return null;
        }
    }
}