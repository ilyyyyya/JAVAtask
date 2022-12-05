package ru.mirea.undo;


import java.util.LinkedList;
import java.util.function.Consumer;

public class UndoStringBuilder {
    private StringBuilder sb;
    private LinkedList<Consumer<StringBuilder>> commands = new LinkedList<>(); // consumer функциональный интерфейс, который принимает в качестве входного аргумента объект типа T, совершает некоторые действия, но при этом ничего не возвращает

    public UndoStringBuilder undo(){
        if(!commands.isEmpty()){
            commands.removeLast().accept(sb);
        }
        return this;
    }

    public UndoStringBuilder(){
        sb = new StringBuilder();
    }

    public UndoStringBuilder(int capacity){
        sb = new StringBuilder(capacity);
    }
    public UndoStringBuilder(CharSequence seq){
        sb=new StringBuilder(seq);
    }
    public UndoStringBuilder(String str){
        sb=new StringBuilder(str);
    }

    public UndoStringBuilder append(boolean b){
        int beginInd = sb.length();
        sb.append(b);
        int endInd = sb.length();
        commands.add(sb->sb.delete(beginInd,endInd));
        return this;
    }

    public UndoStringBuilder append(char c){
        sb.append(c);
        commands.add(sb->sb.delete(sb.length()-1,sb.length()));
        return this;
    }

