package com.trs.data.mapper;

import com.trs.data.entity.EnterpriseNode;
import com.trs.data.entity.IndustrychainRelation;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author zl
 * @create 2019-02-17 11:56
 *
 * 对于复杂的查询可以参照CQL语句执行。
 */

@Repository
public interface EnterpriseRelationRepository extends Neo4jRepository<IndustrychainRelation,Long> {
    //返回节点n以及n指向的所有节点与关系
    @Query("MATCH p=(n:Enterprise)-[r]->(m) WHERE id(n)={0} RETURN p")
    List<IndustrychainRelation> findAllByBotNode(EnterpriseNode botNode);

    //返回节点n以及n指向或指向n的所有节点与关系
    @Query("MATCH p=(n:Enterprise)<-[r]->(m) WHERE m.name={name} RETURN p")
    List<IndustrychainRelation> findAllBySymptom(@Param("name") String name);

    //返回节点n以及n指向或指向n的所有节点以及这些节点间的所有关系
    @Query("MATCH p=(n:Bot)<-[r:BotRelation]->(m:Bot)<-[:BotRelation]->(:Bot)<-[:BotRelation]->(n:Bot) WHERE n.name={name} RETURN p")
    List<IndustrychainRelation> findAllByStartNode(@Param("name") String name);

}
