package org.home.metrics;

import lombok.extern.slf4j.Slf4j;
import org.home.util.HttpClientUtil;
import org.home.util.ServiceResponse;
import org.junit.Test;

/**
 * @ClassName: TestMetricsCollector
 * @Description:
 * @Author: Donaldhan
 * @Date: 2020-04-10 11:02
 */
@Slf4j
public class TestMetricsCollector {
    @Test
    public void systemMetrics(){
        try {
//            String url ="http://localhost:8888/metrics/system";
            String url ="http://10.177.96.191:8888/metrics/system";
            ServiceResponse response = HttpClientUtil.doGet(url);
            log.info("system metrics:{}",response.getData());
        } catch (Exception e) {
            log.error("systemMetrics error",e);
        }
    }
}
