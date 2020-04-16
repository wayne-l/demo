package com.wayne.service;

import com.wayne.dao.UserDao;
import com.wayne.entity.Kpds;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wangyulong018
 * @date 2020/4/15 9:12 PM
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public List<Kpds> list() {

        return userDao.list();
    }
}
