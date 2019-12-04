package groppedev.jvmconfig.core.databind;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

public class JvmParameterDescription 
{
	private final String name; 
	private final String description;

	@Generated("SparkTools")
	private JvmParameterDescription(Builder builder) {
		this.name = builder.name;
		this.description = builder.description;
	}

	/**
	 * Used by Jackson yaml-databind
	 */
	private JvmParameterDescription(@JsonProperty("name") String name,  @JsonProperty("description") String description) 
	{
		this.name = name;
		this.description = description;
	}
	
	public String name() 
	{
		return name;
	}

	public String description() 
	{
		return description;
	}

	@Override
	public String toString() {
		return "JvmParameterDescription [" + (name != null ? "name=" + name + ", " : "")
				+ (description != null ? "description=" + description : "") + "]";
	}

	
	/**
	 * Creates builder to build {@link JvmParameterDescription}.
	 * @return created builder
	 */
	@Generated("SparkTools")
	public static INameStage builder() {
		return new Builder();
	}


	@Generated("SparkTools")
	public interface INameStage {
		public IDescriptionStage name(String name);
	}


	@Generated("SparkTools")
	public interface IDescriptionStage {
		public IBuildStage description(String description);
	}


	@Generated("SparkTools")
	public interface IBuildStage {
		public JvmParameterDescription build();
	}


	/**
	 * Builder to build {@link JvmParameterDescription}.
	 */
	@Generated("SparkTools")
	public static final class Builder implements INameStage, IDescriptionStage, IBuildStage {
		private String name;
		private String description;

		private Builder() {
		}

		@Override
		public IDescriptionStage name(String name) {
			this.name = name;
			return this;
		}

		@Override
		public IBuildStage description(String description) {
			this.description = description;
			return this;
		}

		@Override
		public JvmParameterDescription build() {
			return new JvmParameterDescription(this);
		}
	}
}