
public class addpattern {

    // HOLLOW RECTANHLE
    public static void hollowrect(int rows, int colns) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= colns; j++) {
                if (i == 1 || i == rows || j == 1 || j == colns) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("hollow rectangle");
        hollowrect(7, 8);

        /// INVERTED AND ROATED PYRAMID
        System.out.println("inverted and Roated Pyramid");

        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /// half pyramid on number

        int m = 5;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= (m - i + 1); j++) {
                System.out.print(j);

            }
            System.out.println();
        }

        /// FLOYID TRIANGLE
        int counter = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                counter++;
            }
            System.out.println();
        }
        /// 0 AND 1 TRAINGLE
        System.out.println("1,0 tringle");

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }

        /// BUTTERFLY PATTERN

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /// SOLID ROHUMBUS
        System.out.println("solid rohumbus");
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= (m - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /// HOLLOW ROHAMBUS
        System.out.println("hollow rohumbus");

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= (m - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= m; j++) {
                if (i == 1 || i == 5 || j == 1 || j == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        /// DIAMOND PATTERN

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /// NUMBER PYRAMID
        System.out.println("number piramid");
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= m - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + i);
            }
            System.out.println();
        }

        /// PALIMDROME NUMBER
        System.out.println("palimdrome number");
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= m - i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
