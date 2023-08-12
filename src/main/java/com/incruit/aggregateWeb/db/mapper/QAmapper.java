package com.incruit.aggregateWeb.db.mapper;

import com.incruit.aggregateWeb.db.dto.QAdto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface QAmapper {

    @Select("SELECT * FROM qa")
    List<QAdto> findQAList(QAdto qAdto);
}
