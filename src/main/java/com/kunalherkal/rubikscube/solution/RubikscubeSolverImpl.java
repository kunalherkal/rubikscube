package com.kunalherkal.rubikscube.solution;

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

	private void solveWhiteCross() {

		
			solveWhiteCrosssOnYellowSide();
		

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
			//Moves for up side
			moveBluesThirdPlacedWhiteTileOnYellowSide(yellow, blue, orange);

			moveBluesFifthPlacedWhiteTileOnYellowSide(yellow, blue, red);
			
			while (blue.getColors()[1] == Color.WHITE) {
				if(yellow.getColors()[1] == Color.WHITE){
					yellow.rotateClockwise();
				} else {
					blue.rotateClockwise();
					moveBluesFifthPlacedWhiteTileOnYellowSide(yellow, blue, red);
				}
			}

			while (blue.getColors()[7] == Color.WHITE) {
				blue.rotateClockwise();
				moveBluesThirdPlacedWhiteTileOnYellowSide(yellow, blue, orange);
			}
			
			//Moves for down side
			moveGreensThirdPlacedWhiteTileOnYellowSide(yellow, green, orange);

			moveGreensFifthPlacedWhiteTileOnYellowSide(yellow, green, red);
			
			while (blue.getColors()[7] == Color.WHITE) {
				if(yellow.getColors()[7] == Color.WHITE){
					yellow.rotateClockwise();
				} else {
					green.rotateClockwise();
					moveGreensThirdPlacedWhiteTileOnYellowSide(yellow, green, orange);
				}
			}

			while (green.getColors()[1] == Color.WHITE) {
				green.rotateClockwise();
				moveGreensFifthPlacedWhiteTileOnYellowSide(yellow, green, red);
			}
			
			
			//Moves for down left
			moveRedsFirstPlacedWhiteTileOnYellowSide(yellow, blue, red);
			
			moveRedsSeventhPlacedWhiteTileOnYellowSide(yellow, green, red);
			
			while (red.getColors()[3] == Color.WHITE) {
				if(yellow.getColors()[3] == Color.WHITE){
					yellow.rotateClockwise();
				} else {
					red.rotateClockwise();
					moveRedsFirstPlacedWhiteTileOnYellowSide(yellow, blue, red);
				}
			}

			while (red.getColors()[5] == Color.WHITE) {
				red.rotateClockwise();
				moveRedsSeventhPlacedWhiteTileOnYellowSide(yellow, green, red);
			}
			
			//Moves for right
			moveOrangesFirstPlacedWhiteTileOnYellowSide(yellow, blue, orange);
			
			moveOrangesSeventhPlacedWhiteTileOnYellowSide(yellow, green, orange);
			
			while (orange.getColors()[5] == Color.WHITE) {
				if(yellow.getColors()[5] == Color.WHITE){
					yellow.rotateClockwise();
				} else {
					orange.rotateClockwise();
					moveOrangesSeventhPlacedWhiteTileOnYellowSide(yellow, green, orange);
				}
			}

			while (orange.getColors()[3] == Color.WHITE) {
				orange.rotateClockwise();
				moveOrangesFirstPlacedWhiteTileOnYellowSide(yellow, blue, orange);
			}
			
			//Moves for opposite
			while (white.getColors()[7] == Color.WHITE) {
				if(yellow.getColors()[7] == Color.WHITE){
					yellow.rotateClockwise();
				} else {
					green.rotateClockwise();
					green.rotateClockwise();
				}
			}
			
			while (white.getColors()[1] == Color.WHITE) {
				if(yellow.getColors()[1] == Color.WHITE){
					yellow.rotateClockwise();
				} else {
					blue.rotateClockwise();
					blue.rotateClockwise();
				}
			}
			
			while (white.getColors()[3] == Color.WHITE) {
				if(yellow.getColors()[5] == Color.WHITE){
					yellow.rotateClockwise();
				} else {
					orange.rotateClockwise();
					orange.rotateClockwise();
				}
			}
			
			while (white.getColors()[5] == Color.WHITE) {
				if(yellow.getColors()[3] == Color.WHITE){
					yellow.rotateClockwise();
				} else {
					red.rotateClockwise();
					red.rotateClockwise();
				}
			}
			
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

	private void moveOrangesSeventhPlacedWhiteTileOnYellowSide(Side yellow,
			Side green, Side orange) {
		while (orange.getColors()[7] == Color.WHITE) {
			if(yellow.getColors()[7] == Color.WHITE){
				yellow.rotateClockwise();
			} else {
				green.rotateAntiClockwise();
			}
		}
	}

	private void moveOrangesFirstPlacedWhiteTileOnYellowSide(Side yellow,
			Side blue, Side orange) {
		while (orange.getColors()[1] == Color.WHITE) {
			if(yellow.getColors()[1] == Color.WHITE){
				yellow.rotateClockwise();
			} else {
				blue.rotateClockwise();
			}
		}
	}

	private void moveRedsSeventhPlacedWhiteTileOnYellowSide(Side yellow,
			Side green, Side red) {
		while (red.getColors()[7] == Color.WHITE) {
			if(yellow.getColors()[7] == Color.WHITE){
				yellow.rotateClockwise();
			} else {
				green.rotateClockwise();
			}
		}
	}

	private void moveRedsFirstPlacedWhiteTileOnYellowSide(Side yellow,
			Side blue, Side red) {
		while (red.getColors()[1] == Color.WHITE) {
			if(yellow.getColors()[1] == Color.WHITE){
				yellow.rotateClockwise();
			} else {
				blue.rotateAntiClockwise();
			}
		}
	}

	private void moveGreensFifthPlacedWhiteTileOnYellowSide(Side yellow,
			Side green, Side red) {
		while (green.getColors()[5] == Color.WHITE) {
			if(yellow.getColors()[3] == Color.WHITE){
				yellow.rotateClockwise();
			} else {
				red.rotateAntiClockwise();
			}
		}
	}

	private void moveGreensThirdPlacedWhiteTileOnYellowSide(Side yellow,
			Side green, Side orange) {
		while (green.getColors()[3] == Color.WHITE) {
			if(yellow.getColors()[5] == Color.WHITE){
				yellow.rotateClockwise();
			} else {
				orange.rotateClockwise();
			}
		}
	}

	private void moveBluesFifthPlacedWhiteTileOnYellowSide(Side yellow, Side blue,
			Side red) {
		while (blue.getColors()[5] == Color.WHITE) {
			if(yellow.getColors()[3] == Color.WHITE){
				yellow.rotateClockwise();
			} else {
				red.rotateClockwise();
			}
		}
	}

	private void moveBluesThirdPlacedWhiteTileOnYellowSide(Side yellow, Side blue,
			Side orange) {
		
		while (blue.getColors()[3] == Color.WHITE) {
			if(yellow.getColors()[5] == Color.WHITE){
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
