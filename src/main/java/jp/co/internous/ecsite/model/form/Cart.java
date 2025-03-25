package jp.co.internous.ecsite.model.form;

import java.io.Serializable;

public class Cart implements Serializable {
	
	private int id;
	private String goodsName;
	private int price;
	private int count;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void goodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	
	public String getGoodsName() {
		return goodsName;
	}
	
	public void price(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void count(int count) {
		this.count = count;
	}
	
	public int getCount() {
		return count;
	}

}
