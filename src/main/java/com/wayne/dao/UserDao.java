package com.wayne.dao;

import com.wayne.entity.Kpds;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author wangyulong018
 * @date 2020/4/15 9:10 PM
 */
@Repository
public interface UserDao {

    List<Kpds> list();
}
