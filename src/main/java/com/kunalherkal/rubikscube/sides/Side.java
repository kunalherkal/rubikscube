package com.kunalherkal.rubikscube.sides;

import com.kunalherkal.rubikscube.colors.Color;
import com.kunalherkal.rubikscube.cube.Cube;

public interface Side {

	void setTileColor(int index, Color color);

	void rotateClockwise(Cube cube);

	void rotateAntiClockwise(Cube cube);
	
	public Color[] getColors();

}
