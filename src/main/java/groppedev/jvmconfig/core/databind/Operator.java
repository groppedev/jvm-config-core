package groppedev.jvmconfig.core.databind;

public enum Operator 
{
	EQUAL("="), COLON(":"), NOTHING("");

	private String symbol;

	private Operator(String symbol) 
	{
		this.symbol = symbol;
	}

	public String symbol() 
	{
		return symbol;
	}
}
