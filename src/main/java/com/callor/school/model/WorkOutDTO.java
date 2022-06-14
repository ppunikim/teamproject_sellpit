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
public class WorkOutDTO {

	private String sl_id; //	varchar2(5)
	private String sl_scid; //	varchar2(4)
	private String sc_num; //	varchar2(6)
	private String sc_label; //	nvarchar2(20)
	private String sc_division; //	nvarchar2(20)
	private String sc_day; //	varchar2(10)
	private String sc_part; //	nvarchar2(30)
	private String sl_listid; //	varchar2(5)
	private String list_name; //	nvarchar2(125)
	
	
	private int sl_set;
	private String sl_weight;
	private String sl_rep;
}
