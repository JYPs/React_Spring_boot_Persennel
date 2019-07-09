package com.seoulit.erp.logi.production.handler;

import com.seoulit.erp.logi.production.service.ProductionServiceFacade;
import com.seoulit.erp.logi.production.to.PrmTo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/************************************************************************
 @Package		com.seoulit.erp.logi.production.controller
 @Class			PrmController.java
 @Author			홍재
 @Description	소요량 전개 취합 관련 컨트롤러
 @Create			2019.06.17
 @Last Update
 ************************************************************************/


@RestController
@RequestMapping("/logi/production/*")
public class PrmHandler {

    @Autowired
    private ProductionServiceFacade productionServiceFacade;

    @RequestMapping("/findPrmList")
    public List<PrmTo> findPrmList () throws Exception{
        return productionServiceFacade.findPrmList();
    }
    @RequestMapping("/registPrm")
    public void registPrm(
        @RequestParam String empCode,
        @RequestBody List<PrmTo> prmList
    ) throws Exception{
        productionServiceFacade.registPrm(empCode, prmList);
    }
}
