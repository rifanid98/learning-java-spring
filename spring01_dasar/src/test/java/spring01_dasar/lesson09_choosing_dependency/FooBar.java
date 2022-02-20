package spring01_dasar.lesson09_choosing_dependency;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class FooBar {

    private Foo foo;

    private Bar bar;
}
