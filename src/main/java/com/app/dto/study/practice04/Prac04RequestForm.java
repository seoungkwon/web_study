package com.app.dto.study.practice04;

public class Prac04RequestForm {
	
	private String category;
    private String product;

    
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

	@Override
	public String toString() {
		return "Prac04RequestForm [category=" + category + ", product=" + product + "]";
	}
    
}
