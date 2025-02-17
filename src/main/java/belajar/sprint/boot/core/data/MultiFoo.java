package belajar.sprint.boot.core.data;

import lombok.Getter;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class MultiFoo {

    @Getter
    private List<Foo> fooLists;

    public MultiFoo(ObjectProvider<Foo> foo) {
        fooLists = foo.stream().collect(Collectors.toList());
    }
}
