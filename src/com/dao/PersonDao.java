package com.dao;

import com.po.Person;
import com.pojo.SelectPersonById;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository("PersonDao")
@Mapper
public interface PersonDao {
     Person selectPersonById1(Integer id);
    public Person selectPersonById2(Integer id);
    public SelectPersonById selectPersonById3(Integer id);
}
