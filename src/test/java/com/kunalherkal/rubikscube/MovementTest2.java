package com.kunalherkal.rubikscube;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.kunalherkal.rubikscube.colors.Color;
import com.kunalherkal.rubikscube.cube.Cube;
import com.kunalherkal.rubikscube.solution.RubikscubeSolver;

public final class MovementTest2 {
	Cube cube;
	RubikscubeSolver rubikscubeSolver;

	@Before
	public void setUp() {
		Injector injector = Guice.createInjector(new RubikscubeModule());
		cube = injector.getInstance(Cube.class);
		rubikscubeSolver = injector.getInstance(RubikscubeSolver.class);

		cube.getRed().setTileColor(0, Color.WHITE);
		cube.getRed().setTileColor(1, Color.BLUE);
		cube.getRed().setTileColor(2, Color.ORANGE);
		cube.getRed().setTileColor(3, Color.YELLOW);
		cube.getRed().setTileColor(4, Color.RED);
		cube.getRed().setTileColor(5, Color.WHITE);
		cube.getRed().setTileColor(6, Color.GREEN);
		cube.getRed().setTileColor(7, Color.BLUE);
		cube.getRed().setTileColor(8, Color.WHITE);
		
		cube.getGreen().setTileColor(0, Color.WHITE);
		cube.getGreen().setTileColor(1, Color.BLUE);
		cube.getGreen().setTileColor(2, Color.RED);
		cube.getGreen().setTileColor(3, Color.ORANGE);
		cube.getGreen().setTileColor(4, Color.GREEN);
		cube.getGreen().setTileColor(5, Color.RED);
		cube.getGreen().setTileColor(6, Color.GREEN);
		cube.getGreen().setTileColor(7, Color.GREEN);
		cube.getGreen().setTileColor(8, Color.YELLOW);

		cube.getOrange().setTileColor(0, Color.YELLOW);
		cube.getOrange().setTileColor(1, Color.RED);
		cube.getOrange().setTileColor(2, Color.WHITE);
		cube.getOrange().setTileColor(3, Color.GREEN);
		cube.getOrange().setTileColor(4, Color.ORANGE);
		cube.getOrange().setTileColor(5, Color.GREEN);
		cube.getOrange().setTileColor(6, Color.GREEN);
		cube.getOrange().setTileColor(7, Color.GREEN);
		cube.getOrange().setTileColor(8, Color.ORANGE);

		cube.getBlue().setTileColor(0, Color.RED);
		cube.getBlue().setTileColor(1, Color.YELLOW);
		cube.getBlue().setTileColor(2, Color.RED);
		cube.getBlue().setTileColor(3, Color.ORANGE);
		cube.getBlue().setTileColor(4, Color.BLUE);
		cube.getBlue().setTileColor(5, Color.RED);
		cube.getBlue().setTileColor(6, Color.YELLOW);
		cube.getBlue().setTileColor(7, Color.RED);
		cube.getBlue().setTileColor(8, Color.ORANGE);

		cube.getYellow().setTileColor(0, Color.BLUE);
		cube.getYellow().setTileColor(1, Color.WHITE);
		cube.getYellow().setTileColor(2, Color.BLUE);
		cube.getYellow().setTileColor(3, Color.ORANGE);
		cube.getYellow().setTileColor(4, Color.YELLOW);
		cube.getYellow().setTileColor(5, Color.WHITE);
		cube.getYellow().setTileColor(6, Color.GREEN);
		cube.getYellow().setTileColor(7, Color.ORANGE);
		cube.getYellow().setTileColor(8, Color.BLUE);
		
		cube.getWhite().setTileColor(0, Color.YELLOW);
		cube.getWhite().setTileColor(1, Color.YELLOW);
		cube.getWhite().setTileColor(2, Color.ORANGE);
		cube.getWhite().setTileColor(3, Color.BLUE);
		cube.getWhite().setTileColor(4, Color.WHITE);
		cube.getWhite().setTileColor(5, Color.WHITE);
		cube.getWhite().setTileColor(6, Color.BLUE);
		cube.getWhite().setTileColor(7, Color.YELLOW);
		cube.getWhite().setTileColor(8, Color.RED);
		System.out.println("Cube details:" + cube.toString());

	}
	
