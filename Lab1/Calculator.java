import java.lang.*;
import java.util.*;

public  class Calculator
{
    private String name;
    public Float addition(Float A, Float B){
        return A + B;
    }
    public Float subtraction(Float A, Float B){
        return A - B;
    }
    public Float multiplication(Float A, Float B){
        return A * B;
    }
    public void setName(String N){
        name = N;
    }
    public String getName(){
        String message1 = "Welcome to the Calculator designed by " + name + ".\n";
        String message2 = "Enter A to Add, S to Subtract, M to Multiply, and Q to quit.";
        return message1 + message2;
    }
    public String printResult(String op, Float arg1, Float arg2, Float ans){
        String operation = "operation";
        switch (op){
            case "A":
                operation = "addition";
                break;
            case "S":
                operation = "subtraction";
                break;
            case "M":
                operation = "multiplication";
                break;
        }
        return "The " + operation + " of " + arg1 + " and " + arg2 + " is " + ans;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Calculator myCalc = new Calculator();
        myCalc.setName("Group X");
        boolean quitFlag = false;
            while (!quitFlag){
                try{
                    System.out.println(myCalc.getName());
                    String operation = input.nextLine();
                    if(operation.equals("Q")){
                    quitFlag =true;
                    break;
                    }
                    else if (operation.equals("A") || operation.equals("S") || operation.equals("M")){
                    System.out.println("Enter argument 1:");
                    String input1 = input.nextLine();
                    if(input1.equals("Q")){
                        quitFlag = true;
                        break;
                    }
                    Float argument1 = Float.parseFloat(input1);
                    System.out.println("Enter argument 2: ");
                    String input2= input.nextLine();
                    if(input2.equals("Q")){
                        quitFlag = true;
                        break;
                    }
                    Float argument2 = Float.parseFloat(input2);
                    switch(operation){
                        case "A":
                                    Float result = myCalc.addition(argument1,argument2);
                                    System.out.println(myCalc.printResult(operation,argument1,argument2,result));
                                    break;
                        case "S":
                                    Float result2 = myCalc.subtraction(argument1,argument2);
                                    System.out.println(myCalc.printResult(operation,argument1,argument2,result2));
                                    break;
                        case "M":
                                    Float result3 = myCalc.multiplication(argument1,argument2);
                                    System.out.println(myCalc.printResult(operation,argument1,argument2,result3));
                                    break;
                    }
                }
                else{
                    System.out.println("Error Try again.");
                }
                }catch (Exception e){
                    System.out.println("Please enter float or integer. Try again.");
                }
                }
        System.out.println("Thank you for using the calculator! Goodbye.");
    }
}