package com.meddo.demo.controller;

import com.meddo.demo.common.Constants;
import com.meddo.demo.dto.IntReqRespDTO;
import com.meddo.demo.service.IIntService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = Constants.BASE_URL)
public class IntController {

    @Autowired
    IIntService intService;

    @RequestMapping(value = Constants.TEST_INT,
                    method = RequestMethod.POST,
                    consumes = MediaType.APPLICATION_JSON_VALUE,
                    produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<IntReqRespDTO> myMethod(@RequestBody IntReqRespDTO intReqRespDTO){
        List<Integer> result = intService.myTestMethod(intReqRespDTO);
        return (ResponseEntity<IntReqRespDTO>) result;
    }
}
