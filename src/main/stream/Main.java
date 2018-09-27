package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static stream.S.*;

public class Main {
    public static void main(String... args) {
        List<PgLang> pgs = PgLangFactory.createPgLangs();

        print("#######################################################");
        print("条件合致するものの抽出パターン");
        print("#######################################################");

        print("【No.01: for文】");
        for (PgLang pg : pgs) {
            if (pg.name.startsWith("C")) {
                print(pg.name);
            }
        }
        print("");

        print("【No.02: forEach】");
        pgs.stream().forEach(pg -> {
            if (pg.name.startsWith("C")) {
                print(pg.name);
            }
        });
        print("");

        print("[No.03: filter】");
        pgs.stream().filter(pg -> pg.name.startsWith("C")).forEach(pg -> print(pg.name));
        print("");

        print("#######################################################");
        print("特定要素の抽出パターン");
        print("#######################################################");
        List<String> names = new ArrayList<>();

        print("【No.01: for文】");
        for (PgLang pg : pgs) {
            names.add(pg.name);
        }
        print(names.toString());
        names.clear();
        print("");

        print("【No.02: forEach】");
        pgs.stream().forEach(pg -> names.add(pg.name));
        print(names.toString());
        names.clear();
        print("");

        print("【No.03: map】");
        pgs.stream().map(pg -> pg.name).forEach(name -> names.add(name));
        print(names.toString());
        names.clear();
        print("");

        print("【No.04: map + collect】");
        List<String> names2 = pgs.stream().map(pg -> pg.name).collect(Collectors.toList());
        print(names2.toString());
        print("");
    }
}
