package com.dao;

import com.pojo.Paper;

import java.util.List;

/**
 * @author GlanTUT
 * @version V1.0
 * @Package com.dao
 * @date 2020/4/14 7:09
 */
public interface PaperDao {
    int addPaper(Paper paper);

    int deletePaperById(long id);

    int updatePaper(Paper paper);

    Paper queryById(long id);

    List<Paper> queryAllPaper();


}
