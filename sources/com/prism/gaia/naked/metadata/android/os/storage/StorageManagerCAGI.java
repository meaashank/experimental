package com.prism.gaia.naked.metadata.android.os.storage;

import W6.b;
import W6.c;
import W6.i;
import W6.m;
import W6.n;
import W6.q;
import W6.s;
import android.os.IInterface;
import android.os.storage.StorageManager;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.entity.NakedStaticMethod;
import com.prism.gaia.naked.entity.NakedStaticObject;

/* JADX INFO: loaded from: classes6.dex */
@b
@c
public final class StorageManagerCAGI {

    @i(StorageManager.class)
    @m
    public interface C extends ClassAccessor {
        @s("invalidateVolumeListCache")
        NakedStaticMethod<Void> invalidateVolumeListCache();

        @n("mStorageManager")
        NakedObject<IInterface> mStorageManager();

        @q("sStorageManager")
        NakedStaticObject<IInterface> sStorageManager();

        @q("sVolumeListCache")
        NakedObject<Object> sVolumeListCache();
    }
}
