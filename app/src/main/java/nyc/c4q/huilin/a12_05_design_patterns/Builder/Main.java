package nyc.c4q.huilin.a12_05_design_patterns.Builder;

/**
 * Created by huilin on 12/5/16.
 */

public class Main {

    public static void main(String[] args) {
        ClasstoBeBuilt.Builder classtoBeBuilt = new ClasstoBeBuilt.Builder();
        classtoBeBuilt.setmA("hi");
        classtoBeBuilt.build();
        System.out.println(classtoBeBuilt.toString());
    }
}
