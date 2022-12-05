package ru.mirea.lab6_13;

public interface OnStringBuilderChangeListener {
    void onChange(OvservableStringBuilder stringBuilder);

    /*
    Слушатель.
    Каждый раз, когда меняется связанный с ним UndobleStringBuilder,
    вызывается метод onChange().
            */
}
