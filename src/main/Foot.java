package main;

public class Foot {
	private String foodname;
	private int peice;
	private int sinew;
	
	public void display() {
		System.out.println("食物名称\t价格\t恢复体力");
		System.out.println(foodname+"\t"+peice+"\t"+sinew);
	}
	
	/**
	 * 
	 * @param foodname
	 * @param peice	价格
	 * @param sinew	恢复的体力
	 */
	public Foot(String foodname,int peice,int sinew) {
		this.foodname=foodname;
		this.peice=peice;
		this.sinew=sinew;
	}
	
	public String getFoodname() {
		return foodname;
	}
	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}
	public int getPeice() {
		return peice;
	}
	public void setPeice(int peice) {
		this.peice = peice;
	}
	public int getSinew() {
		return sinew;
	}
	public void setSinew(int sinew) {
		this.sinew = sinew;
	}
	
	
}
