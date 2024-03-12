import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Nikolay
 */
public class Main {

    public static void main(String[] args) {
        int a1,b1,a2,b2;
        System.out.println("This program will get the coordinates of two segments on the number line and find a possible intersection for them");
        System.out.println();
        ArrayList<Integer> Segment1 = getSortedSegment();
        ArrayList<Integer> Segment2 = getSortedSegment();
        a1 = Segment1.get(0); b1 = Segment1.get(1);
        a2 = Segment2.get(0); b2 = Segment2.get(1);

        if (a2 > b1 || a1 > b2) {
            System.out.println("There is no intersection");
        }
        else if (b1 == a2) {
            System.out.println("The intersection is: " + b1);
        }
        else if (b2 == a1) {
            System.out.println("The intersection is: " + b2);
        }
        else if (a1 <= a2 & b1 <= b2) {
            System.out.println("The intersection is: [" + a2 + ", " + b1 + "]");
        }
        else if (a1 <= a2 & b1 > b2) {
            System.out.println("The intersection is: [" + a2 + ", " + b2 + "]");
        }
        else if (b1 >= b2) {
            System.out.println("The intersection is: [" + a1 + ", " + b2 + "]");
        }
        else {
            System.out.println("The intersection is: [" + a1 + ", " + b1 + "]");
        }
    }

    public static ArrayList<Integer> getSortedSegment() {
        ArrayList<Integer> List = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int x,y,temp;
        System.out.println("Enter the coordinates of the segment: ");
        x = scanner.nextInt();
        y = scanner.nextInt();
        System.out.println();
        if (x > y) {
            temp = y; y = x; x = temp;
        }
        List.add(x);
        List.add(y);
        return List;
    }
}
