package com.bumptech.glide.load.engine.cache;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import g3.InterfaceC4444b;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public interface a {

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.cache.a$a, reason: collision with other inner class name */
    public interface InterfaceC0367a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f139584a = 262144000;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f139585b = "image_manager_disk_cache";

        @Nullable
        a build();
    }

    public interface b {
        boolean a(@NonNull File file);
    }

    @Nullable
    File a(InterfaceC4444b interfaceC4444b);

    void b(InterfaceC4444b interfaceC4444b);

    void c(InterfaceC4444b interfaceC4444b, b bVar);

    void clear();
}
