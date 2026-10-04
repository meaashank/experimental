package com.bumptech.glide.load.engine.bitmap_recycle;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements a<byte[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f139522a = "ByteArrayPool";

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.a
    public int a(byte[] bArr) {
        return bArr.length;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.a
    public int b() {
        return 1;
    }

    public int c(byte[] bArr) {
        return bArr.length;
    }

    public byte[] d(int i10) {
        return new byte[i10];
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.a
    public String getTag() {
        return f139522a;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.a
    public byte[] newArray(int i10) {
        return new byte[i10];
    }
}
