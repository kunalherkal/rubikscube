package com.kunalherkal.rubikscube;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.kunalherkal.rubikscube.RubikscubeModule;
import com.kunalherkal.rubikscube.colors.Color;
import com.kunalherkal.rubikscube.cube.Cube;
import com.kunalherkal.rubikscube.solution.RubikscubeSolver;

public final class MovementTest {
	Cube cube;
	RubikscubeSolver rubikscubeSolver;

	@Before
	public void setUp() {
		Injector injector = Guice.createInjector(new RubikscubeModule());
		cube = injector.getInstance(Cube.class);
		rubikscubeSolver = injector.getInstance(RubikscubeSolver.class);

		System.out.println("Cube details:" + cube.toString());

		cube.getWhite().setTileColor(0, Color.RED);
		cube.getWhite().setTileColor(1, Color.RED);
		cube.getWhite().setTileColor(2, Color.YELLOW);
		cube.getWhite().setTileColor(3, Color.BLUE);
		cube.getWhite().setTileColor(5, Color.RED);
		cube.getWhite().setTileColor(6, Color.WHITE);
		cube.getWhite().setTileColor(7, Color.YELLOW);
		cube.getWhite().setTileColor(8, Color.GREEN);

		cube.getRed().setTileColor(0, Color.ORANGE);
		cube.getRed().setTileColor(1, Color.GREEN);
		cube.getRed().setTileColor(2, Color.WHITE);
		cube.getRed().setTileColor(3, Color.GREEN);
		cube.getRed().setTileColor(4, Color.RED);
		cube.getRed().setTileColor(5, Color.ORANGE);
		cube.getRed().setTileColor(6, Color.YELLOW);
		cube.getRed().setTileColor(7, Color.ORANGE);
		cube.getRed().setTileColor(8, Color.WHITE);

		cube.getYellow().setTileColor(0, Color.GREEN);
		cube.getYellow().setTileColor(1, Color.RED);
		cube.getYellow().setTileColor(2, Color.ORANGE);
		cube.getYellow().setTileColor(3, Color.YELLOW);
		cube.getYellow().setTileColor(4, Color.YELLOW);
		cube.getYellow().setTileColor(5, Color.YELLOW);
		cube.getYellow().setTileColor(6, Color.BLUE);
		cube.getYellow().setTileColor(7, Color.WHITE);
		cube.getYellow().setTileColor(8, Color.YELLOW);

		cube.getOrange().setTileColor(0, Color.GREEN);
		cube.getOrange().setTileColor(1, Color.YELLOW);
		cube.getOrange().setTileColor(2, Color.YELLOW);
		cube.getOrange().setTileColor(3, Color.RED);
		cube.getOrange().setTileColor(4, Color.ORANGE);
		cube.getOrange().setTileColor(5, Color.WHITE);
		cube.getOrange().setTileColor(6, Color.RED);
		cube.getOrange().setTileColor(7, Color.ORANGE);
		cube.getOrange().setTileColor(8, Color.BLUE);

		cube.getBlue().setTileColor(0, Color.WHITE);
		cube.getBlue().setTileColor(1, Color.BLUE);
		cube.getBlue().setTileColor(2, Color.RED);
		cube.getBlue().setTileColor(3, Color.GREEN);
		cube.getBlue().setTileColor(5, Color.ORANGE);
		cube.getBlue().setTileColor(6, Color.GREEN);
		cube.getBlue().setTileColor(7, Color.WHITE);
		cube.getBlue().setTileColor(8, Color.BLUE);

		cube.getGreen().setTileColor(0, Color.ORANGE);
		cube.getGreen().setTileColor(1, Color.BLUE);
		cube.getGreen().setTileColor(2, Color.ORANGE);
		cube.getGreen().setTileColor(3, Color.WHITE);
		cube.getGreen().setTileColor(4, Color.GREEN);
		cube.getGreen().setTileColor(5, Color.BLUE);
		cube.getGreen().setTileColor(6, Color.BLUE);
		cube.getGreen().setTileColor(7, Color.GREEN);
		cube.getGreen().setTileColor(8, Color.RED);

		System.out.println("Cube details:" + cube.toString());
	}

