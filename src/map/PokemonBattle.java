package map;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import entity.Entity;
public class PokemonBattle extends JFrame implements ActionListener{
	GamePanel gp;
	private Entity player;
	StarterPokemon SP;
	JFrame Gym = new JFrame();
	
	JButton FIGHT = new JButton ("FIGHT");
	JButton BAG = new JButton ("BAG");
	JButton POKEMON = new JButton ("POKEMON");
	JButton RUN = new JButton ("RUN");
	JButton BACK = new JButton ("BACK");
	
	JButton move1 = new JButton ("");
	JButton move2 = new JButton ("");
	JButton move3 = new JButton ("");
	JButton move4 = new JButton ("");
	
	JLabel message = new JLabel("WHAT WILL YOUR");
	JLabel message2 = new JLabel("POKEMON DO?");
	JLabel pLevel = new JLabel("");
	JLabel pName = new JLabel("");
	JLabel pHp = new JLabel("");
	public JLabel pRHp = new JLabel("");
	
	
	public PokemonBattle(Entity player, StarterPokemon SP) {
	super("BossBattle");
	this.player = player;
	this.SP = SP;
	PokemonStats PS = new PokemonStats (SP);
	setSize(750,500);
	setLayout(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	IPanel Gym = new IPanel();
	Gym.setLayout(null);
	Gym.setBounds(0,0,750,500);
	add(Gym);
	
	Gym.setSize(750,500);
	Gym.setLayout(null);
	Gym.setVisible(true);
	
	ImageIcon pokemon1 = new ImageIcon ("charmanderInBattle.png");
	Image img1 =pokemon1.getImage() ;   
	//scaled image to fit 100x70
	Image newimg1 = img1.getScaledInstance(200, 140, java.awt.Image.SCALE_SMOOTH ) ; 
	ImageIcon pokemonpic1 = new ImageIcon( newimg1 );
	JLabel pokemon1bl = new JLabel(pokemonpic1);
	
	pokemon1bl.setBounds(100,210,200,140);
	pokemon1bl.setVisible(false);
	Gym.add(pokemon1bl);
	
	ImageIcon pokemon2 = new ImageIcon ("squirtleInBattle3.png");
	Image img2 =pokemon2.getImage() ;   
	//scaled image to fit 100x70
	Image newimg2 = img2.getScaledInstance(200, 140, java.awt.Image.SCALE_SMOOTH ) ; 
	ImageIcon pokemonpic2 = new ImageIcon( newimg2 );
	JLabel pokemon2bl = new JLabel(pokemonpic2);
	
	pokemon2bl.setBounds(100,210,200,140);
	pokemon2bl.setVisible(false);
	Gym.add(pokemon2bl);
	
	ImageIcon pokemon3 = new ImageIcon ("bulbasaurInBattle2.png");
	Image img3 =pokemon3.getImage() ;   
	//scaled image to fit 100x70
	Image newimg3 = img3.getScaledInstance(200, 140, java.awt.Image.SCALE_SMOOTH ) ; 
	ImageIcon pokemonpic3 = new ImageIcon( newimg3 );
	JLabel pokemon3bl = new JLabel(pokemonpic3);
	
	pokemon3bl.setBounds(100,210,200,140);
	pokemon3bl.setVisible(false);
	Gym.add(pokemon3bl);
	
	
	FIGHT.setBounds(315,365,160,40);
	FIGHT.setBackground(Color.RED);
	FIGHT.setForeground(Color.WHITE);
	FIGHT.setActionCommand("FIGHT");
	FIGHT.addActionListener(this);
	Gym.add(FIGHT);	
	setVisible(true); 	
	
	BAG.setBounds(500,365,160,40);
	BAG.setBackground(Color.ORANGE);
	BAG.setForeground(Color.WHITE);
	BAG.setActionCommand("BAG");
	BAG.addActionListener(this);
	Gym.add(BAG);	
	setVisible(true);
	
	POKEMON.setBounds(315,415,160,40);
	POKEMON.setBackground(Color.GREEN);
	POKEMON.setForeground(Color.WHITE);
	POKEMON.setActionCommand("POKEMON");
	POKEMON.addActionListener(this);
	Gym.add(POKEMON);	
	setVisible(true);
	
	RUN.setBounds(500,415,160,40);
	RUN.setBackground(Color.BLUE);
	RUN.setForeground(Color.WHITE);
	RUN.setActionCommand("RUN");
	RUN.addActionListener(this);
	Gym.add(RUN);
	setVisible(true);
	
	 Font myFont = new Font("Dialog",Font.BOLD, 12);
	 Font newFont = myFont.deriveFont(20F);
	 Font anotherFont = myFont.deriveFont(25F);
	
	 message.setFont(newFont);
	message.setBounds(70,360,200,30);
	message.setForeground(Color.WHITE);
	Gym.add(message);
	setVisible(true);
	
	 message2.setFont(newFont);
	message2.setBounds(80,390,200,30);
	message2.setForeground(Color.WHITE);
	Gym.add(message2);
	setVisible(true);
	
	move1.setBounds(115,365,200,40);
	move1.setBackground(Color.ORANGE);
	move1.setForeground(Color.WHITE);
	move1.addActionListener(this);
	Gym.add(move1);	
	setVisible(false); 
	
	move2.setBounds(400,365,200,40);
	move2.setBackground(Color.GRAY);
	move2.setForeground(Color.WHITE);
	move2.addActionListener(this);
	Gym.add(move2);	
	setVisible(false);
	
	move3.setBounds(115,415,200,40);
	move3.setBackground(Color.LIGHT_GRAY);
	move3.setForeground(Color.WHITE);
	move3.addActionListener(this);
	Gym.add(move3);	
	setVisible(false);
	
	move4.setBounds(400,415,200,40);
	move4.setBackground(Color.BLUE);
	move4.setForeground(Color.WHITE);
	move4.addActionListener(this);
	Gym.add(move4);
	setVisible(false);
	
	
	BACK.setBounds(640,415,80,40);
	BACK.setBackground(Color.GRAY);
	BACK.setForeground(Color.WHITE);
	BACK.setActionCommand("BACK");
	BACK.addActionListener(this);
	Gym.add(BACK);
	setVisible(false);
	pLevel.setFont(anotherFont);
	pLevel.setBounds(665,237,40,40);
	pLevel.setForeground(Color.BLACK);
		String lvl = Integer.toString(PS.level);
		pLevel.setText(lvl);
	Gym.add(pLevel);
	setVisible(true);
	
	pName.setFont(newFont);
	pName.setBounds(435,237,180,40);
	pName.setForeground(Color.BLACK);
	if(SP.charmander == true) {
		pName.setText("Charmander");
		pokemon1bl.setBounds(100,210,200,140);
		pokemon1bl.setVisible(true);
	}else if(SP.squirtle == true) {
		pName.setText("Squirtle");
		pokemon2bl.setBounds(100,210,200,140);
		pokemon2bl.setVisible(true);
	}else if(SP.bulbasaur == true) {
		pName.setText("Bulbasaur");
		pokemon3bl.setBounds(100,210,200,140);
		pokemon3bl.setVisible(true);
	}
	Gym.add(pName);
	setVisible(true);
	
	pHp.setFont(newFont);
	pHp.setBounds(590,290,40,40);
	pHp.setForeground(Color.BLACK);
		String pokemonHp = Double.toString(PS.Hp);
		pHp.setText(pokemonHp);
	Gym.add(pHp);
	setVisible(true);
	
	player.worldY += 20;
	KeyHandler.upPressed = false;
	}
	public void actionPerformed(ActionEvent event)
	{
		String eventName = event.getActionCommand();
		if( eventName.equals("FIGHT"))
		{
			PokemonStats PS = new PokemonStats (SP);
			FIGHT.setVisible(false);
			BAG.setVisible(false);
			POKEMON.setVisible(false);
			RUN.setVisible(false);
			message.setVisible(false);
			message2.setVisible(false);
			move1.setVisible(true);
			move2.setVisible(true);
			move3.setVisible(true);
			move4.setVisible(true);
			BACK.setVisible(true);
			if(SP.charmander == true) {
				move1.setBackground(Color.orange);
				move1.setText(PS.pmove1);
				move2.setBackground(Color.LIGHT_GRAY);
				move2.setText(PS.pmove2);
				move3.setBackground(Color.GRAY);
				move3.setText(PS.pmove3);
				move4.setBackground(Color.magenta);
				move4.setText(PS.pmove4);
			}
			if(SP.squirtle == true) {
				move1.setBackground(Color.BLUE);
				move1.setText(PS.pmove1);
				move2.setBackground(Color.GRAY);
				move2.setText(PS.pmove2);
				move3.setBackground(Color.BLUE);
				move3.setText(PS.pmove3);
				move4.setBackground(Color.LIGHT_GRAY);
				move4.setText(PS.pmove4);
			}
			if(SP.bulbasaur == true) {
				move1.setBackground(Color.GREEN);
				move1.setText(PS.pmove1);
				move2.setBackground(Color.GRAY);
				move2.setText(PS.pmove2);
				move3.setBackground(Color.GRAY);
				move3.setText(PS.pmove3);
				move4.setBackground(Color.GREEN);
				move4.setText(PS.pmove4);
			}

		}
		if( eventName.equals("BAG"))
		{
			FIGHT.setVisible(false);
			BAG.setVisible(false);
			POKEMON.setVisible(false);
			RUN.setVisible(false);
			message.setVisible(false);
			message2.setVisible(false);
			BACK.setVisible(true);

		}
		if( eventName.equals("POKEMON"))
		{
			FIGHT.setVisible(false);
			BAG.setVisible(false);
			POKEMON.setVisible(false);
			RUN.setVisible(false);
			message.setVisible(false);
			message2.setVisible(false);
			BACK.setVisible(true);

		}
		if(eventName.equals("BACK")) {
			FIGHT.setVisible(true);
			BAG.setVisible(true);
			POKEMON.setVisible(true);
			RUN.setVisible(true);
			message.setVisible(true);
			message2.setVisible(true);
			move1.setVisible(false);
			move2.setVisible(false);
			move3.setVisible(false);
			move4.setVisible(false);
			BACK.setVisible(false);
		}
		if( eventName.equals("RUN"))
		{
			dispose();
			resetPlayerSpeed();
		}
	}
	public void resetPlayerSpeed() {
		player.speed = 4;
	}
	public class IPanel extends JPanel {
	    Image map;
	    public IPanel() {
	        super();
	        Toolkit kit = Toolkit.getDefaultToolkit();
	        map = kit.getImage("battleBackground.png");
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
