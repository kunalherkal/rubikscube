package com.kunalherkal.rubikscube.sides;

import com.google.inject.Inject;
import com.kunalherkal.rubikscube.colors.Color;

public final class Red extends SideAdapter {
	
	@Inject
	public Red(){
		for (int i = 0; i < colors.length; i++) {
			colors[i] = Color.RED;
		}
	}

	public void rotateClockwise() {
		// TODO Auto-generated method stub

	}

	public void rotateAntiClockwise() {
		// TODO Auto-generated method stub

	}

}
