package BT2_C5;
import java.util.List;

class BinarySearch implements Search {
    @Override
    public int search(List<Book> books, int targetId) {
        int left = 0;
        int right = books.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midId = books.get(mid).getId();

            if (midId == targetId) {
                return mid; 
            }
            if (midId < targetId) {
                left = mid + 1; 
            } else {
                right = mid - 1; 
            }
        }
        return -1;
    }
}
