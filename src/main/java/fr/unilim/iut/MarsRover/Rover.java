package fr.unilim.iut.MarsRover;

public class Rover {
	private int positionX;
	private int positionY;
	private String rotation;
	public Rover() {
		this.positionX = 0;
		this.positionY = 0;
		this.rotation ="N";
	}
	public int positionX() {
		return this.positionX;
	}
	public int positionY() {
		return this.positionY;
	}
	public String rotation() {
		return this.rotation;
	}
	
	
	public void deplacement(String avancement) {
		switch(avancement) {
		case "F" : this.forward();
		break;
		case "B" : this.backward();
		break;
		case "L" : this.left();
		break;
		case "R" : this.right();
		break;
		default : System.out.println("Commande incorrect");
		}
	}
	public void left() {
		switch(this.rotation) {
		case "N":this.rotation = "O";
		break;
		case "S":this.rotation = "E";
		break;
		case "E":this.rotation = "N";
		break;
		case "O":this.rotation = "S";
		break;
		default : System.out.println("Rotation impossible");
		}
	}
	public void right() {
		switch(this.rotation) {
		case "N":this.rotation = "E";
		break;
		case "S":this.rotation = "O";
		break;
		case "E":this.rotation = "S";
		break;
		case "O":this.rotation = "N";
		break;
		default : System.out.println("Rotation impossible");
		}
	}
	
	
	public void forward() {
		switch(this.rotation) {
		case "N" : 
					if(this.positionY == 100) {
					System.out.println("limite NORD atteinte");
					}else {
						this.positionY = this.positionY + 1;
					}
		break;
		
		case "S" : 
			
					if(this.positionY == 0) {
						System.out.println("limite SUD atteinte");
					}else {
						this.positionY = this.positionY - 1;
					}
		break;
		
		case "E" : 
					if(this.positionX == 100) {
						System.out.println("limite EST atteinte");
					}else {
						this.positionX = this.positionX + 1;
					}
		break;
		
		case "O" : 
					if(this.positionX == 0) {
						System.out.println("limite OUEST atteinte");
					}else {
						this.positionX = this.positionX - 1;
					}
		break;
		
		default : System.out.println("Deplacement impossible");
		}
	}
	
	
	public void backward() {
		switch(this.rotation) {
		case "N" : 
					if(this.positionY == 0) {
					System.out.println("limite SUD atteinte");
					}else {
						this.positionY = this.positionY - 1;
					}
		break;
		
		case "S" : 
			
					if(this.positionY == 100) {
						System.out.println("limite NORD atteinte");
					}else {
						this.positionY = this.positionY + 1;
					}
		break;
		
		case "E" : 
					if(this.positionX == 0) {
						System.out.println("limite OUEST atteinte");
					}else {
						this.positionX = this.positionX - 1;
					}
		break;
		
		case "O" : 
					if(this.positionX == 100) {
						System.out.println("limite EST atteinte");
					}else {
						this.positionX = this.positionX + 1;
					}
		break;
		
		default : System.out.println("Deplacement impossible");
		}
	}
	
}
