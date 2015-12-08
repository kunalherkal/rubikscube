package com.kunalherkal.rubikscube.solution;

import java.util.LinkedList;
import java.util.List;

import com.google.inject.Inject;
import com.kunalherkal.rubikscube.colors.Color;
import com.kunalherkal.rubikscube.cube.Cube;
import com.kunalherkal.rubikscube.sides.Side;

public final class RubikscubeSolverImpl implements RubikscubeSolver {
	private final Cube cube;
	
	@Inject
	public RubikscubeSolverImpl(Cube cube) {
		this.cube = cube;
	}
	
	public void solve() {
		if(whiteCrossOnWhiteSide()){
			
		} else {
			solveWhiteCross();
		}
		
		
	}

	public void solveWhiteCross() {

		
			solveWhiteCrosssOnYellowSide();
			solveforWhiteCrossOnWhiteSide();

	}
	
	private void solveforWhiteCrossOnWhiteSide() {
		boolean redSideTileIsWhite = true;
		boolean blueSideTileIsWhite = true;
		boolean greenSideTileIsWhite = true;
		boolean orangeSideTileIsWhite = true;
		
		Side yellow = cube.getYellow();
		Side blue = cube.getBlue();
		Side green = cube.getGreen();
		Side red = cube.getRed();
		Side orange = cube.getOrange();
		
		List<Side> sides = new LinkedList<>();
		sides.add(red);
		sides.add(green);
		sides.add(orange);
		sides.add(blue);
		
		while(redSideTileIsWhite || blueSideTileIsWhite || orangeSideTileIsWhite || greenSideTileIsWhite){
			
			for(Side side : sides) {
				while(side.getColors()[1] != side.getColors()[4]){
					yellow.rotateClockwise();
				}
				
				if(side.getColors()[1] == side.getColors()[4]) {
					side.rotateClockwise();
					side.rotateClockwise();
				}
				
			}
			
			if(yellow.getColors()[1] == Color.WHITE){
				blueSideTileIsWhite = true;
			} else {
				blueSideTileIsWhite = false;
			}
				
			if(yellow.getColors()[3] == Color.WHITE){
				redSideTileIsWhite = true;
			}  else {
				redSideTileIsWhite = false;
			}
				
					
			if(yellow.getColors()[5] == Color.WHITE){
				orangeSideTileIsWhite = true;
			}  else {
				orangeSideTileIsWhite = false;
			}
				
				 
			if(yellow.getColors()[7] == Color.WHITE){
				greenSideTileIsWhite = true;
			} else {
				greenSideTileIsWhite = false;
			}
				
			
		}
		
		System.out.println("By now you should have white cross on white side");
		
		
	}

	public void solveWhiteCrosssOnYellowSide()  {
		boolean redSideTileIsWhite = false;
		boolean blueSideTileIsWhite = false;
		boolean greenSideTileIsWhite = false;
		boolean orangeSideTileIsWhite = false;
		
		Side yellow = cube.getYellow();
		
		if(yellow.getColors()[1] == Color.WHITE){
			blueSideTileIsWhite = true;
		}
			
		if(yellow.getColors()[3] == Color.WHITE){
			redSideTileIsWhite = true;
		}
				
		if(yellow.getColors()[5] == Color.WHITE){
			orangeSideTileIsWhite = true;
		}
			 
		if(yellow.getColors()[7] == Color.WHITE){
			greenSideTileIsWhite = true;
		}
		
		if(redSideTileIsWhite && blueSideTileIsWhite && orangeSideTileIsWhite && greenSideTileIsWhite){
			return;
		}
		
		Side blue = cube.getBlue();
		Side green = cube.getGreen();
		Side red = cube.getRed();
		Side orange = cube.getOrange();
		Side white = cube.getWhite();
		
		while (!(redSideTileIsWhite && blueSideTileIsWhite
				&& orangeSideTileIsWhite && greenSideTileIsWhite)) {
			
			moveBluesWhiteTilesToYellow(yellow, blue, red, orange);
			
			moveGreensWhiteTilesToYellow(yellow, blue, green, red, orange);
			
			moveRedsWhiteTilesToYellow(yellow, blue, green, red);
			
			moveOrangesWhiteTilesToYellow(yellow, blue, green, orange);
			
			moveWhitesWhiteTilesToYellow(yellow, blue, green, red, orange, white);
			
			if(yellow.getColors()[1] == Color.WHITE){
				blueSideTileIsWhite = true;
			} else {
				blueSideTileIsWhite = false;
			}
				
			if(yellow.getColors()[3] == Color.WHITE){
				redSideTileIsWhite = true;
			} else {
				redSideTileIsWhite = false;
			}
					
			if(yellow.getColors()[5] == Color.WHITE){
				orangeSideTileIsWhite = true;
			} else {
				orangeSideTileIsWhite = false;
			}
				 
			if(yellow.getColors()[7] == Color.WHITE){
				greenSideTileIsWhite = true;
			} else {
				greenSideTileIsWhite = false;
			}
			
		}
		
		System.out.println("By now you should have white cross on yellow side.");
		
	}

