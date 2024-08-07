package Programs;

public class String_StringBuffer_StringBuilder {

	public static void main(String[] args) {
		String str = "Hello";
		System.out.println(str.hashCode());
		str += " World!";
		System.out.println(str.hashCode());
		System.out.println(str);
		
		StringBuffer strBuf = new StringBuffer("Hey!");
		System.out.println(strBuf.hashCode());
		strBuf.append(" How are you?");
		System.out.println(strBuf.hashCode());
		System.out.println(strBuf);
		
		StringBuilder strBuild = new StringBuilder("Hi!");
		System.out.println(strBuild.hashCode());
		strBuf.append(" Are you free?");
		System.out.println(strBuild.hashCode());
		System.out.println(strBuild);		
	}
}
