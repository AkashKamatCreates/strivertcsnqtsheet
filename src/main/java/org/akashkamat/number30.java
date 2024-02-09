package org.akashkamat;
import static org.akashkamat.number18.FactorialRecursive;

public class number30 {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        System.out.println(Permutation(a, b));
    }
    public static int Permutation(int a, int b){
        int res = FactorialRecursive(5) / FactorialRecursive(a-b);
        return res;
    }
}
