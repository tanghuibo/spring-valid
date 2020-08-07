package io.github.tanghuibo.springvalid.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotBlank;

/**
 * @author tanghuibo
 * @date 2020/8/7下午10:41
 */
@RestController
@RequestMapping("/")
@Validated
public class TestController {

    @GetMapping("test1")
    public String test1(@NotBlank @RequestParam("name") String name) {
        return name;
    }
}
