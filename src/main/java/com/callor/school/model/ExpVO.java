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
public class ExpVO {
	
	
 	private String ex_listid;//	varchar2(5 byte)
 	private String ex_list;//	nvarchar2(125 char)
 	private String ex_content;//	nvarchar2(1000 char)

}
