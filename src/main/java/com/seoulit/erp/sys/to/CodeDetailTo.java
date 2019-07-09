package com.seoulit.erp.sys.to;

import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;
import com.seoulit.common.to.BaseTo;

@Alias("CodeDetailTo")
@Getter
@Setter
public class CodeDetailTo extends BaseTo {

	private String divisionCodeNo;
	private String detailCode;
	private String detailCodeName;
	private String codeUseCheck;
	private String description;


}
