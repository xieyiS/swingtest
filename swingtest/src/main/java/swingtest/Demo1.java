package swingtest;

import javax.swing.JOptionPane;

public class Demo1 {

	public static void main(String[] args) {
		//JOptionPane.showMessageDialog(null, "错误信息提示", "标题", JOptionPane.INFORMATION_MESSAGE);

		//JOptionPane.showMessageDialog(null, "提示消息", "标题",JOptionPane.WARNING_MESSAGE);
		
		//JOptionPane.showMessageDialog(null, "提示消息.", "标题",JOptionPane.PLAIN_MESSAGE); 
		
		//int n = JOptionPane.showConfirmDialog(null, "你高兴吗?", "标题",JOptionPane.YES_NO_OPTION);//i=0/1  
		
		String inputValue = JOptionPane.showInputDialog("请输入你给我金额");
		System.out.println(inputValue);
		
	}

}
