/*
Q49. Given a score out of 100, print Excellent (≥90), Good (≥75), Average (≥50), Poor (< 50)
— using nested ternary operators.
*/

import java.util.*;

public class ScoreGrade_49 
{
    public static void main(String x[]) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter score (0-100): ");
        int score = sc.nextInt();

        String result = (score >= 90) ? "Excellent"
                : (score >= 75) ? "goood"
                        : (score >= 50) ? "Average"
                                : "poor";
        System.out.println("Result: " + result);
    }
}

/*
 * >javac ScoreGrade.java
 * 
 * >java ScoreGrade
 * Enter score (0-100): 95
 * Result: Excellent
 * 
 * >java ScoreGrade
 * Enter score (0-100): 80
 * Result: goood
 * 
 * >java ScoreGrade
 * Enter score (0-100): 55
 * Result: Average
 * 
 * >java ScoreGrade
 * Enter score (0-100): 40
 * Result: poor
 */