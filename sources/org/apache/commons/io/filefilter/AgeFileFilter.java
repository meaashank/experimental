package org.apache.commons.io.filefilter;

import android.support.v4.media.session.f;
import androidx.concurrent.futures.b;
import java.io.File;
import java.io.Serializable;
import java.util.Date;
import org.apache.commons.io.FileUtils;

/* JADX INFO: loaded from: classes6.dex */
public class AgeFileFilter extends AbstractFileFilter implements Serializable {
    private static final long serialVersionUID = -2132740084016138541L;
    private final boolean acceptOlder;
    private final long cutoff;

    public AgeFileFilter(long j10) {
        this(j10, true);
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(File file) {
        boolean zIsFileNewer = FileUtils.isFileNewer(file, this.cutoff);
        return this.acceptOlder ? !zIsFileNewer : zIsFileNewer;
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter
    public String toString() {
        String str = this.acceptOlder ? "<=" : ">";
        StringBuilder sb2 = new StringBuilder();
        b.a(sb2, super.toString(), "(", str);
        return f.a(sb2, this.cutoff, ")");
    }

    public AgeFileFilter(long j10, boolean z10) {
        this.acceptOlder = z10;
        this.cutoff = j10;
    }

    public AgeFileFilter(Date date) {
        this(date, true);
    }

    public AgeFileFilter(Date date, boolean z10) {
        this(date.getTime(), z10);
    }

    public AgeFileFilter(File file) {
        this(file, true);
    }

    public AgeFileFilter(File file, boolean z10) {
        this(file.lastModified(), z10);
    }
}
