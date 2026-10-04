package com.bykv.vk.openvk.preload.geckox.c;

import com.bykv.vk.openvk.preload.a.d.c;
import com.bykv.vk.openvk.preload.a.l;
import com.bykv.vk.openvk.preload.a.q;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends q<Boolean> {

    /* JADX INFO: renamed from: com.bykv.vk.openvk.preload.geckox.c.a$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f140517a;

        static {
            int[] iArr = new int[com.bykv.vk.openvk.preload.a.d.b.values().length];
            f140517a = iArr;
            try {
                iArr[com.bykv.vk.openvk.preload.a.d.b.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f140517a[com.bykv.vk.openvk.preload.a.d.b.NULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f140517a[com.bykv.vk.openvk.preload.a.d.b.NUMBER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.q
    public final /* synthetic */ void a(c cVar, Boolean bool) throws IOException {
        Boolean bool2 = bool;
        if (bool2 == null) {
            cVar.h();
        } else {
            cVar.a(bool2);
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.q
    public final /* synthetic */ Boolean a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
        com.bykv.vk.openvk.preload.a.d.b bVarF = aVar.f();
        int i10 = AnonymousClass1.f140517a[bVarF.ordinal()];
        if (i10 == 1) {
            return Boolean.valueOf(aVar.i());
        }
        if (i10 == 2) {
            aVar.j();
            return null;
        }
        if (i10 == 3) {
            return Boolean.valueOf(aVar.m() != 0);
        }
        throw new l("Expected BOOLEAN or NUMBER but was ".concat(String.valueOf(bVarF)));
    }
}
