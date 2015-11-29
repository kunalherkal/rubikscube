package com.kunalherkal.rubikscube;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import com.kunalherkal.rubikscube.cube.Cube;
import com.kunalherkal.rubikscube.sides.Blue;
import com.kunalherkal.rubikscube.sides.Green;
import com.kunalherkal.rubikscube.sides.Orange;
import com.kunalherkal.rubikscube.sides.Red;
import com.kunalherkal.rubikscube.sides.White;
import com.kunalherkal.rubikscube.sides.Yellow;
import com.kunalherkal.rubikscube.solution.RubikscubeSolver;
import com.kunalherkal.rubikscube.solution.RubikscubeSolverImpl;


public final class RubikscubeModule extends AbstractModule{

	@Override
	protected void configure() {
		bind(White.class).in(Singleton.class);
		bind(Yellow.class).in(Singleton.class);
		bind(Blue.class).in(Singleton.class);
		bind(Green.class).in(Singleton.class);
		bind(Orange.class).in(Singleton.class);
		bind(Red.class).in(Singleton.class);
		bind(Cube.class).in(Singleton.class);
		bind(RubikscubeSolver.class).to(RubikscubeSolverImpl.class).in(Singleton.class);
	}

}
