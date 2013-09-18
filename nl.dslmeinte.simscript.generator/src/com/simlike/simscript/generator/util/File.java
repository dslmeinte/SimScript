package nl.dslmeinte.simscript.generator.util;

/**
 * Class to capture both the path (relative to the {@code src-gen/} folder of
 * the project which is being build and the full contents of a file-to-generate.
 * 
 * @author Meinte Boersma
 */
public class File {

	private final String path;
	private final CharSequence contents;

	public File(String path, CharSequence contents) {
		this.path = path;
		this.contents = contents;
	}

	public String getPath() {
		return path;
	}

	public CharSequence getContents() {
		return contents;
	}

}
