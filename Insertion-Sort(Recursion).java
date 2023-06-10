Class Solution{
  static void InsertionSort(int arr[], int i){
    int n = arr.length;
    if (i==n) return;
    
    int j = i;
    while (j>0 && arr[j-1]>arr[j]){
      int temp = arr[j-1];
      arr[j-1] = arr[j];
      arr[j] = temp;
      j--;
    }
    InsertionSort(arr, i+1);
  }
