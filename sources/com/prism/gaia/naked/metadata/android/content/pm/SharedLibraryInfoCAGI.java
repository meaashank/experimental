package com.prism.gaia.naked.metadata.android.content.pm;

import android.content.pm.SharedLibraryInfo;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedBoolean;
import com.prism.gaia.naked.entity.NakedObject;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@W6.b
@W6.c
public class SharedLibraryInfoCAGI {

    @W6.m
    @W6.j("android.content.pm.SharedLibraryInfo")
    public interface C extends ClassAccessor {
        @W6.n("mDependencies")
        NakedObject<List<SharedLibraryInfo>> mDependencies();

        @W6.n("mIsNative")
        NakedBoolean mIsNative();
    }

    @W6.l
    @W6.j("android.content.pm.SharedLibraryInfo")
    public interface O26 extends ClassAccessor {
        @W6.n("mCodePaths")
        NakedObject<List<String>> mCodePaths();

        @W6.n("mPackageName")
        NakedObject<String> mPackageName();

        @W6.n("mPath")
        NakedObject<String> mPath();
    }
}
