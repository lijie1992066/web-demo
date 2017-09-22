package com.ys.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lijie.dao.mapper.YsUserMapper;
import com.lijie.domain.YsUser;
import com.lijie.domain.YsUserExample;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class Mytest {
	
	private ApplicationContext ac;
	
	@Before
	public void beforeTest() {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
			"classpath:spring/applicationContext-*.xml");
	}
	
	@Test
	public void testMybaits() {
		
		YsUserMapper bean = ac.getBean(YsUserMapper.class);
		PageHelper.startPage(2, 3);
		YsUserExample example = new YsUserExample();
		List<YsUser> users = bean.selectByExample(example);
		for (YsUser user : users) {
			System.out.println(user);
		}
		PageInfo<YsUser> pageInfo = new PageInfo<YsUser>(users);
		long total = pageInfo.getTotal();
		System.out.println(total);
	}
	
	@Test
	public void testRedis() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
			"classpath:spring/applicationContext-*.xml");
		JedisPool pool = (JedisPool) applicationContext.getBean("redisClient");
		Jedis jedis = pool.getResource();
		String string = jedis.get("key1");
		System.out.println(string);
		jedis.close();
		pool.close();
		
	}
}
