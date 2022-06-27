package test;

public class StringBufferandBuilder {
public static void main(String[] args) {
	String s = new String("velocity");
	StringBuffer sb = new StringBuffer("katraj");
	StringBuilder sbb = new StringBuilder("pune");
	s.concat("pune");
	sb.append(" pune ");
	sbb.append("maharashtra");
	System.out.println(s);
	System.out.println(sb);
	System.out.println(sbb);
	sb.reverse();
	System.out.println(sb);
		
		
		
		
	}

}
