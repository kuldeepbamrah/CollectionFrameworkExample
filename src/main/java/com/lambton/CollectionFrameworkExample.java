package com.lambton;

import java.util.ArrayList;

public class CollectionFrameworkExample {

    public static void main(String[] args)
    {

        ArrayList<String> mStringArrayList = new ArrayList<>();

        mStringArrayList.add("A");
        mStringArrayList.add("B");
        mStringArrayList.add("C");
        mStringArrayList.add("C");

        mStringArrayList.add("A");
        mStringArrayList.add("A");

        System.out.println(mStringArrayList);

        for(int i = 0; i<= mStringArrayList.size()-1;i++)
        {
            System.out.println("Index: " + i+"  Element : " +mStringArrayList.get(i));
        }


    }
}
