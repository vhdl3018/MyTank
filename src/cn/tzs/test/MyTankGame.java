package cn.tzs.test;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyTankGame  extends JFrame{
	MyPanel mp =null;
	public static void main(String[] args){
		MyTankGame mtgGame = new MyTankGame();
	}
	
	//构造函数 
	public MyTankGame(){
		mp = new MyPanel();
		this.add(mp);
		
		this.setSize(400,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}

//我的面板
class MyPanel extends JPanel{
	
	//定义一个我的坦克
	Hero hero = null;
	
	//构造函数 
	public MyPanel(){
		hero = new Hero(10, 10);
	}
	

	/**
	 * 功能：重写父类的方法
	 */
	public void paint(Graphics g){
		super.paint(g);
		g.fillRect(0, 0, 400, 300);

		this.drawTank(hero.getX(), hero.getY(), g, 0, 0);
	}
	
	//画坦克的函数 
	/**
	 * 功能：封装一个画坦克的类
	 * @param x
	 * @param y
	 * @param g
	 * @param direct
	 * @param type
	 */
	public void drawTank(int x, int y, Graphics g, int direct,int type){
		//判断是什么类型的坦克
		switch (type) {
		case 0://画出我的坦克
			g.setColor(Color.cyan);
			//画出我的坦克
			//1、画出左边的矩形
			g.fillRect(x, y, 5, 30);
			//2、画出右边的图片
			g.fillRect(x+15, y, 5, 30);
			//3、画出中间矩形
			g.fill3DRect(x+5, y+5, 10, 20,false);
			//4、画出圆形
			g.fillOval(x+4, y+10, 10, 10);
			
			//5、画矩形，当作炮杆
			g.fillRect(x+9, y, 2,15);
			break;
		case 1:
			g.setColor(Color.yellow);

		}
		
		switch (direct) {
		case 0://向上走
			
			break;

		}
	}
}


class Tank{
	//表示坦克的横坐标
	int  x = 0;
	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}


	int y = 0;
	
	
	public Tank(int x , int y){
		this.x = x;
		this.y = y;
	}
	
	
}


//我的坦克

class Hero extends Tank{
	public Hero(int x, int y) {
		// TODO Auto-generated constructor stub
		super(x, y);
	}
}
