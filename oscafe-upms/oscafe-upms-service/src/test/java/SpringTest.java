import com.liwy.oscafe.upms.dao.IUpmsUserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by liwy on 2018/1/21.
 */
@RunWith(SpringRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml","classpath:applicationContext-jdbc.xml"})
public class SpringTest {

    @Autowired
    private IUpmsUserDao userDao;

    @Test
    public void testUserDao() {
        System.out.println(userDao.selectByPrimaryKey(1));
    }
}
