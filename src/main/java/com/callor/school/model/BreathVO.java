package com.callor.school.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class BreathVO {
	
	private String br_id;//	varchar2(5 byte)
	private String br_list;//	nvarchar2(20 char)
	private String br_seq;//	number
	private String br_contenth;//	nvarchar2(200 char)

}
