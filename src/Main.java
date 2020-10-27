import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//reading from file
		/*
		Maze m0=null;
		try {
	      File myObj = new File("mazes.txt");
	      Scanner myReader = new Scanner(myObj);
	      while (myReader.hasNextLine()) {
	        int rows = Integer.parseInt(myReader.nextLine());
	    	int[][] maze=new int[rows][];
	        for(int i=0;i<rows;i++) {
	        	String line = myReader.nextLine();
	        	maze[i] = Arrays.stream(line.split(",")).mapToInt(Integer::parseInt).toArray();
	        }
	        int x = Integer.parseInt(myReader.nextLine());
	        int y = Integer.parseInt(myReader.nextLine());
	        Position start = new Position(x,y);
	        m0=new Maze(maze,start);
	        myReader.nextLine();
	      }
	      myReader.close();
	    } catch (FileNotFoundException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
		*/
		//end reading from file
		
		
		
		/*
		 * creating mazes and solve them just by putting them 
		 */
		/*
		ArrayList<Maze> mazes = new ArrayList<Maze>();
		//create maze class
		int[][] maze = {
				{1,0,0,0,1},
				{2,0,1,1,1},
				{1,1,1,0,0},
		};
		Position start = new Position(0,4);
		Maze m = new Maze(maze,start);
		//create maze class
		int[][] maze1 = {
				{1,0,0,0,1},
				{2,0,1,0,1},
				{1,1,1,0,1},
		};
		Position start1 = new Position(0,4);
		Maze m1 = new Maze(maze1,start1);
		//create maze class
		int[][] maze2 = {
				{1,0,0,0,1,0,0,1,0},
				{2,0,1,0,1,0,0,1,1},
				{1,1,1,0,1,0,1,0,1},
				{0,0,1,0,0,0,1,1,1},
				{1,0,1,1,1,0,1,0,1},
				{1,1,1,0,1,1,1,0,1},
		};
		Position start2 = new Position(0,7);
		Maze m2 = new Maze(maze2,start2);
		
		//add the mazes to the mazes arrayList
		mazes.add(m0);
		mazes.add(m);
		mazes.add(m1);
		mazes.add(m2);
		//create the maze solver
		MazeList mazeList = new MazeList(mazes);
		//solve the mazes
		mazeList.solveMazes();
		*/
		MazeList mazeList = new MazeList();
		mazeList.solveMazes();
	}

}
