package ru.javabegin.training.fastjava2.stringsAndBasicsOfTextProcessing;
//3. В строке найти количество цифр.
public class Task3 {
        public void getNumberOfDigits(){
            String s = "jge7erhfuehr7hbweb33sdhb247";
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                if (Character.isDigit(s.charAt(i))) {
                    count++;
                }
            }
            System.out.println(count);
        }
}
