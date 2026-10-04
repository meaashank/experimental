package com.bumptech.glide.load.engine;

import androidx.annotation.Nullable;
import com.bumptech.glide.load.DataSource;
import g3.InterfaceC4444b;

/* JADX INFO: loaded from: classes2.dex */
public interface e {

    public interface a {
        void a(InterfaceC4444b interfaceC4444b, @Nullable Object obj, com.bumptech.glide.load.data.d<?> dVar, DataSource dataSource, InterfaceC4444b interfaceC4444b2);

        void c(InterfaceC4444b interfaceC4444b, Exception exc, com.bumptech.glide.load.data.d<?> dVar, DataSource dataSource);

        void d();
    }

    boolean b();

    void cancel();
}
