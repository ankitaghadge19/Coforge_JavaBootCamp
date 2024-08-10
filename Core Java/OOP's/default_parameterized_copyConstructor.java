class ATS {
    int a, b, c;

    public ATS() {
        a = 0;
        b = 0;
        c = 0;
    }

    public ATS(int x, int y, int z) {
        a = x;
        b = y;
        c = z;
    }

    // Constructor for copying ATS objects
    public ATS(ATS T) {
        a = T.a;
        b = T.b;
        c = T.c;
    }

    void output() {
        System.out.println(a + " " + b + " " + c);
    }

    // Method to set the values
    void setValues(int x, int y, int z) {
        a = x;
        b = y;
        c = z;
    }
}

class default_parameterized_copyConstructor{
    public static void main(String[] args) {
        ATS p = new ATS();
        p.output();

        ATS s = new ATS(10, 20, 30);
        s.output();

        ATS t = new ATS(s);
        t.output();
    }
}
