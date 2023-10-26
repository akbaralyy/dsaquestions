import java.util.ArrayList;

public class leet {
    public static void main(String[] args) {
        System.out.println(uniquePaths(3, 7));
    }

        static int uniquePaths(int m, int n) {
            if (m == 1 || n == 1) {

                return 1;
            }


            int pathsDown = uniquePaths(m - 1, n);
            int pathsRight = uniquePaths(m, n - 1);


            return pathsDown + pathsRight;
        }
    }

