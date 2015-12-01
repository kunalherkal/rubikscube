package com.kunalherkal.rubikscube;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.kunalherkal.rubikscube.colors.Color;
import com.kunalherkal.rubikscube.cube.Cube;
import com.kunalherkal.rubikscube.solution.RubikscubeSolver;

public final class MovementTest1 {
	Cube cube;
	RubikscubeSolver rubikscubeSolver;

	@Before
	public void setUp() {
		Injector injector = Guice.createInjector(new RubikscubeModule());
		cube = injector.getInstance(Cube.class);
		rubikscubeSolver = injector.getInstance(RubikscubeSolver.class);

		System.out.println("Cube details:" + cube.toString());

	}
	
	@Test
	public void testClockWiseMovementForRedSide() {
		cube.getRed().rotateClockwise();

		Assert.assertEquals(Color.RED, cube.getRed().getColors()[0]);
		Assert.assertEquals(Color.RED, cube.getRed().getColors()[1]);
		Assert.assertEquals(Color.RED, cube.getRed().getColors()[2]);
		Assert.assertEquals(Color.RED, cube.getRed().getColors()[3]);
		Assert.assertEquals(Color.RED, cube.getRed().getColors()[4]);
		Assert.assertEquals(Color.RED, cube.getRed().getColors()[5]);
		Assert.assertEquals(Color.RED, cube.getRed().getColors()[6]);
		Assert.assertEquals(Color.RED, cube.getRed().getColors()[7]);
		Assert.assertEquals(Color.RED, cube.getRed().getColors()[8]);
		
		Assert.assertEquals(Color.WHITE, cube.getBlue().getColors()[2]);
		Assert.assertEquals(Color.WHITE, cube.getBlue().getColors()[5]);
		Assert.assertEquals(Color.WHITE, cube.getBlue().getColors()[8]);
		
		Assert.assertEquals(Color.BLUE, cube.getYellow().getColors()[6]);
		Assert.assertEquals(Color.BLUE, cube.getYellow().getColors()[7]);
		Assert.assertEquals(Color.BLUE, cube.getYellow().getColors()[8]);
		
		Assert.assertEquals(Color.GREEN, cube.getWhite().getColors()[0]);
		Assert.assertEquals(Color.GREEN, cube.getWhite().getColors()[1]);
		Assert.assertEquals(Color.GREEN, cube.getWhite().getColors()[2]);
		
		Assert.assertEquals(Color.YELLOW, cube.getGreen().getColors()[0]);
		Assert.assertEquals(Color.YELLOW, cube.getGreen().getColors()[3]);
		Assert.assertEquals(Color.YELLOW, cube.getGreen().getColors()[6]);

	}

