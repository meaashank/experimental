package com.prism.gaia.naked.metadata.android.content.pm;

import android.content.Intent;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedMethod;

/* JADX INFO: loaded from: classes6.dex */
@W6.b
@W6.c
public class IPackageDataObserver2CAGI {

    @W6.l
    @W6.j("android.content.pm.IPackageDeleteObserver2")
    public interface G extends ClassAccessor {
        @W6.p("onPackageDeleted")
        @W6.f({String.class, int.class, String.class})
        NakedMethod<Void> onPackageDeleted();

        @W6.p("onUserActionRequired")
        @W6.f({Intent.class})
        NakedMethod<Void> onUserActionRequired();
    }
}
