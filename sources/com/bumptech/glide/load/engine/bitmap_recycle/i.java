package com.bumptech.glide.load.engine.bitmap_recycle;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements a<int[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f139529a = "IntegerArrayPool";

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.a
    public int a(int[] iArr) {
        return iArr.length;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.a
    public int b() {
        return 4;
    }

    public int c(int[] iArr) {
        return iArr.length;
    }

    public int[] d(int i10) {
        return new int[i10];
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.a
    public String getTag() {
        return f139529a;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.a
    public int[] newArray(int i10) {
        return new int[i10];
    }
}
