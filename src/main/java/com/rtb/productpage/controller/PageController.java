package com.rtb.productpage.controller;

import com.rtb.productpage.VO.ResponseTemplateVO;
import com.rtb.productpage.service.PageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pages")
@Slf4j
public class PageController {

    @Autowired
    private PageService pageService;

    @GetMapping("/{id}")
    public ResponseTemplateVO findBookDetailsByBookId(@PathVariable("id") Long bookId) {
        log.info("Inside findBookDetailsByBookId method of PageController");
        return pageService.findBookDetailsByBookId(bookId);
    }

}
