package map;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import map.Main;


import javax.swing.*;
public class MenuScreen extends JFrame implements ActionListener {
   private JLabel titleImageLabel;
   private JLabel Objectives;
   private JLabel Mechanics;
   JButton playBtn = new JButton("Play");
   JButton instructionsBtn = new JButton("Objectives");
   JButton backBtn = new JButton("Back");
   JButton mechanicsBtn = new JButton("Mechanics");
	Main ms = new Main();

   public MenuScreen() {
       super("Menu");
       setSize(640, 480);
       setLayout(null);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       ImageIcon T1 = new ImageIcon("Title.png");
       Image T2 = T1.getImage();
       
       ImageIcon O1 = new ImageIcon("Objectives.png");
       Image O2 = O1.getImage();
       
       ImageIcon M1 = new ImageIcon("Mechanics.png");
       Image M2 = M1.getImage();
     
       IPanel background = new IPanel();
       background.setLayout(null);
       background.setBounds(0, 0, 640, 480);
       
       add(background);
       
       
       backBtn.setBounds(10, 402, 70, 30);
       backBtn.setFocusable(false);
       backBtn.addActionListener(this);
       backBtn.setVisible(false);

       
       playBtn.setBounds(260, 150, 120, 60);
       playBtn.setFocusable(false);
       playBtn.addActionListener(this);
       
      
       instructionsBtn.setBounds(260, 250, 120, 60);
       instructionsBtn.setFocusable(false);
       instructionsBtn.addActionListener(this);
       
       mechanicsBtn.setBounds(260, 350, 120, 60);
       mechanicsBtn.setFocusable(false);
       mechanicsBtn.addActionListener(this);
       
       // Adjust the scaling to fit the desired width and height
       Image T3 = T2.getScaledInstance(190, 100, java.awt.Image.SCALE_SMOOTH);
       ImageIcon T4 = new ImageIcon(T3);
       titleImageLabel = new JLabel(T4);
       titleImageLabel.setBounds(215, 20, 200, 100);
       
       Image O3 = O2.getScaledInstance( 640, 480, java.awt.Image.SCALE_SMOOTH);
       ImageIcon O4 = new ImageIcon(O3);
       Objectives = new JLabel(O4);
       Objectives.setBounds(0, 0, 640, 480);
       Objectives.setVisible(false);
       
       Image M3 = M2.getScaledInstance( 640, 480, java.awt.Image.SCALE_SMOOTH);
       ImageIcon M4 = new ImageIcon(M3);
       Mechanics = new JLabel(M4);
       Mechanics.setBounds(0, 0, 640, 480);
       Mechanics.setVisible(false);
       
       background.add(backBtn);
       background.add(Mechanics);
       background.add(Objectives);
       background.add(mechanicsBtn);
       background.add(instructionsBtn);
       background.add(playBtn);
       background.add(titleImageLabel);
       
       background.setLayout(null);
       

       setVisible(true);
       
      
   }
   public static void main(String[] arguments) {
	   MenuScreen frame = new MenuScreen();

	   
   }
   public class IPanel extends JPanel {
       Image map;
       public IPanel() {
           super();
           Toolkit kit = Toolkit.getDefaultToolkit();
           map = kit.getImage("PkBack.png");
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
   @Override
	public void actionPerformed(ActionEvent e) {
	   if(e.getSource()==playBtn){
			ms.GameStage();
			dispose();
		}

	if(e.getSource()==instructionsBtn){
		Objectives.setVisible(true);
		instructionsBtn.setVisible(false);
		mechanicsBtn.setVisible(false);
		playBtn.setVisible(false);
		backBtn.setVisible(true);
	}
	if(e.getSource()==backBtn){
			Objectives.setVisible(false);
			Mechanics.setVisible(false);
			instructionsBtn.setVisible(true);
			mechanicsBtn.setVisible(true);
			playBtn.setVisible(true);
			backBtn.setVisible(false);
		}
	if(e.getSource()==mechanicsBtn){
			Mechanics.setVisible(true);
			instructionsBtn.setVisible(false);
			playBtn.setVisible(false);
			mechanicsBtn.setVisible(false);
			backBtn.setVisible(true);
		}
	
	
		
	}
   }
   

