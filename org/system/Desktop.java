package org.system;

public class Desktop extends Computer{
	public void DesktopSize() {
		System.out.println("Desktop size is 80");
	}
	public static void main(String[] args) {
		Desktop object= new Desktop();
		object.ComputerModel();
		object.DesktopSize();
	}
}