	@Test
	public void testClockWiseMovementForRedSide() {
		cube.getRed().rotateClockwise();

		Assert.assertEquals(Color.GREEN, cube.getRed().getColors()[0]);
		Assert.assertEquals(Color.YELLOW, cube.getRed().getColors()[1]);
		Assert.assertEquals(Color.WHITE, cube.getRed().getColors()[2]);
		Assert.assertEquals(Color.BLUE, cube.getRed().getColors()[3]);
		Assert.assertEquals(Color.RED, cube.getRed().getColors()[4]);
		Assert.assertEquals(Color.BLUE, cube.getRed().getColors()[5]);
		Assert.assertEquals(Color.WHITE, cube.getRed().getColors()[6]);
		Assert.assertEquals(Color.WHITE, cube.getRed().getColors()[7]);
		Assert.assertEquals(Color.ORANGE, cube.getRed().getColors()[8]);
		
		Assert.assertEquals(Color.YELLOW, cube.getBlue().getColors()[2]);
		Assert.assertEquals(Color.YELLOW, cube.getBlue().getColors()[5]);
		Assert.assertEquals(Color.ORANGE, cube.getBlue().getColors()[8]);
		
		Assert.assertEquals(Color.ORANGE, cube.getYellow().getColors()[6]);
		Assert.assertEquals(Color.RED, cube.getYellow().getColors()[7]);
		Assert.assertEquals(Color.RED, cube.getYellow().getColors()[8]);
		
		Assert.assertEquals(Color.GREEN, cube.getWhite().getColors()[0]);
		Assert.assertEquals(Color.ORANGE, cube.getWhite().getColors()[1]);
		Assert.assertEquals(Color.WHITE, cube.getWhite().getColors()[2]);
		
		Assert.assertEquals(Color.GREEN, cube.getGreen().getColors()[0]);
		Assert.assertEquals(Color.ORANGE, cube.getGreen().getColors()[3]);
		Assert.assertEquals(Color.BLUE, cube.getGreen().getColors()[6]);

	}

