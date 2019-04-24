package swingtest;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Demo0 {
	public static void main(String[] args) {
		// 创建JFrame
		JFrame frame = new JFrame("hello,world");
		
		
		
		// 设置尺寸
		frame.setSize(200, 100);
		// JFrame在屏幕居中
		frame.setLocationRelativeTo(null);
		//frame.setLocation(1000, 200);
		// JFrame关闭时的操作
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 显示JFrame
		frame.setVisible(true);

		// 创建按钮
        JButton button = new JButton("OK");
        // 向frame中添加一个按钮
        frame.add(button);
        
        
        frame.validate();
	}
}
