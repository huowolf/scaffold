package com.huowolf;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.huowolf.mapper.UserInfoMapper;
import com.huowolf.model.UserInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MapperTests {


	@Autowired
	private UserInfoMapper userInfoMapper;

	@Test
	public void testSelectAll() {
        List<UserInfo> userInfos = userInfoMapper.selectAll();  //自动生成返回值对象快捷键：ctrl+alt+v
        for (UserInfo userInfo : userInfos) {                   //for each 循环快捷键：iter关键词
            System.out.println(userInfo.getUsername());
        }
    }

    @Test
    public void testSelectByPage() {
        PageHelper.startPage(2,5);
        List<UserInfo> userInfos = userInfoMapper.selectAll();  //自动生成返回值对象快捷键：ctrl+alt+v

        System.out.println("Total: " + ((Page) userInfos).getTotal());
        for (UserInfo userInfo : userInfos) {                   //for each 循环快捷键：iter关键词
            System.out.println(userInfo.getUsername());
        }
    }

}
