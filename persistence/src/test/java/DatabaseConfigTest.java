import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/persistence-context.xml"})
public class DatabaseConfigTest {

    @Autowired
    HibernateTemplate hibernateTemplate;

   // @Transactional
    @Test
    public void testSavingFile() {
//        FileInfo file = new FileInfo();
//        file.setFileName("TestFile");
//        file.setFileNize("34");
//        file.setFilePath("/test/path");
//
//        hibernateTemplate.save(file);
//        Assert.assertNotNull(file);
//        hibernateTemplate.flush();


    }
}
