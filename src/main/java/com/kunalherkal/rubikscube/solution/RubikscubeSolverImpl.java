package com.kunalherkal.rubikscube.solution;

import com.google.inject.Inject;
import com.kunalherkal.rubikscube.cube.Cube;

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
		if(whiteCrossOnYellowSide()){
			
		} else {
			solveWhiteCrosssOnYellowSide();
		}
		
	}

	private void solveWhiteCrosssOnYellowSide() {
		// TODO Auto-generated method stub
		
	}

	private boolean whiteCrossOnYellowSide() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean whiteCrossOnWhiteSide() {
		// TODO Auto-generated method stub
		return false;
	}

	

	

}
