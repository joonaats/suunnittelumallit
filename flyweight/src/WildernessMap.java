import java.util.Random;

public class WildernessMap extends Map {
    public WildernessMap(int width, int height) {
        super(width, height);
    }

    // Factory Method Implementation
    @Override
    protected Tile createTile() {
        Random rand = new Random();
        int tileType = rand.nextInt(3);  // 0 = Swamp, 1 = Water, 2 = Forest

        switch (tileType) {
            case 0:
                return new Swamp();
            case 1:
                return new Water();
            case 2:
                return new Forest();
            default:
                return null;
        }
    }
}