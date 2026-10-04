package org.apache.commons.io.filefilter;

import android.support.v4.media.session.f;
import androidx.concurrent.futures.b;
import java.io.File;
import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
public class SizeFileFilter extends AbstractFileFilter implements Serializable {
    private static final long serialVersionUID = 7388077430788600069L;
    private final boolean acceptLarger;
    private final long size;

    public SizeFileFilter(long j10) {
        this(j10, true);
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(File file) {
        boolean z10 = file.length() < this.size;
        return this.acceptLarger ? !z10 : z10;
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter
    public String toString() {
        String str = this.acceptLarger ? ">=" : "<";
        StringBuilder sb2 = new StringBuilder();
        b.a(sb2, super.toString(), "(", str);
        return f.a(sb2, this.size, ")");
    }

    public SizeFileFilter(long j10, boolean z10) {
        if (j10 < 0) {
            throw new IllegalArgumentException("The size must be non-negative");
        }
        this.size = j10;
        this.acceptLarger = z10;
    }
}
