package com.wxplatform.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import common.beans.ResultBean;
import common.beans.ResultBeanUtil;
import common.beans.ResultEnum;
import common.utils.getOpenId.GetOpenIdUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import java.util.concurrent.ConcurrentSkipListMap;
import static common.utils.NotNullCheckUtils.NotNull;

@Component
@Service
public class WxGetOpenIdService {


    private static final Logger logger = LoggerFactory.getLogger(WxGetOpenIdService.class);

    ConcurrentSkipListMap<String, JSONObject> concurrentSkipListMap =
            new ConcurrentSkipListMap<String, JSONObject>();

    public  ConcurrentSkipListMap getOpenId(String code) {
        NotNull(code, "code.is.null");
        String openId = GetOpenIdUtil.getOpenId(code);
        JSONObject openIdJSON = JSON.parseObject(openId);
    logger.info("WxGetOpenIdService.getOpenId() success" );
            concurrentSkipListMap.put("Result", openIdJSON);
            return concurrentSkipListMap;
    }

}
