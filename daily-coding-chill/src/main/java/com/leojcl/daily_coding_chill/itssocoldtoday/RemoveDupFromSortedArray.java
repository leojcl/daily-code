package com.leojcl.daily_coding_chill.itssocoldtoday;

public class RemoveDupFromSortedArray {
    public static int removeDuplicates(int [] nums){
        int n = nums.length;
        if(n <= 1) return n;

        // phần tử đầu tiên index = 0, nên ta sẽ gán write cho index tiếp theo
        int write = 1;

        // tạo read để duyệt từ đầu đến cuối mảng tìm các phần tử khác nhau
        for(int read = 1; read < n; read++){
            // so sánh phần từ đang đọc với phần tử unique cuối cùng đã lưu
            if(nums[read] != nums[write-1]){
                // nếu khác nhau thì bạn sẽ ghi giá trị mới unique này vào vị trí write
                nums[write] = nums[read];
                write++;
            }
        }
        return  write;

    }
}
