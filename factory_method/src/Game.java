public class Game {
    public static void main(String[] args) {  // Main method must be exactly like this
        Game game = new Game();  // Create an instance of Game

        // Create and display a CityMap
        Map cityMap = game.createMap("city", 5, 5);  // Creating a 5x5 CityMap
        System.out.println("City Map:");
        cityMap.display();

        // Create and display a WildernessMap
        Map wildernessMap = game.createMap("wilderness", 5, 5);  // Creating a 5x5 WildernessMap
        System.out.println("\nWilderness Map:");
        wildernessMap.display();
    }

    // Factory Method to create a Map object
    public Map createMap(String type, int width, int height) {
        if (type.equalsIgnoreCase("city")) {
            return new CityMap(width, height);
        } else if (type.equalsIgnoreCase("wilderness")) {
            return new WildernessMap(width, height);
        }
        return null;
    }
}