package com.bumptech.glide.load.engine.prefill;

import android.graphics.Bitmap;
import androidx.activity.C1477d;
import androidx.annotation.Nullable;
import e.f0;
import y3.m;

/* JADX INFO: loaded from: classes2.dex */
public final class PreFillType {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @f0
    public static final Bitmap.Config f139753e = Bitmap.Config.RGB_565;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f139754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f139755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bitmap.Config f139756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f139757d;

    public static class Builder {
        private Bitmap.Config config;
        private final int height;
        private int weight;
        private final int width;

        public Builder(int i10) {
            this(i10, i10);
        }

        public PreFillType build() {
            return new PreFillType(this.width, this.height, this.config, this.weight);
        }

        public Bitmap.Config getConfig() {
            return this.config;
        }

        public Builder setConfig(@Nullable Bitmap.Config config) {
            this.config = config;
            return this;
        }

        public Builder setWeight(int i10) {
            if (i10 <= 0) {
                throw new IllegalArgumentException("Weight must be > 0");
            }
            this.weight = i10;
            return this;
        }

        public Builder(int i10, int i11) {
            this.weight = 1;
            if (i10 <= 0) {
                throw new IllegalArgumentException("Width must be > 0");
            }
            if (i11 <= 0) {
                throw new IllegalArgumentException("Height must be > 0");
            }
            this.width = i10;
            this.height = i11;
        }
    }

    public PreFillType(int i10, int i11, Bitmap.Config config, int i12) {
        m.f(config, "Config must not be null");
        this.f139756c = config;
        this.f139754a = i10;
        this.f139755b = i11;
        this.f139757d = i12;
    }

    public Bitmap.Config a() {
        return this.f139756c;
    }

    public int b() {
        return this.f139755b;
    }

    public int c() {
        return this.f139757d;
    }

    public int d() {
        return this.f139754a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof PreFillType) {
            PreFillType preFillType = (PreFillType) obj;
            if (this.f139755b == preFillType.f139755b && this.f139754a == preFillType.f139754a && this.f139757d == preFillType.f139757d && this.f139756c == preFillType.f139756c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f139756c.hashCode() + (((this.f139754a * 31) + this.f139755b) * 31)) * 31) + this.f139757d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("PreFillSize{width=");
        sb2.append(this.f139754a);
        sb2.append(", height=");
        sb2.append(this.f139755b);
        sb2.append(", config=");
        sb2.append(this.f139756c);
        sb2.append(", weight=");
        return C1477d.a(sb2, this.f139757d, '}');
    }
}
