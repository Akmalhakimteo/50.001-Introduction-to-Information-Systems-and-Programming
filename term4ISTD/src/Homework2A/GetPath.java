package Homework2A;

import java.util.ArrayList;


public class GetPath { 
	
	
	
	
	
    public static boolean getPath (int row, int column, ArrayList<Point> path, final int [][] grid) {
    	if(row<0||column<0||grid[row][column]==1) {
    		return false; //only go when '0'
    	}
    	if((row==0&&column==0)||getPath(row-1,column,path,grid)||getPath(row,column-1,path,grid)){
    		Point newpoint = new Point(row,column); //must instantiate
    		path.add(newpoint);
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

	
    
    