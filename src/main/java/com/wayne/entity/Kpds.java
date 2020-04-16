package com.wayne.entity;


/**
 * @author wangyulong018
 * @date 2020/4/15 9:06 PM
 *
 * CREATE TABLE `kpds` (
 *   `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
 *   `name` varchar(50) NOT NULL DEFAULT '',
 *   `gender` varchar(11) NOT NULL DEFAULT '',
 *   `height` varchar(11) DEFAULT '',
 *   `weight` varchar(11) DEFAULT NULL,
 *   `profession` varchar(50) DEFAULT NULL,
 *   `college` varchar(50) DEFAULT NULL,
 *   `major` varchar(50) DEFAULT NULL,
 *   `mobile` varchar(30) DEFAULT NULL,
 *   `monthSalary` varchar(30) DEFAULT NULL,
 *   `yearSalary` varchar(30) DEFAULT NULL,
 *   `hasCar` varchar(11) DEFAULT NULL,
 *   `hasHourse` varchar(11) DEFAULT NULL,
 *   `birthDay` varchar(30) DEFAULT NULL,
 *   `createAt` varchar(30) DEFAULT NULL,
 *   `updateAt` varchar(30) DEFAULT NULL,
 *   `nowCityName` varchar(11) DEFAULT NULL,
 *   `nowDistrictName` varchar(11) DEFAULT NULL,
 *   `homeProvinceName` varchar(11) DEFAULT NULL,
 *   `homeCityName` varchar(30) DEFAULT NULL,
 *   `homeDistrictName` varchar(30) DEFAULT NULL,
 *   `description` varchar(500) DEFAULT NULL,
 *   `standard` varchar(500) DEFAULT NULL,
 *   `picOriginUrl` varchar(500) DEFAULT NULL,
 *   PRIMARY KEY (`id`)
 * ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
 *
 */

public class Kpds {

    private long id;
    private String name;
    private String gender;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Kpds{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
