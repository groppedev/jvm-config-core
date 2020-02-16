package groppedev.jvmconfig.core;

import java.io.IOException;
import java.io.InputStream;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import groppedev.jvmconfig.core.bundle.Bundle;

public class BundlesReader 
{
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException 
	{
		ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
		InputStream bundleResource = Launcher.class.getResourceAsStream("/groppedev/jvmconfig/conf/bundle-test.yaml");
		Bundle b = mapper.readValue(bundleResource, Bundle.class);
		System.out.println(b);
	}
}
