package com.knowledge.string;

public class ReplaceACharacter {
    public static void main(String[] args) {
        System.out.println(
                replace("helloABCworld", "ABC", "C", new StringBuilder())
        );
    }

    static String replace(String str, String target, String replace, StringBuilder sb) {
        int i = str.indexOf(target);
        if (i == -1) {
            return str;
        }
        sb.append(str, 0, i);
        sb.append(replace);
        sb.append(str.substring(i + replace.length() + 1));
        return replace(sb.toString(), "AB", "C", new StringBuilder());
    }
}
