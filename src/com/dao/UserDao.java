package com.dao;
import java.util.List;
import java.util.Map;

import com.pojo.MapUser;
import com.pojo.SelectUserOrdersById;
import com.pojo.SelectUserParam;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import com.po.MyUser;

@Repository("userDao")
@Mapper
/*
 * 使用Spring自动扫描MyBatis的接口并装配 （Spring将指定包中所有被@Mapper注解标注的接口自动装配为MyBatis的映射接口
 */
public interface UserDao {
    //bind
    public List<MyUser> selectUserByBind(MyUser user);
    //foreach
    public List<MyUser> selectUserByForeach(List<Integer> listId);

    //set
    public int updateUserBySet(MyUser user);
    //where
    public List<MyUser> selectUserByWhere(MyUser user);
    //trim
    public List<MyUser> selectUserByTrim(MyUser user);
    //choose
    List<MyUser> selectUserByChoose(MyUser user);
    //if标签
    public List<MyUser> selectUserByIf(MyUser user);


    public MyUser selectOrdersById1(Integer uid);
    public MyUser selectOrdersById2(Integer uid);
    public List<SelectUserOrdersById> selectOrdersById3(Integer uid);


    /**
     * 接口方法对应的SQL映射文件UserMapper.xml中的id
     */
    public List<MapUser> selectResultMap();

    public List<Map<String,Object>> selectAllUserMap();

    public List<MyUser> selectAllUserBybean(SelectUserParam param);

    public List<MyUser> selectChenUserByMap(Map<String,Object> param);

    public MyUser selectUserById(Integer uid);

    public List<MyUser> selectAllUser();

    public int addUser(MyUser user);

    public int updateUser(MyUser user);

    public int deleteUser(Integer uid);
}