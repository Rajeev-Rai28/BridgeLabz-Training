package com.day4.zipZapMart;

public class ZipZapMartMain {
    public static void main(String[] args) {

        Transaction[] arr = {
            new Transaction(500),
            new Transaction(1200),
            new Transaction(300),
            new Transaction(900),
            new Transaction(100)
        };

        ZipZipMart.mergeSort(arr, 0, arr.length - 1);

        for (Transaction t : arr) {
            System.out.println(t);
        }
    }
}

