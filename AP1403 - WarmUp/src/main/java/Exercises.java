public class Exercises {
    public boolean isPrime(long n) {
        if(n == 1) return false;
        for(long i = 3;i*i <= n;i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    /*
        implement an algorithm to find out the index of input number in a fibonacci sequence starting from 0, 1
        e.g. 0, 1, 1, 2, 3, 5, ...
        indices start from 0, e.g. 3 is the index 4 of this sequence
        if the input is not a fibonacci number with description above, return -1
     */
    public long fibonacciIndex(long n) {
        if(n == 0)return 0;
        int index = 1;
        int a1 = 0;
        int a2 = 1;
        while(a2 < n){
            int a3 = a1 + a2;
            a1 = a2;
            a2 = a3;
            index++;
        }
        if(a2 != n){
            return -1;
        }
        return index;
    }

    /*
        you should create a triangle with "*" and return a two-dimensional array of characters based on that
        the triangle's area is empty, which means some characters should be " "

        example 1, input = 3:
        *
        **
        ***

        example 2, input = 5:
        *
        **
        * *
        *  *
        *****

        the output has to be a two-dimensional array of characters, so don't just print the triangle!
     */
    public char[][] generateTriangle(int n) {
        char[][] result = new char[n][];     
        for (int i = 0; i < n; i++) {
            result[i] = new char[i + 1];        
            for (int j = 0; j <= i; j++) {
                if(i == n - 1) { 
                    result[i][j] = '*';
                } else {
                    if(j == 0 || j == i) {
                        result[i][j] = '*';
                    } else {
                        result[i][j] = ' ';
                    }
                }
            }
        }       
        return result;
    }
    

    public static void main(String[] args) {
        Exercises ex = new Exercises();
        ex.generateTriangle(5);
    }
}
