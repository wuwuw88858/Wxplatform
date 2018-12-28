

import com.alibaba.fastjson.JSONObject;
import com.wxplatform.dao.WxMemberDAO;
import com.wxplatform.mapper.GroupMemberMapper;
import com.wxplatform.pojo.DepartmentInfo;
import com.wxplatform.pojo.GroupMember;
import com.wxplatform.pojo.GroupMemberExample;
import com.wxplatform.service.WxGetOpenIdService;
import com.wxplatform.service.WxMemberInfoService;
import common.beans.ResultBean;
import common.exceptions.NullException;
import common.utils.NotNullCheckUtils;
import org.apache.log4j.Logger;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.PostConstruct;
import java.util.*;
import java.util.concurrent.ConcurrentSkipListMap;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "file:src/main/resources/xml/applicationContext.xml",
        "file:src/main/resources/xml/springMVC.xml" })
@WebAppConfiguration
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class wxLoginTest {
    @Autowired
    WxGetOpenIdService wxGetOpenIdService;
    @Autowired
    GroupMemberMapper groupMemberMapper;
    @Autowired
    WxMemberDAO wxLoginDAO;

    ResultBean resultBean = new ResultBean();

    Logger logger = Logger.getLogger("wxLoginTest");
    String code = null;

    @Test
    public void testGetOpenId() {
        //ResultBean<Map> s = new ResultBean<Map>(wxGetOpenIdService.getOpenId(code));
        ConcurrentSkipListMap s = wxGetOpenIdService.getOpenId(code);
        System.out.println(s.toString());
    }

    @Test

    public void testRegrex() {
        GroupMemberExample example = new GroupMemberExample();
        example.setOrderByClause("");
        Collection<GroupMember> memberlist = wxLoginDAO.selectAllMember(example);
        ConcurrentSkipListMap<String, Object> concurrentSkipListMap = new ConcurrentSkipListMap<String, Object>();
        List<Map> lists = new ArrayList<Map>();
        for(GroupMember member : memberlist) {
                Map<String, Object> maps = new HashMap<String, Object>();
                maps.put("id", member.getOpenid());
                maps.put("name", member.getMembername());
                lists.add(maps);
        }
        concurrentSkipListMap.put("data", lists);
        System.out.println("集合中Map创建json对象:" + new JSONObject(concurrentSkipListMap));
    }

    @Test
    public void testList() {
        List<GroupMember> memberinfo  = wxLoginDAO.selectMemberListWithPage();
        for(GroupMember list : memberinfo) {
            System.out.println(list.getDepartment());
        }
    }

    @PostConstruct
    @Test
    public void test(){
        for (int i=0; i<10; i++) {
            logger.info(i + "----Log.Info----");
            logger.info(i + "----Log.Info----");
            logger.info(i + "----Log.Info----");
        }
    }

}
