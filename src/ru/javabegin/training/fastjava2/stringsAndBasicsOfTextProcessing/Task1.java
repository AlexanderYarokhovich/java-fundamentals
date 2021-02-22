package ru.javabegin.training.fastjava2.stringsAndBasicsOfTextProcessing;
//Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.

public class Task1 {
    private final String[] arrayName = {"camelCase", "communityEdition", "armstrongNumber", "externalLibraries"};
    private String[] newArrayName = new String[arrayName.length];

    public void stringBuild() {


        for (int i = 0; i < arrayName.length; i++) {
            newArrayName[i] = oneName(arrayName[i]);
            System.out.println(newArrayName[i]);
        }
    }

    private String oneName(String newName) {
        StringBuilder builderString = new StringBuilder();
        for (int j = 0; j < newName.length(); j++) {
            char c = newName.charAt(j);
            if (Character.isUpperCase(c)) {
                builderString.append("_").append(Character.toString(c).toLowerCase());
            } else {
                builderString.append(c);
            }
        }
        return builderString.toString();
    }
}

