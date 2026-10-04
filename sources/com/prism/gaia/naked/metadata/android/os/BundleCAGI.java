package com.prism.gaia.naked.metadata.android.os;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedMethod;
import com.prism.gaia.naked.entity.NakedObject;

/* JADX INFO: loaded from: classes6.dex */
@W6.b
@W6.c
public final class BundleCAGI {

    public interface A {

        public interface BaseBundle {

            @W6.i(Bundle.class)
            @W6.m
            public interface C extends ClassAccessor {
                @W6.n("mParcelledData")
                NakedObject<Parcel> mParcelledData();
            }
        }
    }

    @W6.l
    @W6.i(Bundle.class)
    public interface G extends ClassAccessor {
        @W6.p("getIBinder")
        @W6.f({String.class})
        NakedMethod<IBinder> getIBinder();

        @W6.p("putIBinder")
        @W6.f({String.class, IBinder.class})
        NakedMethod<Void> putIBinder();

        @W6.p("setDefusable")
        @W6.f({boolean.class})
        NakedMethod<Void> setDefusable();
    }
}
