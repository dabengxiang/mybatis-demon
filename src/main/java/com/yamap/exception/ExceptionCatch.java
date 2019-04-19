package com.yamap.exception;

import com.yamap.utils.ResultCode;
import com.yamap.utils.ResultVOUtil;
import com.yamap.utils.VO.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: gyc
 * @Date: 2019/4/19 10:31
 */
@ControllerAdvice
@Slf4j
public class ExceptionCatch {



    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResultVO exception(Exception exception){
        //记录日志
        log.error("catch exception:{}",exception);
        return ResultVOUtil.defindeFail(ResultCode.SYSTEM_ERROR.getCode(),"系统繁忙");

    }

}
