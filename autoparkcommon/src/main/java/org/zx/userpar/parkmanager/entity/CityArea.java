package org.zx.userpar.parkmanager.entity;

import javax.persistence.*;

/**
 * Create by IDEA
 *
 * @Author: zhangxin
 * @DATE: 2021/8/13 11:24 上午
 * @Description: 城市的区，比如西山区、五华区
 */
@Entity
@Table(name = "city_area")
public class CityArea {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String areaName;

    private String areaCode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }
}
