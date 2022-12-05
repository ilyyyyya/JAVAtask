package ru.mirea.undo;


public class Main {
    public static void main(String[] args) {
        UndoStringBuilder undoStringBuilder = new UndoStringBuilder("test ");

        System.out.println("====Append(before/after undoing)====");

        System.out.print("Boolean: " + undoStringBuilder.append(true));
        System.out.println(" " + undoStringBuilder.undo());

        System.out.print("Char: " + undoStringBuilder.append('C'));
        System.out.println(" " + undoStringBuilder.undo());

        char[] c = "CHAR".toCharArray();
        System.out.print("CharArray: " + undoStringBuilder.append(c));
        System.out.println(" " + undoStringBuilder.undo());


        System.out.print("CharArray whit offset: " + undoStringBuilder.append(c, 2, 2));
        System.out.println(" " + undoStringBuilder.undo());

        System.out.print("String: " + undoStringBuilder.append("STRING"));
        System.out.println(" " + undoStringBuilder.undo());

        System.out.print("Int: " + undoStringBuilder.append(123));
        System.out.println(" " + undoStringBuilder.undo());

        System.out.print("Long: " + undoStringBuilder.append(1234567891012L));
        System.out.println(" " + undoStringBuilder.undo());

        System.out.print("Float: " + undoStringBuilder.append(1.1f));
        System.out.println(" " + undoStringBuilder.undo());

        System.out.print("Double: " + undoStringBuilder.append(12345.12345));
        System.out.println(" " + undoStringBuilder.undo());


        System.out.println();
        System.out.println("====Insert====");
        System.out.println("Before undoing:");
        System.out.println("Begin string: " + undoStringBuilder);
        System.out.println("Boolean: " + undoStringBuilder.insert(2,true));
        System.out.println("Char: " + undoStringBuilder.insert(0, 'C'));
        System.out.println("CharArray: " + undoStringBuilder.insert(undoStringBuilder.lenght(), c));
        System.out.println("CharArray whit offset: " + undoStringBuilder.insert(undoStringBuilder.lenght(), c, 2, 2));
        System.out.println("String: " + undoStringBuilder.insert(0, "STRING"));
        System.out.println("Int: " + undoStringBuilder.insert(3, 123));
        System.out.println("Long: " + undoStringBuilder.insert(9, 1234567891012L));
        System.out.println("Float: " + undoStringBuilder.insert(undoStringBuilder.lenght(), 1.1f));
        System.out.println("Double: " + undoStringBuilder.insert(31, 12345.12345));

        System.out.println("Undoing:");
        System.out.println(undoStringBuilder);
        for (int i = 0; i < 9; i++) {
            System.out.println(undoStringBuilder.undo());
        }

        System.out.println();
        System.out.println("====Reverse and Replace====");
        System.out.println("Begin string: " + undoStringBuilder);
        System.out.println("Reverse: " + undoStringBuilder.reverse());
        System.out.println("Replace: " + undoStringBuilder.replace(0, 2, "TEST"));
        undoStringBuilder.setCharAt(5, 'T');
        System.out.println("Set char: " + undoStringBuilder);




    }
}
