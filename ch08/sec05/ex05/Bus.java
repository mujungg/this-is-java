package ch08.sec05.ex05;

public class Bus implements Vehicle{
	@Override
	public void run() {
		System.out.println("������ �޸��ϴ�.");
	}
	
	public void checkFare() {
		System.out.println("��������� üũ�մϴ�.");
	}
}