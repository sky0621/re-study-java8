package chap02;

import java.io.File;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String... args) {
        FileSystem fs = FileSystems.getDefault();
        Path path = fs.getPath("foo.txt");
        System.out.println(path.getFileName().toString());

        Path path2 = Paths.get("foo.txt");
        System.out.println(path2.toString());
    }
}
