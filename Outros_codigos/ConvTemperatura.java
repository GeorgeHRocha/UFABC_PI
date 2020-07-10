import java.util.Scanner;
import java.text.DecimalFormat;
public class ConvTemperatura {
    public static void main (String[] args) {
        double Celsius;
        double Kelvin;
        double Fahrenheit;
        double Rankine;
        double Reamur;
        double Romer;
        double Deslile;
        Scanner Scan = new Scanner(System.in);
        
        Celsius = Scan.nextDouble();

        Kelvin = Celsius + 273.15;
        Fahrenheit = (Celsius * 9) / 5 + 32;
        Rankine = (Kelvin * 9) / 5;
        Reamur = (Celsius * 4) / 5;
        Romer = (Celsius * 21) / 40 + 7.5;
        Deslile = ((100 - Celsius) * 3) / 2;

        System.out.println(new DecimalFormat("0.0").format(Kelvin));
        System.out.println(new DecimalFormat("0.0").format(Fahrenheit));
        System.out.println(new DecimalFormat("0.0").format(Rankine));
        System.out.println(new DecimalFormat("0.0").format(Reamur));
        System.out.println(new DecimalFormat("0.0").format(Romer));
        System.out.println(new DecimalFormat("0.0").format(Deslile));
    }
}