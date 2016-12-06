package nyc.c4q.huilin.a12_05_design_patterns.Builder;

/**
 * Created by huilin on 12/5/16.
 */

public class ClasstoBeBuilt {

    private String mA;
    private String mB;
    private int mC;
    private int mD;
    private double mE;
    private Class<?> mF;

    public ClasstoBeBuilt(
            String a,
            String b,
            int c,
            int d,
            double e,
            Class<?> f
    ) {
        this.mA = a;
        this.mB = b;
        this.mC = c;
        this.mD = d;
        this.mE = e;
        this.mF = f;
    }

    public static class Builder {

        // must have default values of what you want the class being built to have
        private String mA = "a";
        private String mB = "b";
        private int mC = 1;
        private int mD = 2;
        private double mE = 5.0;
        private Class<?> mF = int.class;

        public Builder() {
        }

        public void setmA(String mA) {
            this.mA = mA;
        }

        public void setmB(String mB) {
            this.mB = mB;
        }

        public void setmC(int mC) {
            this.mC = mC;
        }

        public void setmD(int mD) {
            this.mD = mD;
        }

        public void setmE(double mE) {
            this.mE = mE;
        }

        public void setmF(Class<?> mF) {
            this.mF = mF;
        }

        public ClasstoBeBuilt build() {
            return new ClasstoBeBuilt(mA, mB, mC, mD, mE, mF);
        }
    }
}
