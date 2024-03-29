package com.seoulit.erp.logi.production.handler;

import com.seoulit.erp.logi.business.to.ContractDetailTo;
import com.seoulit.erp.logi.production.service.ProductionServiceFacade;
import com.seoulit.erp.logi.production.to.MpsTo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/************************************************************************
 @Package com.seoulit.erp.logi.production.handler
 @Class MpsController.java
 @Author 홍재
 @Description 주생산계획 관련 컨트롤러
 @Create 2019.06.12
 @Last Update
 ************************************************************************/

@RestController
@RequestMapping("/logi/production/findMpsList/*")
public class MpsHandler {
    @Autowired
    private ProductionServiceFacade productionServiceFacade;

    @RequestMapping("/findMpsList")
    public List<MpsTo> findMpsList(
           //value에 맞는 값을 찾아서 가지고옴 뷰에서 aa라는 키값으로 보내면 value를 aa로 바꿔주면 받아옴
           //value값을 입력하지않으면 변수명이랑 같은 이름을 가지고옴
//            @RequestParam String fromDate,
//            @RequestParam(value = "toDate", required = false, defaultValue = "a") String toDate
           @RequestBody Map<String, Object> searchDate
    ) throws Exception {

        return productionServiceFacade.findMpsList(searchDate);

    }

    @RequestMapping("/registerMps")
    public void registerMps(
            @RequestBody List<MpsTo> mpsToList,
            @RequestBody List<ContractDetailTo> contractDetailTOList
    ) throws Exception {
        productionServiceFacade.registMps(mpsToList, contractDetailTOList);
    }

}
