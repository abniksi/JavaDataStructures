public class Main{
  public static void main(String[] args){
    int maxSize = 100;
    OrderedArray array = new OrderedArray(maxSize);

    array.insert(43);
    array.insert(532);
    array.insert(32);
    array.insert(643);
    array.insert(34);
    array.insert(84);
    array.insert(1);
    array.insert(85);
    array.insert(123);
    array.insert(17);
    array.insert(549);

    array.display();

    int searchKey = 123;
    if(array.find(searchKey) != array.size()){
      System.out.println("Found " + searchKey);
    }else{
      System.out.println("Cannot find " + searchKey);
    }

    array.delete(549);
    array.delete(17);
    array.delete(34);

    array.display();
  }
}