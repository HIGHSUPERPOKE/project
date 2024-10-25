
import java.util.Scanner;


public class LinearEquationLogic {
    private Scanner myScanner;
    private Coordinate coordinate;


    public LinearEquationLogic(){
        myScanner = new Scanner(System.in);
        coordinate = null;
    }


    public void start(){
        System.out.println("Welcome to the linear equation calculator!");
        getInputs();
    }


    public void getInputs(){
        System.out.print("Enter coordinate 1: ");
        String coordinate1 = myScanner.nextLine();
        System.out.print("Enter coordinate 2: ");
        String coordinate2 = myScanner.nextLine();


        coordinate = new Coordinate(coordinate1, coordinate2);
        coordinate.parseLogic();
    }


    public class Coordinate {
        private String coordinate1;
        private String coordinate2;


        public Coordinate(String coordinate1, String coordinate2){
            this.coordinate1 = coordinate1;
            this.coordinate2 = coordinate2;
        }


        public void parseLogic(){
            int num1 = coordinate1.indexOf(",");
            int num2 = coordinate2.indexOf(",");
            String x1 = coordinate1.substring(1, num1);
            String x2 = coordinate2.substring(1, num2);
            String y1 = coordinate1.substring(num1 + 2, coordinate1.length() - 1);
            String y2 = coordinate2.substring(num2 + 2, coordinate2.length() - 1);
            int stringAsInt = Integer.parseInt(x1);
            int string2AsInt = Integer.parseInt(x2);
            int string3AsInt = Integer.parseInt(y1);
            int string4AsInt = Integer.parseInt(y2);
        }
    }
}



public class LinearEquation {
    private int num1;
    private int num2;
    private int num3;
    private int num4;


    public LinearEquation(int x1, int y1, int x2, int y2){
        num1 = x1;
        num2 = x2;
        num3 = y1;
        num4 = y2;
    }


    public double distance(){
        return Math.round((Math.sqrt((Math.pow(num2 - num1, 2) + Math.pow(num4 - num3, 2)))) * 100) / 100.0;
    }


    public double yIntercept(){
        return num3 - (slope() * num1);
    }


    public double slope(){
        return (double)(num4 - num3) / (num2 - num1);
    }


    public String equation(){

    }

    import java.util.Scanner;


    public class LinearEquationLogic {


        private Scanner myScanner;
        private Coordinate coordinate;


        public LinearEquationLogic(){
            myScanner = new Scanner(System.in);
        }


        public void start(){
            getInfo();
        }


        public void getInfo(){
            System.out.print("Enter coordinate 1: ");
            String coordinate1 = myScanner.nextLIne();
            System.out.print("Enter coordinate 2: ");
            String coordinate2 = myScanner.nextLine();

            coordinate
        }
    }

}




