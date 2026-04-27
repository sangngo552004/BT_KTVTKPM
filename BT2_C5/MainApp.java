package BT2_C5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        // Tạo danh sách các cuốn sách (chưa được sắp xếp)
        List<Book> library = new ArrayList<>();
        library.add(new Book(105, "Java Programming"));
        library.add(new Book(101, "Data Structures"));
        library.add(new Book(109, "Design Patterns"));
        library.add(new Book(103, "Clean Code"));
        library.add(new Book(107, "Operating Systems"));

        System.out.println("=== Danh sach ban dau ===");
        for (Book b : library) System.out.println(b);

        int targetId = 103; // ID cuốn sách cần tìm

        // --- KIỂM TRA TÌM KIẾM TUẦN TỰ ---
        System.out.println("\n[1] --- (Linear Search) ---");
        Search linearAlgo = new LinearSearch();
        int indexLinear = linearAlgo.search(library, targetId);
        if (indexLinear != -1) {
            System.out.println("-> Tim thay sach (ID " + targetId + ") tai index: " + indexLinear);
        }

        // --- KIỂM TRA TÌM KIẾM NHỊ PHÂN ---
        System.out.println("\n[2] --- (Binary Search) ---");
        // Lưu ý quan trọng: Binary Search BẮT BUỘC danh sách phải được sắp xếp trước
        Collections.sort(library); 
        System.out.println("Danh sach sau khi sap xep:");
        for (Book b : library) System.out.println(b);

        Search binaryAlgo = new BinarySearch();
        int indexBinary = binaryAlgo.search(library, targetId);
        if (indexBinary != -1) {
            System.out.println("-> TTim thay sach (ID " + targetId + ") tai index: " + indexBinary);
        }
    }
}
