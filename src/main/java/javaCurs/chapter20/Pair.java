package javaCurs.chapter20;

//20.8
public class Pair <F, S> {
    private F first;
    private S second;

    public static void main(String[] args) {
        Pair pair1 = new Pair("day of birth", 9);
        Pair pair2 = new Pair("084", 'T');
        Pair pair3 = new Pair(1, 2.5);
        Pair pair4 = new Pair("PI", Math.PI);
        Pair pair5 = new Pair(true, null);

        System.out.println("pair nr.1 contains: " + pair1);
        System.out.println("pair nr.2 contains: " + pair2);
        System.out.println("pair nr.3 contains: " + pair3);
        System.out.println("pair nr.4 contains: " + pair4);
        System.out.println("pair nr.5 contains: " + pair5);
    }

    public Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public void setFirst(F first) {
        this.first = first;
    }

    public F getFirst() {
        return this.first;
    }

    public void setSecond(S second) {
        this.second = second;
    }

    public S getSecond() {
        return this.second;
    }

    public String toString() {
        return String.format("[%s, %s]", getFirst(), getSecond());
    }
}
