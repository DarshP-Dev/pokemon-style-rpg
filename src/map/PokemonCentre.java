package map;
	
	import java.awt.*;
	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import entity.Entity;
	import entity.Player;
	import javax.swing.*;
	
	public class PokemonCentre extends JFrame implements ActionListener {
		GamePanel gp;
		private Entity player;
		StarterPokemon SP;
	 private JLabel Leveling1,Leveling2,Leveling3;
	 String bankNum = String.valueOf(Player.money);
	 JFrame store = new JFrame();
	 JButton lvl1Btn = new JButton("Xp LVL 1");
	 JButton lvl2Btn = new JButton("XP LVL 2");
	 JButton lvl3Btn = new JButton("XP LVL 3");
	 JButton exitBtn = new JButton("Exit");
	 JButton  bank = new JButton ("Your cash: $"+bankNum);
	 JLabel transaction = new JLabel();
	
	
	 public PokemonCentre(Entity player, StarterPokemon SP){
		 super("Centre");
			this.player = player;
			this.SP = SP;
		 setSize(640, 480);
	     setLayout(null);
	     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
		 IPanel Centre = new IPanel();
		 Centre.setLayout(null);
		 Centre.setBounds(0, 0, 640, 480);
	    
	     add(Centre);
	    
	     ImageIcon T1 = new ImageIcon("Xp1.png");
	     Image T2 = T1.getImage();
	    
	     ImageIcon O1 = new ImageIcon("Xp1.png");
	     Image O2 = O1.getImage();
	    
	     ImageIcon M1 = new ImageIcon("Xp1.png");
	     Image M2 = M1.getImage();
	   
		 lvl1Btn.setBounds(50, 200, 120, 60);
		 lvl1Btn.setFocusable(false);
		 lvl1Btn.addActionListener(this);
	
	     
		 lvl2Btn.setBounds(250, 200, 120, 60);
		 lvl2Btn.setFocusable(false);
		 lvl2Btn.addActionListener(this);
	     
	    
		 lvl3Btn.setBounds(450, 200, 120, 60);
		 lvl3Btn.setFocusable(false);
		 lvl3Btn.addActionListener(this);
	     
		 exitBtn.setBounds(250, 350, 120, 60);
		 exitBtn.setFocusable(false);
		 exitBtn.addActionListener(this);
		
		 bank.setBounds(490,10,120,30);
		 bank.setBackground(Color.black);
		 bank.setForeground(Color.yellow);
		
		 transaction.setBounds(10,300,200,100);
		 transaction.setForeground(Color.red);
		
		 Image T3 = T2.getScaledInstance(100, 150, java.awt.Image.SCALE_SMOOTH);
	     ImageIcon T4 = new ImageIcon(T3);
	     Leveling1 = new JLabel(T4);
	     Leveling1.setBounds(60, 50, 100, 150);
	    
	     Image O3 = O2.getScaledInstance( 100, 150, java.awt.Image.SCALE_SMOOTH);
	     ImageIcon O4 = new ImageIcon(O3);
	     Leveling2 = new JLabel(O4);
	     Leveling2.setBounds(260, 50, 100, 150);
	    
	     Image M3 = M2.getScaledInstance( 100, 150, java.awt.Image.SCALE_SMOOTH);
	     ImageIcon M4 = new ImageIcon(M3);
	     Leveling3 = new JLabel(M4);
	     Leveling3.setBounds(460, 50, 100, 150);
	    
	    
		
	     Centre.setSize(640,480);
	     Centre.setLayout(null);
	     Centre.setVisible(true);
	    
	     Centre.add(bank);
	     Centre.add(transaction);
	     Centre.add(Leveling1);
	     Centre.add(Leveling2);
	     Centre.add(Leveling3);
	     Centre.add(lvl1Btn);
	     Centre.add(lvl2Btn);
	     Centre.add(lvl3Btn);
	     Centre.add(exitBtn);
	     Centre.add(transaction);
	    
	    
	     Centre.setLayout(null);
	    
	
	     setVisible(true);
			player.worldY += 20;
			KeyHandler.upPressed = false;
	 }
	@Override
	public void actionPerformed(ActionEvent e) {
		PokemonStats PS = new PokemonStats(SP);
		 if(e.getSource()==exitBtn){
				dispose();
				resetPlayerSpeed();
			}
	
		if(e.getSource()==lvl1Btn){
			
			if(50>Player.money) {
				transaction.setText("Not Enough Money");
			}
			
			if(50<=Player.money) {
			transaction.setText("Potion Purchased");
			Player.money = Player.money -50;
			bankNum = String.valueOf(Player.money);
			bank.setText("Your cash: $"+bankNum);
			PS.level++;
	
			}
			System.out.println(Player.money);
		   
	
			
				}
		if(e.getSource()==lvl2Btn){
			if(100>Player.money) {
				transaction.setText("Not Enough Money");
			}
			
			if(100<=Player.money) {
			transaction.setText("Potion Purchased");
			bankNum = String.valueOf(Player.money);
			bank.setText("Your cash: $"+bankNum);
			Player.money = Player.money -100;
			PS.level = PS.level + 3;
	
				}
				
			}
		if(e.getSource()==lvl3Btn){
			if(200>Player.money) {
				transaction.setText("Not Enough Money");
			}
			
			if(200<=Player.money) {
			transaction.setText("Potion Purchased");
			bankNum = String.valueOf(Player.money);
			bank.setText("Your cash: $"+bankNum);
			Player.money = Player.money -200;
			PS.level = PS.level + 5;
	
				}
				
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
	        map = kit.getImage("PokemonCentre.png");
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
