package project.core.cdi.impl.io;

import project.core.cdi.io.Resource;

import java.io.File;

/**
 * Xml resource implementation.
 */
public class XmlResource implements Resource {
    private final String filename;

    public XmlResource(String filename) {
        this.filename = filename;
    }

    @Override
    public File getFile() {
        return new File(filename);
    }
}
