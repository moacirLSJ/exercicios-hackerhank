import java.util.*;

public class RoutePlanner {

    public static boolean routeExists(int fromRow, int fromColumn, int toRow, int toColumn,
                                      boolean[][] mapMatrix) {


        return true;
    }

    public static void main(String[] args) {
        boolean[][] mapMatrix = {
                {true,  false, false},
                {true,  true,  false},
                {false, true,  true}
        };
        System.out.println(routeExists(0, 0, 2, 2, mapMatrix));

//        boolean[][] mapMatrix = {
//                {true,  false, false},
//                {true,  false,  true},
//                {false, false,  true}
//        };
//        System.out.println(routeExists(0, 0, 2, 2, mapMatrix));

    }
}