	@Test
	public void testAntiClockWiseMovementForRedSide() {
		cube.getRed().rotateAntiClockwise();

		Assert.assertEquals(Color.ORANGE, cube.getRed().getColors()[0]);
		Assert.assertEquals(Color.WHITE, cube.getRed().getColors()[1]);
		Assert.assertEquals(Color.WHITE, cube.getRed().getColors()[2]);
		Assert.assertEquals(Color.BLUE, cube.getRed().getColors()[3]);
		Assert.assertEquals(Color.RED, cube.getRed().getColors()[4]);
		Assert.assertEquals(Color.BLUE, cube.getRed().getColors()[5]);
		Assert.assertEquals(Color.WHITE, cube.getRed().getColors()[6]);
		Assert.assertEquals(Color.YELLOW, cube.getRed().getColors()[7]);
		Assert.assertEquals(Color.GREEN, cube.getRed().getColors()[8]);
		
		Assert.assertEquals(Color.BLUE, cube.getBlue().getColors()[2]);
		Assert.assertEquals(Color.ORANGE, cube.getBlue().getColors()[5]);
		Assert.assertEquals(Color.GREEN, cube.getBlue().getColors()[8]);
		
		Assert.assertEquals(Color.WHITE, cube.getYellow().getColors()[6]);
		Assert.assertEquals(Color.ORANGE, cube.getYellow().getColors()[7]);
		Assert.assertEquals(Color.GREEN, cube.getYellow().getColors()[8]);
		
		Assert.assertEquals(Color.RED, cube.getWhite().getColors()[0]);
		Assert.assertEquals(Color.RED, cube.getWhite().getColors()[1]);
		Assert.assertEquals(Color.ORANGE, cube.getWhite().getColors()[2]);
		
		Assert.assertEquals(Color.ORANGE, cube.getGreen().getColors()[0]);
		Assert.assertEquals(Color.YELLOW, cube.getGreen().getColors()[3]);
		Assert.assertEquals(Color.YELLOW, cube.getGreen().getColors()[6]);

	}
	
	
	@Test
	public void testClockWiseMovementForGreenSide() {
		cube.getGreen().rotateClockwise();

		Assert.assertEquals(Color.GREEN, cube.getGreen().getColors()[0]);
		Assert.assertEquals(Color.ORANGE, cube.getGreen().getColors()[1]);
		Assert.assertEquals(Color.WHITE, cube.getGreen().getColors()[2]);
		Assert.assertEquals(Color.GREEN, cube.getGreen().getColors()[3]);
		Assert.assertEquals(Color.GREEN, cube.getGreen().getColors()[4]);
		Assert.assertEquals(Color.BLUE, cube.getGreen().getColors()[5]);
		Assert.assertEquals(Color.YELLOW, cube.getGreen().getColors()[6]);
		Assert.assertEquals(Color.RED, cube.getGreen().getColors()[7]);
		Assert.assertEquals(Color.RED, cube.getGreen().getColors()[8]);
		
		Assert.assertEquals(Color.ORANGE, cube.getRed().getColors()[2]);
		Assert.assertEquals(Color.WHITE, cube.getRed().getColors()[5]);
		Assert.assertEquals(Color.RED, cube.getRed().getColors()[8]);
		
		Assert.assertEquals(Color.GREEN, cube.getWhite().getColors()[2]);
		Assert.assertEquals(Color.GREEN, cube.getWhite().getColors()[5]);
		Assert.assertEquals(Color.YELLOW, cube.getWhite().getColors()[8]);
		
		Assert.assertEquals(Color.BLUE, cube.getOrange().getColors()[0]);
		Assert.assertEquals(Color.WHITE, cube.getOrange().getColors()[3]);
		Assert.assertEquals(Color.BLUE, cube.getOrange().getColors()[6]);
		
		Assert.assertEquals(Color.ORANGE, cube.getYellow().getColors()[2]);
		Assert.assertEquals(Color.WHITE, cube.getYellow().getColors()[5]);
		Assert.assertEquals(Color.WHITE, cube.getYellow().getColors()[8]);
		
		

	}

	@Test
	public void testAntiClockWiseMovementForGreenSide() {
		cube.getGreen().rotateAntiClockwise();

		Assert.assertEquals(Color.RED, cube.getGreen().getColors()[0]);
		Assert.assertEquals(Color.RED, cube.getGreen().getColors()[1]);
		Assert.assertEquals(Color.YELLOW, cube.getGreen().getColors()[2]);
		Assert.assertEquals(Color.BLUE, cube.getGreen().getColors()[3]);
		Assert.assertEquals(Color.GREEN, cube.getGreen().getColors()[4]);
		Assert.assertEquals(Color.GREEN, cube.getGreen().getColors()[5]);
		Assert.assertEquals(Color.WHITE, cube.getGreen().getColors()[6]);
		Assert.assertEquals(Color.ORANGE, cube.getGreen().getColors()[7]);
		Assert.assertEquals(Color.GREEN, cube.getGreen().getColors()[8]);
		
		Assert.assertEquals(Color.BLUE, cube.getRed().getColors()[2]);
		Assert.assertEquals(Color.WHITE, cube.getRed().getColors()[5]);
		Assert.assertEquals(Color.BLUE, cube.getRed().getColors()[8]);
		
		Assert.assertEquals(Color.ORANGE, cube.getWhite().getColors()[2]);
		Assert.assertEquals(Color.WHITE, cube.getWhite().getColors()[5]);
		Assert.assertEquals(Color.WHITE, cube.getWhite().getColors()[8]);
		
		Assert.assertEquals(Color.RED, cube.getOrange().getColors()[0]);
		Assert.assertEquals(Color.WHITE, cube.getOrange().getColors()[3]);
		Assert.assertEquals(Color.ORANGE, cube.getOrange().getColors()[6]);
		
		Assert.assertEquals(Color.GREEN, cube.getYellow().getColors()[2]);
		Assert.assertEquals(Color.GREEN, cube.getYellow().getColors()[5]);
		Assert.assertEquals(Color.YELLOW, cube.getYellow().getColors()[8]);

	}
	
