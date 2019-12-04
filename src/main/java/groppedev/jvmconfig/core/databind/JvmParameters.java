package groppedev.jvmconfig.core.databind;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import groppedev.jvmconfig.core.Lang;
import groppedev.jvmconfig.core.Launcher;

public class JvmParameters 
{
	private static List<JvmParameter> parameters;
	private static List<JvmParameterDescription> descriptions;
	private static final String DEFINITIONS_FILE_PATH = "/groppedev/jvmconfig/conf/jvmparameters.yaml";
	private static final String DESCRIPTIONS_FILE_PATH = "/groppedev/jvmconfig/conf/descriptions-{{lang}}.yaml";

	static
	{
		// check language.
		Lang lang = selectLang();
		System.out.println("language -> " + lang);
		
		
		ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
		try 
		{
			parameters = objectMapper.reader()
					.forType(new TypeReference<List<JvmParameter>>(){})
					.readValue(Launcher.class.getResourceAsStream(DEFINITIONS_FILE_PATH));
			descriptions = objectMapper.reader()
					.forType(new TypeReference<List<JvmParameterDescription>>(){})
					.readValue(Launcher.class.getResourceAsStream(DESCRIPTIONS_FILE_PATH.replace("{{lang}}", lang.name().toLowerCase())));
					
		} 
		catch (IOException e) 
		{
			throw new RuntimeException("JVM Parameter definitions parsing error", e);
		}
	}

	private static Lang selectLang()
	{
		return Lang.fromString(System.getProperty("jvmconfig.lang", "EN"));
	}

	public static Collection<JvmParameter> parameters()
	{
		return Collections.unmodifiableList(parameters);
	}
	
	public static Collection<JvmParameterDescription> descriptions()
	{
		return Collections.unmodifiableList(descriptions);
	}
	
	public static int size()
	{
		return parameters.size();
	}
	
	public static String definitionsFilePath()
	{
		return DEFINITIONS_FILE_PATH;
	}
}
