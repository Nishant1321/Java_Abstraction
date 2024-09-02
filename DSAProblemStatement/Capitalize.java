package DSAProblemStatement;

public class Capitalize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a="nishant is my name";
StringBuilder capitalized= new StringBuilder();

String[] word=a.split("\\s+");
for(String words :word) {
	if(word.length>0) {
		capitalized.append(Character.toUpperCase(words.charAt(0)))
		.append(words.substring(1).toLowerCase()).append(" ");
		
		
	}
}
String result=capitalized.toString().trim();
System.out.println(result);
	}

}
