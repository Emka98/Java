import java.util.Arrays;

public class Tab {
    public static void main(String[] args) throws Exception {
        
        double tab1[][] = new double[3][3];
            tab1[0][0] = 1.0;
            tab1[0][1] = 1.5;
            tab1[0][2] = 2.0;
            tab1[1][0] = 1.5;
            tab1[1][1] = 2.0;
            tab1[1][2] = 3.0;
            tab1[2][0] = 2.0;
            tab1[2][1] = 2.5;
            tab1[2][2] = 3.0;

        double tab2[][] =  {
            {1.0, 1.5, 2.0},
            {1.5, 2.0, 3.0},
            {2.0, 2.5, 3.0}
        };

        Calulator cal = new Calulator();

        System.out.println(Arrays.deepToString(tab1));
        System.out.println(Arrays.deepToString(tab2));

        System.out.println(cal.summultiplicateOfDiagonals(tab1));
        System.out.println(cal.summultiplicateOfMiddleRowMiddleColumn(tab1));
        System.out.println(cal.SumOfExtremeElements(tab1));
    }
}
