package academy.learnprogramming;

public class MethodChaining {

    public static void main(String[] args) {
        String start = "  Java  ";

        String trimmed = start.trim();
        System.out.println("trimmed= " + trimmed);

        String lowerCase = trimmed.toLowerCase();
        System.out.println("lowercase= " + lowerCase);

        String result = lowerCase.replace('j', 'J');
        System.out.println("result= " + result);

        String anotherResult = "  Java  ".trim().toLowerCase().replace('j', 'J');
        System.out.println("anotherResult= " + result);
        System.out.println(result.equals(anotherResult));

        String a = "abc";
        String b = a.toUpperCase(); // produces new string does not change a variable
        String c = b.replace('B', 'b').replace('C', 'c'); // produces new String
        System.out.println("a= " + a);
        System.out.println("b= " + b);
        System.out.println("c= " + c);

        if (a.equalsIgnoreCase(b)) {
            System.out.println("String are equal");
        }

        if (a.toLowerCase().trim().equals(b.toLowerCase().trim())) {
            System.out.println("Equal");
        }
    }
}
