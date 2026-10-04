package com.tencent.cos.xml.model.tag;

import android.support.v4.media.e;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class ListMultipartUploads {
    public String bucket;
    public List<CommonPrefixes> commonPrefixes;
    public String delimiter;
    public String encodingType;
    public boolean isTruncated;
    public String keyMarker;
    public String maxUploads;
    public String nextKeyMarker;
    public String nextUploadIdMarker;
    public String prefix;
    public String uploadIdMarker;
    public List<Upload> uploads;

    public static class CommonPrefixes {
        public String prefix;

        public String toString() {
            return e.a(new StringBuilder("{CommonPrefixes:\nPrefix:"), this.prefix, "\n}");
        }
    }

    public static class Initiator {
        public String displayName;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        public String f194134id;
        public String uin;

        public String toString() {
            StringBuilder sb2 = new StringBuilder("{Initiator:\nUin:");
            sb2.append(this.uin);
            sb2.append("\nId:");
            sb2.append(this.f194134id);
            sb2.append("\nDisplayName:");
            return e.a(sb2, this.displayName, "\n}");
        }
    }

    public static class Owner {
        public String displayName;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        public String f194135id;
        public String uid;

        public String toString() {
            StringBuilder sb2 = new StringBuilder("{Owner:\nUid:");
            sb2.append(this.uid);
            sb2.append("\nId:");
            sb2.append(this.f194135id);
            sb2.append("\nDisplayName:");
            return e.a(sb2, this.displayName, "\n}");
        }
    }

    public static class Upload {
        public String initiated;
        public Initiator initiator;
        public String key;
        public Owner owner;
        public String storageClass;
        public String uploadID;

        public String toString() {
            StringBuilder sb2 = new StringBuilder("{Upload:\nKey:");
            sb2.append(this.key);
            sb2.append("\nUploadID:");
            sb2.append(this.uploadID);
            sb2.append("\nStorageClass:");
            sb2.append(this.storageClass);
            sb2.append("\n");
            Initiator initiator = this.initiator;
            if (initiator != null) {
                sb2.append(initiator.toString());
                sb2.append("\n");
            }
            Owner owner = this.owner;
            if (owner != null) {
                sb2.append(owner.toString());
                sb2.append("\n");
            }
            sb2.append("Initiated:");
            return e.a(sb2, this.initiated, "\n}");
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("{ListMultipartUploads:\nBucket:");
        sb2.append(this.bucket);
        sb2.append("\nEncoding-Type:");
        sb2.append(this.encodingType);
        sb2.append("\nKeyMarker:");
        sb2.append(this.keyMarker);
        sb2.append("\nUploadIdMarker:");
        sb2.append(this.uploadIdMarker);
        sb2.append("\nNextKeyMarker:");
        sb2.append(this.nextKeyMarker);
        sb2.append("\nNextUploadIdMarker:");
        sb2.append(this.nextUploadIdMarker);
        sb2.append("\nMaxUploads:");
        sb2.append(this.maxUploads);
        sb2.append("\nIsTruncated:");
        sb2.append(this.isTruncated);
        sb2.append("\nPrefix:");
        sb2.append(this.prefix);
        sb2.append("\nDelimiter:");
        sb2.append(this.delimiter);
        sb2.append("\n");
        List<Upload> list = this.uploads;
        if (list != null) {
            for (Upload upload : list) {
                if (upload != null) {
                    sb2.append(upload.toString());
                    sb2.append("\n");
                }
            }
        }
        List<CommonPrefixes> list2 = this.commonPrefixes;
        if (list2 != null) {
            for (CommonPrefixes commonPrefixes : list2) {
                if (commonPrefixes != null) {
                    sb2.append(commonPrefixes.toString());
                    sb2.append("\n");
                }
            }
        }
        sb2.append("}");
        return sb2.toString();
    }
}