	@Test
	public void testClockWiseMovementForOrangeSide() {
		cube.getOrange().rotateClockwise();

		Assert.assertEquals(Color.GREEN, cube.getOrange().getColors()[0]);
		Assert.assertEquals(Color.GREEN, cube.getOrange().getColors()[1]);
		Assert.assertEquals(Color.YELLOW, cube.getOrange().getColors()[2]);
		Assert.assertEquals(Color.GREEN, cube.getOrange().getColors()[3]);
		Assert.assertEquals(Color.ORANGE, cube.getOrange().getColors()[4]);
		Assert.assertEquals(Color.RED, cube.getOrange().getColors()[5]);
		Assert.assertEquals(Color.ORANGE, cube.getOrange().getColors()[6]);
		Assert.assertEquals(Color.GREEN, cube.getOrange().getColors()[7]);
		Assert.assertEquals(Color.WHITE, cube.getOrange().getColors()[8]);
		
		Assert.assertEquals(Color.BLUE, cube.getBlue().getColors()[0]);
		Assert.assertEquals(Color.WHITE, cube.getBlue().getColors()[3]);
		Assert.assertEquals(Color.BLUE, cube.getBlue().getColors()[6]);
		
		Assert.assertEquals(Color.RED, cube.getWhite().getColors()[6]);
		Assert.assertEquals(Color.ORANGE, cube.getWhite().getColors()[7]);
		Assert.assertEquals(Color.YELLOW, cube.getWhite().getColors()[8]);
		
		Assert.assertEquals(Color.RED, cube.getYellow().getColors()[0]);
		Assert.assertEquals(Color.RED, cube.getYellow().getColors()[1]);
		Assert.assertEquals(Color.YELLOW, cube.getYellow().getColors()[2]);
		
		Assert.assertEquals(Color.RED, cube.getGreen().getColors()[2]);
		Assert.assertEquals(Color.YELLOW, cube.getGreen().getColors()[5]);
		Assert.assertEquals(Color.BLUE, cube.getGreen().getColors()[8]);

	}

	@Test
	public void testAntiClockWiseMovementForOrangeSide() {
		cube.getOrange().rotateAntiClockwise();

		Assert.assertEquals(Color.WHITE, cube.getOrange().getColors()[0]);
		Assert.assertEquals(Color.GREEN, cube.getOrange().getColors()[1]);
		Assert.assertEquals(Color.ORANGE, cube.getOrange().getColors()[2]);
		Assert.assertEquals(Color.RED, cube.getOrange().getColors()[3]);
		Assert.assertEquals(Color.ORANGE, cube.getOrange().getColors()[4]);
		Assert.assertEquals(Color.GREEN, cube.getOrange().getColors()[5]);
		Assert.assertEquals(Color.YELLOW, cube.getOrange().getColors()[6]);
		Assert.assertEquals(Color.GREEN, cube.getOrange().getColors()[7]);
		Assert.assertEquals(Color.GREEN, cube.getOrange().getColors()[8]);
		
		Assert.assertEquals(Color.BLUE, cube.getBlue().getColors()[0]);
		Assert.assertEquals(Color.YELLOW, cube.getBlue().getColors()[3]);
		Assert.assertEquals(Color.RED, cube.getBlue().getColors()[6]);
		
		Assert.assertEquals(Color.YELLOW, cube.getWhite().getColors()[6]);
		Assert.assertEquals(Color.RED, cube.getWhite().getColors()[7]);
		Assert.assertEquals(Color.RED, cube.getWhite().getColors()[8]);
		
		Assert.assertEquals(Color.YELLOW, cube.getYellow().getColors()[0]);
		Assert.assertEquals(Color.ORANGE, cube.getYellow().getColors()[1]);
		Assert.assertEquals(Color.RED, cube.getYellow().getColors()[2]);
		
		Assert.assertEquals(Color.BLUE, cube.getGreen().getColors()[2]);
		Assert.assertEquals(Color.WHITE, cube.getGreen().getColors()[5]);
		Assert.assertEquals(Color.BLUE, cube.getGreen().getColors()[8]);

	}
	
