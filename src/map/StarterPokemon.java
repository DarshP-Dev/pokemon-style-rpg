package map;

import java.awt.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import entity.Entity;

public class StarterPokemon extends JFrame implements ActionListener {
	private Entity player;
 JFrame store = new JFrame();
 public static boolean charmander = false;
 public static boolean bulbasaur = false;
 public static boolean squirtle = false;
 JButton charmanderBtn = new JButton("Charmander");
 JButton bulbasaurBtn = new JButton("Bulbasaur");
 JButton squirtleBtn = new JButton("Squirtle");
	public double Hp, Def, Att;
	public int level =5;
	public int moveSet =0;
	public String pmove1, pmove2, pmove3, pmove4;

	public StarterPokemon(Entity player){
	 super("Choose Your Pokemon");
		this.player = player;
	 setSize(720, 400);
     setLayout(null);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
	 IPanel Selection = new IPanel();
	 Selection.setLayout(null);
	 Selection.setBounds(0, 0, 720, 400);
     
     add(Selection);
     
    
     charmanderBtn.setBounds(80, 280, 120, 60);
     charmanderBtn.setFocusable(false);
     charmanderBtn.addActionListener(this);

      
     bulbasaurBtn.setBounds(300, 280, 120, 60);
     bulbasaurBtn.setFocusable(false);
     bulbasaurBtn.addActionListener(this);
      
     
     squirtleBtn.setBounds(530, 280, 120, 60);
     squirtleBtn.setFocusable(false);
     squirtleBtn.addActionListener(this);
      
	
	
	 
     Selection.setSize(720, 400);
     Selection.setLayout(null);
     Selection.setVisible(true);
     
    
     Selection.add(charmanderBtn);
     Selection.add(bulbasaurBtn);
     Selection.add(squirtleBtn);
    
     
     Selection.setLayout(null);
     

     setVisible(true);
		player.worldY += 20;
		KeyHandler.upPressed = false;
 }

@Override
public void actionPerformed(ActionEvent e) {
	

	if(e.getSource()==charmanderBtn){
		charmander = true;
		dispose();
		resetPlayerSpeed();
		PokemonStats PS = new PokemonStats(this);
			}
	if(e.getSource()==bulbasaurBtn){
		bulbasaur = true;
		dispose();
		resetPlayerSpeed();
		PokemonStats PS = new PokemonStats(this);
			
		}
	if(e.getSource()==squirtleBtn){
		squirtle = true;
		dispose();
		resetPlayerSpeed();
		PokemonStats PS = new PokemonStats(this);
		}
		
	}
public void resetPlayerSpeed() {
	player.speed = 8;
}

public class IPanel extends JPanel {
    Image map;
    public IPanel() {
        super();
        Toolkit kit = Toolkit.getDefaultToolkit();
        map = kit.getImage("FirstPoke.png");
    }
    @Override
    protected void paintComponent(Graphics comp) {
        super.paintComponent(comp);
        Graphics2D comp2D = (Graphics2D) comp;
        int panelWidth = getWidth();
        int panelHeight = getHeight();
        
        comp2D.drawImage(map, 0, 0, panelWidth, panelHeight, this);

    }
}
}