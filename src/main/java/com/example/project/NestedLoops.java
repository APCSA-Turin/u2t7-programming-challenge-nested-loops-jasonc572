package com.example.project;

/*
1.Manually test first in the Runner class.
2.Run ./gradlew test to run automated tests.
3.Once you have completed the challenges, push to your repository.
4.Submit at turninterminal.netlify.app
*/

public class NestedLoops {
               /*
return the string below for given height=5
*
**
***
****
*****  
           */
public static String starStaircase(int height){
    String answer = "";
    for (int i = 1; i <= height; i++) {
        for (int k = 1; k <= i; k++) {
            answer = answer + "*";
        }
        if (i < height) {
            answer = answer + "\n";
        }
    }
    return answer;
}
          /*
return the string below for given height=5
*****
****
***
**
*
           */

public static String starStaircaseReverse(int height){
    String answer = "";
    for (int i = height; i >= 1; i--) {
        for (int k = 1; k <= i; k++) {
            answer = answer + "*";
        }
        if (i != 1) {
            answer = answer + "\n";
        }
    }
    return answer;
}
            /*

width=5 height=5
*****
*   *
*   *
*   *
*****
          */
    public static String emptyBox(int width, int height) {
        String answer = "";
        if (width == 1 || height == 1) {
            return answer;
        }
        for (int i = 1; i <= height; i++) {
            if (i == 1 || i == height) {
                for (int k = 1; k <= width; k++) {
                    answer = answer + "*";
                }
            } else {
                for (int k = 1; k <= width; k++) {
                    if (k == 1 || k == width) {
                        answer = answer + "*";
                    } else {
                        answer = answer + " ";
                    }
                }
            }
            
            answer = answer + "\n";
        }
        return answer.trim();
    }
                    /*
return the string below for word="HELLO" rows=5                    
HELLO
ELLOH
LLOHE
LOHEL
OHELL

  i will provide a hint for this one if you get stuck.. use modulo
                */
    public static String repeatRectangle(String word, int rows){
        String answer = "";
        String word1 = word;
        for (int i = 0; i < rows; i++) {
            int k = i;
            if (i >= word.length()) {
                k = i % word.length();
            }
            int length = word.length();
            if (i == 0) {
                answer = answer + word;
            } else {
                word1 = word.substring(k) + word.substring(0,k);
                answer = answer + word1;
            }
            answer = answer + "\n";
        }
        return answer.trim();
    }

}