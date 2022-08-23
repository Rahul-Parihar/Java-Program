public class comparison {
    public static void main(String[] args) {
        String S1 = "Shark";
        String S2 = "Shark";
        String S3 = new String("Shark");

        // if (S1 == S2) {
        //     System.out.println("Stings are same");
        // } else {
        //     System.out.println("String are not same");
        // }

        // if (S2 == S3) {
        //     System.out.println("Strings are same");
        // } else {
        //     System.out.println("Strings are not same");
        // }

        if (S1.equals(S3)) {
            System.out.println("Strings are same");
        } else {
            System.out.println("Strings are not same");
        }
    }

}
