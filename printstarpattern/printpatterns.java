package printstarpattern;

public class printpatterns {

    public static void hollow_rectangle(int totRows, int totCols) {
        for (int i = 1; i <= totRows; i++)// ouer rows
        {
            for (int j = 1; j <= totCols; j++) {
                if (i == 1 || i == totRows || j == 1 || j == totCols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void invertedrotatedhalfpyr(int rows, int columns) {
        for (int r = 1; r <= rows; r++) {
            for (int c = 1; c <= columns; c++) {
                if ((r + c) <= 4) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void invertedrotatedhalfpyralpha(int rows) {
        for (int r = 1; r <= rows; r++)// lines
        {

            for (int spaces = 1; spaces <= rows - r; spaces++) {
                System.out.print(" ");
            }
            for (int stars = 1; stars <= r; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void invertedhalfpyralnumberspha(int rows) {
        for (int r = 1; r <= rows; r++)// lines
        {

            for (int n = 1; n <= rows - r + 1; n++) {
                System.out.print(n + " ");
            }

            System.out.println();
        }

    }

    public static void flyodstriangle(int n) {
        int count = 1;
        for (int a = 1; a <= n; a++) {
            for (int s = 1; s <= a; s++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }

    public static void triangle01(int n) {
        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= r; c++) {
                if ((r + c) % 2 == 0) {
                    System.out.print("1" + " ");
                } else {
                    System.out.print("0" + " ");
                }
            }
            System.out.println();
        }
    }

    public static void butterfly(int n) {
        for (int i = 1; i <= n; i++) {
            for (int a = 1; a <= i; a++) {
                System.out.print("*");
            }
            for (int s = 1; s <= 2 * (n - i); s++) {
                System.out.print(" ");
            }

            for (int a = 1; a <= i; a++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int a = 1; a <= i; a++) {
                System.out.print("*");
            }
            for (int s = 1; s <= 2 * (n - i); s++) {
                System.out.print(" ");
            }

            for (int a = 1; a <= i; a++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void solidrhombus(int n) {
        for (int i = 1; i <= n; i++) {
            for (int sp = 1; sp <= n - i; sp++) {
                System.out.print(" ");
            }

            for (int st = 1; st <= n; st++) {
                System.out.print("*");
            }
            System.out.println();

        }}
        public static void hollowrhombus (int n)
        {
            for(int i=1;i<=n;i++)
            {
                for(int sp=1;sp<=n-i;sp++)//spaces
                {
                    System.out.print(" ");
                }
                for(int st=1;st<=n;st++)
                {
                    if(i==1||i==n||st==1||st==n)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
                
                System.out.println();
            }

        }
        public static void diamond(int n)
        {
            for(int i=1;i<=n;i++)
            {
                for(int sp=1;sp<=n-i;sp++)
                {
                    System.out.print(" ");
                }
                for(int st=1;st<=(2*i)-1;st++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int i=n;i>=1;i--)
            {
                for(int sp=1;sp<=n-i;sp++)
                {
                    System.out.print(" ");
                }
                for(int st=1;st<=(2*i)-1;st++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    

    public static void main(String args[]) {
        // hollow_rectangle(4, 5);
        //invertedrotatedhalfpyr(4, 4);
        // invertedrotatedhalfpyralpha(4);
        // invertedhalfpyralnumberspha(5);
        // flyodstriangle(5);
        // triangle01(5);
        //butterfly(5);
        //solidrhombus(5);
       // hollowrhombus(5);
       // diamond(4);
    }

}
