package map;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import entity.Entity;
public class Dialogue implements ActionListener{
	GamePanel gp;
	private Entity player;
	JFrame frame = new JFrame();
	JLabel label = new JLabel();
	JButton myButton = new JButton("Exit");
	public Dialogue(Entity player) {
		this.player = player;
		initializeDialog();
	}
	private void initializeDialog(){
		myButton.setBounds(600,80,60,40);
		myButton.setFocusable(false);
		myButton.addActionListener(this);
		int num;
		label.setBounds(0,0,700,50);
		frame.add(myButton);
		label.setFont(new Font(null,Font.PLAIN,25));
		num = (int) (Math.random() * (7-1 +1) +1);
		if(num ==1) {
			label.setText("Be sure to check out the grass for new pokemon!");
		}else if(num==2) {
			label.setText("South-West of the town you can find Lake Greenwood");
		}else if(num==3) {
			label.setText("Team Rocket has taken over the gym! ");
		}else if(num==4) {
			label.setText("The weather is good nice today");
		}else if(num==5) {
			label.setText("I would train before facing Team Rocket");
		}else if(num==6) {
			label.setText("You look good today!");
		}else if(num==7) {
			label.setText("*Whips it out* Here take this");
		}
		frame.add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setSize(700,160);
		frame.setLayout(null);
		frame.setVisible(true);
		player.worldY += 20;
		KeyHandler.upPressed = false;
	}
	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==myButton) {
			frame.dispose();
			resetPlayerSpeed();
		}
	}
	public void resetPlayerSpeed() {
		player.speed = 4;
	}
}