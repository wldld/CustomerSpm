package com.xy.api.dao;

import com.xy.api.entity.Category;
import com.xy.api.mapper.CategoryMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryDao {
    @Autowired
    @Qualifier("sqlSessionFactory")
    SqlSessionFactory sqlSessionFactory;

    @RequestMapping("/s")
    @ResponseBody
    public Category select(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Category category = null;
        try {
            CategoryMapper categoryMapper = sqlSession.getMapper(CategoryMapper.class);
            category = categoryMapper.selectId(6);
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            sqlSession.close();
        }
        return category;
    }
}
