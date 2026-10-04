package com.cookiegames.smartcookie.adblock.util.hash;

import K3.b;
import K3.c;
import U3.a;
import androidx.compose.runtime.internal.r;
import java.io.Serializable;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@r(parameters = 1)
public final class MurmurHashHostAdapter implements b<a>, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f140717a = 0;

    @Override // K3.b
    public /* synthetic */ int a(a aVar) {
        return b(aVar.f68500a);
    }

    public int b(@NotNull String item) {
        G.p(item, "item");
        byte[] bytes = item.getBytes();
        return c.d(bytes, bytes.length, -1756908916);
    }
}
