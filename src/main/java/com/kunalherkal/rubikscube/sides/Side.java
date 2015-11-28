package com.kunalherkal.rubikscube.sides;

import com.kunalherkal.rubikscube.colors.Color;

public interface Side {

	void setTileColor(int index, Color color);

	void rotateClockwise();

	void rotateAntiClockwise();

}
