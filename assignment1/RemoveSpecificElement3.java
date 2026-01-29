package assignment1;

import java.util.Arrays;

public class RemoveSpecificElement3 {


        // Q3: برنامج لإزالة عنصر معيّن من مصفوفة
        public static void main(String[] args) {

            int[] array = {1, 2, 3, 2, 4, 2, 5};
            int elementToRemove = 2;

            // حساب عدد العناصر التي ستبقى بعد الحذف
            int count = 0;
            for (int value : array) {
                if (value != elementToRemove) {
                    count++;
                }
            }

            // إنشاء مصفوفة جديدة بالحجم المناسب
            int[] newArray = new int[count];
            int index = 0;

            // نسخ العناصر إلى المصفوفة الجديدة بدون العنصر المحذوف
            for (int value : array) {
                if (value != elementToRemove) {
                    newArray[index] = value;
                    index++;
                }
            }

            // طباعة النتائج (بالإنجليزي)
            System.out.println("Array before removal: " + Arrays.toString(array));
            System.out.println("Array after removal:  " + Arrays.toString(newArray));
        }
    }

