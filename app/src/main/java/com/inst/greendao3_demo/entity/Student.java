/*
******************************* Copyright (c)*********************************\
**
**                 (c) Copyright 2015, 蒋朋, china, qd. sd
**                          All Rights Reserved
**
**                           By()
**
**-----------------------------------版本信息------------------------------------
** 版    本: V0.1
**
**------------------------------------------------------------------------------
********************************End of Head************************************\
*/

package com.inst.greendao3_demo.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * 文 件 名: Student
 * 创 建 人: 蒋朋
 * 创建日期: 16-8-26 17:25
 * 描    述:
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */

@Entity
public class Student {

    @Id
    private Long id;
    private String name;
    private String age;
    private String number;
    public String getNumber() {
        return this.number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public String getAge() {
        return this.age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    @Generated(hash = 1277127786)
    public Student(Long id, String name, String age, String number) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.number = number;
    }
    @Generated(hash = 1556870573)
    public Student() {
    }
}
