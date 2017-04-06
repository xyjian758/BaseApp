package com.example.app.demo.canstant;
import com.example.app.demo.utils.AppConfig;

/**
 * author  xyj
 * createtime 2017/4/6 10:56
 * desc
 */
public class Constant {

    public static final String TYPE_PRODUCE = "pre/";//预生产
    public static final String TYPE_UNIT = "test/";//测试

    public static final String UIP_API = "api/InnjiaUip/";
    public static final String URL_BASE = getUrlBase();



    /**
     * Review：
     * <p>
     * Release Location：http://uip.innjia.com/api/InnjiaUip/
     * Split   Location：URL_BASE + UIP_API
     * <p>
     * Unit Location：
     * 预生产：http://testuip.innjia.com/pre/api/InnjiaUip/
     * 测  试：http://testuip.innjia.com/text/api/InnjiaUip/
     * <p>
     * Desc:
     * 1.BuildConfig.DEBUG 自动识别是测试环境还是正式环境
     * 2.对于预生产和测试环境替换 请在urlDebug后面改动TYPE TODO:切换服务器 {测试环境：TYPE_UNIT || 预生产环境：TYPE_PRODUCE}
     *
     * @return
     */
    protected static String getUrlBase() {
        String urlDebug = "http://testuip.innjia.com/" + TYPE_UNIT;
        String urlRelease = "http://uip.innjia.com/";

        return  AppConfig.isTest? urlDebug : urlRelease;
    }



    public static final String HEADER = "Authorization";



}
