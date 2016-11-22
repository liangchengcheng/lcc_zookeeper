package com.lcc.config;

import com.lcc.bean.PageQuery;
import com.lcc.common.DBRepository;
import org.apache.ibatis.annotations.Param;
import java.util.List;
/**
 * Created by lcc on 2016/11/21.
 */
@DBRepository
public interface ConfigurationDao {

    Configuration findByK(@Param("K") String k);

    void updateByk(Configuration configuration);

    void insert(Configuration configuration);

    List<Configuration> getAll();

    List<Configuration> getByPage(PageQuery pageQuery);

    int count();
}
