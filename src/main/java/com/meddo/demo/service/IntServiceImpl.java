package com.meddo.demo.service;

import com.meddo.demo.common.Constants;
import com.meddo.demo.dto.IntReqRespDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "IIntService")
public class IntServiceImpl implements IIntService{

    @Override
    public List<Integer> myTestMethod(IntReqRespDTO intReqRespDTO) {
        if(intReqRespDTO == null){
            throw new RuntimeException(Constants.GENERIC_ERROR);
        }
        else
            return intReqRespDTO.getMyIntList();
    }
}
