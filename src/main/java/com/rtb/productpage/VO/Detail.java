package com.rtb.productpage.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Detail {

    private Long detailId;
    private Long Pages;
    private Long price;
    private Long bookId;

}