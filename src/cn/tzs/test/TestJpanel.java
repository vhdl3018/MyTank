package cn.tzs.test;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * 功能：测试画板
 * 
 * @author qsqxj
 *
 */
public class TestJpanel extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	MyPanel2 mp = null;

	public static void main(String[] args) {
		TestJpanel tJpanel = new TestJpanel();
	}

	public TestJpanel() {
		mp = new MyPanel2();
		this.add(mp);

		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}

/**
 * 功能：定义一个MyPanel(我自己的画板，是用于绘图和现实绘图的区域)
 * 
 * @author qsqxj
 *
 */
class MyPanel2 extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 功能：覆盖JPanel的paint方法 Graphics是绘图的重要类，你可以把它理解成一中画笔
	 */
	public void paint(Graphics g) {
		// 1、调用父类函数完成初始化
		super.paint(g);

		// 先画一个圆
		g.drawOval(100, 100, 200, 200);
		g.drawLine(130, 130, 270, 270);
		g.drawRect(100, 100, 200, 200);

		// 填充矩形，画颜色
		g.setColor(Color.red);
		g.fillRect(100, 100, 50, 50);

		// 在面板上画一个图片
		Image image = Toolkit.getDefaultToolkit()
				.getImage(
				Panel.class.getResource("/images/sun.jpg")
		);

		g.drawImage(image, 90, 90, 90, 90, this);
		
		
		g.setColor(Color.BLUE);
		g.setFont(new Font("黑体", Font.BOLD, 40));
		g.drawString("我是帅哥", 50, 50);
		
		

	}
}
