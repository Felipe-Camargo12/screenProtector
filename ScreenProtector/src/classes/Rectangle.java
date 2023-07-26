package classes;

import java.awt.*;

public class Rectangle extends Shape {
	// Atributos
	private int width;
	private int height;
	
	// Construtores
	public Rectangle(Color color, int posX, int posY, int width, int height) {
		super(color, posX, posY);
		this.width = width;
		this.height = height;
	}
	
	// Metodos especificos
	@Override
	public void draw(Graphics g) {
		g.setColor(super.getColor());
		g.fillRect(super.getPosX(), super.getPosY(), this.width, this.height);
	}
	
	public void changeDir(int limitXmin, int limitXmax, int limitYmin, int limitYmax) {
		if(super.getPosX()+this.width>=limitXmax
			|| super.getPosX()<=limitXmin) {
				super.setSpeedX(super.getSpeedX()*-1);
		}
		if(super.getPosY()+this.height>=limitYmax
				|| super.getPosY()<=limitYmin) {
					super.setSpeedY(super.getSpeedY()*-1);
		}
	}
	
	// Metodos de acesso
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}
