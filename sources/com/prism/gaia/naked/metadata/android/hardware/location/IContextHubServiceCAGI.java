package com.prism.gaia.naked.metadata.android.hardware.location;

import W6.b;
import W6.c;
import W6.f;
import W6.j;
import W6.m;
import W6.s;
import android.os.IBinder;
import android.os.IInterface;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedStaticMethod;

/* JADX INFO: loaded from: classes6.dex */
@b
@c
public final class IContextHubServiceCAGI {

    @m
    @j("android.hardware.location.IContextHubService")
    public interface C extends ClassAccessor {

        @m
        @j("android.hardware.location.IContextHubService$Stub")
        public interface Stub extends ClassAccessor {
            @f({IBinder.class})
            @s("asInterface")
            NakedStaticMethod<IInterface> asInterface();
        }
    }
}
