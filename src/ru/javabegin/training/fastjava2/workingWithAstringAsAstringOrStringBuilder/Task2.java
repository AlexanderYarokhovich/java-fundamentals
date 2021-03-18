package ru.javabegin.training.fastjava2.workingWithAstringAsAstringOrStringBuilder;

//. В строке вставить после каждого символа 'a' символ 'b'.
public class Task2 {
    public void replaceAB() {
        String str = new String("ccacccacccccccacccca");
        System.out.println(str.length());
        StringBuilder sb = new StringBuilder(str);
        int counter =0;
        for (int i = 0; i < str.length(); i++) {
            counter +=1;
            if ("a".equals(String.valueOf(str.charAt(i)))) {
                sb.insert(counter, "b");
                counter++;
            }
        }
        System.out.println(sb);
        System.out.println(str.length());
    }
}
