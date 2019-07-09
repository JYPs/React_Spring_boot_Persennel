package com.seoulit.erp.logi.production.handler;

import com.seoulit.erp.logi.production.service.ProductionServiceFacade;
import com.seoulit.erp.logi.production.to.WorkInstructionTo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/logi/production/*")
public class WorkInstructionHandler {

    @Autowired
    private ProductionServiceFacade productionServiceFacade;


    @RequestMapping("/findMaterialCheckTempList/{mrpGno}/{productionLineCode}")
    public Map<String, Object> findMaterialCheckTempList(
            @PathVariable("mrpGno") String mrpGno,
            @PathVariable("productionLineCode") String productionLineCode

    ) throws Exception {

        Map<String, Object> paramMap = new HashMap<>();

        paramMap.put("mrpGno", mrpGno);
        paramMap.put("productionLineCode", productionLineCode);

       productionServiceFacade.findMaterialCheckTempList(paramMap);

        int errorCode = (Integer) paramMap.get("errorCode");
        String errorMsg = (String) paramMap.get("errorMsg");
        System.out.println("errorcode : " + errorCode);
        System.out.println("errorMsg : " + errorMsg);

        return paramMap;


    }

    //2프로시저 호출 실행후 콜백에서 워크인스트럭션 펑션 호출하면 실행되는 트랜잭션에서 아래메서드호출
    @RequestMapping("/findWorkInstructionList")
    public List<WorkInstructionTo> findWorkInstructionList() throws Exception {

        return productionServiceFacade.findWorkInstructionList();

    }

//    //작업지시에서
//    @RequestMapping("/findWorkInstructionList2")
//    public List<WorkInstructionTo> findWorkInstructionList2() throws Exception {
//
//       return productionServiceFacade.findWorkInstructionList2();
//  }


}
