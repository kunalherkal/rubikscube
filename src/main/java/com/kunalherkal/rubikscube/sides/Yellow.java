package com.kunalherkal.rubikscube.sides;

import com.google.inject.Inject;
import com.kunalherkal.rubikscube.colors.Color;

public final class Yellow extends SideAdapter {
	
	@Inject
	public Yellow(){
		
		for (int i = 0; i < colors.length; i++) {
			colors[i] = Color.YELLOW;
		}
	}

	public void rotateClockwise() {
		System.out.println("Rotate Yellow face clockwise");
		super.rotateClockwise();

	}

	public void rotateAntiClockwise() {
		System.out.println("Rotate Yellow face Ant-clockwise");
		super.rotateAntiClockwise();

	}

}
