package com.prism.lib.pfs.file;

import java.io.FileDescriptor;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public interface a {
    FileDescriptor a() throws IOException;

    void close();

    long getOffset();
}
