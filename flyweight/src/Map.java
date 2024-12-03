import javafx.scene.image.Image;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

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

    public void render(Canvas canvas) {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        double tileWidth = canvas.getWidth() / width;
        double tileHeight = canvas.getHeight() / height;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                Tile tile = map[i][j];
                Image graphic = TileGraphicFactory.getTileGraphic(tile.getType());
                gc.drawImage(graphic, j * tileWidth, i * tileHeight, tileWidth, tileHeight);
            }
        }
    }
}