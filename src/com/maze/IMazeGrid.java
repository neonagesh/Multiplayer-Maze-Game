package com.maze;

import com.MoveDirection;

public interface IMazeGrid {
	
	/**
	 * Gets the X dimension of this IMazeGrid
	 * @return int
	 */
	public int getSizeX();
	
	/**
	 * Gets the Y dimension of this IMazeGrid
	 * @return int
	 */
	public int getSizeY();
	
	/**
	 * Gets the maze cell at a particular point on the grid.
	 * The parameters will be restricted to a value between 0 and the respective dimension's size.
	 * @param x int The x position to get the cell at.
	 * @param y int The y position to get the cell at.
	 * @return IMazeCell The cell.
	 */
	public IMazeCell getMazeCell(int x, int y) throws IllegalArgumentException;
	
	/**
	 * Gets the maze cell representing the start of the maze.
	 * @return IMazeCell
	 */
	public IMazeCell getStartCell();
	
	/**
	 * Gets the maze cell representing the end of the maze.
	 * @return IMazeCell
	 */
	public IMazeCell getEndCell();
	
	public MoveDirection getEndDirection();
	
	public MoveDirection getStartDirection();
}
