import java.util.*;
public class pseudocode{
      public static void main(String[] args) {
      Scanner sc=new Scanner (System.in);
    //1.Sum of two number
        int x,y,z;
        x = sc.nextInt();
        y = sc.nextInt();
        z = x + y;
        System.out.println("Sum = " + z);

    //2.To find square and cube of a number
        //   int num;
        //  num=sc.nextInt();
        //   System.out.println(num*num);
        //   System.out.println(num*num*num);

    //3.To find area and perimeter of rectangle
        // double length;
        // double breadth;
        // double area;
        // double perimeter;
        // length = sc.nextDouble();
        // breadth = sc.nextDouble();
        // area = length * breadth;
        // perimeter = 2 * (length + breadth);
        // System.out.println( area);
        // System.out.println(perimeter);

    //4.To find volume of sphere
        // double radius;
        // double volume;
        // double pi=3.14;
        // radius=sc.nextDouble();
        // volume=4/3*pi*radius*radius*radius;
        // System.out.println(volume);

    //5.variable value assign    
        // int x;
        // x=5;
        // x=x+5;
        // System.out.println(x);

    // 6. Divide and remainder
        // int x = sc.nextInt();
        // int y = sc.nextInt();
        // System.out.println(x / y);
        // System.out.println(x % y);
        
    // 7 & 8. Greater than 5
        // int x = sc.nextInt();
        // if (x >= 5)
        //     System.out.println("X >= 5");
        // else
        //     System.out.println("X < 5");

    // 9 Even Odd
        // int n = sc.nextInt();
        // System.out.println(n % 2 == 0 ? "EVEN" : "ODD");
        
    // 10 Positive Negative
        // int n = sc.nextInt();
        // System.out.println(n >= 0 ? "POSITIVE" : "NEGATIVE");

    // 11 Greatest of two
        // int a = sc.nextInt(), b = sc.nextInt();
        // System.out.println(a > b ? "A greater" : "B greater");

    // 12 Compare
        // int a = sc.nextInt(), b = sc.nextInt();
        // if (a > b) System.out.println("A greater");
        // else if (a < b) System.out.println("A smaller");
        // else System.out.println("Equal");

    // 13 Grade
        // int sum = 0;
        // for (int i = 0; i < 5; i++) sum += sc.nextInt();
        // double per = sum / 5.0;
        // if (per >= 90) System.out.println("A+");
        // else if (per >= 80) System.out.println("A");
        // else if (per >= 70) System.out.println("B+");
        // else if (per >= 60) System.out.println("B");
        // else if (per >= 50) System.out.println("C");
        // else if (per >= 40) System.out.println("D");
        // else System.out.println("F");

    // 14 Nested login
        // String uid = sc.next();
        // String pass = sc.next();
        // if (uid.equals("TIT")) {
        //     if (pass.equals("TIT")) System.out.println("WELCOME");
        //     else System.out.println("INVALID PASSWORD");
        // } else System.out.println("INVALID UID");

    // 15 Switch case
        // int v = sc.nextInt();
        // switch (v) {
        // case 1 -> System.out.println("ONE");
        // case 2 -> System.out.println("TWO");
        // case 3 -> System.out.println("THREE");
        // case 4 -> System.out.println("FOUR");
        // case 5 -> System.out.println("FIVE");
        // default -> System.out.println("WRONG");


    // 16.END CASE
        //int A = sc.nextInt();
        //int B = sc.nextInt();
        //int X = sc.nextInt();
        //  switch (X) {
        //    case 1:
        //       System.out.println(A + B);
        //        break;
        //    case 2:
        //       System.out.println(A - B);
        //         break;
        //    case 3:
        //       System.out.println(A * B);
        //         break;
        //    case 4:
        //       if (B != 0)
        //       System.out.println(A / B);
        //         else
        //       System.out.println("Division by zero not allowed");
        //         break;
        //     default:
        //     System.out.println("Invalid value of X");

    // 17 Increment loop
        // int i = 1;
        // do {
        // System.out.println(i);
        //  i++;
        // } while (i <= 10);
        //}

    // 18 Decrement
        // int i = 10;
        // do {
        //     System.out.println(i);
        //     i--;
        // } while (i >= 1);
        //}

    // 19 Do while
        // int i = 1;
        // do {
        //     System.out.println(i);
        //     i++;
        // } while (i <= 10);
        // }

    // 20 While
        // int i = 1;
        // while (i <= 10) {
        //     System.out.println(i);
        //     i++;
        // }
        // }

    // 21 Table
        // int n = sc.nextInt();
        // for (int i = 1; i <= 10; i++)
        //  System.out.println(n * i);
        //  }

    // 22.
        // for (int i = 1; i <= 10; i++) {
        // System.out.println(i);
        //  }  
        //   }
        //  }   

    // 23.
        // for (int i = 10; i >= 1; i--) {
        //     System.out.println(i);
        //   }
        //   }
        //   }

    // 24.
        // int num = sc.nextInt();
        // for (int i = 1; i <= 10; i++) {
        //     System.out.println(num * i);
        // }
        //   }
        //  }
        
    // 25 Sum 1 to N
        // int n = sc.nextInt(), sum = 0;
        // for (int i = 1; i <= n; i++) sum += i;
        // System.out.println(sum);
        //   }

    // 26 Sum squares
        // int n = sc.nextInt(), sum = 0;
        // for (int i = 1; i <= n; i++) sum += i * i;
        // System.out.println(sum);
        //    }

    // 27 Harmonic
        // int n = sc.nextInt();
        // double sum = 0;
        // for (int i = 1; i <= n; i++) sum += 1.0 / i;
        // System.out.println(sum);
        //  }

    // 28.SUM OF SERIES 1+1/4+1/9+...+1/N^2
        // int N = sc.nextInt();
        // double sum = 0.0;
        // for (int i = 1; i <= N; i++) {
        //     sum = sum + 1.0 / (i * i);
        // }
        // System.out.println("Sum = " + sum);
        //   }
        // }

    // 29 Break
        // for (int i = 1; i <= 10; i++) {
        // if (i == 5) break;
        // System.out.println(i);
        //  }
        //   }

    // 30 Even numbers
        // for (int i = 1; i <= 10; i++)
        //  if (i % 2 == 0) System.out.println(i);
        //   }

    // 31 Odd numbers
        // for (int i = 1; i <= 10; i++)
        //     if (i % 2 != 0) System.out.println(i);
        //  }

    // 32 Reverse
        // int n = sc.nextInt(), rev = 0;
        // while (n > 0) {
        //     rev = rev * 10 + n % 10;
        //     n /= 10;
        // }
        // System.out.println(rev);
        //    }

    // 33 Palindrome
        // int n = sc.nextInt(), temp = n, rev = 0;
        // while (n > 0) {
        //     rev = rev * 10 + n % 10;
        //     n /= 10;
        // }
        // System.out.println(rev == temp ? "PALINDROME" : "NOT");
        //    }

    // 34 Armstrong
        // int n = sc.nextInt(), temp = n, sum = 0;
        // while (n > 0) {
        //     int r = n % 10;
        //     sum += r * r * r;
        //     n /= 10;
        // }
        // System.out.println(sum == temp ? "ARMSTRONG" : "NOT");
        //    }

    // 35 Sum digits
        // int n = sc.nextInt(), sum = 0;
        // while (n > 0) {
        //     sum += n % 10;
        //     n /= 10;
        // }
        // System.out.println(sum);
        //   }

    // 36 Count digits
        // int n = sc.nextInt(), count = 0;
        // while (n > 0) {
        //     count++;
        //     n /= 10;
        // }
        // System.out.println(count);
        //   }

    // 37 successful search/unsuccessful search
        // int num = sc.nextInt();  // number
        // int d = sc.nextInt();    // digit to search
        // boolean found = false;
        // while (num > 0) {
        //     int r = num % 10;
        //     if (r == d) {
        //         found = true;
        //         break;
        //     }
        //     num = num / 10;
        // }
        // if (found)
        //     System.out.println("SUCCESSFUL SEARCH");
        // else
        //     System.out.println("UNSUCCESSFUL SEARCH");
        //   }
        // }

    // 38 HOW TO COUNT MANY TIMES DIGITS PRESENT IN A NUM
        // int num = sc.nextInt();  // number
        // int d = sc.nextInt();    // digit to count
        // int count = 0;
        // while (num > 0) {
        //     int r = num % 10;
        //     if (r == d) {
        //         count++;
        //     }
        //     num = num / 10;
        // }
        // System.out.println("Count = " + count);
        //   }
        //  }

    // 39 Fibonacci
        // int n = sc.nextInt();
        // int a = 0, b = 1;
        // System.out.print(a + " " + b + " ");
        // while (b <= n) {
        //     int c = a + b;
        //     System.out.print(c + " ");
        //     a = b;
        //     b = c;
        // }
        //  }

    // 40 Prime
        // int n = sc.nextInt();
        // boolean flag = true;
        // for (int i = 2; i < n; i++)
        //     if (n % i == 0) flag = false;

        // System.out.println(flag ? "PRIME" : "NOT PRIME");
        //  }

    // 41. VALUE LESS THAN    
        // int value = 1, n = 45;
        // while (value <= n) {
        //     value = value << 1;  // multiply by 2
        // }
        // System.out.println(value);
        //   }
        // }

    // 42. DO WHILE LOOP
        // int x = 15, y = 12;
        // y = x - 1;
        // do {
        //     System.out.println(x);
        //     x = y + (x - 2);
        // } while (x < 40);
        //   }
        //  }    

    // 43. MOD 9 LOGIC
        // int x = 259;
        // if (x == 0)
        //     System.out.println("0");
        // else if (x % 9 == 0)
        //     System.out.println("9");
        // else
        //     System.out.println(x % 9);
        //  }
        //    }

    // 44. BITWISE
        // int A = 4, B = 4, C = 4;
        // if ((A & (B ^ B) & C) != 0) {
        //     A = A >> 1;
        // }
        // System.out.println(A + B + C);
        //   }
        //    }

    // 45 / 46 (same logic)
        // int A = 2, B = 5, C = 10;
        // for (C = 3; C <= 6; C++) {
        // A = (A + A) + A;
        // A = (A ^ 11) + C;
        // }
        // B = (9 + 7) + A;
        // System.out.println(A + B);
        //  }
        //    }

    // 47
        // int A = 7, B = 8, C = 9;
        // if ((A ^ B ^ C) < (B + C + A)) {
        //     B = 6 + A;
        // }
        // A = 8 ^ B;
        // System.out.println(A + B + C);
        //  }
        // }

    // 48 
        // int B = 4, C = 5;
        // for (int A = 2; A <= 4; A++) {
        //     System.out.println(C);
        //     B = B - 1;
        //     C = C + B;
        //  }
        //    }
        //  }

    // 49
        // int value = 32, n = 1;
        // while (value >= n) {
        //     value = value >> 1;
        // }
        // System.out.println(value);
        //  }
        //    }

    // 50
        // int x = 4, y = 8;
        // do {
        //     System.out.println(x);
        //     x = x + y + 1;
        // } while (x < 15);
        //   }
        //     }

    // 51 
        // int B = 4, C = 12;
        // int A = C / B;
        // C = B >> A;
        // System.out.println(C);
        //  }
        //    }

    // 52
        // int P = 4, Q = 2, R = 1;
        // int S = (P & Q) | (R + 1);
        // System.out.println(S);
        //  }
        //    }

    // 53
        // int B = 10, C = 11;
        // int A = B - C;
        // for (C = 2; C <= A; C++) {
        //     B = B + C + 10;
        //     B = B / 2;
        // }
        // C = A + B + C;
        // System.out.println(A + " " + B + " " + C);
        //    }
        //  }

    // 54
        // int P = 6, Q = 4, R = 4;
        // R = (R + P) + Q;
        // if ((Q + P) < (10 - Q)) {
        //     R = 12 + Q;
        //     P = R + R;
        //     Q = (Q + 4) + R;
        // }
        // System.out.println(P + Q + R);
        //    }
        //  }

    // 55 (Array Declaration)
        // int[] A = new int[5];
        // double[] B = new double[10];
        //    }
        //  }

    // 56 (Read & Print Array)
        // int[] A = new int[5];
        // for (int i = 0; i < 5; i++) {
        //     A[i] = sc.nextInt();
        // }
        // for (int i = 0; i < 5; i++) {
        //     System.out.println(A[i]);
        // }
        //    }
        //  }
        
    // 57 Array sum
        // int[] arr = new int[5];
        // int sum = 0;
        // for (int i = 0; i < 5; i++) arr[i] = sc.nextInt();
        // for (int x : arr) sum += x;
        // System.out.println(sum);
        //  }

    // 58 Max
        // int[] arr = new int[5];
        // for (int i = 0; i < 5; i++) arr[i] = sc.nextInt();
        // int max = arr[0];
        // for (int x : arr)
        //     if (x > max) max = x;
        // System.out.println(max);
        //    }

    // 59 Min
        // int[] arr = new int[10];
        // for (int i = 0; i < 10; i++) arr[i] = sc.nextInt();
        // int min = arr[0];
        // for (int x : arr)
        //     if (x < min) min = x;
        // System.out.println(min);
        //   }

    // 60 Declaration + Input + Output of 2D Array (2×2)
        //  int[][] X = new int[2][2];
        //Input
        // for (int r = 0; r < 2; r++) {
        //     for (int c = 0; c < 2; c++) {
        //         X[r][c] = sc.nextInt();
        //     }
        // }
        //Output
        // for (int r = 0; r < 2; r++) {
        //     for (int c = 0; c < 2; c++) {
        //         System.out.print(X[r][c] + " ");
        //     }
        //     System.out.println();
        // }
        //   }
        // }

    // 61 Sum of all elements in 2×2 Matrix
        // int[][] X = new int[2][2];
        // int sum = 0;
        // Input
        // for (int r = 0; r < 2; r++) {
        //     for (int c = 0; c < 2; c++) {
        //         X[r][c] = sc.nextInt();
        //     }
        // }
        // Sum
        // for (int r = 0; r < 2; r++) {
        //     for (int c = 0; c < 2; c++) {
        //         sum += X[r][c];
        //     }
        // }
        // System.out.println("Sum = " + sum);
        //      }
        //  }

    // 62 Count Even and Odd in 3×3 Matrix
        // int[][] X = new int[3][3];
        // int even = 0, odd = 0;
        // Input
        // for (int r = 0; r < 3; r++) {
        //     for (int c = 0; c < 3; c++) {
        //         X[r][c] = sc.nextInt();
        //     }
        // }
        // Count
        // for (int r = 0; r < 3; r++) {
        //     for (int c = 0; c < 3; c++) {
        //         if (X[r][c] % 2 == 0)
        //             even++;
        //         else
        //             odd++;
        //     }
        // }
        // System.out.println("Even = " + even);
        // System.out.println("Odd = " + odd);
        //   }
        //  }

    // 63 Matrix addition
        // int[][] a = new int[3][3];
        // int[][] b = new int[3][3];
        // int[][] c = new int[3][3];
        // for (int i = 0; i < 3; i++)
        //     for (int j = 0; j < 3; j++) {
        //         a[i][j] = sc.nextInt();
        //         b[i][j] = sc.nextInt();
        //         c[i][j] = a[i][j] + b[i][j];
        //     }
        // for (int[] row : c) {
        //     for (int x : row) System.out.print(x + " ");
        //     System.out.println();
        // }
        // }

    // 64 Subtraction of Matrix (3×3)
        // int[][] X = new int[3][3];
        // int[][] Y = new int[3][3];
        // int[][] Z = new int[3][3];
        // Input
        // for (int i = 0; i < 3; i++) {
        //     for (int j = 0; j < 3; j++) {
        //         X[i][j] = sc.nextInt();
        //         Y[i][j] = sc.nextInt();
        //     }
        // }
        // Subtraction
        // for (int i = 0; i < 3; i++) {
        //     for (int j = 0; j < 3; j++) {
        //         Z[i][j] = X[i][j] - Y[i][j];
        //     }
        // }
        // Output
        // for (int i = 0; i < 3; i++) {
        //     for (int j = 0; j < 3; j++) {
        //         System.out.print(Z[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        //   }
        //  }

    // 65. Procedure Calling (Methods in Java)
        // // Procedure 1
        // static void PN() {
        // System.out.println("MUSKAN");
        // }
        // // Procedure 2
        // static void PN2(String name) {
        // System.out.println(name);
        // }
        // public static void main(String[] args) {
        // PN();
        // PN2("MUSKAN");
        // }
        //  }

    // 66. Add using Procedure
        // static void add(int a, int b) {
        // System.out.println(a + b);
        //  }
        // public static void main(String[] args) {
        // add(12, 3);
        //  }
        // }

    //67. Cube of Number
        // static void cube(int n) {
        // System.out.println(n * n * n);
        //  }
        //  public static void main(String[] args) {
        // cube(7);
        //  }
        //  }

    //68. Area of Triangle (Procedure)
        // static void area(int b, int h) {
        // System.out.println((b * h) / 2.0);
        // }
        // public static void main(String[] args) {
        // area(4, 5);
        //  }
        //  }

    //69. Add Two Numbers (Function)  
        // static int add(int a, int b) {
        // return a + b;
        //  }
        // public static void main(String[] args) {
        // System.out.println(add(2, 3));
        //  }
        // }

    // 70. Area of Circle (Function)
        // static double areaCircle(double r) {
        // return 3.14 * r * r;
        // }
        // public static void main(String[] args) {
        // System.out.println(areaCircle(2));
        // }
        //  }

    // 71. Area of Triangle (Function) 
        // static double areaTriangle(int b, int h) {
        // return (b * h) / 2.0;
        // }
        // public static void main(String[] args) {
        // System.out.println(areaTriangle(2, 3));
        //  }
        // }

    // 72. Greatest of Two Numbers (Function)
        // static int max(int a, int b) {
        // if (a > b)
        //     return a;
        // else
        //     return b;
        // }
        // public static void main(String[] args) {
        // System.out.println(max(23, 6));
        // }
        // }

    // 73. Absolute Value
        // static int abs(int n) {
        // if (n >= 0)
        //     return n;
        // else
        //     return -n;
        // }
        // public static void main(String[] args) {
        // System.out.println(abs(5));
        // System.out.println(abs(-5));
        //  }
        // }
        
    // 74 Factorial
        // static int abs(int n) {
        // if (n >= 0)
        //     return n;
        // else
        //     return -n;
        // }
        // public static void main(String[] args) {
        // System.out.println(abs(5));
        // System.out.println(abs(-5));
        //  }
        //  }

    // 75
        // static int funn(int A, int B) {
        // int C = 2;
        // B = B % C;
        // A = A % C;
        // return A + B;
        // }
        // public static void main(String[] args) {
        // System.out.println(funn(9, 7));
        // }
        //   }

    // 76
        // static int funn(int A, int B, int C) {
        // if ((A + C) < (B - A)) {
        //     C = 4 + B;
        //     B = (C + C) + B;
        // } else {
        //     C = (A + 3) ^ A;
        //     C = (10 & 8) + B;
        // }
        // return A + B + C;
        // }
        // public static void main(String[] args) {
        // System.out.println(funn(9, 7, 20));
        // }
        // }

    // 77
        // static int funn(int A, int B, int C) {
        // for (C = 0; C <= 8; C++) {
        //     A = (A + 11) + B;
        //     A = (C + 3) + B;
        // }
        // B = (5 + 10) + A;
        // A = (10 + 8) + A;
        // for (C = 2; C <= 5; C++) {
        //     A = (10 + 2) & A;
        //     B = (3 + 4) + A;
        // }
        // return A + B;
        //  }
        // public static void main(String[] args) {
        // System.out.println(funn(6, 9, 2));
        //    }
        //  }

    // 78 (Series + Harmonic)
        // static int sum(int n) {
        // int s = 0;
        // for (int i = 1; i <= n; i++) s += i;
        // return s;
        //  }
        //  static void harmonic(int n) {
        // double s = 0;
        // for (int i = 1; i <= n; i++) s += 1.0 / i;
        // System.out.println(s);
        // }
        // public static void main(String[] args) {
        // System.out.println(sum(5));
        // harmonic(5);
        //  }
        //    }

    // 79 Reverse (Function)
        // static int reverse(int n) {
        // int b = 0;
        // while (n > 0) {
        //     int a = n % 10;
        //     n = n / 10;
        //     b = b * 10 + a;
        // }
        // return b;
        //  }
        // public static void main(String[] args) {
        // System.out.println(reverse(1234));
        //  }
        //    }

    // 80 Palindrome (Function)
        // static boolean palindrome(int n) {
        // int temp = n, rev = 0;
        // while (n > 0) {
        //     int r = n % 10;
        //     rev = rev * 10 + r;
        //     n /= 10;
        // }
        // return rev == temp;
        //  }
        // public static void main(String[] args) {
        // System.out.println(palindrome(151));
        //    }
        //  }

    // 81
        // static int funn(int A, int B, int C) {
        // for (C = 3; C <= 5; C++) {
        //     A = (C + C) ^ B;

        //     if ((A + C) < (C + A)) {
        //         B = (A + 11) + C;
        //     } else {
        //         C = B + B;
        //         A = 3 + B;
        //         continue;
        //     }
        // }
        // return A + B;
        //  }
        //  public static void main(String[] args) {
        //  System.out.println(funn(4, 4, 7));
        //  }
        //    }

    // 82
        //  static int funn(int A, int B) {
        //  int C = A + A + B + B;
        //  B = C + C + B + B;
        //  A = B - A;
        //  return A + B;
        //  }
        // public static void main(String[] args) {
        //  System.out.println(funn(7, 4));
        //   }
        //  }
        
    // 83 (Swap)
        // int X = 5, Y = 5;
        // int Z = X;
        // X = Y;
        // Y = Z;
        // System.out.println("X=" + X + " Y=" + Y);
        //  }
        //  }

    // 84 (Power Logic)
        // static int compute(int A, int B) {
        // int result = 1;
        // while (B > 0) {
        //     if (B % 2 == 1)
        //         result = result * A;
        //     A = A * A;
        //     B = B / 2;
        // }
        // return result;
        //  }
        // public static void main(String[] args) {
        // System.out.println(compute(4, 3));
        //  }
        //   }

    // 85
        // static int funn(int A, int B, int C) {
        // if ((C ^ B + A) < (A + C)) {
        //     B = A ^ B;
        //     C = (A + 3) + C;
        // }
        // if (((3 ^ B) + (C ^ C)) > (11 & C)) {
        //     B = (C + 12) ^ A;
        // }
        // return A + B + C;
        // }
        // public static void main(String[] args) {
        // System.out.println(funn(2, 6, 1));
        //  }
        //  }
         
    // 86
        // static int funn(int A, int B, int C) {
        // if ((A ^ 8) < 8) {
        //     C = A + C;
        //     C = A + C;
        // }
        // return A + B + C;
        //  }
        // public static void main(String[] args) {
        // System.out.println(funn(3, 8, 7));
        //  }
        //  }

    //  87
        // static int sample(int N) {
        // int I = 0, S = 0;
        // while (N > 0) {
        //     int R = N % 10;
        //     int P = (int) Math.pow(8, I);
        //     S = S + P * R;
        //     I++;
        //     N /= 10;
        // }
        // return S;
        // }
        // public static void main(String[] args) {
        // System.out.println(sample(127));
        //   }
        //   }

    // 88
        // static int divisible(int number) {
        // int count = 0, temp = number;
        // while (temp > 0) {
        //     int digit = temp % 10;
        //     if (digit != 0 && number % digit == 0)
        //         count++;
        //     temp /= 10;
        //   }
        // return count;
        //  }
        // public static void main(String[] args) {
        // System.out.println(divisible(2630));
        //     }
        //  }

    // 89
        // static int countBits(int N) {
        // int count = 0;
        // while (N > 0) {
        //     count += N % 2;
        //     N /= 2;
        // }
        // return count;
        //  }
        // public static void main(String[] args) {
        // System.out.println(countBits(42));
        // }
        // }

    // 90
        // static int funn(int A, int B, int C) {
        // B = (A ^ 11) & B;
        // for (C = 3; C <= 6; C++) {
        //     B = 3 + C;
        //     if (1 < B || (A & C) < (5 - A)) {
        //         A = (C + 2) + C;
        //         B = C + C;
        //         break;
        //     }
        // }
        // return A + B;
        //  }
        // public static void main(String[] args) {
        // System.out.println(funn(4, 8, 57));
        //  }
        //  }

}
}


    


    
