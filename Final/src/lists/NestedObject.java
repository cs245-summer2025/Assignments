package lists;

import java.util.ArrayList;
import java.util.List;

public class NestedObject {
    private Integer item;
    private boolean isInteger;
    private List<NestedObject> children;

    public NestedObject(Integer value){
        item = value;
        isInteger = true;
        children = new ArrayList<>();
    }

    public NestedObject(){
        item = null;
        isInteger = false;
        children = new ArrayList<>();
    }

    public void addNestedElement(NestedObject childNode){
        children.add(childNode);
        isInteger = false;
        setItemValue(null);
    }

    public void setNestedList(List<NestedObject> children){
        for(NestedObject no: children){
            addNestedElement(no);
        }
    }

    public void setItemValue(Integer value){
        if(representsInteger()){
            this.item = value;
        } else {
            this.item = null;
        }
    }

    public boolean representsInteger(){
        return isInteger;
    }
    public List<NestedObject> getNestedList(){
        return children;
    }

    public Integer getValue(){
        return item;
    }

}
