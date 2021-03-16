package vemaybay;

import java.io.Serializable;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class VeMayBay implements Serializable{
	private String id,name,date, luggage;
	private double price;
	
	public VeMayBay(String iD, String name, String date, String luggage, double price) {
		super();
		this.id = iD;
		this.name = name;
		this.date = date;
		this.luggage = luggage;
		this.price = price;
	}

	public VeMayBay() {
		super();
	}

	public String getID() {
		return id;
	}

	public void setID(String iD) {
		id = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getLuggage() {
		return luggage;
	}

	public void setLuggage(String luggage) {
		this.luggage = luggage;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma ve: ");
		while(true)
		{
			id = sc.nextLine();
			String patternStr = "";
			if(id.startsWith("VJ"))
			{
				patternStr = "VJ[1-9]{1}[0-9]{2}";
			} else if(id.startsWith("VN"))
			{
				patternStr = "VN[1-9]{1}[0-9]{2}[0-9]?";
			}else if(id.startsWith("JET"))
			{
				patternStr = "JET[1-9]{1}[0-9]{2}";
			}
			else {
				System.err.println("Nhap lai: ");
				continue;
			}
			Pattern pattern = Pattern.compile(patternStr);
			Matcher matcher = pattern.matcher(id);
			if(matcher.find())
			{
				break;
			}
			else System.err.println("Nhap lai");
		}
		
		System.out.println("Nhap ten chuyen bay: ");
		name = sc.nextLine();
		
		System.out.println("Ngay bay: ");
		date = sc.nextLine();
		
		System.out.println("Nhap hanh ly ky gui: ");
		luggage = sc.nextLine();
		
		System.out.println("Nhap gia ve: ");
		price = Integer.parseInt(sc.nextLine());
	}

	@Override
	public String toString() {
		return "VeMayBay [id=" + id + ", name=" + name + ", date=" + date + ", luggage=" + luggage + ", price=" + price
				+ "]";
	}
	
	public void display()
	{
		System.out.println(toString());
	}
	
}
