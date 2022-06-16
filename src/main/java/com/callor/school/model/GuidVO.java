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
public class GuidVO {
	
	
	private String gd_listid;//	varchar2(5 byte)
	private String gd_list;//	nvarchar2(125 char)
	private String gd_seq;//	nvarchar2(2 char)
	private String gd_content;//	nvarchar2(1000 char)

}
