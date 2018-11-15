package com.example.movierental.service;

import java.util.ArrayList;
import java.util.List;

public class Custom {
	private String name;
	private List<Rental> rentals = new ArrayList<>();

	public void addElement(Rental rental) {
		this.rentals.add(rental);
	}

	public String statement() {
		double totalAmount = 0;
		int score = 0;
		String result = "客户：" + getName() + "\n";
		for (Rental rental : rentals) {
			//计算每部影片的价格
			double thisAmount = rental.getAmount();

			//计算积分
			score += rental.getScore();

			//累计总价格
			totalAmount += thisAmount;

			//输出结果
			rental.getMovie().getTitle();
			result += "影片：" + rental.getMovie().getTitle() + " 的价格是：" + thisAmount + "\n";
		}
		//输出结果
		result += "总价格：" + totalAmount + " 总积分：" + score;
		return result;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Rental> getRentals() {
		return rentals;
	}

	public void setRentals(List<Rental> rentals) {
		this.rentals = rentals;
	}
}
