package com.rtb.productpage.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReviewResponseTemplateVO {
    private List<Rating> rating;
    private List<Review> review;
}
