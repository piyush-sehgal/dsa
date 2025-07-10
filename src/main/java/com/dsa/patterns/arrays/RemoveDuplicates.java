package com.dsa.patterns.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RemoveDuplicates {
//    public static int removeDuplicates(int[] nums) {
//        int j = 1;
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i] != nums[i - 1]) {
//                nums[j] = nums[i];
//                j++;
//            }
//        }
//        return j;
//    }

    static int removeDuplicates(int[] arr) {

        // To track seen elements
        HashSet<Integer> s = new HashSet<>();

        // To maintain the new size of the array
        int idx = 0;

        for (int i = 0; i < arr.length; i++) {
            if (!s.contains(arr[i])) {
                s.add(arr[i]);
                arr[idx++] = arr[i];
            }
        }

        // Return the size of the array
        // with unique elements
        return idx;
    }

    public static void main(String[] args) {
        int[] arr = {92, 13, 4, 8, 79, 40, 82, 49, 9, 23, 24, 25, 26, 29, 31, 32, 33, 34, 41, 10, 11, 12, 16, 3, 56, 18, 67, 7,14, 17, 19, 20, 22, 71, 74, 21, 5, 6, 72, 87, 1, 2, 46, 95};
        Arrays.sort(arr);
        System.out.println("Size with duplicates: "+ arr.length);
        int newSize = removeDuplicates(arr);
        System.out.println("No duplicates size: " + newSize);
        for (int i = 0; i < newSize; i++) {
            System.out.print(arr[i] + ", ");
        }

//        String strArrr[] = {"TLLU1175186", "MNBU0304394", "TTNU8355746", "BULK0005612", "BULK0005615", "BULK0005616", "BULK0005613", "BULK0005614", "TEMU9529691", "SEGU9453141", "MEDU9862689", "OTPU6098132", "SZLU9351478", "BMOU9605020", "OTPU6108170", "IKSU2525799", "CGMU5367645", "BULK0005654", "BULK0005652", "BULK0005655", "BULK0005653", "BULK0005643", "BULK0005645", "BULK0005642", "BULK0005644", "BULK0005651", "BULK0005646", "BULK0005648", "BULK0005647", "BULK0005650", "MCAU6036303", "MMAU1441849", "MCAU6053363", "CRSU6061118", "OTPU6082476", "BMOU9352318", "CAIU5582328", "BMOU9305980", "BMOU9330561", "BMOU9330833", "BMOU9296699", "BMOU9247035", "SEGU9683503", "SEGU9625256", "SEGU9695079", "SEGU9611669", "SEGU9695778", "SEKU9177367", "SEGU9445188", "BULK0005743", "MEDU9714212", "MSCU7319280", "TRIU8743345", "CRSU6067883", "MEDU9095226", "GESU9559709", "BULK0005763", "BMOU9297490", "BMOU9351158", "SEGU9627290", "TTNU8028656", "TEMU9271570", "SEGU9603365", "FBIU5438390", "SEGU9598485", "TRIU8038849", "CXRU1391013", "GESU9536920", "CHIU9037291", "TEMU9029525", "MSCU7443270", "TRIU8060858", "GESU9392458", "MNBU3768280", "MCAU6028416", "MMAU1146695", "MNBU3468046", "MNBU0608592", "MNBU0541159", "MNBU0239262", "MNBU3310852", "MNBU3418997", "MNBU3572636", "MNBU3303576", "TLLU1225311", "MNBU0511750", "MNBU3517074", "MMAU1061598", "MNBU3669251", "MNBU4381188", "MMAU1242180", "MMAU1099320", "CMCU5568621", "FBIU5364467", "SEGU9523151", "CAIU5542161", "MEDU9688920", "MEDU9827754", "TEMU9000250", "TTNU8719030", "CGMU6976820", "TEMU9109554", "TTNU8112181", "OTPU6323059", "CGMU6591860", "MEDU9632140", "MSCU7413656", "MMAU1351196", "MMAU1405395", "MMAU1102911", "CXRU1534243", "TEMU9001467", "MSCU7325262", "CRLU1407732", "CAAU4009983", "CMCU5568534", "CAAU4007126", "IKSU2527127", "TTNU8513570", "CMCU5576709", "CMCU5570906"};
//        System.out.println("Before: " + strArrr.length);
//        final List<String> collect = Arrays.stream(strArrr).collect(Collectors.groupingBy(s -> s, Collectors.<String>counting())).entrySet().stream().filter(a -> a.getValue() == 1).map(Map.Entry::getKey).collect(Collectors.toList());
//        System.out.println("After: " + collect.size());
//        System.out.println(collect);
    }
}
