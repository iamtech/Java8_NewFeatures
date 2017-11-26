package com.features.java8;

public class FunctionalInterfaceLamda{
	
	public static void main(String[] args) {
		
		InterFaceI iFace = (str) -> System.out.println(str + "--");
								
								iFace.myDispaly("yes");
								iFace.myDispaly("its working");
	}

}
