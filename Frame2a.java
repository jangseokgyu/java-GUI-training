import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Frame2a extends JFrame implements ActionListener {
	private Counter count;
	private JLabel label = new JLabel("count = 0");
	public Frame2a(Counter c) {
		count = c;
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		JButton button = new JButton("OK");
		cp.add(label); cp.add(button);
		button.addActionListener(this); // �� ��ü�� ������ �̺�Ʈ ó����� ���
		setTitle("Frame2a"); setSize(200, 60);
		setVisible(true);
		}
	public void actionPerformed(ActionEvent e) {
		count.increment();
		label.setText("count = " + count.countOf());
		}
	}