package org.apache.commons.io.input;

import java.io.InputStream;

/* JADX INFO: loaded from: classes6.dex */
public class InfiniteCircularInputStream extends InputStream {
    private int position = -1;
    private final byte[] repeatedContent;

    public InfiniteCircularInputStream(byte[] bArr) {
        this.repeatedContent = bArr;
    }

    @Override // java.io.InputStream
    public int read() {
        int i10 = this.position + 1;
        byte[] bArr = this.repeatedContent;
        int length = i10 % bArr.length;
        this.position = length;
        return bArr[length] & 255;
    }
}
