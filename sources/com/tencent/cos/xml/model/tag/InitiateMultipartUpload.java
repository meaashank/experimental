package com.tencent.cos.xml.model.tag;

import android.support.v4.media.e;

/* JADX INFO: loaded from: classes7.dex */
public class InitiateMultipartUpload {
    public String bucket;
    public String key;
    public String uploadId;

    public String toString() {
        StringBuilder sb2 = new StringBuilder("{InitiateMultipartUpload:\nBucket:");
        sb2.append(this.bucket);
        sb2.append("\nKey:");
        sb2.append(this.key);
        sb2.append("\nUploadId:");
        return e.a(sb2, this.uploadId, "\n}");
    }
}
