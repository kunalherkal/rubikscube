package com.kunalherkal.rubikscube;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.kunalherkal.rubikscube.colors.Color;
import com.kunalherkal.rubikscube.cube.Cube;

public final class App {

	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new RubikscubeModule());
		Cube cube = injector.getInstance(Cube.class);

		System.out.println("Cube details:");

		System.out.println(cube.toString());
		
		cube.getWhite().setTileColor(0, Color.BLUE);

		System.out.println("Cube details:");

		System.out.println(cube.toString());
	}
}
