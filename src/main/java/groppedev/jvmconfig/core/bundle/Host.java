package groppedev.jvmconfig.core.bundle;

import java.util.List;

public class Host 
{
	private String host;
	private int quantity;
	private String size;
	private String sequence;
	private List<String> containers;
	private List<String> exclude;
	private String mode;
	private String jvm;
	
	
//	   - host         : TEST1
//	      quantity     : 14
//	      size         : M
//	      sequence     : alphabetic
//	      servers      :
//	        - name : a
//	        - name : b
//	        - name : c
	public Host()
	{
		this.size = "M";
		this.mode = "AUTO";
	}
	
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getJvm() {
		return jvm;
	}
	public void setJvm(String jvm) {
		this.jvm = jvm;
	}
	public String getSequence() {
		return sequence;
	}
	public void setSequence(String sequence) {
		this.sequence = sequence;
	}
	public List<String> getContainers() {
		return containers;
	}
	public void setContainers(List<String> containers) {
		this.containers = containers;
	}
	public List<String> getExclude() {
		return exclude;
	}
	public void setExclude(List<String> exclude) {
		this.exclude = exclude;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\n\tHost [");
		if (host != null) {
			builder.append("host=");
			builder.append(host);
			builder.append(", ");
		}
		if (mode != null) {
			builder.append("mode=");
			builder.append(mode);
			builder.append(", ");
		}
		builder.append("quantity=");
		builder.append(quantity);
		builder.append(", ");
		if (size != null) {
			builder.append("size=");
			builder.append(size);
			builder.append(", ");
		}
		if (sequence != null) {
			builder.append("sequence=");
			builder.append(sequence);
			builder.append(", ");
		}
		if (containers != null) {
			builder.append("containers=");
			builder.append(containers);
			builder.append(", ");
		}
		if (exclude != null) {
			builder.append("exclude=");
			builder.append(exclude);
			builder.append(", ");
		}
		if (jvm != null) {
			builder.append("jvm=");
			builder.append(jvm);
		}
		builder.append("]");
		return builder.toString();
	}
}
