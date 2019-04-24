package swingtest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ShowButton extends JFrame {
    public ShowButton() {
        JButton button = new JButton("点我");
        add(button);

        // 添加鼠标监听事件
        button.addActionListener(new ActionListener() {
        	
        	int i = 0;
        	
            public void actionPerformed(ActionEvent e) {
            	i++;
                System.out.println("按钮被点击"+i+"次");
                Object source = e.getSource();
                JButton button = (JButton) source;
                String text = button.getText();
                if ("按钮被点击".equals(text)) {
                    button.setText("点我");
                } else {
                    button.setText("按钮被点击");
                }
            }
        });
    }

    public static void main(String[] args) {
        ShowButton frame = new ShowButton();
        frame.setTitle("我的框架");
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
