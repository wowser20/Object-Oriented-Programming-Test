import javax.swing.*;
public class Watertank {
	
	private double capacity;
	private double currentwater;
	private double temperature;
	private double wastage;
	
	
	JOptionPane p = new JOptionPane();
	//Default constructor - initialize something...
	
	public Watertank(){
		currentwater=0.0;
		capacity=1000.0;
		wastage=0.0;
		temperature=0.0;
	}
	public Watertank(double capacity){//parameterize initiator
		currentwater=0.0;
		this.capacity=capacity;
		temperature=0.0;
		wastage=0.0;
		
	}
	public Watertank(double currentwater, double capacity){//parametize initiator
		this.currentwater=currentwater;
		this.capacity=capacity;
		temperature=0.0;
		wastage=0.0;
	
	}
	

	public Watertank(double currentwater, double capacity, double wastage,double temperature){
		this.temperature=temperature;
		this.capacity=capacity;
		this.currentwater=currentwater;
		this.wastage=wastage;
	}
	
	//OBSERVERS - THEY OBSERVE O.O or THEY GET INFO
	public boolean isEmpty(){
		return(currentwater==0);
	}
	public boolean isFull(){
		return(currentwater==capacity);
	
	}
	
	public double getCapacity(){return capacity;}
	public double getCurrentwater(){return currentwater;}
	public double getRemaining(){return (capacity-currentwater);}
	public double getTemperature(){return temperature;}
	public double getDrainwater(){return currentwater;}
	
	//Transformer - changing the state
	public void Fillwater(double amount){
		if(amount>capacity){
			p.showMessageDialog(null,"Can't add that amount of water "+amount+" L"+" as it exceeds the total capacity of the container");
		}
		else if(amount+currentwater>capacity){
			wastage=(amount+currentwater)-capacity;
			currentwater=capacity;
			p.showMessageDialog(null,"Water has exceeded its capacity some have spilled out of the container"+"\nWASTAGE: "+wastage+"L");
			
		}else if(amount<=capacity){
		currentwater+=amount;
		p.showMessageDialog(null, "An amount of: "+amount+" L"+" was added successfully");
		}
		}
	public void Removewater(double amount){
		if(currentwater==0){
			p.showMessageDialog(null, "The container is empty can't remove any water");
		}
		else if(amount>currentwater){
			p.showMessageDialog(null, "Can't remove water by this amount: "+amount+" L");
		}
		else if (amount<=currentwater){
			currentwater-=amount;
			p.showMessageDialog(null, amount + " was removed successfully");
		}
		}
	public void Changetemperature(double Newtemperature){
			temperature=Newtemperature;
			p.showMessageDialog(null,"The temperature has been changed to "+Newtemperature+" C"+" successfully");
		} 
	public void Changecapacity(double Newcapacity){
			capacity=Newcapacity;
			p.showMessageDialog(null, "The capacity has been changed to "+Newcapacity+" L"+" successfully");
		}		
		
	public void Drainwater(double Newcurrentwater){
		if (currentwater==0){
			p.showMessageDialog(null, "The container is empty can't be drained");
		}
		else{
		currentwater=Newcurrentwater;
		p.showMessageDialog(null, "The water has been drained successfully");	
		}
	
		}
		}
