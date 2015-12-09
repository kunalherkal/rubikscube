package com.kunalherkal.rubikscube;

import org.junit.Before;
import org.junit.Test;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.kunalherkal.rubikscube.colors.Color;
import com.kunalherkal.rubikscube.cube.Cube;
import com.kunalherkal.rubikscube.solution.RubikscubeSolver;

public final class WhiteCrossOnWhiteSideTest1 {
	Cube cube;
	RubikscubeSolver rubikscubeSolver;
	
	@Before
	public void setUp() {
		Injector injector = Guice.createInjector(new RubikscubeModule());
		cube = injector.getInstance(Cube.class);
		rubikscubeSolver = injector.getInstance(RubikscubeSolver.class);

		System.out.println("Cube details:" + cube.toString());

		cube.getRed().setTileColor(0, Color.BLUE);
		cube.getRed().setTileColor(1, Color.RED);
		cube.getRed().setTileColor(2, Color.RED);
		cube.getRed().setTileColor(3, Color.ORANGE);
		cube.getRed().setTileColor(4, Color.RED);
		cube.getRed().setTileColor(5, Color.BLUE);
		cube.getRed().setTileColor(6, Color.YELLOW);
		cube.getRed().setTileColor(7, Color.ORANGE);
		cube.getRed().setTileColor(8, Color.GREEN);
		
		cube.getGreen().setTileColor(0, Color.BLUE);
		cube.getGreen().setTileColor(1, Color.WHITE);
		cube.getGreen().setTileColor(2, Color.RED);
		cube.getGreen().setTileColor(3, Color.ORANGE);
		cube.getGreen().setTileColor(4, Color.GREEN);
		cube.getGreen().setTileColor(5, Color.GREEN);
		cube.getGreen().setTileColor(6, Color.ORANGE);
		cube.getGreen().setTileColor(7, Color.BLUE);
		cube.getGreen().setTileColor(8, Color.RED);

		cube.getOrange().setTileColor(0, Color.GREEN);
		cube.getOrange().setTileColor(1, Color.YELLOW);
		cube.getOrange().setTileColor(2, Color.GREEN);
		cube.getOrange().setTileColor(3, Color.RED);
		cube.getOrange().setTileColor(4, Color.ORANGE);
		cube.getOrange().setTileColor(5, Color.RED);
		cube.getOrange().setTileColor(6, Color.BLUE);
		cube.getOrange().setTileColor(7, Color.WHITE);
		cube.getOrange().setTileColor(8, Color.ORANGE);

		cube.getBlue().setTileColor(0, Color.RED);
		cube.getBlue().setTileColor(1, Color.RED);
		cube.getBlue().setTileColor(2, Color.WHITE);
		cube.getBlue().setTileColor(3, Color.WHITE);
		cube.getBlue().setTileColor(4, Color.BLUE);
		cube.getBlue().setTileColor(5, Color.YELLOW);
		cube.getBlue().setTileColor(6, Color.YELLOW);
		cube.getBlue().setTileColor(7, Color.GREEN);
		cube.getBlue().setTileColor(8, Color.GREEN);

		cube.getYellow().setTileColor(0, Color.WHITE);
		cube.getYellow().setTileColor(1, Color.GREEN);
		cube.getYellow().setTileColor(2, Color.YELLOW);
		cube.getYellow().setTileColor(3, Color.BLUE);
		cube.getYellow().setTileColor(4, Color.YELLOW);
		cube.getYellow().setTileColor(5, Color.BLUE);
		cube.getYellow().setTileColor(6, Color.ORANGE);
		cube.getYellow().setTileColor(7, Color.YELLOW);
		cube.getYellow().setTileColor(8, Color.WHITE);
		
		cube.getWhite().setTileColor(0, Color.ORANGE);
		cube.getWhite().setTileColor(1, Color.GREEN);
		cube.getWhite().setTileColor(2, Color.WHITE);
		cube.getWhite().setTileColor(3, Color.WHITE);
		cube.getWhite().setTileColor(4, Color.WHITE);
		cube.getWhite().setTileColor(5, Color.YELLOW);
		cube.getWhite().setTileColor(6, Color.BLUE);
		cube.getWhite().setTileColor(7, Color.ORANGE);
		cube.getWhite().setTileColor(8, Color.YELLOW);
		System.out.println("Cube details:" + cube.toString());
	}
	
	
	@Test
	public void testWhiteCrossOnYellowSide() throws Exception{
		rubikscubeSolver.solveWhiteCross();
		
		cube.getWhite().setTileColor(1, Color.WHITE);
		cube.getWhite().setTileColor(3, Color.WHITE);
		cube.getWhite().setTileColor(5, Color.WHITE);
		cube.getWhite().setTileColor(7, Color.WHITE);
		
	}

}