	private void moveWhitesWhiteTilesToYellow(Side yellow, Side blue,
			Side green, Side red, Side orange, Side white) {
		//System.out.println("In moveWhitesWhiteTilesToYellow "  + cube.toString());
		while (white.getColors()[3] == Color.WHITE) {
			if(yellow.getColors()[3] == Color.WHITE){
				yellow.rotateClockwise();
			} else {
				blue.rotateClockwise();
				blue.rotateClockwise();
			}
		}
		
		while (white.getColors()[5] == Color.WHITE) {
			if(yellow.getColors()[5] == Color.WHITE){
				yellow.rotateClockwise();
			} else {
				green.rotateClockwise();
				green.rotateClockwise();
			}
		}
		
		while (white.getColors()[1] == Color.WHITE) {
			if(yellow.getColors()[7] == Color.WHITE){
				yellow.rotateClockwise();
			} else {
				red.rotateClockwise();
				red.rotateClockwise();
			}
		}
		
		while (white.getColors()[7] == Color.WHITE) {
			if(yellow.getColors()[1] == Color.WHITE){
				yellow.rotateClockwise();
			} else {
				orange.rotateClockwise();
				orange.rotateClockwise();
			}
		}
	}

	private void moveOrangesWhiteTilesToYellow(Side yellow, Side blue,
			Side green, Side orange) {
		//System.out.println("In moveOrangesWhiteTilesToYellow "  + cube.toString());
		moveOrangesThirdPlacedWhiteTileOnYellowSide(yellow, green, orange);
		
		moveOrangesFifthPlacedWhiteTileOnYellowSide(yellow, blue, orange);
		
		while (orange.getColors()[7] == Color.WHITE) {
			if(yellow.getColors()[1] == Color.WHITE){
				yellow.rotateClockwise();
			} else {
				orange.rotateAntiClockwise();
				moveOrangesFifthPlacedWhiteTileOnYellowSide(yellow, blue, orange);
			}
		}

		while (orange.getColors()[1] == Color.WHITE) {
			orange.rotateAntiClockwise();
			moveOrangesThirdPlacedWhiteTileOnYellowSide(yellow, green, orange);
		}
	}

	private void moveRedsWhiteTilesToYellow(Side yellow, Side blue, Side green,
			Side red) {
		//System.out.println("In moveRedsWhiteTilesToYellow "  + cube.toString());
		moveRedsThirdPlacedWhiteTileOnYellowSide(yellow, blue, red);
		
		moveRedsFifthPlacedWhiteTileOnYellowSide(yellow, green, red);
		
		while (red.getColors()[7] == Color.WHITE) {
			if(yellow.getColors()[7] == Color.WHITE){
				yellow.rotateClockwise();
			} else {
				red.rotateClockwise();
				moveRedsThirdPlacedWhiteTileOnYellowSide(yellow, blue, red);
			}
		}

		while (red.getColors()[1] == Color.WHITE) {
			red.rotateClockwise();
			moveRedsFifthPlacedWhiteTileOnYellowSide(yellow, green, red);
		}
	}

	private void moveGreensWhiteTilesToYellow(Side yellow, Side blue,
			Side green, Side red, Side orange) {
		//System.out.println("In moveGreensWhiteTilesToYellow "  + cube.toString());
		moveGreensThirdPlacedWhiteTileOnYellowSide(yellow, green, red);

		moveGreensFifthPlacedWhiteTileOnYellowSide(yellow, green, orange);
		
		while (green.getColors()[7] == Color.WHITE) {
			if(yellow.getColors()[5] == Color.WHITE){
				yellow.rotateClockwise();
			} else {
				green.rotateClockwise();
				moveGreensThirdPlacedWhiteTileOnYellowSide(yellow, green, red);
			}
		}

		while (green.getColors()[1] == Color.WHITE) {
			green.rotateClockwise();
			moveGreensFifthPlacedWhiteTileOnYellowSide(yellow, green, orange);
		}
	}

