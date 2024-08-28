import java.util.Random;

public abstract class Map {
    protected int width;
    protected int height;
    protected Tile[][] map;

    public Map(int width, int height) {
        this.width = width;
        this.height = height;
        this.map = new Tile[height][width];
        generateMap();  // Initialize the map with random tiles.
    }

    // Factory Method
    protected abstract Tile createTile();

    // Generates the map by filling it with random tiles.
    private void generateMap() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                map[i][j] = createTile();
            }
        }
    }

    // Displays the map on the screen as a matrix of characters.
    public void display() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(map[i][j].getCharacter() + " ");
            }
            System.out.println();
        }
    }
}