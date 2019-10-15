
public class MazeBot {
	
	public char[][] maze;
	public int Goalx;
	public int Goaly;
	
	public MazeBot(char[][] maze, int Goalx, int Goaly) {
		this.maze = maze;
		this.Goalx = Goalx;
		this.Goaly = Goaly;
	}
	
	public boolean FindPath(int y, int x) {
		if (y < 0 || x < 0 || y >= this.maze.length || x >= this.maze[0].length) {
			return false;
		}
		else if (this.maze[y][x] == 'G') {
			System.out.println("Goal was reached at maze[" + y + "]" + "[" + x + "]");
         return true;
		}
		else if (this.maze[y][x] == '#') {
			return false;
		}
		else if (this.maze[y][x] == 'X' || this.maze[y][x] == '+') {
			return false;
		}
		
		this.maze[y][x] = '+';
		
		if (FindPath(y+1, x) == true) {
			System.out.println("South Path found at maze[" + (y+1) + "][" + x + "]");
			return true;
		}
		if (FindPath(y, x-1) == true) {
			System.out.println("West Path found at maze[" + y + "][" + (x-1) + "]");
			return true;
		}
		if (FindPath(y-1, x) == true) {
			System.out.println("North Path found at maze[" + (y-1) + "][" + x + "]");
			return true;
		}
		if (FindPath(y, x+1) == true) {
			System.out.println("East Path found at maze[" + y + "][" + (x+1) + "]" );
			return true;
		}
		
		this.maze[y][x] = 'X';
		System.out.println("Path wasn't found");
		return false;
	}
	
