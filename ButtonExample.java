import java.awt.event.*;
import javax.swing.*;

public class ButtonExample implements ActionListener {
	JTextField tf = new JTextField();
	int count = 0;

	ButtonExample() {
		JFrame f = new JFrame("Button Example");
		JButton b1 = new JButton(new AbstractAction("Add") {
			@Override
			public void actionPerformed( ActionEvent e ) {
				count++;
				tf.setText("You have clicked " + count + " times");
			}
		});

		JButton b2 = new JButton(new AbstractAction("reset") {
			@Override
			public void actionPerformed( ActionEvent e ) {
				count=0;

				tf.setText("You have clicked " + count + " times");
			}
		});

		JButton b3 = new JButton(new AbstractAction("Subtracte") {
			@Override
			public void actionPerformed( ActionEvent e ) {
				count--;
				tf.setText("You have clicked " + count + " times");
			}
		});
		JLabel l1 = new JLabel("Press Button");
		tf.setBounds(50, 50, 200, 30);
		b1.setBounds(50, 100, 200, 30);
		b2.setBounds(50, 200, 200, 30);
		b3.setBounds(50, 150, 200, 30);
		l1.setBounds(150, 10, 100, 30);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(tf);
		f.add(l1);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
		b1.addActionListener(this);
	}


	public static void main(String[] args) {
		new ButtonExample();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
