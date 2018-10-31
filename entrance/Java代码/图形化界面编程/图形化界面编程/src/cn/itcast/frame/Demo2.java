package cn.itcast.frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import cn.itcast.util.FrameUtil;

public class Demo2 {
//事件
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//动作事件  鼠标点击和空格
		JFrame frame = new JFrame("动作监听");
		JButton button = new JButton("点我啊");
		frame.add(button);
		new FrameUtil().initFrame(frame, 300, 150);
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton button = (JButton) e.getSource();
				if("点我啊".equals(button.getText())){
					button.setText("点他啊");
				}else{
					button.setText("点我啊");
				}
			}
		});

	}

}
