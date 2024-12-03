import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Game extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("RPG Map Generator");

        // Create a map (City or Wilderness)
        Map cityMap = new CityMap(10, 10); // 10x10 grid

        // Create a canvas to render the map
        Canvas canvas = new Canvas(500, 500); // 500x500 pixels
        cityMap.render(canvas);

        // Add the canvas to the scene
        VBox root = new VBox();
        root.getChildren().add(canvas);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


}