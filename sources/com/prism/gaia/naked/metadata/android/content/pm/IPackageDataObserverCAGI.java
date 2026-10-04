package com.prism.gaia.naked.metadata.android.content.pm;

import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedMethod;

/* JADX INFO: loaded from: classes6.dex */
@W6.b
@W6.c
public class IPackageDataObserverCAGI {

    @W6.l
    @W6.j("android.content.pm.IPackageDataObserver")
    public interface G extends ClassAccessor {
        @W6.p("onRemoveCompleted")
        @W6.f({String.class, boolean.class})
        NakedMethod<Void> onRemoveCompleted();
    }
}
