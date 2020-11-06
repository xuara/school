/**
 * System.out.printf() and String.format() take a format string as their first argument, and then
 * a variable number of arguments after the format string.  System.out.printf() displays the resulting
 * text to the screen, and String.format() returns the text as a String.
 * 
 * To the best of my knowledge, this kind of formatting goes back to the C programming language and is
 * used in the C printf() function.  C++ was based on C, and Java is based on C++, so these format strings
 * are still present in Java and other programming languages (such as Python).
 * 
 * The material that I am presenting here is just a short and incomplete demonstration.  I am just going
 * to go over the most common use cases. The full specification can be found in the Java API here:
 * 
 * http://download.oracle.com/javase/6/docs/api/java/util/Formatter.html#syntax
 * 
 * 
 * 
 * 
 * The whole idea is to be able to format text the way you would like it to appear.
 * 
 * Inside the format string, there are zero or more "conversions."  For each conversion, you need
 * something to convert, and that is where the variable number of arguments comes in.  If your
 * format string has just one conversion, then you will need one argument passed into your printf()
 * after the format string.  Likewise, if you're doing two conversions, you will need two conversions,
 * and so on...  (There is an exception to this rule if you use what the javadocs refer to as an
 * "argument_index" followed by a dollar sign.  This is pretty advanced, and I've never seen it
 * used in practice in the real world, so I'm not going to discuss it here.)
 * 
 * Inside the format string, each conversion looks like this:
 * 
 * %[flags][width][.precision]conversion
 * 
 * It starts with a % sign, and then the flags, width, and precision are all optional.  The
 * conversion character is mandatory.
 * 
 * Common conversion characters:
 * (If a conversion character is uppercase, it will result in an uppercase
 * conversion where applicable).
 * 
 * 'b' 'B' - This formats boolean variables as the text "true" or "false"
 * 's' 'S' - This inserts a string
 * 'c' 'C' - This inserts a single character
 * 'd'     - This formats integer-types into a decimal (base 10, digits 0-9) integer text
 * 'o'     - This formats integer-types into an octal (base 8, digits 0-7) integer text
 * 'x' 'X' - This formats integer-types into a hexadecimal (base 16, digits 0-9a-f) integer text
 * 'e' 'E' - This formats floating-point types into scientific notation text (ex 1.234e+10)
 * 'f'     - This formats floating-point types into fixed-point notation 0.001234
 * 'g' 'G' - This formats floating-point types the same as 'f' or 'e'/'E' depending on the precision.
 * '%'     - If you want to just show a percent sign instead of doing a conversion, you just put "%%" into your format string
 * 
 * Common flag characters:
 * '-' - The result will be left-justified
 * '+' - Positive numbers will start with a + sign and negative numbers will start with a - sign
 * ' ' - Positive numbers will start with a space, and negative numbers will start with a - sign
 * '0' - If a number doesn't fill the width its allotted, it will be prepended with zeros.
 * ',' - Digit grouping will be done Ex. "1,000,000" instead of "1000000"
 * '(' - Negative numbers will be enclosed in parenthesis
 * 
 * Width:
 * The width is the minimum number of characters that the conversion will use.  For example, if my
 * number is 5 and I set a width of 3 then my conversion will be "  5", because it must use at least
 * 3 characters.  I can use the '-' flag to left-justify the text so that it would become "5  " instead.
 * Alternatively, I could use the '0' flag to make the text come out as "005".  If my number is 12345,
 * and I use a width of 3, the text will still be "12345", because the width only specifies the minimum
 * number of characters in the conversion; if more characters are required, more characters will be used.
 * 
 * Precision:
 * The precision is differentiated from the width by being written out after a decimal point.
 * 
 * For most conversion types, the precision is the maximum number of characters to be used.
 * 
 * For the floating point conversions 'e', 'E', and 'f' the precision is the number of digits
 * that will follow the decimal point, and rounding will occur if necessary.  For the floating point
 * conversions 'g' or 'G', the precision will be the total number of digits.
 * 
 * Onto some examples...
 * 
 * 
 * 
 */
public class PrintfPrimer {

