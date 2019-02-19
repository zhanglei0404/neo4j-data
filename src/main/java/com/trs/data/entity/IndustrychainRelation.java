package com.trs.data.entity;

import org.neo4j.ogm.annotation.*;

/**
 * 节点关系类
 *
 * @author zl
 * @create 2019-02-17 11:53
 *
 * 有必要说明一下， @StartNode 和@EndNode注释的类可以不是同一个类。
 */
@RelationshipEntity(type = "INDUSTRYCHAIN")
public class IndustrychainRelation {
    @Id
    @GeneratedValue
    private Long id;
    @StartNode
    private EnterpriseNode startNode;
    @EndNode
    private EnterpriseNode endNode;
    @Property
    private String relation;

    public IndustrychainRelation() {
    }

    public IndustrychainRelation(Long id, EnterpriseNode startNode, EnterpriseNode endNode, String relation) {
        this.id = id;
        this.startNode = startNode;
        this.endNode = endNode;
        this.relation = relation;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public EnterpriseNode getStartNode() {
        return startNode;
    }

    public void setStartNode(EnterpriseNode startNode) {
        this.startNode = startNode;
    }

    public EnterpriseNode getEndNode() {
        return endNode;
    }

    public void setEndNode(EnterpriseNode endNode) {
        this.endNode = endNode;
    }

    @Override
    public String toString() {
        return "IndustrychainRelation{" +
                "id=" + id +
                ", startNode=" + startNode +
                ", endNode=" + endNode +
                ", relation='" + relation + '\'' +
                '}';
    }
}
