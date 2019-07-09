package com.seoulit.erp.sys.to;

import java.util.List;

import org.apache.ibatis.type.Alias;

@Alias("CodeTo")
public class CodeTo {

	private String code, codeName, editStatus, codeGroup;
	List<CodeDetailTo> codeDetailList;

	public List<CodeDetailTo> getCodeDetailList() {
		return codeDetailList;
	}

	public void setCodeDetailList(List<CodeDetailTo> codeDetailList) {
		this.codeDetailList = codeDetailList;
	}

	public String getCodeGroup() {
		return codeGroup;
	}

	public void setCodeGroup(String codeGroup) {
		this.codeGroup = codeGroup;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCodeName() {
		return codeName;
	}

	public void setCodeName(String codeName) {
		this.codeName = codeName;
	}

	public String getEditStatus() {
		return editStatus;
	}

	public void setEditStatus(String editStatus) {
		this.editStatus = editStatus;
	}
}
