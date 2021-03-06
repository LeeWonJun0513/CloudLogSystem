package assistlog;

public interface Transform {

	public boolean appliesTo(String className);

	public byte[] instrument(String className, byte[] defaultByteCode, ClassLoader loader);

}