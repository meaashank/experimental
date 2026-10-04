package com.prism.gaia.naked.metadata.com.android.internal.telephony;

import W6.b;
import W6.c;
import W6.f;
import W6.j;
import W6.l;
import W6.s;
import android.os.IBinder;
import android.os.IInterface;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedStaticMethod;

/* JADX INFO: loaded from: classes6.dex */
@b
@c
public final class ISmsCAGI {

    @l
    @j("com.android.internal.telephony.ISms")
    public interface G extends ClassAccessor {

        @l
        @j("com.android.internal.telephony.ISms$Stub")
        public interface Stub extends ClassAccessor {
            @f({IBinder.class})
            @s("asInterface")
            NakedStaticMethod<IInterface> asInterface();
        }
    }
}
