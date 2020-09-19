package homework;
class Vehicle{
	float speed,size;
	Vehicle (float speed,float size){
		this.speed = speed;
		this.size = size;
	}
	
	void speedDown() {
		System.out.println("减速");
	}
	
	void speedUp() {
		System.out.println("加速");
	}
}
public class Main1 {
	public static void main (String[] args) {
		Vehicle vehicle = new Vehicle(50,400);
		System.out.println("当前速度为" + vehicle.speed + "km/h");
		System.out.println("该交通工具体积为" + vehicle.size + "m3");
		vehicle.speedUp();
		vehicle.speedDown();
	}
}
