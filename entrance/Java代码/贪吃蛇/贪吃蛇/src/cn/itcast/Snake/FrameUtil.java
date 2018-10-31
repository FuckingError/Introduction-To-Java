package cn.itcast.Snake;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class FrameUtil {
	public static void initFrame(JFrame frame,int width,int height){
		Toolkit toolkit = Toolkit.getDefaultToolkit();//获取一个与系统相关的工具类对象
		Dimension d = toolkit.getScreenSize();//获取屏幕分辨率
		//宽
		int x = (int) d.getWidth();
		//高
		int y = (int) d.getHeight();
		frame.setBounds((x-width)/2, (y-height)/2, width,height);
		frame.setVisible(true);
		//退出并关闭 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
