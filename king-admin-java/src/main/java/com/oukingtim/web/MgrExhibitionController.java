package com.oukingtim.web;

import com.oukingtim.domain.Exhibition;
import com.oukingtim.service.MgrExhibitionService;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xufan on 2018/03/18.
 */
@RestController
@Api(description = "展会管理API")
@RequestMapping("/api/mgr/exhibition/management")
public class MgrExhibitionController extends MgrBaseController<MgrExhibitionService,Exhibition> {


    private static Logger logger = LoggerFactory.getLogger(MgrExhibitionController.class);


    //测试git更新

}
