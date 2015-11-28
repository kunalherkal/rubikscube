package com.kunalherkal.rubikscube.sides;

import com.kunalherkal.rubikscube.colors.Color;

public interface Side {

	void setTileColor(int index, Color color);

	void rotateClockwise();

	void rotateAntiClockwise();

	public Side getLeft();

	public void setLeft(Side left);

	public Side getRight();

	public void setRight(Side right);

	public Side getUp();

	public void setUp(Side up);

	public Side getDown();

	public void setDown(Side down);

	public Side getOpposite();

	public void setOpposite(Side opposite);

}
