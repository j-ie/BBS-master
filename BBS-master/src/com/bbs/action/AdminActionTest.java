package com.bbs.action;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.After;
import org.junit.runner.RunWith;

/**
 * Created by jie
 * on 2018-12-14-15:08.
 */
@RunWith(Arquillian.class)
public class AdminActionTest {
    @After
    public void tearDown() throws Exception {
    }

    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(AdminAction.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

}
