package com.trs.data.test;

import com.trs.data.entity.EnterpriseNode;
import com.trs.data.mapper.EnterpriseRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 保存
 *
 * @author zl
 * @create 2019-02-17 12:01
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class Neo4jApplicationTests {
    @Autowired
    EnterpriseRepository enterpriseRepository;

    @Test
    public void contextLoads() {
        enterpriseRepository.save(new EnterpriseNode("磊家"));
        System.out.println(enterpriseRepository.findAllByName("磊家"));
    }

}
