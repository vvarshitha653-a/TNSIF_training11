package org.tnsif.acc.c2tc.multipleinterfcae;

class SmartPhone implements Camera,MusicPlayer{

	@Override
	public void playMusic() {
		System.out.println("playing music on the smartphone");
		
	}

	@Override
	public void takePhoto() {
		System.out.println("taking photo using smartphone camra");
		
	}
	
}

public class MultipleInterface {

	public static void main(String[] args) {
		SmartPhone obj=new SmartPhone();
		obj.playMusic();
		obj.takePhoto();
		

	}

}