	@Test
	public void testAntiClockWiseMovementForRedSide() {
		cube.getRed().rotateAntiClockwise();

		Assert.assertEquals(Color.RED, cube.getRed().getColors()[0]);
		Assert.assertEquals(Color.RED, cube.getRed().getColors()[1]);
		Assert.assertEquals(Color.RED, cube.getRed().getColors()[2]);
		Assert.assertEquals(Color.RED, cube.getRed().getColors()[3]);
		Assert.assertEquals(Color.RED, cube.getRed().getColors()[4]);
		Assert.assertEquals(Color.RED, cube.getRed().getColors()[5]);
		Assert.assertEquals(Color.RED, cube.getRed().getColors()[6]);
		Assert.assertEquals(Color.RED, cube.getRed().getColors()[7]);
		Assert.assertEquals(Color.RED, cube.getRed().getColors()[8]);
		
		Assert.assertEquals(Color.YELLOW, cube.getBlue().getColors()[2]);
		Assert.assertEquals(Color.YELLOW, cube.getBlue().getColors()[5]);
		Assert.assertEquals(Color.YELLOW, cube.getBlue().getColors()[8]);
		
		Assert.assertEquals(Color.GREEN, cube.getYellow().getColors()[6]);
		Assert.assertEquals(Color.GREEN, cube.getYellow().getColors()[7]);
		Assert.assertEquals(Color.GREEN, cube.getYellow().getColors()[8]);
		
		Assert.assertEquals(Color.BLUE, cube.getWhite().getColors()[0]);
		Assert.assertEquals(Color.BLUE, cube.getWhite().getColors()[1]);
		Assert.assertEquals(Color.BLUE, cube.getWhite().getColors()[2]);
		
		Assert.assertEquals(Color.WHITE, cube.getGreen().getColors()[0]);
		Assert.assertEquals(Color.WHITE, cube.getGreen().getColors()[3]);
		Assert.assertEquals(Color.WHITE, cube.getGreen().getColors()[6]);

	}
	
	
	@Test
	public void testClockWiseMovementForGreenSide() {
		cube.getGreen().rotateClockwise();

		Assert.assertEquals(Color.GREEN, cube.getGreen().getColors()[0]);
		Assert.assertEquals(Color.GREEN, cube.getGreen().getColors()[1]);
		Assert.assertEquals(Color.GREEN, cube.getGreen().getColors()[2]);
		Assert.assertEquals(Color.GREEN, cube.getGreen().getColors()[3]);
		Assert.assertEquals(Color.GREEN, cube.getGreen().getColors()[4]);
		Assert.assertEquals(Color.GREEN, cube.getGreen().getColors()[5]);
		Assert.assertEquals(Color.GREEN, cube.getGreen().getColors()[6]);
		Assert.assertEquals(Color.GREEN, cube.getGreen().getColors()[7]);
		Assert.assertEquals(Color.GREEN, cube.getGreen().getColors()[8]);
		
		Assert.assertEquals(Color.WHITE, cube.getRed().getColors()[2]);
		Assert.assertEquals(Color.WHITE, cube.getRed().getColors()[5]);
		Assert.assertEquals(Color.WHITE, cube.getRed().getColors()[8]);
		
		Assert.assertEquals(Color.ORANGE, cube.getWhite().getColors()[2]);
		Assert.assertEquals(Color.ORANGE, cube.getWhite().getColors()[5]);
		Assert.assertEquals(Color.ORANGE, cube.getWhite().getColors()[8]);
		
		Assert.assertEquals(Color.YELLOW, cube.getOrange().getColors()[0]);
		Assert.assertEquals(Color.YELLOW, cube.getOrange().getColors()[3]);
		Assert.assertEquals(Color.YELLOW, cube.getOrange().getColors()[6]);
		
		Assert.assertEquals(Color.RED, cube.getYellow().getColors()[2]);
		Assert.assertEquals(Color.RED, cube.getYellow().getColors()[5]);
		Assert.assertEquals(Color.RED, cube.getYellow().getColors()[8]);
		
		

	}

	@Test
	public void testAntiClockWiseMovementForGreenSide() {
		cube.getGreen().rotateAntiClockwise();

		Assert.assertEquals(Color.GREEN, cube.getGreen().getColors()[0]);
		Assert.assertEquals(Color.GREEN, cube.getGreen().getColors()[1]);
		Assert.assertEquals(Color.GREEN, cube.getGreen().getColors()[2]);
		Assert.assertEquals(Color.GREEN, cube.getGreen().getColors()[3]);
		Assert.assertEquals(Color.GREEN, cube.getGreen().getColors()[4]);
		Assert.assertEquals(Color.GREEN, cube.getGreen().getColors()[5]);
		Assert.assertEquals(Color.GREEN, cube.getGreen().getColors()[6]);
		Assert.assertEquals(Color.GREEN, cube.getGreen().getColors()[7]);
		Assert.assertEquals(Color.GREEN, cube.getGreen().getColors()[8]);
		
		Assert.assertEquals(Color.YELLOW, cube.getRed().getColors()[2]);
		Assert.assertEquals(Color.YELLOW, cube.getRed().getColors()[5]);
		Assert.assertEquals(Color.YELLOW, cube.getRed().getColors()[8]);
		
		Assert.assertEquals(Color.RED, cube.getWhite().getColors()[2]);
		Assert.assertEquals(Color.RED, cube.getWhite().getColors()[5]);
		Assert.assertEquals(Color.RED, cube.getWhite().getColors()[8]);
		
		Assert.assertEquals(Color.WHITE, cube.getOrange().getColors()[0]);
		Assert.assertEquals(Color.WHITE, cube.getOrange().getColors()[3]);
		Assert.assertEquals(Color.WHITE, cube.getOrange().getColors()[6]);
		
		Assert.assertEquals(Color.ORANGE, cube.getYellow().getColors()[2]);
		Assert.assertEquals(Color.ORANGE, cube.getYellow().getColors()[5]);
		Assert.assertEquals(Color.ORANGE, cube.getYellow().getColors()[8]);

	}
	
