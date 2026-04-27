package BT2_C5;
import java.util.List;

class LinearSearch implements Search {
    @Override
    public int search(List<Book> books, int targetId) {
    
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == targetId) {
                return i; 
            }
        }
        return -1;
    }
}
