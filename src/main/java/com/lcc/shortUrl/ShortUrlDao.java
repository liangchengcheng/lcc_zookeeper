package com.lcc.shortUrl;

import com.lcc.common.DBRepository;
import org.apache.ibatis.annotations.Param;

/**
 * Created by lcc on 2016/11/22.
 */
@DBRepository
public interface ShortUrlDao {

    void save(ShortUrl shortUrl);

    ShortUrl findByNewUrl(@Param("url")String url);
}
