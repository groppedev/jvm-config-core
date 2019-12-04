package groppedev.jvmconfig.core;

public enum Lang
{
	EN, IT, UNKNOWN;
	
	public static Lang fromString(String value)
	{
		for(Lang l : Lang.values())
		{
			if(l.name().equals(value))
			{
				return l;
			}
		}
		return Lang.UNKNOWN;
	}
}
