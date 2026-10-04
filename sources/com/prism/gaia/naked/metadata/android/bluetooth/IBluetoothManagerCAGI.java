package com.prism.gaia.naked.metadata.android.bluetooth;

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
public final class IBluetoothManagerCAGI {

    @m
    @j("android.bluetooth.IBluetoothManager")
    public interface G extends ClassAccessor {

        @m
        @j("android.bluetooth.IBluetoothManager$Stub")
        public interface Stub extends ClassAccessor {
            @f({IBinder.class})
            @s("asInterface")
            NakedStaticMethod<IInterface> asInterface();
        }
    }
}
