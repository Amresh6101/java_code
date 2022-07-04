public class LeetCodeBi81 {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(str);
    }
}
/*
 * there are 12 characters with special meanings: the backslash \, the caret ^,
 * the dollar sign $, the period or dot ., the vertical bar or pipe symbol |,
 * the question mark ?,
 * the asterisk or star *, the plus sign +, the opening parenthesis (, the
 * closing parenthesis ), and the opening square bracket [,
 * the opening curly brace {, These special characters are often called
 * "metacharacters".
 * 
 * So, if you want to split on e.g. period/dot . which means "any character" in
 * regex,
 * use either backslash \ to escape the individual special character like so
 * split("\\."), or use character class [] to
 * represent literal character(s) like so split("[.]"), or use Pattern#quote()
 * to escape the entire string like so split(Pattern.quote(".")).
 */