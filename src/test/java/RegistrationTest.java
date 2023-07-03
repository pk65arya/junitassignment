import org.example.Userregistration;
import org.junit.Assert;
import org.junit.Test;

public class RegistrationTest {
    Userregistration val=new Userregistration();

    @Test
    public void testfnamevalidation(){
        boolean bool= val.fnamevalidation();
        Assert.assertEquals(true,bool);
    }

    @Test
    public void testlnamevalidation(){
        boolean bool= val.lnamevalidation();
        Assert.assertEquals(true,bool);
    }

    @Test
    public void testemailvalidatin(){
        boolean bool= val.emailvalidation();
        Assert.assertEquals(true,bool);
    }
    @Test
    public void testmobilevalidation(){
        boolean bool= val.mobilevalidatio();
        Assert.assertEquals(true,bool);
    }
}
