package chap01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String... args) {
        System.out.println("java8");
        String text = "";
        switch (text) {
            case "golang":
                System.out.println("go!");
                break;
            case "java":
                System.out.println("java!");
                break;
            case "":
                System.out.println("blank!");
                break;
            default:
                System.out.println("default!");
                break;
        }

        int no = 10_000_000;
        System.out.println(no);

        createInstance("");

        List<String> lst = new ArrayList<>();
        System.out.println(lst);
    }

    private static <T> T createInstance(String className) {
        try {
            Class cls = Class.forName(className);
            return (T) cls.newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
