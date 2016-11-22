package com.lcc.captcha;

import com.lcc.common.DBRepository;
import org.apache.ibatis.annotations.Param;
import java.util.Date;

/**
 * Created by lcc on 2016/11/22.
 */
@DBRepository
public interface CaptchaCodeDao {

    void save(CaptchaCode captchaCode);

    void incrTryTimes(@Param("id") int id);

    CaptchaCode findById(@Param("id") int id);

    CaptchaCode findLastBySessionId(@Param("sessionId") String sessionId);

    int countBySessionIdAndCreateTime(@Param("sessionId") String sessionId, @Param("targetTime") Date targetTime);

    void invalidCaptchaCode(@Param("sessionId") String sessionId, @Param("code") String code);
}
