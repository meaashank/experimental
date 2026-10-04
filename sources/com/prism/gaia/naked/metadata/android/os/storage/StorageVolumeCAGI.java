package com.prism.gaia.naked.metadata.android.os.storage;

import W6.b;
import W6.c;
import W6.j;
import W6.l;
import W6.n;
import W6.p;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedMethod;
import com.prism.gaia.naked.entity.NakedObject;
import java.io.File;

/* JADX INFO: loaded from: classes6.dex */
@b
@c
public final class StorageVolumeCAGI {

    @l
    @j("android.os.storage.StorageVolume")
    public interface G extends ClassAccessor {
        @p("getPath")
        NakedMethod<String> getPath();

        @n("mPath")
        NakedObject<File> mPath();

        @n("mState")
        NakedObject<String> mState();
    }

    @l
    @j("android.os.storage.StorageVolume")
    public interface P28 extends ClassAccessor {
        @n("mInternalPath")
        NakedObject<File> mInternalPath();
    }
}
