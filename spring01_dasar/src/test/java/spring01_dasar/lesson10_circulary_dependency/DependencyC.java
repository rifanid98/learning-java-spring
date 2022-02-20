package spring01_dasar.lesson10_circulary_dependency;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class DependencyC {

    private DependencyA dependencyA;
}
