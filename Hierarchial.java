package Guvi;

import java.util.Collection;
import java.util.TreeMap;

public class Hierarchial {

    private Collection<TreeMap> children;
    private String caption;

    public void TreeNode(Collection<TreeMap> children, String caption) {
        this.children = children;
        this.caption = caption;
    }

    public Collection<TreeMap> getChildren() {
        return children;
    }

    public void setChildren(Collection<TreeMap> children) {
        this.children = children;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

}

