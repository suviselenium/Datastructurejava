import org.testng.annotations.DataProvider;

public class AnagramDataProvider {

    @DataProvider(name = "testIsStringsAreEqualLength")
    public static Object[][] testIsStringsAreEqualLength() {
        return new Object[][]{
                {
                        "tac",
                        "laxa"
                },

        };
    }

    @DataProvider(name = "testIsStringNull")
    public static Object[][] testIsStringNull() {
        return new Object[][]{
                {
                        null,
                        null
                },

        };
    }
    @DataProvider(name = "tesIsStringNotAnagram")
    public static Object[][] tesIsStringNotAnagram() {
        return new Object[][]{
                {
                        "tac",
                        "lax"
                },

        };
    }

    @DataProvider(name = "testIsStringAnagram")
    public static Object[][] testIsStringAnagram() {
        return new Object[][]{
                {
                        "Desperation",
                        "A Rope Ends It"
                },

        };
    }

    @DataProvider(name = "testAnagramNonEnglishString")
    public static Object[][] testAnagramNonEnglishString() {
        return new Object[][]{
                {
                        "字谜字",
                        "谜字字"
                },

        };
    }
}
