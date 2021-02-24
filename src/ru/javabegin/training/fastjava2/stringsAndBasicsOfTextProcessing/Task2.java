package ru.javabegin.training.fastjava2.stringsAndBasicsOfTextProcessing;


//Замените в строке все вхождения 'word' на 'letter'.
public class Task2 {
    public void replase(){
        String Str = new String("Word of the incident spread quickly Word");

        System.out.print("Возвращаемое значение: " );
        System.out.println(Str.replace("Word", "letter"));

    }
}
