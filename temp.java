//convert celsius to fahrenheit => C × 9/5 + 32
//convert fahrenheit to celsius => F − 32 × 5/9;
public class temp {
    public static void main (String []args){
    double celsius = 36.0;
    double f = 44;
    double Cel= (f-32)*5/9;
    double fahrenheit = (celsius*9/5)+32;
    System.out.println("the temperature in farenhite is = "+" "+fahrenheit);
    System.out.println("the temperature in celsius is = "+" " + Cel);
    }
    
}
