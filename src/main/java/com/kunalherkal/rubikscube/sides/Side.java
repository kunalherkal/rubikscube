package com.kunalherkal.rubikscube.sides;

import com.kunalherkal.rubikscube.colors.Color;
import com.kunalherkal.rubikscube.cube.Cube;

public interface Side {

	void setTileColor(int index, Color color);

	void rotateClockwise();

	void rotateAntiClockwise();
	
	public Color[] getColors();
	
	public Cube getCube();

	public void setCube(Cube cube);

}
