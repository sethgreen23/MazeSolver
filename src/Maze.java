import java.util.LinkedList;

public class Maze {
	public int[][] maze;
	public LinkedList<Position> path= new LinkedList<Position>();
	public Position start;
	private LinkedList<String> rightPath=new LinkedList<String>();
	public Maze(int[][] maze,Position start) {
		this.maze = maze;
		this.start = start;
		//push the start position from where you will start searching your treasure
		path.push(this.start);
	}
	
	//show maze
	public void showMaze() {
		for(int i=0;i<maze.length;i++) {
			for(int j=0;j<maze[i].length;j++) {
				System.out.print(maze[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	//check boundaries
	public boolean checkBoundaries(int x,int y) {
		if(x<0 || y<0 || x>=maze.length || y>=maze[x].length)
			return false;
		
		return true;
	}
	
	//solve maze
	
	public boolean solveMaze() {
		while(true) {
			int x = path.peek().x;
			int y = path.peek().y;
			//System.out.println(y+" "+x+"  "+maze[x][y]);
			
			maze[x][y]=0;
			//start searching for a track in all directions
			//up
			if(checkBoundaries(x-1,y)) {
				if(maze[x-1][y]==1) {
					//System.out.println("Move up");
					rightPath.push("Move up");
					path.push(new Position(x-1,y));
					continue;
				}else if(maze[x-1][y]==2) {
					rightPath.push("Moved up.");
					return true;
				}
			}
			//left
			if(checkBoundaries(x,y-1)) {
				if(maze[x][y-1]==1) {
					//System.out.println("Move left");
					rightPath.push("Move left");
					path.push(new Position(x,y-1));
					continue;
				}else if(maze[x][y-1]==2) {
					rightPath.push("Moved left.");
					return true;
				}
			}
			//down
			if(checkBoundaries(x+1,y)) {
				if(maze[x+1][y]==1) {
					//System.out.println("Move down");
					rightPath.push("Move down");
					path.push(new Position(x+1,y));
					continue;
				}else if(maze[x+1][y]==2) {
					rightPath.push("Moved down.");
					return true;
				}
			}
			//right
			if(checkBoundaries(x,y+1)) {
				if(maze[x][y+1]==1) {
					//System.out.println("Move right");
					rightPath.push("Move right");
					path.push(new Position(x,y+1));
					continue;
				}else if(maze[x][y+1]==2) {
					rightPath.push("Moved right.");
					return true;
				}
			}
			//if in all the direction we found a wall then we go back to the previous direction to search for a path
			path.pop();
			//System.out.println("Go back.");
			if(rightPath.size()>0)
				rightPath.pop();
			if(path.size()<=0) {
				return false;
			}
		}
	}

	
	public void getRightPath() {
		while(rightPath.size()>0) {
			if(rightPath.size()==1) {
				System.out.print(rightPath.pollLast());
			}else {
				System.out.println(rightPath.pollLast());
			}
			
		}
	}
}

















