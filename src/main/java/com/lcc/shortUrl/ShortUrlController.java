package com.lcc.shortUrl;

import com.lcc.bean.JsonData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

@Slf4j
@Controller
public class ShortUrlController {

    @Resource
    private ShortUrlService shortUrlService;

    @ResponseBody
    @RequestMapping("/gen")
    public JsonData generate(@RequestParam("url")String url){
        return JsonData.success(shortUrlService.generate(url));
    }

    @RequestMapping("/t/{url}")
    public void toOrigin(@PathVariable("url")String url,HttpServletResponse response){
        try {
            response.sendRedirect(shortUrlService.getOriginUrlWithoutException(url));
        }catch (Exception e){
            e.printStackTrace();
            //根据短链接跳转出异常 url
        }
    }

}
