package com.prism.lib.pfs.file.exchange;

import android.os.Parcelable;
import com.prism.commons.file.FileType;
import com.prism.lib.pfs.file.a;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes7.dex */
public interface ExchangeFile extends Parcelable {
    boolean deleteQuietly();

    boolean exists();

    a getFileDescriptorProxy() throws IOException;

    String getId();

    InputStream getInputStream() throws IOException;

    String getName();

    FileType getType();

    long lastModified();

    long length();

    boolean writeFromInputStream(InputStream inputStream, boolean z10) throws IOException;
}
