import com.sun.media.sound.InvalidDataException;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AnagramTest {
    private Angram ang;

    @BeforeMethod
    public void setUp() {
        ang = new Angram();
    }

    /**
     * This test will check if null is passed then isStringAnagram method should throw InvalidDataException
     * @param str1
     * @param str2
     * @throws InvalidDataException
     */
    @Test(expectedExceptions = InvalidDataException.class, dataProvider = "testIsStringNull", dataProviderClass = AnagramDataProvider.class)
    public void testIsStringNull(String str1, String str2) throws InvalidDataException{
        ang.isStringAnagram(str1,str2);
    }

    /**
     *
     * @param str1
     * @param str2
     * @throws InvalidDataException
     */
    @Test(dataProvider = "testIsStringsAreEqualLength", dataProviderClass = AnagramDataProvider.class)
    public void testIsStringsAreEqualLength(String str1, String str2) throws InvalidDataException{
        Assert.assertFalse(ang.isStringAnagram(str1,str2));
        //Assert.assertFalse(str1.equalsIgnoreCase(str2));
    }

    @Test(dataProvider = "tesIsStringNotAnagram", dataProviderClass = AnagramDataProvider.class)
    public void tesIsStringNotAnagram(String str1, String str2) throws InvalidDataException {
        Assert.assertFalse(ang.isStringAnagram(str1,str2));

    }

    @Test(dataProvider = "testIsStringAnagram", dataProviderClass = AnagramDataProvider.class)
    public void testIsStringAnagram(String str1, String str2) throws InvalidDataException {
        Assert.assertTrue(ang.isStringAnagram(str1,str2));
    }

    @Test(dataProvider = "testAnagramNonEnglishString", dataProviderClass = AnagramDataProvider.class)
    public void testAnagramNonEnglishString(String str1, String str2) throws InvalidDataException {
        Assert.assertTrue(ang.isStringAnagram(str1,str2));

    }
}
