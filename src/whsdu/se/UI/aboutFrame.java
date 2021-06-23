/*
 * 
 * 这个ui类，用于显示关于菜单项中的信息
 * */

package whsdu.se.UI;

import java.awt.GridLayout;
import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


public class aboutFrame extends JInternalFrame {

	private  JLabel label;
	public  aboutFrame() {
		super("关于");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//setMaximizable(true);	//标题栏有最大化按钮
		//setIconifiable(true);	//标题栏有最小化按钮
		setClosable(true);		//标题栏有关闭按钮
		setResizable(true);		//可以改变大小
		setBounds(new Rectangle(206,76,331,300));
		JPanel Panel1 = new JPanel();	//创建中心面板
		Panel1.setBorder(new EmptyBorder(30, 10, 50, 10));		//设置边框
		getContentPane().add(Panel1);
		label = new JLabel();
		Panel1.add(label);
		label.setText("<html>华中农业大学校园车辆管理系统<br />  开发成员：廖梓萌，陈颢元，王星月，马昌盛 <br /> </html>");//输入显示的汉字
		setVisible(true);		
	}
}
