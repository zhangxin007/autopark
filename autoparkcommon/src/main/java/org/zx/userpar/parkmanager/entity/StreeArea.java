package org.zx.userpar.parkmanager.entity;

import javax.persistence.*;

/**
 * Create by IDEA
 *
 * @Author: zhangxin
 * @DATE: 2021/8/13 11:43 上午
 * @Description: 区下的街道，比如呈贡区，龙城街道，
 */
@Entity
@Table(name = "stree_area")
public class StreeArea {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "city_area_id",nullable = false)
    private CityArea cityArea;

    private String streeAreaName;

    private String streaAreaCode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public CityArea getCityArea() {
        return cityArea;
    }

    public void setCityArea(CityArea cityArea) {
        this.cityArea = cityArea;
    }

    public String getStreeAreaName() {
        return streeAreaName;
    }

    public void setStreeAreaName(String streeAreaName) {
        this.streeAreaName = streeAreaName;
    }

    public String getStreaAreaCode() {
        return streaAreaCode;
    }

    public void setStreaAreaCode(String streaAreaCode) {
        this.streaAreaCode = streaAreaCode;
    }
}
