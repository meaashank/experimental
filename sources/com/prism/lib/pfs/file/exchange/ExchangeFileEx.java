package com.prism.lib.pfs.file.exchange;

import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public interface ExchangeFileEx extends ExchangeFile {
    void adjustFilename(boolean z10);

    void mkParentDirs() throws IOException;
}
