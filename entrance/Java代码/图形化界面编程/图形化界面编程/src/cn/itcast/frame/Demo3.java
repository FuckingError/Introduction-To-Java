package cn.itcast.frame;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import cn.itcast.util.FrameUtil;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("��������");
		JButton button = new JButton("��ť");
		frame.add(button);
		
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
					if(e.getClickCount()==2){
					System.out.println("���˫��");
				}
			}
		});
		
		FrameUtil.initFrame(frame, 300, 150);

	}

}
