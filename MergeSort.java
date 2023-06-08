class Solution
{
    void merge(int arr[], int l, int m, int r)
    {
        ArrayList<Integer> temp = new ArrayList<>();
        int low = l;
        int high = m+1;
        
        while (low<= m && high <=r){
            if (arr[low] <= arr[high]){
                temp.add(arr[low]);
                low++;
            } else {
                temp.add(arr[high]);
                high++;
            }
        }
        
        while (low <= m){
            temp.add(arr[low]);
            low++;
        }
    
        while (high <= r){
            temp.add(arr[high]);
            high++;
        }
        
        for (int i = l; i <= r; i++) {
            arr[i] = temp.get(i - l);
        }
    }
    void mergeSort(int arr[], int l, int r)
    {
        if (l>=r) return;
        int m = (l+r)/2;
        
        mergeSort(arr,l,m);
        mergeSort(arr, m+1, r);
        merge(arr,l,m,r);

    }
}
