package ru.mirea.lab32;

import java.io.Serializable;
import java.util.Arrays;

public class Game implements Serializable {

   private TerritoriesInfo territoriesInfo;
   private ResourcesInfo resourcesInfo;
   private DiplomacyInfo diplomacyInfo;

    public Game(TerritoriesInfo territoriesInfo, ResourcesInfo resourcesInfo, DiplomacyInfo diplomacyInfo) {
        this.territoriesInfo = territoriesInfo;
        this.resourcesInfo = resourcesInfo;
        this.diplomacyInfo = diplomacyInfo;
    }

    public TerritoriesInfo getTerritoriesInfo() {
        return territoriesInfo;
    }

    public void setTerritoriesInfo(TerritoriesInfo territoriesInfo) {
        this.territoriesInfo = territoriesInfo;
    }

    public ResourcesInfo getResourcesInfo() {
        return resourcesInfo;
    }

    public void setResourcesInfo(ResourcesInfo resourcesInfo) {
        this.resourcesInfo = resourcesInfo;
    }

    public DiplomacyInfo getDiplomacyInfo() {
        return diplomacyInfo;
    }

    public void setDiplomacyInfo(DiplomacyInfo diplomacyInfo) {
        this.diplomacyInfo = diplomacyInfo;
    }

    @Override
    public String toString() {
        return "Game{" +
                "territoriesInfo=" + territoriesInfo +
                ", resourcesInfo=" + resourcesInfo +
                ", diplomacyInfo=" + diplomacyInfo +
                '}';
    }
}
