package ru.javabegin.training.fastjava2.workingWithAstringAsAstringOrStringBuilder;
//Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только английские буквы.
public class Task9 {
    String str = "fdnnFouJdc387GG`12/.,аврорргШШШ";
    private int count1 = 0;
    private int count2 = 0;
    public void searchForLetters(){
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            String s = Character.toString(c);
            boolean smallLetter = s.matches("[a-z]");
            boolean capitalLetter = s.matches("[A-Z]");
            if(smallLetter){
                count1++;
            }
            if(capitalLetter){
                count2++;
            }
        }
        System.out.println("маленьких букв: " + count1);
        System.out.println("больших букв: " + count2);
    }
}
