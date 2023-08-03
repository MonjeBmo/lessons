package lesson2;

public class operation {

    public int plus(int n1, int n2) {
        return (n1 + n2);
    }

    public int minus(int n1, int n2) {
        return (n1 - n2);
    }

    public int multiply(int n1, int n2) {
        return (n1 * n2);
    }

    public int div(int n1, int n2) {
        return (n1 / n2);
    }

    public int maxOrMin(int n1, int n2) {
        if (n1 >= n2)
            return n1;
        return n2;
    }

}
