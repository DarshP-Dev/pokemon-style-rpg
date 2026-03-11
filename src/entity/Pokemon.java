package entity;

public class Pokemon {
    // Instance variables
	public String name;
	public String type;
	public int level;
	public int health;
    

    // Constructor
    public Pokemon(String name, String type, int level, int health) {
        this.name = name;
        this.type = type;
        this.level = level;
        this.health = health;
        
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getLevel() {
        return level;
    }

    // Setter methods (if needed)
    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    public void sethealth(int health) {
        this.health = health;
    }

    // Example method to display information about the Pokemon
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Level: " + level);
    }
}