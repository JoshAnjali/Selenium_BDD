package TestNGDataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class TestNgDataprovider
{

        @DataProvider(name = "Datainput")
        public Object[][] createData()
        {
            return new Object[][]
                    {
                    {"Data1"},
                    {"Data2"},
                    {"Data3"},
                    {"Data4"},
                    {"Data5"},
                    };
        }

        @Test(dataProvider = "Datainput")
        public void testGoogleSearch(String inputdata)
        {
            System.out.println("Searching for: " + inputdata);

        }

}

