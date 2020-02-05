package com.spartaglobal.cob;

public class ArmstrongNumbers {

    public int checkArmstrongNumbers(int number){
        String str =Integer.toString(number);
        int cubedSum = 0;
        for(int i = 0; i< str.length(); i++){
            if(("-").equals(String.valueOf(str.charAt(i))) ){
                continue;
            }
            cubedSum = cubedSum + (int) Math.pow(Character.getNumericValue(str.charAt(i)), 3);

        }
        return cubedSum;
    }

    public boolean isArmstrongNumber(int number){
        if(number >= 0 && number == checkArmstrongNumbers(number)){
            System.out.println("This is an armstrong number " + number);
            return true;
        } else {
            System.out.println("This is not an armstrong number " + number);
            return false;
        }
    }
}
