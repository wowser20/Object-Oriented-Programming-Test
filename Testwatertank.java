
//SUBMITTED BY: ANDREA ELLA R. REMORERAS CCE107/INTERMEDIATE PROGRAMMING
import javax.swing.*;
public class Testwatertank {

		@SuppressWarnings("static-access")
		public static void main (String[]args){
			
			JOptionPane p = new JOptionPane();
			String menu []={"ADD WATER","REMOVE WATER","DRAIN","SET CAPACITY","SET TEMPERATURE","END"};
			String choice="", hold="";
			Watertank tank = new Watertank();
			double amount=0;
			double Newcapacity=0;
			double Newtemperature=0.0;
			double Newcurrentwater=0.0;
		do{
			try{
			hold="WATER TANK INFORMATION"+"\nEmpty: "+tank.isEmpty()+"        Full: "+tank.isFull()+
					"\nCurrent Water: "+tank.getCurrentwater()+" L"+
					"\nCapacity: "+tank.getCapacity()+" L"+
					"\nRemaining water: "+tank.getRemaining()+" L"+
					"\nTemperature: "+tank.getTemperature()+" C"+
					"\nChoose:";
			choice=p.showInputDialog(null, hold,"Menu",1,null,menu,menu[0]).toString();
			switch(choice){
			case "ADD WATER":
				if (tank.getCurrentwater()>=tank.getCapacity()){
					p.showMessageDialog(null, "The container is already full can't add more water");
				}else{
				amount=Double.parseDouble(
				p.showInputDialog("How many liters of water would you like to add?"));
				tank.Fillwater(amount);
				}
				break;
			case "REMOVE WATER":
				if(tank.getCurrentwater()==0){
					p.showMessageDialog(null, "The container is empty can't remove water");
				}else{
				amount=Double.parseDouble(
				p.showInputDialog("How many liters of water would you like to remove?"));
				tank.Removewater(amount);
				}
				break;
				
			case "DRAIN":
				tank.Drainwater(Newcurrentwater);
				break;
			case "SET CAPACITY":
				Newcapacity=Double.parseDouble(
				p.showInputDialog(null,"How many liters would you like to add?"));
				tank.Changecapacity(Newcapacity);
				break;
			case "SET TEMPERATURE":
				Newtemperature=Double.parseDouble(
				p.showInputDialog(null,"Set in to what degree?"));
				tank.Changetemperature(Newtemperature);
				break;
			case "END":
				p.showMessageDialog(null,"Program is now terminating.. . .");
				System.exit(0);
				break;
			
			default:p.showMessageDialog(null,"Program is now terminating.. . .");
            System.exit(0);
				}
				}
			catch(Exception e){
				p.showMessageDialog(null, "Program is now terminating.. . .");
				System.exit(0);
				}
				}
		while (choice!="END");
		System.exit(0);
				}
				}
