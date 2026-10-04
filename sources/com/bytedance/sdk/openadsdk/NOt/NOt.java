package com.bytedance.sdk.openadsdk.NOt;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public class NOt extends ZRu {
    private int NOt;
    private int mZ;
    private volatile boolean uR;

    public NOt(int i10, int i11) {
        this.NOt = 15;
        this.mZ = 3;
        if (i10 <= 0) {
            throw new IllegalArgumentException("Max count must be positive number!");
        }
        this.NOt = i10;
        this.mZ = i11;
    }

    private void mZ(List<File> list) {
        long jNOt = NOt(list);
        int size = list.size();
        if (ZRu(jNOt, size)) {
            return;
        }
        for (File file : list) {
            long length = file.length();
            if (file.delete()) {
                size--;
                jNOt -= length;
            }
            if (ZRu(file, jNOt, size)) {
                return;
            }
        }
    }

    private void uR(List<File> list) {
        long jNOt;
        int size;
        boolean zZRu;
        if (list != null) {
            try {
                if (list.size() != 0 && !(zZRu = ZRu((jNOt = NOt(list)), (size = list.size())))) {
                    TreeMap treeMap = new TreeMap();
                    for (File file : list) {
                        treeMap.put(Long.valueOf(file.lastModified()), file);
                    }
                    for (Map.Entry entry : treeMap.entrySet()) {
                        if (entry != null && !zZRu) {
                            ((Long) entry.getKey()).getClass();
                            File file2 = (File) entry.getValue();
                            long length = file2.length();
                            if (file2.delete()) {
                                size--;
                                jNOt -= length;
                            }
                            if (ZRu(file2, jNOt, size)) {
                                return;
                            }
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.NOt.ZRu
    public boolean ZRu(long j10, int i10) {
        return i10 <= this.NOt;
    }

    @Override // com.bytedance.sdk.openadsdk.NOt.ZRu
    public boolean ZRu(File file, long j10, int i10) {
        return i10 <= this.mZ;
    }

    @Override // com.bytedance.sdk.openadsdk.NOt.ZRu
    public void ZRu(List<File> list) {
        if (this.uR) {
            uR(list);
            this.uR = false;
        } else {
            mZ(list);
        }
    }

    public NOt(int i10, int i11, boolean z10) {
        this.NOt = 15;
        this.mZ = 3;
        if (i10 > 0) {
            this.NOt = i10;
            this.mZ = i11;
            this.uR = z10;
            return;
        }
        throw new IllegalArgumentException("Max count must be positive number!");
    }
}
