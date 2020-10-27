import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MazeList {
	
	public ArrayList<Maze> mazes=new ArrayList<Maze>();
	
	/*
	 * this one i use it just because i will create the mazes in the main
	 */
	/*
	public MazeList(ArrayList<Maze> mazes ) {
		this.mazes = mazes;
	}
	*/
	public void solveMazes() {
		readFileMazes();
		for(Maze m : mazes) {
			if(m.solveMaze()) {
				m.getRightPath();
				System.out.println("You found the treasure.");
			}else {
				System.out.println("No path.");
			}
			System.out.println("-".repeat(49));
		}
	}
	
	public void readFileMazes() {
		
		Maze m=null;
		try {
	      File file = new File("mazes.txt");
	      Scanner scanner = new Scanner(file);
	      while (scanner.hasNextLine()) {
	        int rows = Integer.parseInt(scanner.nextLine());
	    	int[][] maze=new int[rows][];
	        for(int i=0;i<rows;i++) {
	        	String line = scanner.nextLine();
	        	maze[i] = Arrays.stream(line.split(",")).mapToInt(Integer::parseInt).toArray();
	        }
	        int x = Integer.parseInt(scanner.nextLine());
	        int y = Integer.parseInt(scanner.nextLine());
	        Position start = new Position(x,y);
	        m=new Maze(maze,start);
	        mazes.add(m);
	        scanner.nextLine();
	      }
	      scanner.close();
	    } catch (FileNotFoundException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	}
}
