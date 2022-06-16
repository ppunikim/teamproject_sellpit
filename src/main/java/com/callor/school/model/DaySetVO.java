package com.callor.school.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class DaySetVO {

	private String my_seq;//		NUMBER			PRIMARY KEY,
	private String my_username;//nVARCHAR2(50)	NOT NULL,
	private String my_list;
	private String my_date;//VARCHAR2(15)	NOT NULL,
	private String my_dayset;//nVARCHAR2(30)	NOT NULL,
	private String my_weight;//NUMBER			NOT NULL,
	private String my_rep;//NUMBER			NOT NULL,

}
