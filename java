//1.Hello and name Printer
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
        String name = obj.nextLine();
        System.out.println("Hello");
        System.out.println(name);
        
    }
}

//2.Value Performance 1
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        float b = obj.nextFloat();
        System.out.println(a);
        System.out.printf("%.2f",b);
    }
}

//3.Execute the word with a Statement
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str= obj.next();
        System.out.println("May I know how to learn " + str + "!!!..." );
    }
}

//4.Execute the String Statement 1

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
     Scanner obj = new Scanner(System.in);
        String name = obj.nextLine();
        System.out.println("Hai " + name + "!    Welcome to Programming Language...");;

    }
}
//5.Math Functions 1
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
   Scanner obj = new Scanner(System.in);

        double a = obj.nextDouble();
        int b = obj.nextInt();
        int c = obj.nextInt();
        int d = obj.nextInt();

        System.out.println((int)Math.floor(a));
        System.out.println((int)Math.ceil(a));
        System.out.println((int)Math.sqrt(b));
        System.out.println((int)Math.pow(c, d));

        
    }

    }
//6.Float Formation 1

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner c = new Scanner(System.in);

        float num = c.nextFloat();

        System.out.printf("%.6f\n", num);
        System.out.printf("%.4f\n", num);
        System.out.printf("%.2f\n", num);
        System.out.println(Math.round(num));
}
}

//7.THREE IDIOTS 2
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x1 = s.nextInt();
        int y1 = s.nextInt();
        int x2 = s.nextInt();
        int y2 = s.nextInt();
        double midX = (x1 + x2) / 2.0;
        double midY = (y1 + y2) / 2.0;
        System.out.printf("Binoy's house is located at (%.1f,%.1f)", midX, midY);
    }

}
//8.PROFIT CALCULATOR 1
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int copies = a.nextInt();
        int costEach = a.nextInt();       
        int costAgency = a.nextInt();
        double profit = (copies * costEach) - (copies * costAgency)-100;
        System.out.println("Number of copies sold:" + copies);
        System.out.println("Cost of each copy:" + costEach);
        System.out.println("Cost spent by agency on each newspaper:" + costAgency);
        System.out.printf("The profit obtained is Rs.%.2f", (float)profit);
    }
}
  
    //9.Area and Perimeter of Triangle. 1
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();
        double area = 0.5 * base * height;
        double perimeter = side1 + side2 + side3;
        System.out.printf("Area of Triangle is %.2f\n", area);
        System.out.printf("Perimeter of Triangle is %.2f", perimeter);
    }
}

    //10.Alice in wonderland 6
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner j = new Scanner(System.in);
        int k = j.nextInt();
        int A = k/10;
        int b = k%10;
        int c = A+b;
        System.out.println("Bird said:" + k);
        System.out.println("Alice must go in path-" + c);
    }
}



