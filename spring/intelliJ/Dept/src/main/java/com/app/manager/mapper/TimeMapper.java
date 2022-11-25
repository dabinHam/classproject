package com.app.manager.mapper;


import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TimeMapper {

    String getTime();   // sql 실행하여 시간을 가지고오고싶다.

}
