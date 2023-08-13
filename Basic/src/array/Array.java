package array;
// 자료형[] 배열 이름 = new 자료형[개수];
// 자료형 배열 이름[] = new 자료형[개수];

public class Array {
    public static void main(String[] args) {
        int[] studentIDs = new int[10];
        int[] studentIDs_init = {102, 103, 104};

        studentIDs[0] = 100;
        int length1 = studentIDs.length;
        int length2 = studentIDs_init.length;
        System.out.println(length1);
        System.out.println(length2);
    }
}
