package ua.nure.hrynko.SummaryTask4.db.dto;

import ua.nure.hrynko.SummaryTask4.db.dto.Entity;

/**
 * Menu item entity.

 */
public class Cars extends Entity {

	private static final long serialVersionUID = 4716395168539434663L;

	private String name;
	
	private Integer price;
	
	private String category;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Cars [id=" + getId() + ", name=" + name + ", price=" + price + ", category="
				+ category + ", getId()=" + getId() + "]";
	}

}