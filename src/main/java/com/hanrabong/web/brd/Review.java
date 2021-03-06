package com.hanrabong.web.brd;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @Component @Lazy
@AllArgsConstructor
@NoArgsConstructor
public class Review {
	private String revnum, revtitle, revcontent, rating, revdate, cnum, pnum;
}
