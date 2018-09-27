package stream;

import java.util.ArrayList;
import java.util.List;

public class PgLangFactory {
    static List<PgLang> createPgLangs() {
        List<PgLang> l = new ArrayList<>();
        l.add(new PgLang(1, "Java"));
        l.add(new PgLang(2, "Golang"));
        l.add(new PgLang(3, "Python"));
        l.add(new PgLang(4, "Ruby"));
        l.add(new PgLang(5, "JavaScript"));
        l.add(new PgLang(6, "PHP"));
        l.add(new PgLang(7, "C"));
        l.add(new PgLang(8, "C++"));
        l.add(new PgLang(9, "C#"));
        l.add(new PgLang(10, "Scala"));
        l.add(new PgLang(11, "Kotlin"));
        l.add(new PgLang(12, "Elixir"));
        l.add(new PgLang(13, "COBOL"));
        l.add(new PgLang(14, "Swift"));
        l.add(new PgLang(15, "Erlang"));
        l.add(new PgLang(16, "Clojure"));
        l.add(new PgLang(17, "LISP"));
        l.add(new PgLang(18, "Rust"));
        l.add(new PgLang(19, "Perl"));
        l.add(new PgLang(20, "TypeScript"));
        return l;
    }
}
