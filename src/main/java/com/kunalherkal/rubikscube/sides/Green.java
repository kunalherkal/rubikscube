package com.kunalherkal.rubikscube.sides;

import com.google.inject.Inject;
import com.kunalherkal.rubikscube.colors.Color;

public final class Green extends SideAdapter {
	
	@Inject
	public Green(){
		for (int i = 0; i < colors.length; i++) {
			colors[i] = Color.GREEN;
		}
	}

	public void rotateClockwise() {
		System.out.println("Rotate Green face clockwise");
		super.rotateClockwise();
		
	}

	public void rotateAntiClockwise() {
		System.out.println("Rotate Green face Ant-clockwise");
		super.rotateAntiClockwise();
		
	}

}
