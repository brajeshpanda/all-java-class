public class ChangeCaseOfChar {
    public static void main(String[] args) {
        String abc = "mY nAmE iS mUnEeB";
        StringBuilder result = new StringBuilder();

        for (char ch : abc.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch));
            } else {
                result.append(ch); // spaces
            }
        }

        System.out.println(result.toString());
    }
}

