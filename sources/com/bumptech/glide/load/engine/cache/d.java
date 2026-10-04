package com.bumptech.glide.load.engine.cache;

import com.bumptech.glide.load.engine.cache.a;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public class d implements a.InterfaceC0367a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f139592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f139593d;

    public class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f139594a;

        public a(String str) {
            this.f139594a = str;
        }

        @Override // com.bumptech.glide.load.engine.cache.d.c
        public File a() {
            return new File(this.f139594a);
        }
    }

    public class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f139595a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f139596b;

        public b(String str, String str2) {
            this.f139595a = str;
            this.f139596b = str2;
        }

        @Override // com.bumptech.glide.load.engine.cache.d.c
        public File a() {
            return new File(this.f139595a, this.f139596b);
        }
    }

    public interface c {
        File a();
    }

    public d(String str, long j10) {
        this(new a(str), j10);
    }

    @Override // com.bumptech.glide.load.engine.cache.a.InterfaceC0367a
    public com.bumptech.glide.load.engine.cache.a build() {
        File fileA = this.f139593d.a();
        if (fileA == null) {
            return null;
        }
        if (fileA.isDirectory() || fileA.mkdirs()) {
            return new e(fileA, this.f139592c);
        }
        return null;
    }

    public d(String str, String str2, long j10) {
        this(new b(str, str2), j10);
    }

    public d(c cVar, long j10) {
        this.f139592c = j10;
        this.f139593d = cVar;
    }
}
