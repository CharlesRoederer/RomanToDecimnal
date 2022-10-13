public class RomanToDecimal {
    /**
     *
     * @param roman
     * @return
     */
    public static int romanToDecimal(String roman) {
        int sum=0;
        roman=roman.toUpperCase();
        // "XI" .length()=> 2
        // "MCMLXII" .length()=> 7
        // 0123456
        // len(roman)
        // string.length()
        // array.length
        // list.size()
        for(int i=0; i< roman.length(); i++) {

            if(roman.charAt(i) == 'I')
                sum+=1;
            else if(roman.charAt(i) =='V')
                sum += 5;
            else if(roman.charAt(i) =='X')
                sum +=10;
            else if(roman.charAt(i) =='L')
                sum +=50;
            else if(roman.charAt(i) =='C')
                sum +=100;
            else if(roman.charAt(i) =='D')
                sum +=500;
            else if(roman.charAt(i) =='M')
                sum +=1000;
            else
                return -1;

        }
        //INVARIANT
        if(roman.indexOf("IV") !=-1)
            sum -=2;
        if(roman.indexOf("IX") !=-1)
            sum -=2;
        if(roman.indexOf("XL") !=-1)
            sum -=20;
        if(roman.indexOf("XC") !=-1)
            sum -=20;
        if(roman.indexOf("CD") !=-1)
            sum -=200;
        if(roman.indexOf("CM") !=-1)
            sum -=200;
        return sum;
    }
/*

private static String deciminalToRoman(int decimnal)
    String roman ""
    //2175
    while number > 1000
    roman=CM
    while number > 900
    roman = 10qqq00
 */

     /**
     *  main method for java class
     *  @param args command-line arguments, if needed
     */

    public static void main(String[] args) {
        for(String roman: args){
            int decimal= romanToDecimal(roman);
            //String romanTest= decimalToRoman(decimal)
            if (decimal != -1)
                System.out.println("Input: " +roman+ "=> output: " + decimal);
            else
                System.out.println("Input: " +roman+ "=> output: invalid");
        }

    }
}
