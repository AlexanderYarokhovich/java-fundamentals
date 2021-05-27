package ru.javabegin.training.fastjava2.stringsAndBasicsOfTextProcessing;

//Замените в строке все вхождения 'word' на 'letter'.
public class Task2 {
    public void replace(){
        String str = new String("Word of the incident spread quickly Word");
        System.out.print("Возвращаемое значение: " );
        System.out.println(str.replace("Word", "letter"));
    }
}
