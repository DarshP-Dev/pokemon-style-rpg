package tile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.imageio.ImageIO;
import java.awt.Graphics2D;
import map.GamePanel;

public class TileManager {
	
	GamePanel gp;
	public Tile[] tile;
	public int mapTileNum[][];
	
	public TileManager(GamePanel gp) {
		this.gp = gp;
		tile = new Tile[300];
		mapTileNum = new int [gp.maxWorldCol][gp.maxWorldRow];
		getTileImage();
		loadMap("/maps/map01.txt");
	}
	
	public void getTileImage() {
		
		try {
			
			tile[0] = new Tile();
			tile[0].image = ImageIO.read(getClass().getResourceAsStream("/tiles/GrassTile.png"));
			
			tile[1] = new Tile();
			tile[1].image = ImageIO.read(getClass().getResourceAsStream("/tiles/PathTile.png"));
			
			tile[2] = new Tile();
			tile[2].image = ImageIO.read(getClass().getResourceAsStream("/tiles/WaterTile.png"));
			tile[2].collision = true;
			
			tile[3] = new Tile();
			tile[3].image = ImageIO.read(getClass().getResourceAsStream("/tiles/TallGrassTile.png"));
			
			tile[4] = new Tile();
			tile[4].image = ImageIO.read(getClass().getResourceAsStream("/mountainTiles/BottomLeftMountain.png"));
			tile[4].collision = true;

			tile[5] = new Tile();
			tile[5].image = ImageIO.read(getClass().getResourceAsStream("/mountainTiles/BottomRightMountain.png"));
			tile[5].collision = true;
			
			tile[6] = new Tile();
			tile[6].image = ImageIO.read(getClass().getResourceAsStream("/mountainTiles/FrontMountain.png"));
			tile[6].collision = true;
			
			tile[7] = new Tile();
			tile[7].image = ImageIO.read(getClass().getResourceAsStream("/mountainTiles/MiddleLeftMountain.png"));
			tile[7].collision = true;
			
			tile[8] = new Tile();
			tile[8].image = ImageIO.read(getClass().getResourceAsStream("/mountainTiles/MiddleMountain.png"));
			tile[8].collision = true;
			
			tile[9] = new Tile();
			tile[9].image = ImageIO.read(getClass().getResourceAsStream("/mountainTiles/MiddleRightMountain.png"));
			tile[9].collision = true;
			
			tile[10] = new Tile();
			tile[10].image = ImageIO.read(getClass().getResourceAsStream("/mountainTiles/TopLeftMountain.png"));
			tile[10].collision = true;
			
			tile[11] = new Tile();
			tile[11].image = ImageIO.read(getClass().getResourceAsStream("/mountainTiles/TopMiddleMountain.png"));
			tile[11].collision = true;
			
			tile[12] = new Tile();
			tile[12].image = ImageIO.read(getClass().getResourceAsStream("/mountainTiles/TopRightMountain.png"));
			tile[12].collision = true;
			
			tile[13] = new Tile();
			tile[13].image = ImageIO.read(getClass().getResourceAsStream("/trees/bigTree1.png"));
			tile[13].collision = true;
			
			tile[14] = new Tile();
			tile[14].image = ImageIO.read(getClass().getResourceAsStream("/trees/bigTree2.png"));
			tile[14].collision = true;
			
			tile[15] = new Tile();
			tile[15].image = ImageIO.read(getClass().getResourceAsStream("/trees/bigTree3.png"));
			tile[15].collision = true;
			
			tile[16] = new Tile();
			tile[16].image = ImageIO.read(getClass().getResourceAsStream("/trees/bigTree4.png"));
			tile[16].collision = true;
			
			tile[17] = new Tile();
			tile[17].image = ImageIO.read(getClass().getResourceAsStream("/trees/bigTree5.png"));
			tile[17].collision = true;
			
			tile[18] = new Tile();
			tile[18].image = ImageIO.read(getClass().getResourceAsStream("/trees/bigTree6.png"));
			tile[18].collision = true;
			
			tile[19] = new Tile();
			tile[19].image = ImageIO.read(getClass().getResourceAsStream("/trees/bigTree7.png"));
			tile[19].collision = true;
			
			tile[20] = new Tile();
			tile[20].image = ImageIO.read(getClass().getResourceAsStream("/trees/bigTree8.png"));
			tile[20].collision = true;
			
			tile[21] = new Tile();
			tile[21].image = ImageIO.read(getClass().getResourceAsStream("/gym/Gym1.png"));
			tile[21].collision = true;

			
			tile[22] = new Tile();
			tile[22].image = ImageIO.read(getClass().getResourceAsStream("/gym/Gym2.png"));
			tile[22].collision = true;

			tile[23] = new Tile();
			tile[23].image = ImageIO.read(getClass().getResourceAsStream("/gym/Gym3.png"));
			tile[23].collision = true;

			tile[24] = new Tile();
			tile[24].image = ImageIO.read(getClass().getResourceAsStream("/gym/Gym4.png"));
			tile[24].collision = true;

			tile[25] = new Tile();
			tile[25].image = ImageIO.read(getClass().getResourceAsStream("/gym/Gym5.png"));
			tile[25].collision = true;

			tile[26] = new Tile();
			tile[26].image = ImageIO.read(getClass().getResourceAsStream("/gym/Gym6and7.png"));
			tile[26].collision = true;

			tile[28] = new Tile();
			tile[28].image = ImageIO.read(getClass().getResourceAsStream("/gym/Gym8.png"));
			tile[28].collision = true;

			tile[29] = new Tile();
			tile[29].image = ImageIO.read(getClass().getResourceAsStream("/gym/Gym9.png"));
			tile[29].collision = true;

			tile[30] = new Tile();
			tile[30].image = ImageIO.read(getClass().getResourceAsStream("/gym/Gym10.png"));
			tile[30].collision = true;

			tile[31] = new Tile();
			tile[31].image = ImageIO.read(getClass().getResourceAsStream("/gym/Gym11.png"));
			tile[31].collision = true;

			tile[32] = new Tile();
			tile[32].image = ImageIO.read(getClass().getResourceAsStream("/gym/Gym12.png"));
			tile[32].collision = true;

			tile[33] = new Tile();
			tile[33].image = ImageIO.read(getClass().getResourceAsStream("/gym/Gym13.png"));
			tile[33].collision = true;

			tile[34] = new Tile();
			tile[34].image = ImageIO.read(getClass().getResourceAsStream("/gym/Gym14and15.png"));
			tile[34].collision = true;

			tile[36] = new Tile();
			tile[36].image = ImageIO.read(getClass().getResourceAsStream("/gym/Gym16.png"));
			tile[36].collision = true;

			tile[37] = new Tile();
			tile[37].image = ImageIO.read(getClass().getResourceAsStream("/gym/Gym17.png"));
			tile[37].collision = true;

			tile[38] = new Tile();
			tile[38].image = ImageIO.read(getClass().getResourceAsStream("/gym/Gym18.png"));
			tile[38].collision = true;

			tile[39] = new Tile();
			tile[39].image = ImageIO.read(getClass().getResourceAsStream("/gym/Gym19.png"));
			tile[39].collision = true;

			tile[40] = new Tile();
			tile[40].image = ImageIO.read(getClass().getResourceAsStream("/gym/Gym20.png"));
			tile[40].collision = true;

			tile[41] = new Tile();
			tile[41].image = ImageIO.read(getClass().getResourceAsStream("/gym/gym21.png"));
			tile[41].collision = true;

			tile[42] = new Tile();
			tile[42].image = ImageIO.read(getClass().getResourceAsStream("/gym/gym22.png"));
			tile[42].collision = true;
			
			tile[43] = new Tile();
			tile[43].image = ImageIO.read(getClass().getResourceAsStream("/gym/gym23.png"));
			tile[43].collision = true;

			tile[44] = new Tile();
			tile[44].image = ImageIO.read(getClass().getResourceAsStream("/gym/gym24.png"));
			tile[44].collision = true;

			tile[45] = new Tile();
			tile[45].image = ImageIO.read(getClass().getResourceAsStream("/gym/gym25.png")); 
			tile[45].collision = true;

			tile[46] = new Tile();
			tile[46].image = ImageIO.read(getClass().getResourceAsStream("/pokecenter/pokecenter1.png"));
			tile[46].collision = true;

			tile[47] = new Tile();
			tile[47].image = ImageIO.read(getClass().getResourceAsStream("/pokecenter/pokecenter2.png"));
			tile[47].collision = true;
			
			tile[48] = new Tile();
			tile[48].image = ImageIO.read(getClass().getResourceAsStream("/pokecenter/pokecenter3.png"));
			tile[48].collision = true;

			tile[49] = new Tile();
			tile[49].image = ImageIO.read(getClass().getResourceAsStream("/pokecenter/pokecenter4.png"));
			tile[49].collision = true;

			tile[50] = new Tile();
			tile[50].image = ImageIO.read(getClass().getResourceAsStream("/pokecenter/pokecenter5.png"));
			tile[50].collision = true;

			tile[51] = new Tile();
			tile[51].image = ImageIO.read(getClass().getResourceAsStream("/pokecenter/pokecenter6.png"));
			tile[51].collision = true;

			tile[52] = new Tile();
			tile[52].image = ImageIO.read(getClass().getResourceAsStream("/pokecenter/pokecenter7.png"));
			tile[52].collision = true;

			tile[53] = new Tile();
			tile[53].image = ImageIO.read(getClass().getResourceAsStream("/pokecenter/pokecenter8.png"));
			tile[53].collision = true;

			tile[54] = new Tile();
			tile[54].image = ImageIO.read(getClass().getResourceAsStream("/pokecenter/pokecenter9.png"));
			tile[54].collision = true;

			tile[55] = new Tile();
			tile[55].image = ImageIO.read(getClass().getResourceAsStream("/pokecenter/pokecenter10.png"));
			tile[55].collision = true;

			tile[56] = new Tile();
			tile[56].image = ImageIO.read(getClass().getResourceAsStream("/pokecenter/pokecenter11.png"));
			tile[56].collision = true;

			tile[57] = new Tile();
			tile[57].image = ImageIO.read(getClass().getResourceAsStream("/pokecenter/pokecenter12.png"));
			tile[57].collision = true;

			tile[58] = new Tile();
			tile[58].image = ImageIO.read(getClass().getResourceAsStream("/pokecenter/pokecenter13.png"));
			tile[58].collision = true;

			tile[59] = new Tile();
			tile[59].image = ImageIO.read(getClass().getResourceAsStream("/pokecenter/pokecenter14.png"));
			tile[59].collision = true;

			tile[60] = new Tile();
			tile[60].image = ImageIO.read(getClass().getResourceAsStream("/pokecenter/pokecenter15.png"));
			tile[60].collision = true;

			tile[61] = new Tile();
			tile[61].image = ImageIO.read(getClass().getResourceAsStream("/pokecenter/pokecenter16.png"));
			tile[61].collision = true;

			tile[62] = new Tile();
			tile[62].image = ImageIO.read(getClass().getResourceAsStream("/pokecenter/pokecenter17.png"));
			tile[62].collision = true;

			tile[63] = new Tile();
			tile[63].image = ImageIO.read(getClass().getResourceAsStream("/pokecenter/pokecenter18.png"));
			tile[63].collision = true;

			tile[64] = new Tile();
			tile[64].image = ImageIO.read(getClass().getResourceAsStream("/pokecenter/pokecenter19.png"));
			tile[64].collision = true;

			tile[65] = new Tile();
			tile[65].image = ImageIO.read(getClass().getResourceAsStream("/pokecenter/pokecenter20.png"));
			tile[65].collision = true;

			tile[66] = new Tile();
			tile[66].image = ImageIO.read(getClass().getResourceAsStream("/pokecenter/pokecenter21.png"));
			tile[66].collision = true;

			tile[67] = new Tile();
			tile[67].image = ImageIO.read(getClass().getResourceAsStream("/pokecenter/pokecenter22.png"));
			tile[67].collision = true;

			tile[68] = new Tile();
			tile[68].image = ImageIO.read(getClass().getResourceAsStream("/pokecenter/pokecenter23.png"));
			tile[68].collision = true;
			
			tile[69] = new Tile();
			tile[69].image = ImageIO.read(getClass().getResourceAsStream("/pokecenter/pokecenter24.png"));
			tile[69].collision = true;

			tile[70] = new Tile();
			tile[70].image = ImageIO.read(getClass().getResourceAsStream("/pokecenter/pokecenter25.png"));
			tile[70].collision = true;

			tile[71] = new Tile();
			tile[71].image = ImageIO.read(getClass().getResourceAsStream("/shop/shop1.png"));
			tile[71].collision = true;

			tile[72] = new Tile();
			tile[72].image = ImageIO.read(getClass().getResourceAsStream("/shop/shop2.png"));
			tile[72].collision = true;

			tile[73] = new Tile();
			tile[73].image = ImageIO.read(getClass().getResourceAsStream("/shop/shop3.png"));
			tile[73].collision = true;

			tile[74] = new Tile();
			tile[74].image = ImageIO.read(getClass().getResourceAsStream("/shop/shop4.png"));
			tile[74].collision = true;

			tile[75] = new Tile();
			tile[75].image = ImageIO.read(getClass().getResourceAsStream("/shop/shop5.png"));
			tile[75].collision = true;

			tile[76] = new Tile();
			tile[76].image = ImageIO.read(getClass().getResourceAsStream("/shop/shop6.png"));
			tile[76].collision = true;

			tile[77] = new Tile();
			tile[77].image = ImageIO.read(getClass().getResourceAsStream("/shop/shop7.png"));
			tile[77].collision = true;

			tile[78] = new Tile();
			tile[78].image = ImageIO.read(getClass().getResourceAsStream("/shop/shop8.png"));
			tile[78].collision = true;

			tile[79] = new Tile();
			tile[79].image = ImageIO.read(getClass().getResourceAsStream("/shop/shop9.png"));
			tile[79].collision = true;

			tile[80] = new Tile();
			tile[80].image = ImageIO.read(getClass().getResourceAsStream("/shop/shop10.png"));
			tile[80].collision = true;

			tile[81] = new Tile();
			tile[81].image = ImageIO.read(getClass().getResourceAsStream("/shop/shop11.png"));
			tile[81].collision = true;

			tile[82] = new Tile();
			tile[82].image = ImageIO.read(getClass().getResourceAsStream("/shop/shop12.png"));
			tile[82].collision = true;

			tile[83] = new Tile();
			tile[83].image = ImageIO.read(getClass().getResourceAsStream("/shop/shop13.png"));
			tile[83].collision = true;
			
			tile[84] = new Tile();
			tile[84].image = ImageIO.read(getClass().getResourceAsStream("/shop/shop14.png"));
			tile[84].collision = true;

			tile[85] = new Tile();
			tile[85].image = ImageIO.read(getClass().getResourceAsStream("/shop/shop15.png"));
			tile[85].collision = true;

			tile[86] = new Tile();
			tile[86].image = ImageIO.read(getClass().getResourceAsStream("/shop/shop16.png"));
			tile[86].collision = true;

			tile[87] = new Tile();
			tile[87].image = ImageIO.read(getClass().getResourceAsStream("/house/house1.png"));
			tile[87].collision = true;
			
			tile[88] = new Tile();
			tile[88].image = ImageIO.read(getClass().getResourceAsStream("/house/house2.png"));
			tile[88].collision = true;

			tile[89] = new Tile();
			tile[89].image = ImageIO.read(getClass().getResourceAsStream("/house/house3.png"));
			tile[89].collision = true;

			tile[90] = new Tile();
			tile[90].image = ImageIO.read(getClass().getResourceAsStream("/house/house4.png"));
			tile[90].collision = true;

			tile[91] = new Tile();
			tile[91].image = ImageIO.read(getClass().getResourceAsStream("/house/house5.png"));
			tile[91].collision = true;

			tile[92] = new Tile();
			tile[92].image = ImageIO.read(getClass().getResourceAsStream("/house/house6.png"));
			tile[92].collision = true;

			tile[93] = new Tile();
			tile[93].image = ImageIO.read(getClass().getResourceAsStream("/house/house7.png"));
			tile[93].collision = true;

			tile[94] = new Tile();
			tile[94].image = ImageIO.read(getClass().getResourceAsStream("/house/house8.png"));
			tile[94].collision = true;

			tile[95] = new Tile();
			tile[95].image = ImageIO.read(getClass().getResourceAsStream("/house/house9.png"));
			tile[95].collision = true;

			tile[96] = new Tile();
			tile[96].image = ImageIO.read(getClass().getResourceAsStream("/house/house10.png"));
			tile[96].collision = true;

			tile[97] = new Tile();
			tile[97].image = ImageIO.read(getClass().getResourceAsStream("/house/house11.png"));
			tile[97].collision = true;

			tile[98] = new Tile();
			tile[98].image = ImageIO.read(getClass().getResourceAsStream("/house/house12.png"));
			tile[98].collision = true;

			tile[99] = new Tile();
			tile[99].image = ImageIO.read(getClass().getResourceAsStream("/house/house13.png"));
			tile[99].collision = true;

			tile[100] = new Tile();
			tile[100].image = ImageIO.read(getClass().getResourceAsStream("/house/house14.png"));
			tile[100].collision = true;

			tile[101] = new Tile();
			tile[101].image = ImageIO.read(getClass().getResourceAsStream("/house/house15.png"));
			tile[101].collision = true;

			tile[102] = new Tile();
			tile[102].image = ImageIO.read(getClass().getResourceAsStream("/house/house16.png"));
			tile[102].collision = true;

			tile[103] = new Tile();
			tile[103].image = ImageIO.read(getClass().getResourceAsStream("/house/house17.png"));
			tile[103].collision = true;

			tile[104] = new Tile();
			tile[104].image = ImageIO.read(getClass().getResourceAsStream("/house/house18.png"));
			tile[104].collision = true;

			tile[105] = new Tile();
			tile[105].image = ImageIO.read(getClass().getResourceAsStream("/house/house19.png"));
			tile[105].collision = true;

			tile[106] = new Tile();
			tile[106].image = ImageIO.read(getClass().getResourceAsStream("/house/house20.png"));
			tile[106].collision = true;

			tile[107] = new Tile();
			tile[107].image = ImageIO.read(getClass().getResourceAsStream("/npc/npc1.png"));
			tile[107].collision = true;
			
			tile[108] = new Tile();
			tile[108].image = ImageIO.read(getClass().getResourceAsStream("/npc/npc2.png"));
			tile[108].collision = true;
			
			tile[109] = new Tile();
			tile[109].image = ImageIO.read(getClass().getResourceAsStream("/npc/npc3.png"));
			tile[109].collision = true;
			
			tile[110] = new Tile();
			tile[110].image = ImageIO.read(getClass().getResourceAsStream("/npc/npc4.png"));
			tile[110].collision = true;
			
			tile[111] = new Tile();
			tile[111].image = ImageIO.read(getClass().getResourceAsStream("/npc/npc5.png"));
			tile[111].collision = true;
			
			tile[112] = new Tile();
			tile[112].image = ImageIO.read(getClass().getResourceAsStream("/npc/npc6.png"));
			tile[112].collision = true;
			
			tile[113] = new Tile();
			tile[113].image = ImageIO.read(getClass().getResourceAsStream("/npc/npc7.png"));
			tile[113].collision = true;
			
			tile[114] = new Tile();
			tile[114].image = ImageIO.read(getClass().getResourceAsStream("/npc/npc8.png"));
			tile[114].collision = true;
			
			tile[115] = new Tile();
			tile[115].image = ImageIO.read(getClass().getResourceAsStream("/teamrocket/James.png"));
			tile[115].collision = true;
			
			tile[116] = new Tile();
			tile[116].image = ImageIO.read(getClass().getResourceAsStream("/teamrocket/Jessie.png"));
			tile[116].collision = true;
			
			tile[117] = new Tile();
			tile[117].image = ImageIO.read(getClass().getResourceAsStream("/teamrocket/Meowth.png"));
			tile[117].collision = true;
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public void loadMap(String filePath) {
		try {
			InputStream is = getClass().getResourceAsStream(filePath);
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			
			int col = 0;
			int row = 0;
			
			while(col<gp.maxWorldCol && row<gp.maxWorldRow) {
				String line = br.readLine();
				while(col<gp.maxWorldCol) {
					String numbers[] = line.split(" ");
					int num = Integer.parseInt(numbers[col]);
					mapTileNum[col][row] = num;
					col++;
				}
				if(col == gp.maxWorldCol) {
					col = 0;
					row++;
				}
			}
			br.close();
		}catch(Exception e) {
			
		}
	}
	
	public void draw(Graphics2D g2) {
		
		int worldCol =0;
		int worldRow = 0;
		
		while(worldCol <gp.maxWorldCol && worldRow < gp.maxWorldRow) {
			int tileNum = mapTileNum[worldCol][worldRow];
			
			int worldX = worldCol*gp.tileSize;
			int worldY = worldRow*gp.tileSize;
			int screenX =worldX - gp.player.worldX + gp.player.screenX;
			int screenY = worldY - gp.player.worldY + gp.player.screenY;
			
			if(worldX + gp.tileSize > gp.player.worldX - gp.player.screenX && 
					worldX - gp.tileSize< gp.player.worldX + gp.player.screenX &&
					worldY + gp.tileSize>gp.player.worldY - gp.player.screenY && 
					worldY - gp.tileSize< gp.player.worldY + gp.player.screenY) {
				
			g2.drawImage(tile[tileNum].image, screenX, screenY, gp.tileSize, gp.tileSize, null);
			}
			
			worldCol++;
			
			if(worldCol == gp.maxWorldCol) {
				worldCol = 0;
				worldRow++;
			}
		}
	}
}
