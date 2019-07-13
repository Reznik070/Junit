//To be used without Testng type tests


package initial;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import initial2.lost_pass_testcase;


@RunWith(Suite.class)
@SuiteClasses({User.class, lost_pass_testcase.class})

public class suiteTest {

}
