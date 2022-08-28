package string.algo;

public class StringCount {

    public static void main(String[] args) {
	System.out.println(generate(1));
    }

    static String generate(int count) {
	return count <= 100 ? count + generate(++count) : "";
    }

    static String generate(StringBuilder sb, int count) {
	if (sb == null)
	    sb = new StringBuilder();

	if (count <= 100) {
	    sb.append(count);
	    generate(sb, ++count);
	}

	return sb.toString();
    }
}
