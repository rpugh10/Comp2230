import java.util.Arrays;

public class ModifiedBSTree {

    private int capacity;
    private Integer values[];

    public ModifiedBSTree(int capacity){
        this.capacity = capacity;
        values = new Integer[capacity];
    }

    public String toString(){
        String levelOrder = "[";
        for(int i = 0; i < values.length; i++){
            levelOrder += values[i];
            if(i < values.length - 1){
                levelOrder += ", ";
            }
        }
        levelOrder += "]";
        return levelOrder;
    }

    public void insertHelper(int item, int index){
        if(index >= values.length){
            values = expandCapacity(values);
        }

        if(values[index] == null){
            values[index] = item;
            return;
        }

        if(item < values[index]){
            index = 2 * index  + 1;
            insertHelper(item, index);
        }else{
            index = 2 * (index + 1);
            insertHelper(item, index);
        }
    }

    public Integer[] expandCapacity(Integer[] old){
        Integer[] newArray = Arrays.copyOf(old, old.length * 2);
        return newArray;
    }

    public void insert(int item){
        insertHelper(item, 0);
    }


    
}
