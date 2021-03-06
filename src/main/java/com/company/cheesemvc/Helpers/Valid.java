package com.company.cheesemvc.Helpers;

public class Valid {

    static String[] allowed = {"A","E","I","O","U","Y","B","C","D","F","G","H","K","L","M","N"," ","R","S","T",".",",","J","P","Q","V","W","X","Z","!"};


    public static Boolean validCheese(String cheese) {
        int valids = 0;
        for (int i = 0; i < cheese.length(); i++){
            char ch = cheese.toUpperCase().charAt(i);
            for(int j = 0; j < allowed.length; j++){
                String al = allowed[j];
                if (al.charAt(0) == ch){
                    valids++;
                    break;
                }
            }
        }
        if (valids == cheese.length() && !cheese.equals("")){
            return true;
        }

        return false;
    }

    public static Boolean validDescription(String description) {
        int valids = 0;
        if (!description.equals("")){
            for (int i = 0; i < description.length(); i++){
                char ch = description.toUpperCase().charAt(i);
                for(int j = 0; j < allowed.length; j++){
                    String al = allowed[j];
                    if (al.charAt(0) == ch){
                        valids++;
                        break;
                    }
                }
            }
        }

        if (valids == description.length()){
            return true;
        }

        return false;
    }
}
