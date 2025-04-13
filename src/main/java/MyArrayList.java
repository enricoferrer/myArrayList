public class MyArrayList {
    private final String[] list;
    private int size;

    public MyArrayList(){
        list = new String[10];
        size = 0;
    }

    public void add(String value){
        if (size == list.length){
            String[] newList = new String[size * 2];
            for (int i = 0; i < size; i++){
                newList[i] = list[i];
            }
        }
        list[size] = value;
        size++;
    }

    public String get(int index){
        checkIndex(index);
        return list[index];
    }

    public void set(int index, String value){
        checkIndex(index);
        list[index] = value;
    }

    public boolean remove(int index){
        checkIndex(index);
        try {
            if (index < size){
                for (int i = index ; i < size; i++){
                    list[i] = list[i + 1];
                }
                size--;
                return true;
            } else {
                throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
            }
        }catch (ArrayIndexOutOfBoundsException e){
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
        }
    }

    public boolean remove(String value){
        for (int i = 0; i < size; i++){
            if (list[i].equals(value)){
                remove(i);
            }
        }
        return false;
    }

    public int getSize(){
        return size;
    }

    public String toString(){
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < size; i++){
            string.append(list[i]);
            if (i != size - 1){
                string.append(", ");
            }
        }
        return string.toString();
    }

    private void checkIndex(int index){
        if (index > size || index < 0){
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
        }
    }

    private String outOfBoundsMsg(int index){
        return "Invalid Index:" + index;
    }

}
