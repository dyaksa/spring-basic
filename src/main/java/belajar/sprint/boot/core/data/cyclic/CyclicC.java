package belajar.sprint.boot.core.data.cyclic;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CyclicC {
    private CyclicA cyclicA;
}
