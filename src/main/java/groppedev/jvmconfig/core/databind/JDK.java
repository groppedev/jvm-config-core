package groppedev.jvmconfig.core.databind;

public enum JDK 
{
	JDK6(6), JDK7(7), JDK8(8), JDK9(9), JDK10(10), JDK11(11), JDK12(12), JDK13(13), JDK14(14), LATEST(JDK14);
	
	private int majorversion;
	
	private JDK(int majorversion)
	{
		this.majorversion = majorversion;
	}
	
	private JDK(JDK jdk)
	{
		this.majorversion = jdk.majorversion;
	}

	public int majorVersion() 
	{
		return majorversion;
	}
}
