package homeWork4.Entities;

import homeWork4.Interfaces.Entity;

public class Campaign implements Entity{
	
	private int id;
	private String name;
	private String description;
	private int discount;
	
	public Campaign() {}

	public Campaign(int id, String name, String description, int discount) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.discount = discount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public int getDiscount() {
		return discount;
	}
	
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
	
	
	
	
}
