package com.ehome.controller;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.servlet.http.HttpServlet;

public class CreateCode extends HttpServlet {

	private static Color setColor(){
		
		int i1 = (int) (Math.random()*256);
		int i2 = (int) (Math.random()*256);
		int i3 = (int) (Math.random()*256);
		Color c = new Color(i1,i2,i3);
		return c;
	}
	
	
	private static void drawLine(Graphics g) {
		g.drawLine(0, 15, 50, 17) ;
		
		for(int i=1;i<3;i++){
			int x1 = (int) (Math.random()*50);
			int x2 = (int) (Math.random()*50);
			int y1 = (int) (Math.random()*25);
			int y2 = (int) (Math.random()*25);
			g.drawLine(x1, y1, x2, y2);
			g.setColor(setColor());
		}
		
	}

	private static void drawDot(Graphics g) {
		
		for(int i=1;i<100;i++){
			int x1 = (int) (Math.random()*50);
			int y1 = (int) (Math.random()*25);
			g.drawLine(x1, y1, x1, y1);
			g.setColor(setColor());
		}
		
		
	}
	private static String stringCode = null;
	private static void drawString(Graphics g) {
		String content = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		char c1 = content.charAt((int) (Math.random()*62));
		char c2 = content.charAt((int) (Math.random()*62));
		char c3 = content.charAt((int) (Math.random()*62));
		char c4 = content.charAt((int) (Math.random()*62));
		stringCode = ""+c1+c2+c3+c4;
		Font font = new Font(stringCode,Font.BOLD,15);
		g.setFont(font);
		g.setColor(setColor());
		g.drawString(stringCode, 8, 16);
		
	}
	
	public static String getCode(){
		return stringCode;
	}
	
	public static BufferedImage Create(){
		BufferedImage bi = new BufferedImage(50, 25, BufferedImage.TYPE_INT_RGB);
		
		Graphics g = bi.getGraphics();
		
		g.drawRect(0, 0, 50, 25);
		drawString(g);
		drawLine(g);
		drawDot(g);
		return bi;
	}



	
	
}
