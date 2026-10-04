package com.tencent.cos.xml.model.tag;

import android.support.v4.media.e;

/* JADX INFO: loaded from: classes7.dex */
public class CopyObject {
    public String eTag;
    public String lastModified;

    public String toString() {
        StringBuilder sb2 = new StringBuilder("{CopyObject:\nETag:");
        sb2.append(this.eTag);
        sb2.append("\nLastModified:");
        return e.a(sb2, this.lastModified, "\n}");
    }
}
