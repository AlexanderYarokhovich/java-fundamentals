package ru.javabegin.training.fastjava2.workingWithAstringAsAstringOrStringBuilder;
//Проверить, является ли заданное слово палиндромом.
public class Task3 {
    public void func(){
        System.out.println(isPalindrome());
    }
    boolean isPalindrome() {
        String s = "dovod";
        int n = s.length();
        for (int i = 0; i < (n/2); i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
