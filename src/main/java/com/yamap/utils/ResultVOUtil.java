package com.yamap.utils;

import com.yamap.utils.VO.ResultVO;

public class ResultVOUtil {

    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(ResultCode.SUCCESS.getCode());
        resultVO.setMsg("成功");
        resultVO.setData(object);
        return resultVO;
    }

    public static ResultVO fail(Object object) {
        return defindeFail(ResultCode.FAIL.getCode(),object);
    }

    public static ResultVO defindeFail(Integer code,Object object){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(code);
        resultVO.setMsg("失败");
        resultVO.setData(object);
        return resultVO;
    }


}
