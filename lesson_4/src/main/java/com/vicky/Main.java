package com.vicky;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {

        FileWriter fileWriter = null;
        FileReader reader = null;
        String text = "";
        try {

            reader = new FileReader("/home/vicky/IdeaProjects/Java_homework/lesson_4/db/db.sql");
            while (reader.ready()) {
                text += (char) reader.read();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        ArrayList<String> stringList = new ArrayList<>();
        String[] array = text.split(("\n"));
        System.out.println(text);

        for (String a : array) {
            System.out.println(a);
        }

        ArrayList<String> surnameList = new ArrayList<>();
        ArrayList<String> nameList = new ArrayList<>();
        ArrayList<String> secnameList = new ArrayList<>();
        ArrayList<Integer> ageList = new ArrayList<>();
        ArrayList<String> genderList = new ArrayList<>();
        ArrayList<Integer> idList = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            String[] temp = array[i].split(" ");
            surnameList.add(temp[0]);
            nameList.add(temp[1]);
            secnameList.add(temp[2]);
            ageList.add(Integer.parseInt(temp[3]));
            genderList.add(temp[4]);
            idList.add(i);

        }
        for (int i = 0; i < array.length; i++) {
            String result =new StringBuilder()
                    .append(surnameList.get(i))
                    .append(" ")
                    .append(nameList.get(i).charAt(0))
                    .append(".")
                    .append(secnameList.get(i).charAt(0))
                    .append(". ")
                    .append(ageList.get(i))
                    .append(" ")
                    .append(genderList.get(i))
                    .toString();
            System.out.println(result);

        }
        for (int i = 0; i < idList.size(); i++) {

            for (int j = 1; j < idList.size() - i; j++) {

                if (ageList.get(j - 1) > ageList.get(j)) {

                    int swapAge = ageList.get(j-1);
                    ageList.set(j - 1, ageList.get(j));
                    ageList.set(j, swapAge);
                    int swap = idList.get(j-1);
                    idList.set(j - 1, idList.get(j));
                    idList.set(j, swap);

                }

            }
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
           int sortedIndex = idList.get(i);
            String resultSort =new StringBuilder()
                    .append(idList.get(sortedIndex))
                    .append(surnameList.get(sortedIndex))
                    .append(" ")
                    .append(nameList.get(sortedIndex).charAt(0))
                    .append(".")
                    .append(secnameList.get(sortedIndex).charAt(0))
                    .append(". ")
                    .append(ageList.get(i))
                    .append(" ")
                    .append(genderList.get(sortedIndex))
                    .toString();
            System.out.println(resultSort);

        }
    }
}