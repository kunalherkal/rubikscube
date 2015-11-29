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

		try {
			solveWhiteCrosssOnYellowSide();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void solveWhiteCrosssOnYellowSide() throws InterruptedException {
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
		
		Side up = yellow.getUp();
		Side down = yellow.getDown();
		Side left = yellow.getLeft();
		Side right = yellow.getRight();
		Side opposite = yellow.getOpposite();
		
		while (!(redSideTileIsWhite && blueSideTileIsWhite
				&& orangeSideTileIsWhite && greenSideTileIsWhite)) {
			
			System.out.println("Starting!");
			
			
			
			//Moves for up side
			moveUpsThirdPlacedWhiteTileOnYellowSide(yellow, up, left);

			moveUpsFifthPlacedWhiteTileOnYellowSide(yellow, up, right);
			
			while (up.getColors()[1] == Color.WHITE) {
				if(yellow.getColors()[1] == Color.WHITE){
					yellow.rotateClockwise();
				} else {
					up.rotateClockwise();
					moveUpsFifthPlacedWhiteTileOnYellowSide(yellow, up, right);
				}
			}

			while (up.getColors()[7] == Color.WHITE) {
				up.rotateClockwise();
				moveUpsThirdPlacedWhiteTileOnYellowSide(yellow, up, left);
			}
			
			System.out.println("Moves for up siade done!");
			
			Thread.sleep(5000);
			
			//Moves for down side
			moveDownsThirdPlacedWhiteTileOnYellowSide(yellow, down, left);

			moveDownsFifthPlacedWhiteTileOnYellowSide(yellow, up, right);
			
			while (up.getColors()[7] == Color.WHITE) {
				if(yellow.getColors()[7] == Color.WHITE){
					yellow.rotateClockwise();
				} else {
					down.rotateClockwise();
					moveDownsThirdPlacedWhiteTileOnYellowSide(yellow, down, left);
				}
			}

			while (down.getColors()[1] == Color.WHITE) {
				down.rotateClockwise();
				moveDownsFifthPlacedWhiteTileOnYellowSide(yellow, up, right);
			}
			
			System.out.println("Moves for down siade done!");
			
			Thread.sleep(5000);
			
			//Moves for down left
			moveLeftsFirstPlacedWhiteTileOnYellowSide(yellow, up, left);
			
			moveLeftsSeventhPlacedWhiteTileOnYellowSide(yellow, down, left);
			
			while (left.getColors()[3] == Color.WHITE) {
				if(yellow.getColors()[3] == Color.WHITE){
					yellow.rotateClockwise();
				} else {
					left.rotateClockwise();
					moveLeftsFirstPlacedWhiteTileOnYellowSide(yellow, up, left);
				}
			}

			while (left.getColors()[5] == Color.WHITE) {
				left.rotateClockwise();
				moveLeftsSeventhPlacedWhiteTileOnYellowSide(yellow, down, left);
			}
			
			System.out.println("Moves for left siade done!");
			
			Thread.sleep(5000);
			
			//Moves for right
			moveRightsFirstPlacedWhiteTileOnYellowSide(yellow, up, right);
			
			moveRightsSeventhPlacedWhiteTileOnYellowSide(yellow, down, left);
			
			while (right.getColors()[5] == Color.WHITE) {
				if(yellow.getColors()[5] == Color.WHITE){
					yellow.rotateClockwise();
				} else {
					right.rotateClockwise();
					moveRightsSeventhPlacedWhiteTileOnYellowSide(yellow, down, left);
				}
			}

			while (right.getColors()[3] == Color.WHITE) {
				right.rotateClockwise();
				moveRightsFirstPlacedWhiteTileOnYellowSide(yellow, up, right);
			}
			
			System.out.println("Moves for right siade done!");
			
			Thread.sleep(5000);
			
			//Moves for opposite
			while (opposite.getColors()[1] == Color.WHITE) {
				if(yellow.getColors()[7] == Color.WHITE){
					yellow.rotateClockwise();
				} else {
					down.rotateClockwise();
					down.rotateClockwise();
				}
			}
			
			while (opposite.getColors()[7] == Color.WHITE) {
				if(yellow.getColors()[1] == Color.WHITE){
					yellow.rotateClockwise();
				} else {
					up.rotateClockwise();
					up.rotateClockwise();
				}
			}
			
			while (opposite.getColors()[3] == Color.WHITE) {
				if(yellow.getColors()[3] == Color.WHITE){
					yellow.rotateClockwise();
				} else {
					left.rotateClockwise();
					left.rotateClockwise();
				}
			}
			
			while (opposite.getColors()[5] == Color.WHITE) {
				if(yellow.getColors()[5] == Color.WHITE){
					yellow.rotateClockwise();
				} else {
					right.rotateClockwise();
					right.rotateClockwise();
				}
			}
			
		}
		
		System.out.println("By now you should have white cross on yellow side.");
		
	}

	private void moveRightsSeventhPlacedWhiteTileOnYellowSide(Side yellow,
			Side down, Side left) {
		while (left.getColors()[7] == Color.WHITE) {
			if(yellow.getColors()[7] == Color.WHITE){
				yellow.rotateClockwise();
			} else {
				down.rotateAntiClockwise();
			}
		}
	}

	private void moveRightsFirstPlacedWhiteTileOnYellowSide(Side yellow,
			Side up, Side right) {
		while (right.getColors()[1] == Color.WHITE) {
			if(yellow.getColors()[1] == Color.WHITE){
				yellow.rotateClockwise();
			} else {
				up.rotateClockwise();
			}
		}
	}

	private void moveLeftsSeventhPlacedWhiteTileOnYellowSide(Side yellow,
			Side down, Side left) {
		while (left.getColors()[7] == Color.WHITE) {
			if(yellow.getColors()[7] == Color.WHITE){
				yellow.rotateClockwise();
			} else {
				down.rotateClockwise();
			}
		}
	}

	private void moveLeftsFirstPlacedWhiteTileOnYellowSide(Side yellow,
			Side up, Side left) {
		while (left.getColors()[1] == Color.WHITE) {
			if(yellow.getColors()[1] == Color.WHITE){
				yellow.rotateClockwise();
			} else {
				up.rotateAntiClockwise();
			}
		}
	}

	private void moveDownsFifthPlacedWhiteTileOnYellowSide(Side yellow,
			Side up, Side left) {
		while (up.getColors()[5] == Color.WHITE) {
			if(yellow.getColors()[3] == Color.WHITE){
				yellow.rotateClockwise();
			} else {
				left.rotateAntiClockwise();
			}
		}
	}

	private void moveDownsThirdPlacedWhiteTileOnYellowSide(Side yellow,
			Side down, Side right) {
		while (down.getColors()[3] == Color.WHITE) {
			if(yellow.getColors()[5] == Color.WHITE){
				yellow.rotateClockwise();
			} else {
				right.rotateClockwise();
			}
		}
	}

	private void moveUpsFifthPlacedWhiteTileOnYellowSide(Side yellow, Side up,
			Side left) {
		while (up.getColors()[5] == Color.WHITE) {
			if(yellow.getColors()[3] == Color.WHITE){
				yellow.rotateClockwise();
			} else {
				left.rotateClockwise();
			}
		}
	}

	private void moveUpsThirdPlacedWhiteTileOnYellowSide(Side yellow, Side up,
			Side right) {
		
		while (up.getColors()[3] == Color.WHITE) {
			System.out.println("Cube: " + cube.toString());
			if(yellow.getColors()[5] == Color.WHITE){
				yellow.rotateClockwise();
			} else {
				right.rotateAntiClockwise();
			}
		}
	}

	

	@Override
	public boolean whiteCrossOnWhiteSide() {
		// TODO Auto-generated method stub
		return false;
	}

	

	

}
