package com.tencent.cos.xml.model.tag;

import android.support.v4.media.e;

/* JADX INFO: loaded from: classes7.dex */
public class PostResponse {
    public String bucket;
    public String eTag;
    public String key;
    public String location;

    public String toString() {
        StringBuilder sb2 = new StringBuilder("{PostResponse:\nLocation:");
        sb2.append(this.location);
        sb2.append("\nBucket:");
        sb2.append(this.bucket);
        sb2.append("\nKey:");
        sb2.append(this.key);
        sb2.append("\nETag:");
        return e.a(sb2, this.eTag, "\n}");
    }
}
