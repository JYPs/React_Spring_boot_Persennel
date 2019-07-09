package com.seoulit.erp.sys.to;

import org.apache.ibatis.type.Alias;

@Alias("AuthorityTo")
public class AuthorityTo {

	private String authorityCode;
	private String authorityName;
	private String menuCode;

	public String getAuthorityCode() {
		return authorityCode;
	}

	public void setAuthorityCode(String authorityCode) {
		this.authorityCode = authorityCode;
	}

	public String getAuthorityName() {
		return authorityName;
	}

	public void setAuthorityName(String authorityName) {
		this.authorityName = authorityName;
	}

	public String getMenuCode() {
		return menuCode;
	}

	public void setMenuCode(String menuCode) {
		this.menuCode = menuCode;
	} 
}
