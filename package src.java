package src.models;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Item> items;

    public Menu() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }

    @Override
    public String toString() {
        StringBuilder menuString = new StringBuilder("Cardápio:\n");
        for (int i = 0; i < items.size(); i++) {
            menuString.append(i + 1).append(". ").append(items.get(i).toString()).append("\n");
        }
        return menuString.toString();
    }
}