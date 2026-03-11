package entity;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import map.GamePanel;
import map.KeyHandler;

public class PlayerPokemon extends Pokemon{
	
	public int health;
	public int level;
	public String name;
	public String type;

	public PlayerPokemon(String name, String type, int level, int health) {
		super(name, type, level, health);
		Pokemon pikachu = new Pokemon("Pikachu", "Electric", 25,100);	
		}

}
