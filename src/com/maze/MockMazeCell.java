package com.maze;

import wlv.mazegenerator.Cell;

import com.MoveDirection;

/**
 * Mocks the implementation of MazeCell implementing IMazeCell for testing purposes only.
 * @author Samuel Giles
 *
 */
public class MockMazeCell implements IMazeCell {

	private MazeCell mazeCell;
	
	public MockMazeCell(boolean north, boolean east, boolean south, boolean west) {
		mazeCell = new MazeCell(new Cell(north, south, east, west, 0));
	}
	
	@Override
	public boolean isWall(MoveDirection direction) {
		return mazeCell.isWall(direction);
	}

}
