package map;

import entity.Entity;
import map.StarterPokemon;

public class CollisionChecker {

	GamePanel gp;
	
		public CollisionChecker(GamePanel gp) {
			this.gp = gp;
		}
		public void checkTile(Entity entity, StarterPokemon SP) {
			
			int entityLeftWorldX = entity.worldX+entity.solidArea.x;
			int entityRightWorldX = entity.worldX + entity.solidArea.x + entity.solidArea.width;
			int entityTopWorldY = entity.worldY + entity.solidArea.y;
			int entityBottomWorldY = entity.worldY + entity.solidArea.y+ entity.solidArea.height;
			
			int entityLeftCol = entityLeftWorldX/gp.tileSize;
			int entityRightCol = entityRightWorldX/gp.tileSize;
			int entityTopRow = entityTopWorldY/gp.tileSize;
			int entityBottomRow = entityBottomWorldY/gp.tileSize;
			
			int tileNum1, tileNum2;
			
			switch(entity.direction) {
			case "up":
				entityTopRow = (entityTopWorldY - entity.speed)/gp.tileSize;
				tileNum1 = gp.tileM.mapTileNum[entityLeftCol][entityTopRow];
				tileNum2 = gp.tileM.mapTileNum[entityRightCol][entityTopRow];
				if(gp.tileM.tile[tileNum1].collision == true || gp.tileM.tile[tileNum2].collision == true) {
					entity.collisionOn = true;
				}
				if(tileNum1 == 107 || tileNum2 == 107 || tileNum1 == 108 || tileNum2 == 108 || tileNum1 == 109 || tileNum2 == 109 || tileNum1 == 111 || tileNum2 == 111 || tileNum1 == 112 || tileNum2 == 112 || tileNum1 == 113 || tileNum2 == 113 || tileNum1 == 114 || tileNum2 == 114 ) {
			        Dialogue d = new Dialogue(entity);  // Pass the player entity to the constructor
			        entity.speed = 0;
					
				}
				if(tileNum1 == 85 || tileNum2 == 85) {
					Store s = new Store(entity);
							entity.speed = 0;
					}
				if(tileNum1 == 115 || tileNum2 == 115 || tileNum1 == 116 || tileNum2 == 116 || tileNum1 == 117 || tileNum2 == 117) {
					PokemonBattle g = new PokemonBattle(entity, SP);
							entity.speed = 0;
					}
				if(tileNum1 == 110 || tileNum2 == 110) {
					StarterPokemon p = new StarterPokemon(entity);
					entity.speed = 0;
				}
				if(tileNum1 == 68 || tileNum2 == 68) {
					PokemonCentre c = new PokemonCentre(entity, SP);
					
					entity.speed = 0;
				}

				
				break;
			case "down":
				entityBottomRow = (entityBottomWorldY + entity.speed)/gp.tileSize;
				tileNum1 = gp.tileM.mapTileNum[entityLeftCol][entityBottomRow];
				tileNum2 = gp.tileM.mapTileNum[entityRightCol][entityBottomRow];
				if(gp.tileM.tile[tileNum1].collision == true || gp.tileM.tile[tileNum2].collision == true) {
					entity.collisionOn = true;
				}
				break;
			case "left":
				entityLeftCol = (entityLeftWorldX - entity.speed)/gp.tileSize;
				tileNum1 = gp.tileM.mapTileNum[entityLeftCol][entityTopRow];
				tileNum2 = gp.tileM.mapTileNum[entityLeftCol][entityBottomRow];
				if(gp.tileM.tile[tileNum1].collision == true || gp.tileM.tile[tileNum2].collision == true) {
					entity.collisionOn = true;
				}
				break;
			case "right":
				entityRightCol = (entityRightWorldX + entity.speed)/gp.tileSize;
				tileNum1 = gp.tileM.mapTileNum[entityRightCol][entityTopRow];
				tileNum2 = gp.tileM.mapTileNum[entityRightCol][entityBottomRow];
				if(gp.tileM.tile[tileNum1].collision == true || gp.tileM.tile[tileNum2].collision == true) {
					entity.collisionOn = true;
				}
				break;
			}
			
			
		}
		
}
