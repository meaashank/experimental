package com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes2.dex */
class FA {
    private final RandomAccessFile ZRu;

    public static class ZRu extends Exception {
        public ZRu(Throwable th) {
            super(th);
        }
    }

    public FA(File file, String str) throws ZRu {
        try {
            this.ZRu = new RandomAccessFile(file, str);
        } catch (FileNotFoundException e10) {
            throw new ZRu(e10);
        }
    }

    public void ZRu(long j10) throws ZRu {
        try {
            this.ZRu.seek(j10);
        } catch (IOException e10) {
            throw new ZRu(e10);
        }
    }

    public void ZRu(byte[] bArr, int i10, int i11) throws ZRu {
        try {
            this.ZRu.write(bArr, i10, i11);
        } catch (IOException e10) {
            throw new ZRu(e10);
        }
    }

    public int ZRu(byte[] bArr) throws ZRu {
        try {
            return this.ZRu.read(bArr);
        } catch (IOException e10) {
            throw new ZRu(e10);
        }
    }

    public void ZRu() {
        com.bykv.vk.openvk.ZRu.ZRu.NOt.mZ.ZRu.ZRu(this.ZRu);
    }
}
