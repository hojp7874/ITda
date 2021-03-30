package com.ssafy.itda.mapper;

import com.ssafy.itda.domain.Question;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface QuestionMapper {

  public Question getQuestion() throws Exception;
  public Question getQuestion(int questionId) throws Exception;
  public String postQuestion(Question question) throws Exception;
}