	@Test
	public void testClockWiseMovementForOrangeSide() {
		cube.getOrange().rotateClockwise();

		Assert.assertEquals(Color.ORANGE, cube.getOrange().getColors()[0]);
		Assert.assertEquals(Color.ORANGE, cube.getOrange().getColors()[1]);
		Assert.assertEquals(Color.ORANGE, cube.getOrange().getColors()[2]);
		Assert.assertEquals(Color.ORANGE, cube.getOrange().getColors()[3]);
		Assert.assertEquals(Color.ORANGE, cube.getOrange().getColors()[4]);
		Assert.assertEquals(Color.ORANGE, cube.getOrange().getColors()[5]);
		Assert.assertEquals(Color.ORANGE, cube.getOrange().getColors()[6]);
		Assert.assertEquals(Color.ORANGE, cube.getOrange().getColors()[7]);
		Assert.assertEquals(Color.ORANGE, cube.getOrange().getColors()[8]);
		
		Assert.assertEquals(Color.YELLOW, cube.getBlue().getColors()[0]);
		Assert.assertEquals(Color.YELLOW, cube.getBlue().getColors()[3]);
		Assert.assertEquals(Color.YELLOW, cube.getBlue().getColors()[6]);
		
		Assert.assertEquals(Color.BLUE, cube.getWhite().getColors()[6]);
		Assert.assertEquals(Color.BLUE, cube.getWhite().getColors()[7]);
		Assert.assertEquals(Color.BLUE, cube.getWhite().getColors()[8]);
		
		Assert.assertEquals(Color.GREEN, cube.getYellow().getColors()[0]);
		Assert.assertEquals(Color.GREEN, cube.getYellow().getColors()[1]);
		Assert.assertEquals(Color.GREEN, cube.getYellow().getColors()[2]);
		
		Assert.assertEquals(Color.WHITE, cube.getGreen().getColors()[2]);
		Assert.assertEquals(Color.WHITE, cube.getGreen().getColors()[5]);
		Assert.assertEquals(Color.WHITE, cube.getGreen().getColors()[8]);

	}

	@Test
	public void testAntiClockWiseMovementForOrangeSide() {
		cube.getOrange().rotateAntiClockwise();

		Assert.assertEquals(Color.ORANGE, cube.getOrange().getColors()[0]);
		Assert.assertEquals(Color.ORANGE, cube.getOrange().getColors()[1]);
		Assert.assertEquals(Color.ORANGE, cube.getOrange().getColors()[2]);
		Assert.assertEquals(Color.ORANGE, cube.getOrange().getColors()[3]);
		Assert.assertEquals(Color.ORANGE, cube.getOrange().getColors()[4]);
		Assert.assertEquals(Color.ORANGE, cube.getOrange().getColors()[5]);
		Assert.assertEquals(Color.ORANGE, cube.getOrange().getColors()[6]);
		Assert.assertEquals(Color.ORANGE, cube.getOrange().getColors()[7]);
		Assert.assertEquals(Color.ORANGE, cube.getOrange().getColors()[8]);
		
		Assert.assertEquals(Color.WHITE, cube.getBlue().getColors()[0]);
		Assert.assertEquals(Color.WHITE, cube.getBlue().getColors()[3]);
		Assert.assertEquals(Color.WHITE, cube.getBlue().getColors()[6]);
		
		Assert.assertEquals(Color.GREEN, cube.getWhite().getColors()[6]);
		Assert.assertEquals(Color.GREEN, cube.getWhite().getColors()[7]);
		Assert.assertEquals(Color.GREEN, cube.getWhite().getColors()[8]);
		
		Assert.assertEquals(Color.BLUE, cube.getYellow().getColors()[0]);
		Assert.assertEquals(Color.BLUE, cube.getYellow().getColors()[1]);
		Assert.assertEquals(Color.BLUE, cube.getYellow().getColors()[2]);
		
		Assert.assertEquals(Color.YELLOW, cube.getGreen().getColors()[2]);
		Assert.assertEquals(Color.YELLOW, cube.getGreen().getColors()[5]);
		Assert.assertEquals(Color.YELLOW, cube.getGreen().getColors()[8]);

	}
	
