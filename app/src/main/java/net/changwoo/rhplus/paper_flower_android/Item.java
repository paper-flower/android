package net.changwoo.rhplus.paper_flower_android;

/**
 * Created by rhee on 18/06/2018.
 */

public class Item {
    private int icon;
    private String name;

    public int getIcon() {
        return icon;
    }

    public String getName() {
        return name;
    }

    public Item(int icon, String name) {
        this.icon = icon;
        this.name = name;
    }
}