	public static void main(String[] args) {
		//Test 1
		char[][] maze = new char[3][3];
		//Block
		maze[0][1] = '#';
		maze[1][1] = '#';
		//Goal
		maze[0][2] = 'G';
		
		MazeBot nmb = new MazeBot(maze, 0, 2);
		nmb.FindPath(0, 0);
		
		System.out.println("-----------------------------------------");
		
		//Test 2
		char[][] maze2 = new char[6][5];
		//Block
		maze2[0][1] = '#';
		maze2[2][0] = '#';
		maze2[0][2] = '#';
		maze2[2][0] = '#';
		maze2[1][2] = '#';
		maze2[2][2] = '#';
		maze2[3][2] = '#';
		maze2[4][2] = '#';
		maze2[4][1] = '#';
		maze2[4][3] = '#';
		maze2[2][4] = '#';
      maze2[1][4] = '#';

		//Goal
		maze2[0][3] = 'G';
		
		MazeBot nmb2 = new MazeBot(maze2, 0, 3);
		nmb2.FindPath(0, 0);
		
      System.out.println("-----------------------------------------");
      
      
      //Test 3
		char[][] maze3 = new char[20][20];
      //Block
	  maze3[0][1] = '#';
      maze3[0][4] = '#'; 
      maze3[0][6] = '#';
      maze3[0][7] = '#';
      maze3[0][8] = '#';
      maze3[0][9] = '#';
      maze3[0][13] = '#';
      maze3[1][1] = '#';
      maze3[1][2] = '#';
      maze3[1][6] = '#';
      maze3[1][13] = '#';
      maze3[1][11] = '#';
      maze3[1][15] = '#';
      maze3[1][16] = '#';
      maze3[1][17] = '#';
      maze3[1][18] = '#';
      maze3[2][4] = '#';
      maze3[2][6] = '#';
      maze3[2][8] = '#';
      maze3[2][9] = '#';
      maze3[2][10] = '#';
      maze3[2][11] = '#';
      maze3[2][13] = '#';
      maze3[2][15] = '#';
      maze3[2][16] = '#';
      maze3[2][18] = '#';
      maze3[2][19] = '#';
      maze3[3][1] = '#';
      maze3[3][2] = '#';
      maze3[3][4] = '#';
      maze3[3][18] = '#';
      maze3[4][1] = '#';
      maze3[4][4] = '#';
      maze3[4][5] = '#';
      maze3[4][6] = '#';
      maze3[4][7] = '#';
      maze3[4][8] = '#';
      maze3[4][9] = '#';
      maze3[4][10] = '#';
      maze3[4][11] = '#';
      maze3[4][13] = '#';
      maze3[4][14] = '#';
      maze3[4][15] = '#';
      maze3[4][16] = '#';
      maze3[4][18] = '#';
      maze3[4][19] = '#';
      maze3[5][9] = '#';
      maze3[5][16] = '#';
      maze3[5][2] = '#';
      maze3[5][4] = '#';
      maze3[5][18] = '#';
      maze3[6][0] = '#';
      maze3[6][9] = '#';
      maze3[6][11] = '#';
      maze3[6][12] = '#';
      maze3[6][13] = '#';
      maze3[6][15] = '#';
      maze3[6][16] = '#';
      maze3[6][18] = '#';
      maze3[7][0] = '#';
      maze3[7][2] = '#';
      maze3[7][4] = '#';
      maze3[7][5] = '#';
      maze3[7][6] = '#';
      maze3[7][8] = '#';
      maze3[7][9] = '#';
      maze3[7][12] = '#';
      maze3[7][13] = '#';
      maze3[7][16] = '#';
      maze3[7][18] = '#';
      maze3[8][2] = '#';
      maze3[8][9] = '#';
      maze3[8][11] = '#';
      maze3[8][12] = '#';
      maze3[8][13] = '#';
      maze3[8][14] = '#';
      maze3[8][16] = '#';
      maze3[9][1] = '#';
      maze3[9][2] = '#';
      maze3[9][3] = '#';
      maze3[9][5] = '#';
      maze3[9][6] = '#';
      maze3[9][7] = '#';
      maze3[9][9] = '#';
      maze3[9][16] = '#';
      maze3[9][18] = '#';
      maze3[10][7] = '#';
      maze3[10][9] = '#';
      maze3[10][10] = '#';
      maze3[10][11] = '#';
      maze3[10][13] = '#';
      maze3[10][14] = '#';
      maze3[10][16] = '#';
      maze3[10][18] = '#';
      maze3[11][5] = '#';
      maze3[11][6] = '#';
      maze3[11][0] = '#';
      maze3[11][1] = '#';
      maze3[11][3] = '#';
      maze3[11][9] = '#';
      maze3[11][11] = '#';
      maze3[11][13] = '#';
      maze3[11][14] = '#';
      maze3[11][16] = '#';
      maze3[11][18] = '#';
      maze3[12][0] = '#';
      maze3[12][1] = '#';
      maze3[12][3] = '#';
      maze3[12][5] = '#';
      maze3[12][8] = '#';
      maze3[12][9] = '#';
      maze3[12][16] = '#';
      maze3[12][18] = '#';
      maze3[13][3] = '#';
      maze3[13][6] = '#';
      maze3[13][8] = '#';
      maze3[13][9] = '#';
      maze3[13][10] = '#';
      maze3[13][11] = '#';
      maze3[13][12] = '#';
      maze3[13][13] = '#';
      maze3[13][14] = '#';
      maze3[13][15] = '#';
      maze3[13][16] = '#';
      maze3[13][18] = '#';
      maze3[13][19] = '#';
      maze3[14][0] = '#';
      maze3[14][1] = '#';
      maze3[14][2] = '#';
      maze3[14][3] = '#';
      maze3[14][4] = '#';
      maze3[14][6] = '#';
      maze3[14][16] = '#';
      maze3[15][8] = '#';
      maze3[15][9] = '#';
      maze3[15][10] = '#';
      maze3[15][11] = '#';
      maze3[15][12] = '#';
      maze3[15][13] = '#';
      maze3[15][14] = '#';
      maze3[15][15] = '#';
      maze3[15][16] = '#';
      maze3[15][17] = '#';
      maze3[16][1] = '#';
      maze3[16][3] = '#';
      maze3[16][4] = '#';
      maze3[16][6] = '#';
      maze3[16][13] = '#';
      maze3[16][16] = '#';
      maze3[16][17] = '#';
      maze3[16][19] = '#';
      maze3[17][3] = '#';
      maze3[17][4] = '#';
      maze3[17][6] = '#';
      maze3[17][8] = '#';
      maze3[17][9] = '#';
      maze3[17][11] = '#';
      maze3[17][12] = '#';
      maze3[17][13] = '#';
      maze3[17][15] = '#';
      maze3[17][16] = '#';
      maze3[17][17] = '#';
      maze3[18][0] = '#';
      maze3[18][4] = '#';
      maze3[18][15] = '#';
      maze3[18][17] = '#';
      maze3[18][18] = '#';
      maze3[19][3] = '#';
      maze3[19][6] = '#';
      maze3[19][0] = '#';
      maze3[19][2] = '#';
      maze3[19][3] = '#';
      maze3[19][6] = '#';
      maze3[19][8] = '#';
      maze3[19][9] = '#';
      maze3[19][10] = '#';
      maze3[19][11] = '#';
      maze3[19][12] = '#';
      maze3[19][13] = '#';
      maze3[19][17] = '#';
      maze3[19][18] = '#';
	   //Goal
      maze3[19][19] = 'G';
   
      MazeBot nmb3 = new MazeBot(maze3, 19,19);
      nmb3.FindPath(0,0);
   }
	
}
