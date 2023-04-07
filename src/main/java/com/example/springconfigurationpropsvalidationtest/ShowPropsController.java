package com.example.springconfigurationpropsvalidationtest;

import com.example.springconfigurationpropsvalidationtest.props.MyProps;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShowPropsController {

    final MyProps props;

    public ShowPropsController(MyProps props) {
        this.props = props;
    }

    @GetMapping("/show-props")
    MyProps showProps() {
        return props;
    }
}
