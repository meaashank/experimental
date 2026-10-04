package com.prism.gaia.naked.metadata.android.accounts;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedMethod;
import com.prism.gaia.naked.entity.NakedStaticMethod;

/* JADX INFO: loaded from: classes6.dex */
@W6.b
@W6.c
public class IAccountManagerResponseCAGI {

    @W6.l
    @W6.j("android.accounts.IAccountManagerResponse")
    public interface G extends ClassAccessor {

        @W6.l
        @W6.j("android.accounts.IAccountManagerResponse$Stub")
        public interface Stub extends ClassAccessor {
            @W6.f({IBinder.class})
            @W6.s("asInterface")
            NakedStaticMethod<IInterface> asInterface();
        }

        @W6.p("onError")
        @W6.f({int.class, String.class})
        NakedMethod<Void> onError();

        @W6.p("onResult")
        @W6.f({Bundle.class})
        NakedMethod<Void> onResult();
    }
}