	@Test
	public void testClockWiseMovementForBlueSide() {
		cube.getBlue().rotateClockwise();

		Assert.assertEquals(Color.YELLOW, cube.getBlue().getColors()[0]);
		Assert.assertEquals(Color.ORANGE, cube.getBlue().getColors()[1]);
		Assert.assertEquals(Color.RED, cube.getBlue().getColors()[2]);
		Assert.assertEquals(Color.RED, cube.getBlue().getColors()[3]);
		Assert.assertEquals(Color.BLUE, cube.getBlue().getColors()[4]);
		Assert.assertEquals(Color.YELLOW, cube.getBlue().getColors()[5]);
		Assert.assertEquals(Color.ORANGE, cube.getBlue().getColors()[6]);
		Assert.assertEquals(Color.RED, cube.getBlue().getColors()[7]);
		Assert.assertEquals(Color.RED, cube.getBlue().getColors()[8]);
		
		Assert.assertEquals(Color.BLUE, cube.getRed().getColors()[0]);
		Assert.assertEquals(Color.ORANGE, cube.getRed().getColors()[3]);
		Assert.assertEquals(Color.GREEN, cube.getRed().getColors()[6]);
		
		Assert.assertEquals(Color.BLUE, cube.getOrange().getColors()[2]);
		Assert.assertEquals(Color.BLUE, cube.getOrange().getColors()[5]);
		Assert.assertEquals(Color.YELLOW, cube.getOrange().getColors()[8]);
		
		Assert.assertEquals(Color.WHITE, cube.getWhite().getColors()[0]);
		Assert.assertEquals(Color.YELLOW, cube.getWhite().getColors()[3]);
		Assert.assertEquals(Color.GREEN, cube.getWhite().getColors()[6]);
		
		Assert.assertEquals(Color.ORANGE, cube.getYellow().getColors()[0]);
		Assert.assertEquals(Color.GREEN, cube.getYellow().getColors()[3]);
		Assert.assertEquals(Color.WHITE, cube.getYellow().getColors()[6]);
		
		

	}

	@Test
	public void testAntiClockWiseMovementForBlueSide() {
		cube.getBlue().rotateAntiClockwise();

		Assert.assertEquals(Color.RED, cube.getBlue().getColors()[0]);
		Assert.assertEquals(Color.RED, cube.getBlue().getColors()[1]);
		Assert.assertEquals(Color.ORANGE, cube.getBlue().getColors()[2]);
		Assert.assertEquals(Color.YELLOW, cube.getBlue().getColors()[3]);
		Assert.assertEquals(Color.BLUE, cube.getBlue().getColors()[4]);
		Assert.assertEquals(Color.RED, cube.getBlue().getColors()[5]);
		Assert.assertEquals(Color.RED, cube.getBlue().getColors()[6]);
		Assert.assertEquals(Color.ORANGE, cube.getBlue().getColors()[7]);
		Assert.assertEquals(Color.YELLOW, cube.getBlue().getColors()[8]);
		
		Assert.assertEquals(Color.YELLOW, cube.getRed().getColors()[0]);
		Assert.assertEquals(Color.BLUE, cube.getRed().getColors()[3]);
		Assert.assertEquals(Color.BLUE, cube.getRed().getColors()[6]);
		
		Assert.assertEquals(Color.GREEN, cube.getOrange().getColors()[2]);
		Assert.assertEquals(Color.ORANGE, cube.getOrange().getColors()[5]);
		Assert.assertEquals(Color.BLUE, cube.getOrange().getColors()[8]);
		
		Assert.assertEquals(Color.ORANGE, cube.getWhite().getColors()[0]);
		Assert.assertEquals(Color.GREEN, cube.getWhite().getColors()[3]);
		Assert.assertEquals(Color.WHITE, cube.getWhite().getColors()[6]);
		
		Assert.assertEquals(Color.WHITE, cube.getYellow().getColors()[0]);
		Assert.assertEquals(Color.YELLOW, cube.getYellow().getColors()[3]);
		Assert.assertEquals(Color.GREEN, cube.getYellow().getColors()[6]);

	}
	
