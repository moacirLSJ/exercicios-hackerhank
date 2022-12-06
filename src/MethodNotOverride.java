public class MethodNotOverride {
    public static void main(String[] args) {
        //any size of parameter
        add(3,4,9,12,10);
    }

    private static void add(int... n) {
        int s = 0;
        StringBuilder t = new StringBuilder();

        for (int i = 1; i < n.length; i++) {
            s += n[i];
            t.append("+"+n[i]);
        }
        s+=n[0];
        t.insert(0, n[0]);
        t.append("=").append(s);
        System.out.println(t);
    }
}
