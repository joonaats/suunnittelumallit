import javafx.scene.image.Image;

import java.util.HashMap;
import java.util.Map;

public class TileGraphicFactory {
    private static final Map<String, Image> tileGraphics = new HashMap<>();

    // Returns the graphic for a specific tile type
    public static Image getTileGraphic(String type) {
        if (!tileGraphics.containsKey(type)) {
            tileGraphics.put(type, loadGraphic(type));
        }
        return tileGraphics.get(type);
    }

    // Load the graphic for a tile type (simple placeholder logic)
    private static Image loadGraphic(String type) {
        String filePath = "/resources/" + type + ".png";
        return new Image(filePath); // Ensure images are available in resources/images
    }
}