package com.dee.practical.Main;

import java.util.ArrayList;
import java.util.List;

public class Interview {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList();
        for (int i =0; i < 10;i++) {
            intList.add(i);
        }

        intList.remove(2);

        for (int j=0; j < 10; j++) {
            if (intList.size() < 10 && intList.get(j).intValue() != j) {
                System.out.println("Missing: " + j);
                break;
            }
        }
    }
}
