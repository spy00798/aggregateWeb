package com.incruit.aggregateWeb.db.mapper;

import com.incruit.aggregateWeb.db.dto.QnADTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface QnAMapper {
    @Select("SELECT * FROM qa")
    List<QnADTO> findQnAList(QnADTO qnaDTO);
}
