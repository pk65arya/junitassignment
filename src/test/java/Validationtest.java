import org.example.Emailvalidation;
import org.junit.Assert;
import org.junit.Test;

public class Validationtest {
    Emailvalidation val=new Emailvalidation();
@Test
public void testvalidation(){
boolean bool= val.validation();
    Assert.assertEquals(true,bool);
}
}
