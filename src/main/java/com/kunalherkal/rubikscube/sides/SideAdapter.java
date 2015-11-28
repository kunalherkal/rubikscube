package com.kunalherkal.rubikscube.sides;

import java.util.Arrays;

import com.kunalherkal.rubikscube.colors.Color;

public abstract class SideAdapter implements Side {
	Color[] colors = new Color[9]; 

	public void setTileColor(int index, Color color){
		if(index != 4)
			colors[index] = color;
	}

	@Override
	public String toString() {
		return "SideAdapter [colors=" + Arrays.toString(colors) + "]";
	}

}