	public static void main(String[] args) {

		System.out.printf( "Trying different conversion types\n\n" );
		
		boolean myTrue = true;
		boolean myFalse = false;
		
		System.out.printf( "Testing %%b and %%B\n" );
		System.out.printf( "myTrue = %b; myFalse = %B\n\n", myTrue, myFalse );
		
		String myString = "This is my string!";
		
		System.out.printf( "Testing %%s\n" );
		System.out.printf( "myString = '%s'\n\n", myString );
		
		char a = 'a';
		char b = 'b';
		char D = 'D';
		
		System.out.printf( "Testing %%c; %%C; and %%c\n" );
		System.out.printf( "a = %c; b = %C; D = %c\n", a, b, D );
		System.out.printf( "Notice how the %%C capitalized 'b' but the %%c didn't make the 'D' lowercase...\n\n" );
		
		byte myByte = 123;
		short myShort = 456;
		int myInt = 789;
		long myLong = 101112;
		
		
		System.out.printf( "Testing %%d\n" );
		System.out.printf( "myByte = %d; myShort = %d; myInt = %d; myLong = %d\n\n", myByte, myShort, myInt, myLong );
		
		int seven = 7;
		int eight = 8;
		int nine = 9;
		
		System.out.printf( "Testing %%o\n" );
		System.out.printf( "seven = %o; eight = %o; nine = %o\n\n", seven, eight, nine );
		
		int ten = 10;
		int fifteen = 15;
		int sixteen = 16;
		
		System.out.printf( "Testing %%x; %%x; %%X; and %%X\n" );
		System.out.printf( "nine = %x; ten = %x; fifteen = %X; sixteen = %X\n\n", nine, ten, fifteen, sixteen );
		
		System.out.printf( "Testing %%e and %%E\n" );
		System.out.printf( "pi = %e; 1000 * pi = %E\n\n", Math.PI, 1000 * Math.PI );
		
		System.out.printf( "Testing %%f\n" );
		System.out.printf( "e = %f\n\n", Math.E );
		
		System.out.printf( "Testing %%g; %%g; %%G; and %%G\n" );
		System.out.printf( "e = %g; 1000000 * e = %g; pi = %G; pi / 1000000 = %G\n", Math.E, 1000000 * Math.E, Math.PI, Math.PI / 1000000 );
		System.out.printf( "Notice how %%g/%%G automatically chooses scientific notation when your magnitude gets really large or really small\n\n" );
		
		System.out.printf( "Flags, width, and precision can be used with most conversion characters, but for the sake of brevity I'm just going to do most of these with %%d\n\n" );
		
		System.out.printf( "Testing %%20d\n" );
		System.out.printf( "fifteen = '%20d'\n\n", fifteen );
		
		System.out.printf( "Testing %%020d\n" );
		System.out.printf( "fifteen = '%020d'\n\n", fifteen );
		
		System.out.printf( "Testing %%-20d\n" );
		System.out.printf( "fifteen = '%-20d'\n\n", fifteen );
		
		System.out.printf( "Testing %%+20d\n" );
		System.out.printf( "fifteen = '%+20d'\n\n", fifteen );
		
		System.out.printf( "Testing %%-+20d\n" );
		System.out.printf( "fifteen = '%-+20d'\n\n", fifteen );
		
		int negativeFifteen = -15;
		
		System.out.printf( "Testing %% d\n" );
		System.out.printf( " fifteen = '% d'\n", fifteen );
		System.out.printf( "-fifteen = '% d'\n", negativeFifteen );
		System.out.printf( "Notice in the positive 15 that there is a space where the + sign could go\n\n" );
		
		System.out.printf( "Testing %%(d\n" );
		System.out.printf( " fifteen = '%(d'\n", fifteen );
		System.out.printf( "-fifteen = '%(d'\n\n", negativeFifteen );
		
		int oneMillion = 1000000;
		System.out.printf( "Testing %%d\n" );
		System.out.printf( "oneMillion = '%d'\n\n", oneMillion );
		
		System.out.printf( "Testing %%,d\n" );
		System.out.printf( "oneMillion = '%,d'\n\n", oneMillion );
		
		System.out.printf( "Testing %%.2f\n" );
		System.out.printf( "pi = '%.2f'\n\n", Math.PI );
		
		System.out.printf( "Testing %%.20f\n" );
		System.out.printf( "pi = '%.20f'\n", Math.PI );
		System.out.printf( "Notice that pi in Java is only valid to 15 decimal places\n" );
		System.out.printf( "In general, the double-type is only accurate for the most significant 15-16 digits\n" );
		System.out.printf( "The float-type is only accurate for the most 7-8 digits\n\n" );
		
		System.out.printf( "Testing %%40.20f\n" );
		System.out.printf( "pi = '%40.20f'\n\n", Math.PI );
		
		System.out.printf( "Testing %%.3s\n" );
		System.out.printf( "myString = %.3s\n\n", myString );
		
		System.out.printf( "Testing String.format()\n" );
		String mySecondString = String.format( "myString = %.3s", myString );
		
		System.out.printf( "mySecondString = '%s'\n\n", mySecondString );
		
		System.out.printf( "Testing System.out.println()\n" );
		//NOTICE THE println
		System.out.println( "mySecondString = '" + mySecondString + "'\n" );
		
	}

}
