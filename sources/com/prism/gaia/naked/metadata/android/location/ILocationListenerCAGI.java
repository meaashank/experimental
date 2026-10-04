package com.prism.gaia.naked.metadata.android.location;

import W6.b;
import W6.c;
import W6.f;
import W6.j;
import W6.l;
import W6.p;
import W6.s;
import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedMethod;
import com.prism.gaia.naked.entity.NakedStaticMethod;

/* JADX INFO: loaded from: classes6.dex */
@b
@c
public final class ILocationListenerCAGI {

    @l
    @j("android.location.ILocationListener")
    public interface G extends ClassAccessor {

        @l
        @j("android.location.ILocationListener$Stub")
        public interface Stub extends ClassAccessor {
            @f({IBinder.class})
            @s("asInterface")
            NakedStaticMethod<IInterface> asInterface();
        }

        @p("onLocationChanged")
        @f({Location.class})
        NakedMethod<Void> onLocationChanged();
    }
}
