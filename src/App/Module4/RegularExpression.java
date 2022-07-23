package App.Module4;

public class RegularExpression {

    public static void main(String[] args) {
        /*
            Regular Expression
            ==================

            Matching symbols for regular expression:
            ========================================
            Regular Expression ==> Description
            . ==> Any Character
            [abc] ==> Exactly given letters
            [abc][vz] ==> Either first or second
            [^abc] ==> Except abc
            [a-z1-7] ==> a-z or 1-7
            A|B ==> A or B
            XZ ==> Exactly XZ
         */
        String str1 = "%", str2 = "a", str3 = "ab", str4 = "p", str5 ="7", str6 = "u";
        System.out.println(str1.matches("."));

        System.out.println(str2.matches("[abc]"));
        System.out.println(str3.matches("[abc]"));

        System.out.println(str4.matches("[^abc]"));

        System.out.println(str5.matches("[a-z0-9]"));

        System.out.println(str6.matches("[AB]"));
        System.out.println("\n\n\n");

        /*
            Meta Characters in Regular Expression
            =====================================
            Regular Expression ==> Description
            \d ==> Digits
            \D ==> Not Digits
            \s ==> Space
            \S ==> not Space
            \w ==> Alphabet or Digits
            \W ==> Neither Alphabet nor Digits
         */
        System.out.println("a".matches("\\w"));
        System.out.println("d".matches("\\d"));
        System.out.println("%".matches("\\D"));
        System.out.println("@".matches("\\W"));
        System.out.println(" ".matches("\\s"));
        System.out.println(" ".matches("\\S"));
        System.out.println("\n\n\n");

        /*
            Quantifiers
            ===========
            Regular Expression ==> Description
            * ==> 0 or more
            + ==> One or more
            ? ==> 0 or 1 time
            {X} ==> X times
            {X,Y} ==> Between X and Y time
         */
        System.out.println("acbdef".matches(".*"));
        System.out.println("acbdef".matches("[a-z]*"));
        System.out.println("acb8def".matches("[a-z]*"));
        System.out.println("acbA8def".matches("[a-zA-z0-9]*"));
        System.out.println("abc5".matches("[a-z]{3}"));
        System.out.println("abc5".matches("[a-z]{3,4}"));
        System.out.println("flioolawale123@gmail.com".matches("[a-z0-9]*@[a-z]*.[a-z]*"));
        System.out.println("flioolawale123@gmail.com".matches("\\w*\\W([a-z]*)\\W([a-z]*)"));
    }
}
