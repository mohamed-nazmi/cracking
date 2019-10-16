package Chapter_08;

import java.util.ArrayList;

public class _04 {
    public static ArrayList<ArrayList<Integer>> getSubsets1(ArrayList<Integer> set) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> phi = new ArrayList<Integer>();
        result.add(phi);
        for (Integer value : set) {
            ArrayList<ArrayList<Integer>> newSubsets = new ArrayList<ArrayList<Integer>>();
            for (ArrayList<Integer> subset : result) {
                ArrayList<Integer> newSubset = new ArrayList<Integer>();
                newSubset.addAll(subset);
                newSubset.add(value);
                newSubsets.add(newSubset);
            }
            result.addAll(newSubsets);
        }
        return result;
    }

    public static ArrayList<ArrayList<Integer>> getSubsets2(ArrayList<Integer> set) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        int x = set.size();
        for (int i = 0; i < (1 << x); i++) {
            ArrayList<Integer> subset = new ArrayList<Integer>();
            for (int j = 0; j < x; j++) {
                if ((i & (1 << j)) != 0) {
                    subset.add(set.get(j));
                }
            }
            result.add(subset);
        }
        return result;
    }
}