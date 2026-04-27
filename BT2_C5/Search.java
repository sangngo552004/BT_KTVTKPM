package BT2_C5;
import java.util.List;

interface Search {
    /**
     * Tìm kiếm cuốn sách theo ID
     * @param books Danh sách sách
     * @param targetId ID cần tìm
     * @return Vị trí của cuốn sách trong danh sách, trả về -1 nếu không tìm thấy
     */
    int search(List<Book> books, int targetId);
}
