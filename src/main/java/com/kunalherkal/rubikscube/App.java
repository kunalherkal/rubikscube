package com.kunalherkal.rubikscube;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.kunalherkal.rubikscube.colors.Color;
import com.kunalherkal.rubikscube.cube.Cube;

public final class App {

	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new RubikscubeModule());
		Cube cube = injector.getInstance(Cube.class);

		System.out.println("Cube details:" + cube.toString());
		
		cube.getWhite().setTileColor(0, Color.RED);
		cube.getWhite().setTileColor(1, Color.RED);
		cube.getWhite().setTileColor(2, Color.YELLOW);
		cube.getWhite().setTileColor(3, Color.BLUE);
		cube.getWhite().setTileColor(5, Color.RED);
		cube.getWhite().setTileColor(6, Color.WHITE);
		cube.getWhite().setTileColor(7, Color.YELLOW);
		cube.getWhite().setTileColor(8, Color.GREEN);

		System.out.println("Cube details:" + cube.toString());
		
		cube.getWhite().rotateClockwise();

		System.out.println("Cube details:" + cube.toString());
		
		cube.getWhite().setOpposite(cube.getYellow());
		
		cube.getYellow().setOpposite(cube.getWhite());
		
		System.out.println("Cube details:" + cube.toString());
	}
}