	@Test
	public void testClockWiseMovementForWhiteSide() {
		cube.getWhite().rotateClockwise();

		Assert.assertEquals(Color.BLUE, cube.getWhite().getColors()[0]);
		Assert.assertEquals(Color.BLUE, cube.getWhite().getColors()[1]);
		Assert.assertEquals(Color.YELLOW, cube.getWhite().getColors()[2]);
		Assert.assertEquals(Color.YELLOW, cube.getWhite().getColors()[3]);
		Assert.assertEquals(Color.WHITE, cube.getWhite().getColors()[4]);
		Assert.assertEquals(Color.YELLOW, cube.getWhite().getColors()[5]);
		Assert.assertEquals(Color.RED, cube.getWhite().getColors()[6]);
		Assert.assertEquals(Color.WHITE, cube.getWhite().getColors()[7]);
		Assert.assertEquals(Color.ORANGE, cube.getWhite().getColors()[8]);
		
		Assert.assertEquals(Color.GREEN, cube.getBlue().getColors()[6]);
		Assert.assertEquals(Color.GREEN, cube.getBlue().getColors()[7]);
		Assert.assertEquals(Color.ORANGE, cube.getBlue().getColors()[8]);
		
		Assert.assertEquals(Color.GREEN, cube.getOrange().getColors()[6]);
		Assert.assertEquals(Color.GREEN, cube.getOrange().getColors()[7]);
		Assert.assertEquals(Color.YELLOW, cube.getOrange().getColors()[8]);
		
		Assert.assertEquals(Color.YELLOW, cube.getRed().getColors()[6]);
		Assert.assertEquals(Color.RED, cube.getRed().getColors()[7]);
		Assert.assertEquals(Color.ORANGE, cube.getRed().getColors()[8]);
		
		Assert.assertEquals(Color.GREEN, cube.getGreen().getColors()[6]);
		Assert.assertEquals(Color.BLUE, cube.getGreen().getColors()[7]);
		Assert.assertEquals(Color.WHITE, cube.getGreen().getColors()[8]);

	}

	@Test
	public void testAntiClockWiseMovementForWhiteSide() {
		cube.getWhite().rotateAntiClockwise();

		Assert.assertEquals(Color.ORANGE, cube.getWhite().getColors()[0]);
		Assert.assertEquals(Color.WHITE, cube.getWhite().getColors()[1]);
		Assert.assertEquals(Color.RED, cube.getWhite().getColors()[2]);
		Assert.assertEquals(Color.YELLOW, cube.getWhite().getColors()[3]);
		Assert.assertEquals(Color.WHITE, cube.getWhite().getColors()[4]);
		Assert.assertEquals(Color.YELLOW, cube.getWhite().getColors()[5]);
		Assert.assertEquals(Color.YELLOW, cube.getWhite().getColors()[6]);
		Assert.assertEquals(Color.BLUE, cube.getWhite().getColors()[7]);
		Assert.assertEquals(Color.BLUE, cube.getWhite().getColors()[8]);
		
		Assert.assertEquals(Color.GREEN, cube.getBlue().getColors()[6]);
		Assert.assertEquals(Color.BLUE, cube.getBlue().getColors()[7]);
		Assert.assertEquals(Color.WHITE, cube.getBlue().getColors()[8]);
		
		Assert.assertEquals(Color.YELLOW, cube.getOrange().getColors()[6]);
		Assert.assertEquals(Color.RED, cube.getOrange().getColors()[7]);
		Assert.assertEquals(Color.ORANGE, cube.getOrange().getColors()[8]);
		
		Assert.assertEquals(Color.GREEN, cube.getRed().getColors()[6]);
		Assert.assertEquals(Color.GREEN, cube.getRed().getColors()[7]);
		Assert.assertEquals(Color.YELLOW, cube.getRed().getColors()[8]);
		
		Assert.assertEquals(Color.GREEN, cube.getGreen().getColors()[6]);
		Assert.assertEquals(Color.GREEN, cube.getGreen().getColors()[7]);
		Assert.assertEquals(Color.ORANGE, cube.getGreen().getColors()[8]);

	}
	
