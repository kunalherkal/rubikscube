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
		// TODO Auto-generated method stub
		
	}

	public void rotateAntiClockwise() {
		// TODO Auto-generated method stub
		
	}

}
