package ru.javabegin.training.fastjava2.workingWithAstringAsAstringOrStringBuilder;
// Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным знаком. Определить количество предложений в строке X.
public class Task10 {
    String X = "Уж вы капитана разбудите сначала. – Отчего так скоро? Алексей Степаныч где? Что будет, то будет!";
    int counter = 0;

    public void numberOffers() {
        for (int i = 0; i < X.length(); i++) {
            if (isCentenceAdd(X.charAt(i))) {
                counter++;
            }
        }
        System.out.println("Предложений в строке: " + counter);
    }
    private boolean isCentenceAdd(final char c){
        return ".".equals(String.valueOf(c))||"!".equals(String.valueOf(c))||"?".equals(String.valueOf(c));
    }
}
