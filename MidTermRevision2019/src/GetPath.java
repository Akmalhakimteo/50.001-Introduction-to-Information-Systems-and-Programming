import java.util.ArrayList;

public class GetPath { 
    
    //Fill in your answer for this method 
    public static boolean getPath (int row, int column, ArrayList<Point> path, final int [][] grid) {
    	if(row==0||column==0||grid[row][column]==1) {
    		return false;
    	}
    	else if((row==0&&column==0)||getPath(row-1, column, path, grid)||getPath(row, column-1, path, grid)) {
    		Point newp = new Point(row,column);
    		path.add(newp);
    		return true;
    		
    	}
    	return false;


    }
}

//You do not need to change any code below. 
class Point {
    int x;
    int y;

    Point (int x, int y) {
        this.x=x;
        this.y=y;
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }
}

