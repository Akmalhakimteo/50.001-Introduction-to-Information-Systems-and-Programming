package Homework2A;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


class GetPath2 {
    public ArrayList<Point>getPath(final int[][]grid){
        if(grid ==null || grid.length==0)return null;
        ArrayList<Point>path = new ArrayList<>();
        if (getPath(0,0,path,grid)){
            return path;
        }
        return null;
    }

    //Fill in your answer for this method
    public static boolean getPath(int r, int c, ArrayList<Point> path, final int[][] grid) {
        boolean Atorigin=(r==0&&c==0);
        if(c<0||r<0||grid[r][c]==1){
            return false;
        }
        if(Atorigin||getPath(r,c-1,path,grid)||getPath(r-1,c,path,grid)){
            Point p = new Point(r,c);
            path.add(p);
            return true;

        }
        return false;

    }


    //You do not need to change any code below.
    static class Point {
        int x;
        int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public String toString() {
            return "(" + x + "," + y + ")";
        }
    }
//    public static void main(String[] args) {
//
//        final int [][] grid0 = {
//                {0,0,0,0},
//                {0,0,1,0},
//                {0,0,0,1},
//                {0,1,0,0}
//        };
//
//
//        ArrayList<Point> path = new ArrayList<>();
//
//        boolean success = GetPath2.getPath(3,2,path, grid0);
//
//        System.out.println(success);
//        if (success)
//            System.out.println(path);
//        path.clear();
//
//
//        final int [][] grid = {
//                {0,0,0,0},
//                {0,0,1,0},
//                {0,1,0,1},
//                {0,1,0,0}
//        };
//
//        success = GetPath2.getPath(3,2,path, grid);
//
//        System.out.println(success);
//        if (success)
//            System.out.println(path);
//        path.clear();
//
//
//    }

    
}



