public class Partition { 

  // lomuto partition  partitions so elements less than piviot on left and greater than on the right  , piviot is the last element , returns index of piviot 

public static int lomuto(int arr[],int low, int high){

  if (arr.length == 0) {
            return -1;
        }

int pivot = arr[high];
        int i = low - 1;

for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;

              
  //place piviot in correct position on array 
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            }
        }

int temp = arr[i + 1];
        arr[i + 1] = arr[high];  // piviot is last element 
        arr[high] = temp;  

        return i + 1;  // return pivot index 
    }

public static int hoarePartition(int[] arr, int low, int high) {

// check if arr is empty 
  if (arr.length == 0) {
            return -1;
        }
int pivot = arr[low];
        int left = low - 1;
        int right = high + 1;

        while (true) {
           //move left index until arr[left ] >= piviot
            do {
                left++;
            } while (arr[left] < pivot);
    // move right index until arr[right] <= piviot 
            do {
                right--;
            } while (arr[right] > pivot);

          // if Left and right pointer cross its done  
          if (left >= right) {
                return right;
            }

            // swap
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
    }
}



