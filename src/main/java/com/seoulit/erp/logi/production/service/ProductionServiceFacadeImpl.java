package com.seoulit.erp.logi.production.service;

import com.seoulit.erp.logi.business.to.ContractDetailTo;
import com.seoulit.erp.logi.production.dao.*;
import com.seoulit.erp.logi.production.to.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductionServiceFacadeImpl implements ProductionServiceFacade {

    @Autowired
    private MpsDao mpsDao;
    @Autowired
    private MrpDao mrpDao;
    @Autowired
    private MrpGatheringDao mrpGatheringDao;
    //    @Autowired
//    ContractDetailDao contractDetailDao;
    @Autowired
    private PrmDao prmDao;
    @Autowired
    private WorkInstructionDao workInstructionDao;

    /*MpsHandler*/
    @Override
    public List<MpsTo> findMpsList(Map<String, Object> searchDate) {
        return mpsDao.selectMpsList(searchDate);
    }


//    아직미완성 contractDetail을 건드려야함
    @Override
    public void registMps(List<MpsTo> mpsList, List<ContractDetailTo> contractDetailList) {
        //생산계획 등록
        for (MpsTo mpsTO : mpsList) {
            mpsDao.insertMps(mpsTO);
        }
    }

    /*MrpHandler*/
    /*MrpDao*/
    @Override
    public List<MrpTo> findMrpList(Map<String, Object> paramMap) {
        return mrpDao.selectMrpList(paramMap);
    }

    @Override
    public List<MrpOpenTempTo> findMrpOpenTempProcessList(List<MpsTo> paramMap) {
        List<MrpOpenTempTo> mrpOpenTempToList = new ArrayList<>();
        MrpOpenTempTo mrpOpenTempTo = null;

       for(MpsTo mpsTo : paramMap){
           mrpOpenTempTo = mrpDao.MrpOpenTempProcessList(mpsTo);
           mrpOpenTempToList.add(mrpOpenTempTo);
       }
        return mrpOpenTempToList;
    }

    /*MrpGatheringDao*/
    @Override
    public void registMrpGathering(Map<String, Object> paramMap) {

        for(MrpTo mrpTo : (List<MrpTo>)paramMap.get("MrpToList")){
            paramMap.put("mpsNo", mrpTo.getMpsNo());
            mrpGatheringDao.mrpGathering(paramMap);
        }

    }

    @Override
    public List<MrpGatheringTo> findMrpGatheringList(Map<String, Object> paramMap) {
        return mrpGatheringDao.selectMrpGatheringList(paramMap);
    }

    @Override
    public void batchMrpGathering(List<MrpGatheringTo> mrpGatheringList) {
        for (MrpGatheringTo MrpGatheringTo : mrpGatheringList) {
            switch (MrpGatheringTo.getStatus()) {
                case "updated":
                    mrpGatheringDao.updateMrpGathering(MrpGatheringTo);
                case "deleted":
                    mrpGatheringDao.deleteMrpGathering(MrpGatheringTo);
            }
        }
    }

    /*PrmDao*/
    @Override
    public List<PrmTo> findPrmList() {
        return prmDao.selectPrmList();
    }

    @Override
    public void registPrm(String empCode, List<PrmTo> prmList) {
        Map<String, String> params = new HashMap<>();
        params.put("empCode", empCode);
        for (PrmTo PrmTo : prmList) {
            params.put("productionResultNo", PrmTo.getProductionResultNo());
            params.put("workInstructionNo", PrmTo.getWorkInstructionNo());
            prmDao.callRegisterPrm(params);
        }
    }

    /*WorkInstructionDao*/
    @Override
    public void findMaterialCheckTempList(Map<String, Object> paramMap) {
        workInstructionDao.materialCheckTempList(paramMap);
    }

    @Override
    public List<WorkInstructionTo> findWorkInstructionList() {
        return workInstructionDao.selectWorkInstructionList();
    }
}
