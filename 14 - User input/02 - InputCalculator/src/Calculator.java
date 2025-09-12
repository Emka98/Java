class Calculator {

    double clculator(double a, double b, char oparator){

        double result = 0.0; 

        if(oparator == '+'){
            result = a + b;
        }
        else if(oparator == '-'){
            result = a - b; 
        }
        else if (oparator == '/'){
            result = a / b;
        }
        else if (oparator == '*'){
            result = a * b;
        }
        else {
            System.out.println("Invalid oparator");
        }
        return result;
    }
}