	@Test
	public void testClockWiseMovementForBlueSide() {
		cube.getBlue().rotateClockwise();

		Assert.assertEquals(Color.BLUE, cube.getBlue().getColors()[0]);
		Assert.assertEquals(Color.BLUE, cube.getBlue().getColors()[1]);
		Assert.assertEquals(Color.BLUE, cube.getBlue().getColors()[2]);
		Assert.assertEquals(Color.BLUE, cube.getBlue().getColors()[3]);
		Assert.assertEquals(Color.BLUE, cube.getBlue().getColors()[4]);
		Assert.assertEquals(Color.BLUE, cube.getBlue().getColors()[5]);
		Assert.assertEquals(Color.BLUE, cube.getBlue().getColors()[6]);
		Assert.assertEquals(Color.BLUE, cube.getBlue().getColors()[7]);
		Assert.assertEquals(Color.BLUE, cube.getBlue().getColors()[8]);
		
		Assert.assertEquals(Color.YELLOW, cube.getRed().getColors()[0]);
		Assert.assertEquals(Color.YELLOW, cube.getRed().getColors()[3]);
		Assert.assertEquals(Color.YELLOW, cube.getRed().getColors()[6]);
		
		Assert.assertEquals(Color.WHITE, cube.getOrange().getColors()[2]);
		Assert.assertEquals(Color.WHITE, cube.getOrange().getColors()[5]);
		Assert.assertEquals(Color.WHITE, cube.getOrange().getColors()[8]);
		
		Assert.assertEquals(Color.RED, cube.getWhite().getColors()[0]);
		Assert.assertEquals(Color.RED, cube.getWhite().getColors()[3]);
		Assert.assertEquals(Color.RED, cube.getWhite().getColors()[6]);
		
		Assert.assertEquals(Color.ORANGE, cube.getYellow().getColors()[0]);
		Assert.assertEquals(Color.ORANGE, cube.getYellow().getColors()[3]);
		Assert.assertEquals(Color.ORANGE, cube.getYellow().getColors()[6]);
		
		

	}

	@Test
	public void testAntiClockWiseMovementForBlueSide() {
		cube.getBlue().rotateAntiClockwise();

		Assert.assertEquals(Color.BLUE, cube.getBlue().getColors()[0]);
		Assert.assertEquals(Color.BLUE, cube.getBlue().getColors()[1]);
		Assert.assertEquals(Color.BLUE, cube.getBlue().getColors()[2]);
		Assert.assertEquals(Color.BLUE, cube.getBlue().getColors()[3]);
		Assert.assertEquals(Color.BLUE, cube.getBlue().getColors()[4]);
		Assert.assertEquals(Color.BLUE, cube.getBlue().getColors()[5]);
		Assert.assertEquals(Color.BLUE, cube.getBlue().getColors()[6]);
		Assert.assertEquals(Color.BLUE, cube.getBlue().getColors()[7]);
		Assert.assertEquals(Color.BLUE, cube.getBlue().getColors()[8]);
		
		Assert.assertEquals(Color.WHITE, cube.getRed().getColors()[0]);
		Assert.assertEquals(Color.WHITE, cube.getRed().getColors()[3]);
		Assert.assertEquals(Color.WHITE, cube.getRed().getColors()[6]);
		
		Assert.assertEquals(Color.YELLOW, cube.getOrange().getColors()[2]);
		Assert.assertEquals(Color.YELLOW, cube.getOrange().getColors()[5]);
		Assert.assertEquals(Color.YELLOW, cube.getOrange().getColors()[8]);
		
		Assert.assertEquals(Color.ORANGE, cube.getWhite().getColors()[0]);
		Assert.assertEquals(Color.ORANGE, cube.getWhite().getColors()[3]);
		Assert.assertEquals(Color.ORANGE, cube.getWhite().getColors()[6]);
		
		Assert.assertEquals(Color.RED, cube.getYellow().getColors()[0]);
		Assert.assertEquals(Color.RED, cube.getYellow().getColors()[3]);
		Assert.assertEquals(Color.RED, cube.getYellow().getColors()[6]);

	}
	
