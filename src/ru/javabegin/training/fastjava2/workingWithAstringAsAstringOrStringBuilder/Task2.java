package ru.javabegin.training.fastjava2.workingWithAstringAsAstringOrStringBuilder;
//. В строке вставить после каждого символа 'a' символ 'b'.
public class Task2 {
    public void replaceAB(){
        String str = new String("Word of the incident spread quickly Word");
        System.out.print("Возвращаемое значение: " );
        System.out.println(str.replace("a", "b"));
    }
}
