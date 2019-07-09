package com.seoulit.erp.sys.handler;

import com.seoulit.erp.sys.service.BaseServiceFacade;
import com.seoulit.erp.sys.to.CodeDetailTo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@CrossOrigin("*")
@RequestMapping("/sys/*")
public class CodeDetailHandler {

    @Autowired
    private BaseServiceFacade baseServiceFacade;


    @RequestMapping("/findCodeDetailList")
    public List<CodeDetailTo> findCodeDetailList() throws Exception {

        return baseServiceFacade.findCodeDetailList();

    }
    
    @RequestMapping("/findPayStepCodeDetailList")
    public List<CodeDetailTo> findPayStepCodeDetailList(@RequestParam String divisionCode) throws Exception {
        return baseServiceFacade.findPayStepCodeDetailList(divisionCode);

    }

    @RequestMapping("/batchDetailCode")
    public void batchDetailCode(
            @RequestBody List<CodeDetailTo> codeDetailList
    ) throws Exception {
    	//System.out.println("aaaaaaa"+codeDetailList.get(0).getDetailCodeName());
        baseServiceFacade.batchDetailCodeProcess(codeDetailList);
    }
}
