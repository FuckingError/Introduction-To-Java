package cn.itcast.Snake;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class FrameUtil {
	public static void initFrame(JFrame frame,int width,int height){
		Toolkit toolkit = Toolkit.getDefaultToolkit();//��ȡһ����ϵͳ��صĹ��������
		Dimension d = toolkit.getScreenSize();//��ȡ��Ļ�ֱ���
		//��
		int x = (int) d.getWidth();
		//��
		int y = (int) d.getHeight();
		frame.setBounds((x-width)/2, (y-height)/2, width,height);
		frame.setVisible(true);
		//�˳����ر� 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
