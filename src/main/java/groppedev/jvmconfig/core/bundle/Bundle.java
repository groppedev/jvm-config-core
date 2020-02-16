package groppedev.jvmconfig.core.bundle;

import java.util.List;

public class Bundle 
{
	private String arch;
	private String conf;
	private String group;
	private String date;
	private String label;
	private String version;
	private boolean jmx;
	private String author;
	private List<Host> hosts;
	
	public String getArch() {
		return arch;
	}
	public void setArch(String arch) {
		this.arch = arch;
	}
	public String getConf() {
		return conf;
	}
	public void setConf(String conf) {
		this.conf = conf;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public boolean isJmx() {
		return jmx;
	}
	public void setJmx(boolean jmx) {
		this.jmx = jmx;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public List<Host> getHosts() {
		return hosts;
	}
	public void setHosts(List<Host> hosts) {
		this.hosts = hosts;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bundle [arch=");
		builder.append(arch);
		builder.append(", conf=");
		builder.append(conf);
		builder.append(", version=");
		builder.append(version);
		builder.append(", group=");
		builder.append(group);
		builder.append(", jmx=");
		builder.append(jmx);
		builder.append(", date=");
		builder.append(date);
		builder.append(", author=");
		builder.append(author);
		builder.append(", label=");
		builder.append(label);
		builder.append(", hosts=");
		builder.append(hosts);
		builder.append("]");
		return builder.toString();
	}	
}
