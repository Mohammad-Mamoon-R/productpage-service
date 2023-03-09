package com.rtb.productpage.service;

import com.rtb.productpage.VO.Detail;
import com.rtb.productpage.VO.ResponseTemplateVO;
import com.rtb.productpage.VO.Review;
import com.rtb.productpage.VO.ReviewResponseTemplateVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class PageService {

    @Autowired
    private RestTemplate restTemplate;
    public ResponseTemplateVO findBookDetailsByBookId(Long bookId) {
        log.info("Inside findDetailByBookId of PageService");
        ResponseTemplateVO responseTemplateVO = new ResponseTemplateVO();


        Detail detail =
                restTemplate.getForObject("http://DETAIL-SERVICE/details/" + bookId
                        , Detail.class);

        responseTemplateVO.setDetail(detail);

        ReviewResponseTemplateVO reviewResponseTemplateVO =
                restTemplate.getForObject("http://REVIEW-SERVICE/reviews/" + bookId
                        , ReviewResponseTemplateVO.class);

        responseTemplateVO.setReview(reviewResponseTemplateVO.getReview());

        responseTemplateVO.setRating(reviewResponseTemplateVO.getRating());

        return  responseTemplateVO;
    }
}
