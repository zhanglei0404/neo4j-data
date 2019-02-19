package com.trs.data.entity;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;

/**
 * 节点类
 *
 * @author zl
 * @create 2019-02-17 11:52
 *
 * id的属性为Long而不能为long，
 * 还需要注意的是在Spring boot1.5中修饰id属性的注释为@GraphId，
 * org.neo4j.ogm.annotation.Id不存在，
 * 效果一样，都是Neo4j数据库自动创建的ID值。
 */
@NodeEntity(label = "Enterprise_test")
public class EnterpriseNode {
    @Id
    @GeneratedValue
    private Long id; //id
    @Property(name = "name")
    private String name;//名
    @Property(name = "kind")
    private String kind;//类
    @Property(name = "weight")
    private long weight;//权重

    public EnterpriseNode() {
    }

    public EnterpriseNode(String name) {
        this.name = name;
    }

    public EnterpriseNode(Long id, String name, String kind, long weight) {
        this.id = id;
        this.name = name;
        this.kind = kind;
        this.weight = weight;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public long getWeight() {
        return weight;
    }

    public void setWeight(long weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "EnterpriseNode{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", kind='" + kind + '\'' +
                ", weight=" + weight +
                '}';
    }

}