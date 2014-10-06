package dto.staticdata.rune;

import dto.staticdata.BasicDataStats;
import dto.staticdata.Gold;
import dto.staticdata.Image;
import dto.staticdata.MetaData;

import java.util.List;
import java.util.Map;

public class Rune {

    private String colloq;
    private boolean consumeOnFull;
    private boolean consumed;
    private int depth;
    private String description;
    private List<String> from;
    private Gold gold;
    private String group;
    private boolean hideFromAll;
    private int id;
    private Image image;
    private boolean inStore;
    private List<String> into;
    private Map<String, Boolean> maps;
    private String name;
    private String plaintext;
    private String requiredChampion;
    private MetaData rune;
    private String sanitizedDescription;
    private int specialRecipe;
    private int stacks;
    private BasicDataStats stats;
    private List<String> tags;

    public String getColloq() {
        return colloq;
    }

    public boolean isConsumeOnFull() {
        return consumeOnFull;
    }

    public boolean isConsumed() {
        return consumed;
    }

    public int getDepth() {
        return depth;
    }

    public String getDescription() {
        return description;
    }

    public List<String> getFrom() {
        return from;
    }

    public Gold getGold() {
        return gold;
    }

    public String getGroup() {
        return group;
    }

    public int getId() {
        return id;
    }

    public boolean isHideFromAll() {
        return hideFromAll;
    }

    public Image getImage() {
        return image;
    }

    public boolean isInStore() {
        return inStore;
    }

    public Map<String, Boolean> getMaps() {
        return maps;
    }

    public List<String> getInto() {
        return into;
    }

    public String getName() {
        return name;
    }

    public String getPlaintext() {
        return plaintext;
    }

    public MetaData getRune() {
        return rune;
    }

    public String getRequiredChampion() {
        return requiredChampion;
    }

    public String getSanitizedDescription() {
        return sanitizedDescription;
    }

    public int getSpecialRecipe() {
        return specialRecipe;
    }

    public int getStacks() {
        return stacks;
    }

    public BasicDataStats getStats() {
        return stats;
    }

    public List<String> getTags() {
        return tags;
    }
}