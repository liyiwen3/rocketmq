package org.apache.rocketmq.store;

import org.apache.rocketmq.store.config.MessageStoreConfig;
import org.junit.Test;

/**
 * @author liyiwen
 * @Description:
 * @date 2020-01-01 23:54
 */
public class TransientStorePoolTest {
    @Test
    public void test() {
        TransientStorePool transientStorePool = new TransientStorePool(new MessageStoreConfig());
        transientStorePool.init();
    }
}
