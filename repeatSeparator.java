public class repeatSeparator{

public String repeatSeparator(String word, String sep, int count) {    
    StringBuffer buffer = new StringBuffer();

    while (count > 0) {
        buffer.append(word);
        count--;
        if (count > 0) {
            buffer.append(sep);
        }
    }

    return buffer.toString();                           
}
public static void main(String args[])
{
	repeatSeparator rs=new repeatSeparator();
	System.out.println(rs.repeatSeparator("Word", "X", 3));	
	System.out.println(rs.repeatSeparator("This", "And", 2));
	System.out.println(rs.repeatSeparator("This", "And", 1));
	System.out.println(rs.repeatSeparator("99", ",", 3));
}
}
	