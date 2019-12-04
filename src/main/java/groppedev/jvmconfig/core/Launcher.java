package groppedev.jvmconfig.core;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import groppedev.jvmconfig.core.databind.JvmParameter;
import groppedev.jvmconfig.core.databind.JvmParameterDescription;
import groppedev.jvmconfig.core.databind.JvmParameters;

/**
 * Main class
 * @author GROMAS
 */
public class Launcher 
{
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException 
	{
		System.out.println(String.format("Loaded %d jvm parameters from the definitions file -> '%s'", 
										 JvmParameters.size(), JvmParameters.definitionsFilePath()));
		for(JvmParameter param : JvmParameters.parameters())
		{
			System.out.println("\t" + param);
		}
		for(JvmParameterDescription desc : JvmParameters.descriptions())
		{
			System.out.println("\t" + desc);
		}
	}
}
