package swingtest;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * 创建框架,使用流失布局管理器.向该框架添加三个标签和文本域
 * @author Administrator
 *
 */
public class ShowFlowLayout extends JFrame {

    public ShowFlowLayout() {
        super.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));

        add(new JLabel("姓名:"));
        add(new JTextField(8));
        add(new JLabel("邮箱:"));
        add(new JTextField(8));
        add(new JLabel("电话:"));
        add(new JTextField(8));
        
    }

    public static void main(String[] args) {
        ShowFlowLayout frame = new ShowFlowLayout();
        frame.setTitle("FlowLayout");
        frame.setSize(500, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}