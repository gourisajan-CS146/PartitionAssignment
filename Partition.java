public class Partition { 

public static int lomuto(int arr[],int low, int high){

  if (arr.length == 0) {
            return -1;
        }

int pivot = arr[high];
        int i = low - 1;

for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

public static int hoarePartition(int[] arr, int low, int high) {

if (arr.length == 0) {
            return -1;
        }
int pivot = arr[low];
        int left = low - 1;
        int right = high + 1;

        while (true) {

            do {
                left++;
            } while (arr[left] < pivot);

            do {
                right--;
            } while (arr[right] > pivot);

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