    public UndoStringBuilder append(char[] str){
        int beginInd = sb.length();
        sb.append(str);
        int endInd = sb.length();
        commands.add(sb->sb.delete(beginInd,endInd));
        return this;
    }
    public UndoStringBuilder append(char[] str, int offset, int len) {
        int beginInd = sb.length();
        sb.append(str, offset, len);
        int endInd = sb.length();
        commands.add(sb -> sb.delete(beginInd, endInd));
        return this;
    }
    public UndoStringBuilder append(CharSequence s) {
        int beginInd = sb.length();
        sb.append(s);
        int endInd = sb.length();
        commands.add(sb -> sb.delete(beginInd, endInd));
        return this;
    }
    public UndoStringBuilder append(CharSequence s, int offset, int len) {
        int beginInd = sb.length();
        sb.append(s, offset, len);
        int endInd = sb.length();
        commands.add(sb -> sb.delete(beginInd, endInd));
        return this;
    }
    public UndoStringBuilder append(double d) {
        int beginInd = sb.length();
        sb.append(d);
        int endInd = sb.length();
        commands.add(sb -> sb.delete(beginInd, endInd));
        return this;
    }
    public UndoStringBuilder append(float f) {
        int beginInd = sb.length();
        sb.append(f);
        int endInd = sb.length();
        commands.add(sb -> sb.delete(beginInd, endInd));
        return this;
    }
    public UndoStringBuilder append(int i) {
        int beginInd = sb.length();
        sb.append(i);
        int endInd = sb.length();
        commands.add(sb -> sb.delete(beginInd, endInd));
        return this;
    }
    public UndoStringBuilder append(long l) {
        int beginInd = sb.length();
        sb.append(l);
        int endInd = sb.length();
        commands.add(sb -> sb.delete(beginInd, endInd));
        return this;
    }
    public UndoStringBuilder append(Object obj) {
        int beginInd = sb.length();
        sb.append(obj);
        int endInd = sb.length();
        commands.add(sb -> sb.delete(beginInd, endInd));
        return this;
    }
    public UndoStringBuilder append(String str) {
        int beginInd = sb.length();
        sb.append(str);
        int endInd = sb.length();
        commands.add(sb -> sb.delete(beginInd, endInd));
        return this;
    }
    public UndoStringBuilder append(StringBuffer stringBuffer) {
        int beginInd = sb.length();
        sb.append(stringBuffer);
        int endInd = sb.length();
        commands.add(sb -> sb.delete(beginInd, endInd));
        return this;
    }
    public UndoStringBuilder appendCodePoint(int codePoint) {
        int beginInd = sb.length();
        sb.appendCodePoint(codePoint);
        int endInd = sb.length();
        commands.add(sb -> sb.delete(beginInd, endInd));
        return this;
    }
    public int capacity() {
        return sb.capacity();
    }
    public char charAt(int index) {
        return sb.charAt(index);
    }
    public int codePointAt(int index) {
        return sb.codePointAt(index);
    }
    public int codePointBefore(int index) {
        return sb.codePointBefore(index);
    }
    public int codePointCount(int beginInd, int endInd) {
        return sb.codePointCount(beginInd, endInd);
    }
    public UndoStringBuilder delete(int beginInd, int endInd) {
        String tempStr = sb.substring(beginInd, endInd);
        commands.add(sb -> sb.insert(beginInd, tempStr));
        sb.delete(beginInd, endInd);
        return this;
    }
    public UndoStringBuilder deleteCharAt(int index) {
        char ch = sb.charAt(index);
        commands.add(sb -> sb.insert(index, ch));
        sb.deleteCharAt(index);
        return this;
    }
    public void ensureCapacity(int minCapacity) {
        sb.ensureCapacity(minCapacity);
    }
    public void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) {
        sb.getChars(srcBegin, srcEnd, dst, dstBegin);
    }
    public int indexOf(String str) {
        return sb.indexOf(str);
    }
    public int indexOf(String str, int indexFrom) {
        return sb.indexOf(str, indexFrom);
    }
    public UndoStringBuilder insert(int offset, boolean b) {
        int beginInd = sb.length();
        sb.insert(offset, b);
        int endInd = sb.length();
        commands.add(sb -> sb.delete(offset, offset + (endInd - beginInd)));
        return this;
    }
    public UndoStringBuilder insert(int offset, char ch) {
        sb.insert(offset, ch);
        commands.add(sb -> sb.delete(offset, offset + 1));
        return this;
    }
    public UndoStringBuilder insert(int offset, char[] str) {
        sb.insert(offset, str);
        commands.add(sb -> sb.delete(offset, offset + str.length));
        return this;
    }
    public UndoStringBuilder insert(int index, char[] str, int offset, int len) {
        sb.insert(index, str, offset, len);
        commands.add(sb -> sb.delete(index, index + len));
        return this;
    }
    public UndoStringBuilder insert(int offset, double d) {
        int beginInd = sb.length();
        sb.insert(offset, d);
        int endInd = sb.length();
        commands.add(sb -> sb.delete(offset, offset + (endInd - beginInd)));
        return this;
    }

    public UndoStringBuilder insert(int offset, float f) {
        int beginInd = sb.length();
        sb.insert(offset, f);
        int endInd = sb.length();
        commands.add(sb -> sb.delete(offset, offset + (endInd - beginInd)));
        return this;
    }

    public UndoStringBuilder insert(int offset, int i) {
        int beginInd = sb.length();
        sb.insert(offset, i);
        int endInd = sb.length();
        commands.add(sb -> sb.delete(offset, offset + (endInd - beginInd)));
        return this;
    }

    public UndoStringBuilder insert(int offset, long l) {
        int beginInd = sb.length();
        sb.insert(offset, l);
        int endInd = sb.length();
        commands.add(sb -> sb.delete(offset, offset + (endInd - beginInd)));
        return this;
    }
    public UndoStringBuilder insert(int dstOffset, CharSequence s) {
        sb.insert(dstOffset, s);
        commands.add(sb -> sb.delete(dstOffset, dstOffset + s.length()));
        return this;
    }
    public UndoStringBuilder insert(int dstOffset, CharSequence s, int beginInd, int endInd) {
        sb.insert(dstOffset, s, beginInd, endInd);
        commands.add(sb -> sb.delete(dstOffset, dstOffset + (endInd - beginInd)));
        return this;
    }
    public UndoStringBuilder insert(int offset, String str) {
        sb.insert(offset, str);
        commands.add(sb -> sb.delete(offset, offset + str.length()));
        return this;
    }
    public int lastIndexOf(String str) {
        return sb.lastIndexOf(str);
    }
    public int lastIndexOf(String str, int fromIndex) {
        return sb.lastIndexOf(str, fromIndex);
    }
    public int lenght() {
        return sb.length();
    }
    public  int offsetByCodePoints(int index, int codePointOffset) {
        return sb.offsetByCodePoints(index, codePointOffset);
    }
    public UndoStringBuilder replace(int beginInd, int endInd, String str) {
        String tmpStr = sb.substring(beginInd, endInd);
        commands.add(sb -> sb.replace(beginInd, beginInd + str.length(), tmpStr));
        sb.replace(beginInd, endInd, str);
        return this;
    }
    public  UndoStringBuilder reverse() {
        commands.add(sb -> sb.reverse());
        sb.reverse();
        return this;
    }
    public void setCharAt(int index, char ch) {
        char tmpC = sb.charAt(index);
        commands.add(sb -> sb.setCharAt(index, tmpC));
        sb.setCharAt(index, ch);
    }
    public void setLength(int newLength) {
        int length = sb.length();
        commands.add(sb -> sb.setLength(length));
        sb.setLength(newLength);
    }
    public CharSequence subSequence(int beginInd, int endInd) {
        return sb.subSequence(beginInd, endInd);
    }
    public String substring(int beginInd) {
        return sb.substring(beginInd);
    }
    public String substring(int beginInd, int endInd) {
        return sb.substring(beginInd, endInd);
    }
    public String toString() {
        return sb.toString();
    }

    public void trimToSize() {
        sb.trimToSize();
    }

}
