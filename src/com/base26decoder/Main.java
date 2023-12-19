package com.base26decoder;

public class Main {
    public static void main(String[] args) {
        if (args.length<1) {
            System.out.println("You must pass an argument to decode!");
            System.exit(-1);
        }
        String userIntId = Base26Decoder.fromBase26(args[0]);
        System.out.println("Encoded: " + args[0] + " decoded: " + userIntId);
    }
}
