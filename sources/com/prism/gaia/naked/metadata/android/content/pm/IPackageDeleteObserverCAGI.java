package com.prism.gaia.naked.metadata.android.content.pm;

import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedMethod;

/* JADX INFO: loaded from: classes6.dex */
@W6.b
@W6.c
public class IPackageDeleteObserverCAGI {

    @W6.l
    @W6.j("android.content.pm.IPackageDeleteObserver")
    public interface G extends ClassAccessor {
        @W6.p("packageDeleted")
        @W6.f({String.class, int.class})
        NakedMethod<Void> packageDeleted();
    }
}
