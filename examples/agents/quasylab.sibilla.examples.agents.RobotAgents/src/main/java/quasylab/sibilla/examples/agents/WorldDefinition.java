/*
 * Sibilla:  a Java framework designed to support analysis of Collective
 * Adaptive Systems.
 *
 *             Copyright (C) 2020.
 *
 * See the NOTICE file distributed with this work for additional information
 * regarding copyright ownership.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *            http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 *  or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package quasylab.sibilla.examples.agents;

import org.apache.commons.math3.random.RandomGenerator;
import quasylab.sibilla.core.models.quasylab.sibilla.core.models.agents.World;

import java.util.LinkedList;

public class WorldDefinition implements World {
	
	private final int width;
	private final int height;

	private LinkedList<Obstacle> obstacles;

	public WorldDefinition(int width, int height, LinkedList<Obstacle> obstacles) {
		this.width = width;
		this.height = height;
		this.obstacles = obstacles;
	}
	
	public int getWidth(){
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public LinkedList<Obstacle> getObstacles(){
		return obstacles;
	}
	
	public synchronized void addObstacles(int xpos, int ypos) {
		obstacles.add(new Obstacle(xpos, ypos));
	}
	
	public int numberOfObstacles() {
		return obstacles.size();
	}
	
	public double thereIsAnObstacle (double x, double y) {
//		for (Obstacles o : obstacles) {
//			if ((o.getXPos()==x)&&(o.getYPos()==y)) {
//				return 1.0;
//			}
//		}	
//		return 0.0;
		if ((x<0)||(x>= width)||(y<0)) {
			return 1.0;
		}
		if (this.obstacles.stream().anyMatch(o -> o.isPlacedAt((int) x, (int) y))) {
			return 1.0;	
		} else {
			return 0.0;
		}
	}

	public double goalReached(double x, double y) {
		return (y==height?1.0:0.0);
	}

	public static WorldDefinition generate(RandomGenerator rg, int width, int height, int numberOfObstacles) {
		boolean[][] grid = new boolean[width][height];
		LinkedList<Obstacle> obstacles = new LinkedList<>();
		int count = 0;
		while(count < numberOfObstacles) {
			int x = rg.nextInt(width);
			int y = rg.nextInt(height);
			if (!grid[x][y]) {
				obstacles.add(new Obstacle(x,y));
				grid[x][y] = true;
				count++;
			}
		}
		return new WorldDefinition(width,height,obstacles);
	}
}
