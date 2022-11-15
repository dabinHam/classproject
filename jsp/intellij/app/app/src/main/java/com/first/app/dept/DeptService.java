package com.first.app.dept;

import com.first.app.util.ConnectionUtil;
import lombok.Cleanup;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.util.List;

//public class DeptService {
//
//    private DeptDao dao = new DeptDao();
//
//    public List<Dept> getList() throws Exception{
//
//        List<Dept> list = dao.selectAll(ConnectionUtil.getInstance().getConnection());
//
//        return list;
//    }
//
//}

// == 코드 줄이기 ==
@Log4j2
public class DeptService {
    private DeptDao dao = new DeptDao();
public List<Dept> getList() throws Exception{

    log.info("DeptService getList() ...");

    @Cleanup Connection conn = ConnectionUtil.getInstance().getConnection();

        List<Dept> list = dao.selectAll(conn);

        return list;
    }

}
