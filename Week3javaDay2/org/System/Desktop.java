package org.System;

public class Desktop extends Computer{
	public void desktopSize() {
		System.out.println("The size of the Desktop is 19 inch monitor and CPU");
	}

	public static void main(String[] args) {
		Desktop d = new Desktop();
		d.computerModel();
		d.desktopSize();
	}

}
