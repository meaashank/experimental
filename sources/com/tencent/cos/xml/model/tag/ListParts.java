package com.tencent.cos.xml.model.tag;

import android.support.v4.media.e;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class ListParts {
    public String bucket;
    public String encodingType;
    public Initiator initiator;
    public boolean isTruncated;
    public String key;
    public String maxParts;
    public String nextPartNumberMarker;
    public Owner owner;
    public String partNumberMarker;
    public List<Part> parts;
    public String storageClass;
    public String uploadId;

    public static class Initiator {
        public String disPlayName;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        public String f194136id;

        public String toString() {
            StringBuilder sb2 = new StringBuilder("{Initiator:\nId:");
            sb2.append(this.f194136id);
            sb2.append("\nDisPlayName:");
            return e.a(sb2, this.disPlayName, "\n}");
        }
    }

    public static class Owner {
        public String disPlayName;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        public String f194137id;

        public String toString() {
            StringBuilder sb2 = new StringBuilder("{Owner:\nId:");
            sb2.append(this.f194137id);
            sb2.append("\nDisPlayName:");
            return e.a(sb2, this.disPlayName, "\n}");
        }
    }

    public static class Part {
        public String eTag;
        public String lastModified;
        public String partNumber;
        public String size;

        public String toString() {
            StringBuilder sb2 = new StringBuilder("{Part:\nPartNumber:");
            sb2.append(this.partNumber);
            sb2.append("\nLastModified:");
            sb2.append(this.lastModified);
            sb2.append("\nETag:");
            sb2.append(this.eTag);
            sb2.append("\nSize:");
            return e.a(sb2, this.size, "\n}");
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("{ListParts:\nBucket:");
        sb2.append(this.bucket);
        sb2.append("\nEncoding-Type:");
        sb2.append(this.encodingType);
        sb2.append("\nKey:");
        sb2.append(this.key);
        sb2.append("\nUploadId:");
        sb2.append(this.uploadId);
        sb2.append("\n");
        Owner owner = this.owner;
        if (owner != null) {
            sb2.append(owner.toString());
            sb2.append("\n");
        }
        sb2.append("PartNumberMarker:");
        sb2.append(this.partNumberMarker);
        sb2.append("\n");
        Initiator initiator = this.initiator;
        if (initiator != null) {
            sb2.append(initiator.toString());
            sb2.append("\n");
        }
        sb2.append("StorageClass:");
        sb2.append(this.storageClass);
        sb2.append("\nNextPartNumberMarker:");
        sb2.append(this.nextPartNumberMarker);
        sb2.append("\nMaxParts:");
        sb2.append(this.maxParts);
        sb2.append("\nIsTruncated:");
        sb2.append(this.isTruncated);
        sb2.append("\n");
        List<Part> list = this.parts;
        if (list != null) {
            for (Part part : list) {
                if (part != null) {
                    sb2.append(part.toString());
                    sb2.append("\n");
                }
            }
        }
        sb2.append("}");
        return sb2.toString();
    }
}
