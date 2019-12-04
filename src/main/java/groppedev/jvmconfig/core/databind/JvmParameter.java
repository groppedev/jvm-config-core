package groppedev.jvmconfig.core.databind;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JvmParameter 
{
	private final String name; 
	private final String prefix;
	private final boolean toggle;
	private final Category category;
	private final JDK sinceJDK;
	private final JDK untilJDK;
	private final Operator operator;

	@Generated("SparkTools")
	private JvmParameter(Builder builder) {
		this.name = builder.name;
		this.prefix = builder.prefix;
		this.toggle = builder.toggle;
		this.category = builder.category;
		this.sinceJDK = builder.sinceJDK;
		this.untilJDK = builder.untilJDK;
		this.operator = builder.operator;
	}

	/**
	 * Used by Jackson yaml-databind
	 */
	private JvmParameter(@JsonProperty("name") String name, 
			@JsonProperty("prefix") String prefix,
			@JsonProperty("toggleable") boolean toggleable, 
			@JsonProperty("category") Category category,
			@JsonProperty("operator") Operator operator,
			@JsonProperty("since") JDK sinceJDK,
			@JsonProperty("until") JDK untilJDK) 
	{
		this.name = name;
		this.prefix = prefix;
		this.toggle = toggleable;
		this.category = category;
		this.operator = operator;
		this.sinceJDK = sinceJDK;
		this.untilJDK = untilJDK;
	}
	
	public String name() 
	{
		return name;
	}

	public String prefix() 
	{
		return prefix;
	}

	public boolean isToggleable() 
	{
		return toggle;
	}

	public Category category() 
	{
		return category;
	}

	public JDK sinceJDK() 
	{
		return sinceJDK;
	}

	public JDK untilJDK() 
	{
		return untilJDK;
	}

	public Operator operator() 
	{
		return operator;
	}

	@Override
	public String toString() {
		return "JvmParameter [" + (name != null ? "name=" + name + ", " : "")
				+ (prefix != null ? "prefix=" + prefix + ", " : "") + "toggle=" + toggle + ", "
				+ (category != null ? "category=" + category + ", " : "")
				+ (sinceJDK != null ? "sinceJDK=" + sinceJDK + ", " : "")
				+ (untilJDK != null ? "untilJDK=" + untilJDK + ", " : "")
				+ (operator != null ? "operator=" + operator : "") + "]";
	}

	
	/**
	 * Creates builder to build {@link JvmParameter}.
	 * @return created builder
	 */
	@Generated("SparkTools")
	public static INameStage builder() {
		return new Builder();
	}


	@Generated("SparkTools")
	public interface INameStage {
		public IPrefixStage name(String name);
	}


	@Generated("SparkTools")
	public interface IPrefixStage {
		public IToggleStage prefix(String prefix);
	}


	@Generated("SparkTools")
	public interface IToggleStage {
		public ICategoryStage toggle(boolean toggle);
	}


	@Generated("SparkTools")
	public interface ICategoryStage {
		public ISinceJDKStage category(Category category);
	}


	@Generated("SparkTools")
	public interface ISinceJDKStage {
		public IUntilJDKStage sinceJDK(JDK sinceJDK);
	}


	@Generated("SparkTools")
	public interface IUntilJDKStage {
		public IOperatorStage untilJDK(JDK untilJDK);
	}


	@Generated("SparkTools")
	public interface IOperatorStage {
		public IBuildStage operator(Operator operator);
	}


	@Generated("SparkTools")
	public interface IBuildStage {
		public JvmParameter build();
	}


	/**
	 * Builder to build {@link JvmParameter}.
	 */
	@Generated("SparkTools")
	public static final class Builder implements INameStage, IPrefixStage, IToggleStage, ICategoryStage, ISinceJDKStage,
			IUntilJDKStage, IOperatorStage, IBuildStage {
		private String name;
		private String prefix;
		private boolean toggle;
		private Category category;
		private JDK sinceJDK;
		private JDK untilJDK;
		private Operator operator;

		private Builder() {
		}

		@Override
		public IPrefixStage name(String name) {
			this.name = name;
			return this;
		}

		@Override
		public IToggleStage prefix(String prefix) {
			this.prefix = prefix;
			return this;
		}

		@Override
		public ICategoryStage toggle(boolean toggle) {
			this.toggle = toggle;
			return this;
		}

		@Override
		public ISinceJDKStage category(Category category) {
			this.category = category;
			return this;
		}

		@Override
		public IUntilJDKStage sinceJDK(JDK sinceJDK) {
			this.sinceJDK = sinceJDK;
			return this;
		}

		@Override
		public IOperatorStage untilJDK(JDK untilJDK) {
			this.untilJDK = untilJDK;
			return this;
		}

		@Override
		public IBuildStage operator(Operator operator) {
			this.operator = operator;
			return this;
		}

		@Override
		public JvmParameter build() {
			return new JvmParameter(this);
		}
	}
}