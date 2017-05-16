package com.daemon;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppsecondTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppsecondTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppsecondTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
		for(int i=0;i<999999999;i++)
		{
			for(int j=0;j < 2;j++)
			{
				
			}
			
		} 	
        assertTrue( true );
    }
}
