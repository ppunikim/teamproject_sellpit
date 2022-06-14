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
public class NotionVO {

	private String no_seq;
	private String no_date;
	private String no_time;
	private String no_write;
	private String no_subject;
	private String no_content;
}
