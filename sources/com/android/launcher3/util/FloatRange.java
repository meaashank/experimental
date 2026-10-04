package com.android.launcher3.util;

/* JADX INFO: loaded from: classes2.dex */
public class FloatRange {
    public float end;
    public float start;

    public FloatRange() {
    }

    public boolean contains(float f10) {
        return f10 >= this.start && f10 <= this.end;
    }

    public void set(float f10, float f11) {
        this.start = f10;
        this.end = f11;
    }

    public FloatRange(float f10, float f11) {
        set(f10, f11);
    }
}
