package com.prism.gaia.naked.metadata.android.app.admin;

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
public final class IDevicePolicyManagerCAGI {

    @l
    @j("android.app.admin.IDevicePolicyManager")
    public interface G extends ClassAccessor {

        @l
        @j("android.app.admin.IDevicePolicyManager$Stub")
        public interface Stub extends ClassAccessor {
            @f({IBinder.class})
            @s("asInterface")
            NakedStaticMethod<IInterface> asInterface();
        }
    }
}