	@Test
	public void testClockWiseMovementForWhiteSide() {
		cube.getWhite().rotateClockwise();

		Assert.assertEquals(Color.WHITE, cube.getWhite().getColors()[0]);
		Assert.assertEquals(Color.WHITE, cube.getWhite().getColors()[1]);
		Assert.assertEquals(Color.WHITE, cube.getWhite().getColors()[2]);
		Assert.assertEquals(Color.WHITE, cube.getWhite().getColors()[3]);
		Assert.assertEquals(Color.WHITE, cube.getWhite().getColors()[4]);
		Assert.assertEquals(Color.WHITE, cube.getWhite().getColors()[5]);
		Assert.assertEquals(Color.WHITE, cube.getWhite().getColors()[6]);
		Assert.assertEquals(Color.WHITE, cube.getWhite().getColors()[7]);
		Assert.assertEquals(Color.WHITE, cube.getWhite().getColors()[8]);
		
		Assert.assertEquals(Color.ORANGE, cube.getBlue().getColors()[6]);
		Assert.assertEquals(Color.ORANGE, cube.getBlue().getColors()[7]);
		Assert.assertEquals(Color.ORANGE, cube.getBlue().getColors()[8]);
		
		Assert.assertEquals(Color.GREEN, cube.getOrange().getColors()[6]);
		Assert.assertEquals(Color.GREEN, cube.getOrange().getColors()[7]);
		Assert.assertEquals(Color.GREEN, cube.getOrange().getColors()[8]);
		
		Assert.assertEquals(Color.BLUE, cube.getRed().getColors()[6]);
		Assert.assertEquals(Color.BLUE, cube.getRed().getColors()[7]);
		Assert.assertEquals(Color.BLUE, cube.getRed().getColors()[8]);
		
		Assert.assertEquals(Color.RED, cube.getGreen().getColors()[6]);
		Assert.assertEquals(Color.RED, cube.getGreen().getColors()[7]);
		Assert.assertEquals(Color.RED, cube.getGreen().getColors()[8]);

	}

	@Test
	public void testAntiClockWiseMovementForWhiteSide() {
		cube.getWhite().rotateAntiClockwise();

		Assert.assertEquals(Color.WHITE, cube.getWhite().getColors()[0]);
		Assert.assertEquals(Color.WHITE, cube.getWhite().getColors()[1]);
		Assert.assertEquals(Color.WHITE, cube.getWhite().getColors()[2]);
		Assert.assertEquals(Color.WHITE, cube.getWhite().getColors()[3]);
		Assert.assertEquals(Color.WHITE, cube.getWhite().getColors()[4]);
		Assert.assertEquals(Color.WHITE, cube.getWhite().getColors()[5]);
		Assert.assertEquals(Color.WHITE, cube.getWhite().getColors()[6]);
		Assert.assertEquals(Color.WHITE, cube.getWhite().getColors()[7]);
		Assert.assertEquals(Color.WHITE, cube.getWhite().getColors()[8]);
		
		Assert.assertEquals(Color.RED, cube.getBlue().getColors()[6]);
		Assert.assertEquals(Color.RED, cube.getBlue().getColors()[7]);
		Assert.assertEquals(Color.RED, cube.getBlue().getColors()[8]);
		
		Assert.assertEquals(Color.BLUE, cube.getOrange().getColors()[6]);
		Assert.assertEquals(Color.BLUE, cube.getOrange().getColors()[7]);
		Assert.assertEquals(Color.BLUE, cube.getOrange().getColors()[8]);
		
		Assert.assertEquals(Color.GREEN, cube.getRed().getColors()[6]);
		Assert.assertEquals(Color.GREEN, cube.getRed().getColors()[7]);
		Assert.assertEquals(Color.GREEN, cube.getRed().getColors()[8]);
		
		Assert.assertEquals(Color.ORANGE, cube.getGreen().getColors()[6]);
		Assert.assertEquals(Color.ORANGE, cube.getGreen().getColors()[7]);
		Assert.assertEquals(Color.ORANGE, cube.getGreen().getColors()[8]);

	}

}
