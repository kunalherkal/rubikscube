package com.kunalherkal.rubikscube.sides;

import com.google.inject.Inject;
import com.kunalherkal.rubikscube.colors.Color;

public final class White extends SideAdapter {
	
	@Inject
	public White(){
		for (int i = 0; i < colors.length; i++) {
			colors[i] = Color.WHITE;
		}
	}

	public void rotateClockwise() {
		// TODO Auto-generated method stub
		

	}

	public void rotateAntiClockwise() {
		// TODO Auto-generated method stub

	}

}