	@Test
	public void testClockWiseMovementForYellowSide() {
		cube.getYellow().rotateClockwise();

		Assert.assertEquals(Color.GREEN, cube.getYellow().getColors()[0]);
		Assert.assertEquals(Color.ORANGE, cube.getYellow().getColors()[1]);
		Assert.assertEquals(Color.BLUE, cube.getYellow().getColors()[2]);
		Assert.assertEquals(Color.ORANGE, cube.getYellow().getColors()[3]);
		Assert.assertEquals(Color.YELLOW, cube.getYellow().getColors()[4]);
		Assert.assertEquals(Color.WHITE, cube.getYellow().getColors()[5]);
		Assert.assertEquals(Color.BLUE, cube.getYellow().getColors()[6]);
		Assert.assertEquals(Color.WHITE, cube.getYellow().getColors()[7]);
		Assert.assertEquals(Color.BLUE, cube.getYellow().getColors()[8]);
		
		Assert.assertEquals(Color.WHITE, cube.getBlue().getColors()[0]);
		Assert.assertEquals(Color.BLUE, cube.getBlue().getColors()[1]);
		Assert.assertEquals(Color.ORANGE, cube.getBlue().getColors()[2]);
		
		Assert.assertEquals(Color.WHITE, cube.getRed().getColors()[0]);
		Assert.assertEquals(Color.BLUE, cube.getRed().getColors()[1]);
		Assert.assertEquals(Color.RED, cube.getRed().getColors()[2]);
		
		Assert.assertEquals(Color.RED, cube.getOrange().getColors()[0]);
		Assert.assertEquals(Color.YELLOW, cube.getOrange().getColors()[1]);
		Assert.assertEquals(Color.RED, cube.getOrange().getColors()[2]);
		
		Assert.assertEquals(Color.YELLOW, cube.getGreen().getColors()[0]);
		Assert.assertEquals(Color.RED, cube.getGreen().getColors()[1]);
		Assert.assertEquals(Color.WHITE, cube.getGreen().getColors()[2]);

	}

	@Test
	public void testAntiClockWiseMovementForYellowSide() {
		cube.getYellow().rotateAntiClockwise();

		Assert.assertEquals(Color.BLUE, cube.getYellow().getColors()[0]);
		Assert.assertEquals(Color.WHITE, cube.getYellow().getColors()[1]);
		Assert.assertEquals(Color.BLUE, cube.getYellow().getColors()[2]);
		Assert.assertEquals(Color.WHITE, cube.getYellow().getColors()[3]);
		Assert.assertEquals(Color.YELLOW, cube.getYellow().getColors()[4]);
		Assert.assertEquals(Color.ORANGE, cube.getYellow().getColors()[5]);
		Assert.assertEquals(Color.BLUE, cube.getYellow().getColors()[6]);
		Assert.assertEquals(Color.ORANGE, cube.getYellow().getColors()[7]);
		Assert.assertEquals(Color.GREEN, cube.getYellow().getColors()[8]);
		
		Assert.assertEquals(Color.YELLOW, cube.getBlue().getColors()[0]);
		Assert.assertEquals(Color.RED, cube.getBlue().getColors()[1]);
		Assert.assertEquals(Color.WHITE, cube.getBlue().getColors()[2]);
		
		Assert.assertEquals(Color.RED, cube.getRed().getColors()[0]);
		Assert.assertEquals(Color.YELLOW, cube.getRed().getColors()[1]);
		Assert.assertEquals(Color.RED, cube.getRed().getColors()[2]);
		
		Assert.assertEquals(Color.WHITE, cube.getOrange().getColors()[0]);
		Assert.assertEquals(Color.BLUE, cube.getOrange().getColors()[1]);
		Assert.assertEquals(Color.RED, cube.getOrange().getColors()[2]);
		
		Assert.assertEquals(Color.WHITE, cube.getGreen().getColors()[0]);
		Assert.assertEquals(Color.BLUE, cube.getGreen().getColors()[1]);
		Assert.assertEquals(Color.ORANGE, cube.getGreen().getColors()[2]);

	}

}
