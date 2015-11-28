package com.kunalherkal.rubikscube.sides;

import com.kunalherkal.rubikscube.colors.Color;

public abstract class SideAdapter implements Side {
	Color[] colors = new Color[9]; 

	public void setTileColor(int index, Color color){
		if(index != 4)
			colors[index] = color;
	}

}
