package ru.mirea.lab32;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        TerritoriesInfo territoryInfo = new TerritoriesInfo("У России 10 провинций, У Франции 8 провинций");
        ResourcesInfo resourcesInfo = new ResourcesInfo("У России 80 золота, У Франции 90 золота");
        DiplomacyInfo diplomacyInfo = new DiplomacyInfo("Франция воюет с Россией, Испания заняла позицию нейтралитета");

        Game saveGame = new Game(territoryInfo,resourcesInfo,diplomacyInfo);

        FileOutputStream outputStream = new FileOutputStream("C:\\Users\\Ilya\\OneDrive\\Рабочий стол\\game.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        objectOutputStream.writeObject(saveGame);

        objectOutputStream.close();


        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Ilya\\OneDrive\\Рабочий стол\\game.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Game savedGame = (Game) objectInputStream.readObject();
        System.out.println(savedGame);
    }
}
