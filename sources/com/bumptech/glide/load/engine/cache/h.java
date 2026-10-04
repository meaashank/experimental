package com.bumptech.glide.load.engine.cache;

import android.content.Context;
import com.bumptech.glide.load.engine.cache.d;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends d {

    public class a implements d.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f139610a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f139611b;

        public a(Context context, String str) {
            this.f139610a = context;
            this.f139611b = str;
        }

        @Override // com.bumptech.glide.load.engine.cache.d.c
        public File a() {
            File cacheDir = this.f139610a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f139611b != null ? new File(cacheDir, this.f139611b) : cacheDir;
        }
    }

    public h(Context context) {
        this(context, "image_manager_disk_cache", 262144000L);
    }

    public h(Context context, long j10) {
        this(context, "image_manager_disk_cache", j10);
    }

    public h(Context context, String str, long j10) {
        super(new a(context, str), j10);
    }
}
