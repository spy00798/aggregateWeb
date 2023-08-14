package com.incruit.aggregateWeb.db.mapper;

import com.incruit.aggregateWeb.db.dto.QnADTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface QnAMapper {
    @Select("select subject as question from kiwonsale.tguardsub where guardIDX2 = 4232")
    List<QnADTO> findQnAList(QnADTO qnaDTO);
}
