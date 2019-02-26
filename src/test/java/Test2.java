import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.github.sunligh91.dao.BaseDAO;
import com.github.sunligh91.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class Test2 {
    public static void main(String[] args) throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlmapconfig.xml");
        SqlSessionFactoryBuilder sql=new SqlSessionFactoryBuilder();
        SqlSessionFactory build = sql.build(resourceAsStream);
        SqlSession sqlSession = build.openSession();
        BaseDAO mapper = sqlSession.getMapper(BaseDAO.class);
        User user = mapper.getUser(2);
        System.out.println(user);

    }
}
