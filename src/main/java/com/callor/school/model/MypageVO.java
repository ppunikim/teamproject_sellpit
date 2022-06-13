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
public class MypageVO {

	public long	  my_seq;
	public String my_username;
	public String my_date;
	public String my_dayset;
	public String my_weight;
	public String my_set;
	public String my_rep;
	
	
}
