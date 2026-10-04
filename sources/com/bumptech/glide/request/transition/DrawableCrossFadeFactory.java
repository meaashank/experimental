package com.bumptech.glide.request.transition;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.DataSource;
import w3.C5742c;
import w3.C5743d;
import w3.InterfaceC5744e;
import w3.InterfaceC5745f;

/* JADX INFO: loaded from: classes2.dex */
public class DrawableCrossFadeFactory implements InterfaceC5745f<Drawable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f140091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f140092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C5742c f140093c;

    public static class Builder {
        private static final int DEFAULT_DURATION_MS = 300;
        private final int durationMillis;
        private boolean isCrossFadeEnabled;

        public Builder() {
            this(300);
        }

        public DrawableCrossFadeFactory build() {
            return new DrawableCrossFadeFactory(this.durationMillis, this.isCrossFadeEnabled);
        }

        public Builder setCrossFadeEnabled(boolean z10) {
            this.isCrossFadeEnabled = z10;
            return this;
        }

        public Builder(int i10) {
            this.durationMillis = i10;
        }
    }

    public DrawableCrossFadeFactory(int i10, boolean z10) {
        this.f140091a = i10;
        this.f140092b = z10;
    }

    @Override // w3.InterfaceC5745f
    public InterfaceC5744e<Drawable> a(DataSource dataSource, boolean z10) {
        return dataSource == DataSource.MEMORY_CACHE ? C5743d.f240082a : b();
    }

    public final InterfaceC5744e<Drawable> b() {
        if (this.f140093c == null) {
            this.f140093c = new C5742c(this.f140091a, this.f140092b);
        }
        return this.f140093c;
    }
}