	@Test
	public void testClockWiseMovementForWhiteSide() {
		cube.getWhite().rotateClockwise();

		Assert.assertEquals(Color.WHITE, cube.getWhite().getColors()[0]);
		Assert.assertEquals(Color.BLUE, cube.getWhite().getColors()[1]);
		Assert.assertEquals(Color.RED, cube.getWhite().getColors()[2]);
		Assert.assertEquals(Color.YELLOW, cube.getWhite().getColors()[3]);
		Assert.assertEquals(Color.WHITE, cube.getWhite().getColors()[4]);
		Assert.assertEquals(Color.RED, cube.getWhite().getColors()[5]);
		Assert.assertEquals(Color.GREEN, cube.getWhite().getColors()[6]);
		Assert.assertEquals(Color.RED, cube.getWhite().getColors()[7]);
		Assert.assertEquals(Color.YELLOW, cube.getWhite().getColors()[8]);
		
		Assert.assertEquals(Color.BLUE, cube.getBlue().getColors()[6]);
		Assert.assertEquals(Color.WHITE, cube.getBlue().getColors()[7]);
		Assert.assertEquals(Color.YELLOW, cube.getBlue().getColors()[8]);
		
		Assert.assertEquals(Color.ORANGE, cube.getOrange().getColors()[2]);
		Assert.assertEquals(Color.BLUE, cube.getOrange().getColors()[5]);
		Assert.assertEquals(Color.ORANGE, cube.getOrange().getColors()[8]);
		
		Assert.assertEquals(Color.GREEN, cube.getRed().getColors()[0]);
		Assert.assertEquals(Color.WHITE, cube.getRed().getColors()[3]);
		Assert.assertEquals(Color.BLUE, cube.getRed().getColors()[6]);
		
		Assert.assertEquals(Color.YELLOW, cube.getGreen().getColors()[0]);
		Assert.assertEquals(Color.GREEN, cube.getGreen().getColors()[1]);
		Assert.assertEquals(Color.ORANGE, cube.getGreen().getColors()[2]);

	}

	@Test
	public void testAntiClockWiseMovementForWhiteSide() {
		cube.getWhite().rotateAntiClockwise();

		Assert.assertEquals(Color.YELLOW, cube.getWhite().getColors()[0]);
		Assert.assertEquals(Color.RED, cube.getWhite().getColors()[1]);
		Assert.assertEquals(Color.GREEN, cube.getWhite().getColors()[2]);
		Assert.assertEquals(Color.RED, cube.getWhite().getColors()[3]);
		Assert.assertEquals(Color.WHITE, cube.getWhite().getColors()[4]);
		Assert.assertEquals(Color.YELLOW, cube.getWhite().getColors()[5]);
		Assert.assertEquals(Color.RED, cube.getWhite().getColors()[6]);
		Assert.assertEquals(Color.BLUE, cube.getWhite().getColors()[7]);
		Assert.assertEquals(Color.WHITE, cube.getWhite().getColors()[8]);
		
		Assert.assertEquals(Color.ORANGE, cube.getBlue().getColors()[6]);
		Assert.assertEquals(Color.GREEN, cube.getBlue().getColors()[7]);
		Assert.assertEquals(Color.YELLOW, cube.getBlue().getColors()[8]);
		
		Assert.assertEquals(Color.BLUE, cube.getOrange().getColors()[2]);
		Assert.assertEquals(Color.WHITE, cube.getOrange().getColors()[5]);
		Assert.assertEquals(Color.GREEN, cube.getOrange().getColors()[8]);
		
		Assert.assertEquals(Color.ORANGE, cube.getRed().getColors()[0]);
		Assert.assertEquals(Color.BLUE, cube.getRed().getColors()[3]);
		Assert.assertEquals(Color.ORANGE, cube.getRed().getColors()[6]);
		
		Assert.assertEquals(Color.YELLOW, cube.getGreen().getColors()[0]);
		Assert.assertEquals(Color.WHITE, cube.getGreen().getColors()[1]);
		Assert.assertEquals(Color.BLUE, cube.getGreen().getColors()[2]);

	}
	
	@Ignore
	@Test
	public void testWhiteCrossOnYellowSide() throws Exception{
		rubikscubeSolver.solveWhiteCrosssOnYellowSide();
	}

}
