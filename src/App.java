import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Double[] CMY = {0.0, 0.0, 0.0};
        double[] RGB = {0, 0, 0};

        System.out.println("Which model you want to convert?");
        System.out.print("RGB / CMY: ");
        String modelo = tec.nextLine().toUpperCase();

        if("RGB".equals(modelo)){
            System.out.print("Enter the RGB first channel: ");
            RGB[0] = Double.parseDouble(tec.nextLine()) / 255;
            System.out.print("Enter the RGB second channel: ");
            RGB[1] = Double.parseDouble(tec.nextLine()) / 255;
            System.out.print("Enter the RGB third channel: ");
            RGB[2] = Double.parseDouble(tec.nextLine()) / 255;

            System.out.print("Values converted to CMY:");
            for ( int i = 0; i < CMY.length; i++){
                System.out.printf("%n%.3f", ((1 - RGB[i])));
            }

            System.out.println("\nValues in hexadecimal:");
            for (int i = 0; i < CMY.length; i++){
                int hexa = (int)Math.round(RGB[i] * 255);
                String hexaD = Integer.toHexString(hexa);
                System.out.println(hexaD.toUpperCase());
            }

        }else if("CMY".equals(modelo)){
            System.out.print("Enter the CMY first channel: ");
            CMY[0] = 1 - Double.parseDouble(tec.nextLine());
            System.out.print("Enter the CMY second channel: ");
            CMY[1] = 1 - Double.parseDouble(tec.nextLine());
            System.out.print("Enter the CMY third channel: ");
            CMY[2] = 1 - Double.parseDouble(tec.nextLine());

            System.out.println("Values converted to RGB: ");
            for(int i = 0; i < CMY.length; i++){
                System.out.println(Math.round(CMY[i] * 255));
            }

            System.out.println("RGB Values in hexadecimal");
            for (int i = 0; i < CMY.length; i++){
                int hexa = (int)Math.round(CMY[i] * 255);
                String hexaD = Integer.toHexString(hexa);
                System.out.println(hexaD.toUpperCase());
            }
        }        
        
        tec.close();
    }
}
