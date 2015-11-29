package rubikscube;



import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.kunalherkal.rubikscube.RubikscubeModule;
import com.kunalherkal.rubikscube.colors.Color;
import com.kunalherkal.rubikscube.cube.Cube;

public final class MovementTest {
	Cube cube;

	@Before
	public void setUp() {
		Injector injector = Guice.createInjector(new RubikscubeModule());
		cube = injector.getInstance(Cube.class);
		
System.out.println("Cube details:" + cube.toString());
		
		cube.getWhite().setTileColor(0, Color.RED);
		cube.getWhite().setTileColor(1, Color.RED);
		cube.getWhite().setTileColor(2, Color.YELLOW);
		cube.getWhite().setTileColor(3, Color.BLUE);
		cube.getWhite().setTileColor(5, Color.RED);
		cube.getWhite().setTileColor(6, Color.WHITE);
		cube.getWhite().setTileColor(7, Color.YELLOW);
		cube.getWhite().setTileColor(8, Color.GREEN);
		
		System.out.println("Hold the cube with blue side facing you and white side facing down");
		
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
	public void testClockWiseMovementForWhiteSide(){
		cube.getWhite().rotateClockwise();
		
		Assert.assertEquals(cube.getWhite().getColors()[0], Color.WHITE);
		Assert.assertEquals(cube.getWhite().getColors()[1], Color.BLUE);
		Assert.assertEquals(cube.getWhite().getColors()[2], Color.RED);
		Assert.assertEquals(cube.getWhite().getColors()[3], Color.YELLOW);
		Assert.assertEquals(cube.getWhite().getColors()[4], Color.WHITE);
		Assert.assertEquals(cube.getWhite().getColors()[5], Color.RED);
		Assert.assertEquals(cube.getWhite().getColors()[6], Color.GREEN);
		Assert.assertEquals(cube.getWhite().getColors()[7], Color.RED);
		Assert.assertEquals(cube.getWhite().getColors()[8], Color.YELLOW);
		
	}

}
