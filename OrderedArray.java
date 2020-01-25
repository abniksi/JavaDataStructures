public class OrderedArray{
  private int[] array;
  private int numberOfElements;

  public OrderedArray(int max){
    array = new int[max];
    numberOfElements = 0;
  }

  public int size(){
    return numberOfElements;
  }

  public int find(int searchKey){
    int lowerBound = 0;
    int upperBound = numberOfElements - 1;
    int currentIndex;

    while(true){
      currentIndex = (lowerBound + upperBound) / 2;
      if(array[currentIndex] == searchKey){
        return currentIndex;
      }else if(lowerBound > upperBound){
        return numberOfElements;
      }else{
        if(array[currentIndex] < searchKey){
          lowerBound = currentIndex + 1;
        }else{
          upperBound = currentIndex - 1;
        }
      }
    }
  }

  public void insert(int value){
    int i;
    for(i = 0; i < numberOfElements; i++){
      if(array[i] > value){
        break;
      }
    }
    for(int x = numberOfElements; x > i; x--){
      array[x] = array[x - 1];
    }
    array[i] = value;
    numberOfElements++;
  }

  public boolean delete(int value){
    int j = find(value);
    if(j == numberOfElements){
      System.out.println("Value is not in array");
      return false;
    }else{
      for(int i = j; i < numberOfElements;i++){ 
        array[i] = array[i + 1];
      }
    }
    numberOfElements--;
    return true;
  }

  public void display(){
    for(int i = 0; i < numberOfElements; i++){
      System.out.println(array[i]);
    }
  }
}