package org.apache.commons.io;

import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public class FileExistsException extends IOException {
    private static final long serialVersionUID = 1;

    public FileExistsException() {
    }

    public FileExistsException(String str) {
        super(str);
    }

    public FileExistsException(File file) {
        super(a.a("File ", file, " exists"));
    }
}
