package com._6.preparation2026.basicJavaFeatures.coding;

public class ReverseAString {
    public static void main(String[] args) {
        String s= "ab";
        char[] arr= s.toCharArray();
        int j =arr.length-1;

        for (int i=0;i<(arr.length)/2;i++){
            char k=arr[i];
            arr[i]=arr[j];
            arr[j]=k;
            j--;


        }
        System.out.println(String.valueOf(arr));


        int a=123;

        int b=0;
        while(a!=0){

            int digit = a % 10;
            b = b * 10 + digit;
            a = a / 10;
        }
        System.out.println(b);
    }
}
