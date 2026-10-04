package com.bumptech.glide.load.engine.cache;

import android.content.Context;
import com.bumptech.glide.load.engine.cache.a;
import com.bumptech.glide.load.engine.cache.d;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class f extends d {

    public class a implements d.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f139606a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f139607b;

        public a(Context context, String str) {
            this.f139606a = context;
            this.f139607b = str;
        }

        @Override // com.bumptech.glide.load.engine.cache.d.c
        public File a() {
            File externalCacheDir = this.f139606a.getExternalCacheDir();
            if (externalCacheDir == null) {
                return null;
            }
            return this.f139607b != null ? new File(externalCacheDir, this.f139607b) : externalCacheDir;
        }
    }

    public f(Context context) {
        this(context, "image_manager_disk_cache", a.InterfaceC0367a.f139584a);
    }

    public f(Context context, int i10) {
        this(context, "image_manager_disk_cache", i10);
    }

    public f(Context context, String str, int i10) {
        super(new a(context, str), i10);
    }
}
