package com.trs.data.mapper;

import com.trs.data.entity.EnterpriseNode;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

/**
 * @author zl
 * @create 2019-02-17 11:56
 *
 * 只需要使接口继承Neo4jRepository就可以使用该接口提供的一些基础的增删改查方法。
 */
@Repository
public interface EnterpriseRepository extends Neo4jRepository<EnterpriseNode,Long> {
    EnterpriseNode findAllByName(String name);
}
