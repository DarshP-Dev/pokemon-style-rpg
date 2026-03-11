package entity;

import java.awt.Graphics2D;
import map.StarterPokemon;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import map.GamePanel;
import map.KeyHandler;

public class Player extends Entity{

	GamePanel gp;
	KeyHandler keyH;
	StarterPokemon SP;
	
	public final int screenX;
	public final int screenY;
	 public static int money = 50;
	 public static int potion1 = 0;
	 public static int potion2 = 0;
	 public static int potion3 = 0;
	

	public Player(GamePanel gp, KeyHandler keyH) {
		this.gp = gp;
		this.keyH = keyH;

		screenX = gp.screenWidth/2 - (gp.tileSize/2);
		screenY = gp.screenHeight/2 - (gp.tileSize/2);
		
		solidArea = new Rectangle(16,16,16,16);
		
		setDefualtValues();
		getPlayerImage();
	}

	public void setDefualtValues() {

		worldX = gp.tileSize*27;
		worldY = gp.tileSize*41;
		speed = 8;
		direction ="down";
	}
	public void getPlayerImage() {
		try {

			up1 = ImageIO.read(getClass().getResourceAsStream("/player/MovementUp1.png"));
			up2 = ImageIO.read(getClass().getResourceAsStream("/player/MovementUp2.png"));
			down1 = ImageIO.read(getClass().getResourceAsStream("/player/MovementDown1.png"));
			down2 = ImageIO.read(getClass().getResourceAsStream("/player/MovementDown2.png"));
			left1 = ImageIO.read(getClass().getResourceAsStream("/player/MovementLeft1.png"));
			left2 = ImageIO.read(getClass().getResourceAsStream("/player/MovementLeft2.png"));
			right1 = ImageIO.read(getClass().getResourceAsStream("/player/MovementRight1.png"));
			right2 = ImageIO.read(getClass().getResourceAsStream("/player/MovementRight2.png"));

		}catch(IOException e) {
			e.printStackTrace();
		}

	}

	public void update() {

		if(keyH.upPressed == true || keyH.downPressed == true || 
				keyH.leftPressed == true || keyH.rightPressed == true) {

			if(keyH.upPressed == true) {
				direction = "up";
			}
			else if(keyH.downPressed == true) {
				direction ="down";
			}
			else if(keyH.leftPressed == true) {
				direction = "left";
			}
			else if (keyH.rightPressed == true) {
				direction = "right";
			}
			//check player collision
			collisionOn = false;
			gp.cChecker.checkTile(this, SP);
			//if collision is false player can move
			if(collisionOn == false) {
				switch(direction) {
				case "up":
					worldY -= speed;
					break;
				case "down":
					worldY += speed;
					break;
				case "left":
					worldX -= speed;
					break;
				case "right":
					worldX += speed;
					break;
				}
			}
			spriteCounter++;
			if(spriteCounter > 20) {
				if(spriteNum == 1) {
					spriteNum =2;
				}
				else if (spriteNum ==2) {
					spriteNum =1;
				}
				spriteCounter = 0;
			}
		}
	}

	public void draw(Graphics2D g2) {
		//g2.setColor(Color.white);
		//g2.fillRect(x,y,gp.tileSize,gp.tileSize);
		
		BufferedImage image = null;
		
		switch(direction){
		case "up":
			if(spriteNum==1){
				image = up1;

			}
			if(spriteNum==2){
				image = up2;

			}
			break;
		case "down":
			if(spriteNum==1){
				image = down1;

			}
			if(spriteNum==2){
				image = down2;

			}
			break;
		case "left":
			if(spriteNum==1){
				image = left1;

			}
			if(spriteNum==2){
				image = left2;

			}
			break;
		case "right":
			if(spriteNum==1){
				image = right1;

			}
			if(spriteNum==2){
				image = right2;

			}
			break;

		}
		g2.drawImage(image, screenX, screenY, gp.tileSize,gp.tileSize,null);
	}
	
	public void Changepos(int i) {
		worldY = worldY - i;
	}
	public void Changespeed() {
		speed = speed + 4;
	}
}
