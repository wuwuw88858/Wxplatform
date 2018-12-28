package common.aop;

import common.beans.ResultBean;
import common.exceptions.FailException;
import common.exceptions.NullException;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/*
* 处理和包装异常
* @param
* @return
* */

public class ControllerAop {
    private static final Logger logger = LoggerFactory.getLogger(ControllerAop.class);

    /*AOP的切片方法*/

    public Object handlerControllerMethod(ProceedingJoinPoint proceedingJoinPoint) {
        long startTime = System.currentTimeMillis();
        ResultBean<?> resultBean;

        try {
            ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
            HttpServletRequest request = attributes.getRequest();
            //url
            logger.info("url={}",request.getRequestURI());

            //method
            logger.info("method={}",request.getMethod());
            resultBean = (ResultBean<?>) proceedingJoinPoint.proceed();
            long elapsedTime = System.currentTimeMillis() - startTime;
            logger.info("[{}]use time: {}", proceedingJoinPoint.getSignature(), elapsedTime);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            resultBean = handlerExpcetion(proceedingJoinPoint, throwable);
        }
        return resultBean;
    }
    /*
    * 封装异常信息
    * */
    private ResultBean<?> handlerExpcetion(ProceedingJoinPoint proceedingJoinPoint, Throwable throwable) {
        ResultBean<?> resultBean = new ResultBean<Object>();
        //已知异常
        if(throwable instanceof NullException) {
            resultBean.setCode(throwable.getLocalizedMessage());
            resultBean.setSuccess(false);
            resultBean.setMsg(throwable.getLocalizedMessage());
        }
        if(throwable instanceof FailException) {
            resultBean.setCode(throwable.getLocalizedMessage());
            resultBean.setSuccess(false);
        }
        return resultBean;
    }


}