	private void moveBluesWhiteTilesToYellow(Side yellow, Side blue, Side red,
			Side orange) {
		//System.out.println("In moveBluesWhiteTilesToYellow. Cube: " + cube.toString());
		moveBluesThirdPlacedWhiteTileOnYellowSide(yellow, blue, orange);

		moveBluesFifthPlacedWhiteTileOnYellowSide(yellow, blue, red);
		
		while (blue.getColors()[7] == Color.WHITE) {
			if(yellow.getColors()[3] == Color.WHITE){
				yellow.rotateClockwise();
			} else {
				blue.rotateAntiClockwise();
				moveBluesFifthPlacedWhiteTileOnYellowSide(yellow, blue, red);
			}
		}

		while (blue.getColors()[1] == Color.WHITE) {
			blue.rotateAntiClockwise();
			moveBluesThirdPlacedWhiteTileOnYellowSide(yellow, blue, orange);
		}
	}

	private void moveOrangesFifthPlacedWhiteTileOnYellowSide(Side yellow,
			Side blue, Side orange) {
		while (orange.getColors()[5] == Color.WHITE) {
			if(yellow.getColors()[3] == Color.WHITE){
				yellow.rotateClockwise();
			} else {
				blue.rotateClockwise();
			}
		}
	}

	private void moveOrangesThirdPlacedWhiteTileOnYellowSide(Side yellow,
			Side green, Side orange) {
		while (orange.getColors()[3] == Color.WHITE) {
			if(yellow.getColors()[5] == Color.WHITE){
				yellow.rotateClockwise();
			} else {
				green.rotateAntiClockwise();
			}
		}
	}

	private void moveRedsFifthPlacedWhiteTileOnYellowSide(Side yellow,
			Side green, Side red) {
		while (red.getColors()[5] == Color.WHITE) {
			if(yellow.getColors()[5] == Color.WHITE){
				yellow.rotateClockwise();
			} else {
				green.rotateClockwise();
			}
		}
	}

	private void moveRedsThirdPlacedWhiteTileOnYellowSide(Side yellow,
			Side blue, Side red) {
		while (red.getColors()[3] == Color.WHITE) {
			if(yellow.getColors()[3] == Color.WHITE){
				yellow.rotateClockwise();
			} else {
				blue.rotateAntiClockwise();
			}
		}
	}

	private void moveGreensFifthPlacedWhiteTileOnYellowSide(Side yellow,
			Side green, Side orange) {
		while (green.getColors()[5] == Color.WHITE) {
			if(yellow.getColors()[1] == Color.WHITE){
				yellow.rotateClockwise();
			} else {
				orange.rotateClockwise();
			}
		}
	}

	private void moveGreensThirdPlacedWhiteTileOnYellowSide(Side yellow,
			Side green, Side red) {
		while (green.getColors()[3] == Color.WHITE) {
			if(yellow.getColors()[7] == Color.WHITE){
				yellow.rotateClockwise();
			} else {
				red.rotateAntiClockwise();
			}
		}
	}

	private void moveBluesFifthPlacedWhiteTileOnYellowSide(Side yellow, Side blue,
			Side red) {
		while (blue.getColors()[5] == Color.WHITE) {
			if(yellow.getColors()[7] == Color.WHITE){
				yellow.rotateClockwise();
			} else {
				red.rotateClockwise();
			}
		}
	}

	private void moveBluesThirdPlacedWhiteTileOnYellowSide(Side yellow, Side blue,
			Side orange) {
		
		while (blue.getColors()[3] == Color.WHITE) {
			if(yellow.getColors()[1] == Color.WHITE){
				yellow.rotateClockwise();
			} else {
				orange.rotateAntiClockwise();
			}
		}
	}

	

	@Override
	public boolean whiteCrossOnWhiteSide() {
		// TODO Auto-generated method stub
		return false;
	}

	

	

}
