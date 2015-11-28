package com.kunalherkal.rubikscube;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.kunalherkal.rubikscube.colors.Color;
import com.kunalherkal.rubikscube.cube.Cube;

public final class App {

	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new RubikscubeModule());
		Cube cube = injector.getInstance(Cube.class);

		System.out.println("Hold the cube with white side facing you and blue side facing up");
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
		
		
		System.out.println("Hold the cube with blue side facing you and white side facing down");
		cube.getBlue().setTileColor(0, Color.WHITE);
		cube.getBlue().setTileColor(1, Color.BLUE);
		cube.getBlue().setTileColor(2, Color.RED);
		cube.getBlue().setTileColor(3, Color.GREEN);
		cube.getBlue().setTileColor(5, Color.ORANGE);
		cube.getBlue().setTileColor(6, Color.GREEN);
		cube.getBlue().setTileColor(7, Color.WHITE);
		cube.getBlue().setTileColor(8, Color.BLUE);
		
		System.out.println("Cube details:" + cube.toString());
		
		cube.getWhite().rotateClockwise();

		System.out.println("Cube details:" + cube.toString());
	}
}
