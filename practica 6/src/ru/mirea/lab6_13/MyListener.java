package ru.mirea.lab6_13;

public class MyListener implements OnStringBuilderChangeListener {

    /*
        Определяем метод onChange
        В него передаётся stringBuilder, который "прослушивается"
     */
    @Override
    public void onChange(OvservableStringBuilder stringBuilder) {
        System.out.println("CHANGED: " + stringBuilder.toString());
    }
}
