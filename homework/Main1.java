package homework;
class Vehicle{
	float speed,size;
	Vehicle (float speed,float size){
		this.speed = speed;
		this.size = size;
	}
	
	void speedDown() {
		System.out.println("����");
	}
	
	void speedUp() {
		System.out.println("����");
	}
}
public class Main1 {
	public static void main (String[] args) {
		Vehicle vehicle = new Vehicle(50,400);
		System.out.println("��ǰ�ٶ�Ϊ" + vehicle.speed + "km/h");
		System.out.println("�ý�ͨ�������Ϊ" + vehicle.size + "m3");
		vehicle.speedUp();
		vehicle.speedDown();
	}
}
