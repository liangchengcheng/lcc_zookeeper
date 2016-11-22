package com.lcc.config;

import com.lcc.acl.enums.Status;
import com.lcc.bean.PageQuery;
import com.lcc.bean.PageResult;
import com.lcc.shortUrl.ShortUrl;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
/**
 * Created by lcc on 2016/11/22.
 */
public class ConfigurationService {

    @Resource
    private ConfigurationDao configurationDao;

    public List<Configuration> getAll() {
        return configurationDao.getAll();
    }

    public PageResult<Configuration> getByPage(PageQuery page) {
        BaseConvert.checkPara(page);
        int count = configurationDao.count();
        if (count > 0) {
            List<Configuration> list = configurationDao.getByPage(page);
            return new PageResult.Builder<Configuration>().total(count).data(list).build();
        }
        return new PageResult.Builder<Configuration>().build();
    }

    public Configuration saveOrUpdate(ConfigurationParam param) {
        Configuration configuration = configurationDao.findByK(param.getK());
        if (configuration == null) {
            configuration = generate(param);
            configurationDao.insert(configuration);
        } else {
            configuration.setV(param.getV());
            configuration.setOperator(RequestHolder.getCurrentUser().getUsername());
            configuration.setComment(param.getComment());
            configurationDao.updateByK(configuration);
        }
        return configuration;
    }

    private Configuration generate(ConfigurationParam param) {
        return new Configuration(param.getK(), param.getV(), RequestHolder.getCurrentUser().getUsername(), param.getComment());
    }
}
