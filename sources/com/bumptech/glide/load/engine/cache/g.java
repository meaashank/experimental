package com.bumptech.glide.load.engine.cache;

import android.content.Context;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.engine.cache.d;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends d {

    public class a implements d.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f139608a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f139609b;

        public a(Context context, String str) {
            this.f139608a = context;
            this.f139609b = str;
        }

        @Override // com.bumptech.glide.load.engine.cache.d.c
        public File a() {
            File externalCacheDir;
            File fileB = b();
            return ((fileB == null || !fileB.exists()) && (externalCacheDir = this.f139608a.getExternalCacheDir()) != null && externalCacheDir.canWrite()) ? this.f139609b != null ? new File(externalCacheDir, this.f139609b) : externalCacheDir : fileB;
        }

        @Nullable
        public final File b() {
            File cacheDir = this.f139608a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f139609b != null ? new File(cacheDir, this.f139609b) : cacheDir;
        }
    }

    public g(Context context) {
        this(context, "image_manager_disk_cache", 262144000L);
    }

    public g(Context context, long j10) {
        this(context, "image_manager_disk_cache", j10);
    }

    public g(Context context, String str, long j10) {
        super(new a(context, str), j10);
    }
}
