package com.inmobi.media;

import java.util.Iterator;
import kd.AbstractC4843c;

/* JADX INFO: renamed from: com.inmobi.media.z4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3817z4 extends AbstractC4843c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ A4 f153669a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3817z4(EnumC3724s9 enumC3724s9, A4 a42) {
        super(enumC3724s9);
        this.f153669a = a42;
    }

    @Override // kd.AbstractC4843c
    public final void afterChange(kotlin.reflect.n property, Object obj, Object obj2) {
        kotlin.jvm.internal.G.p(property, "property");
        EnumC3724s9 enumC3724s9 = (EnumC3724s9) obj2;
        if (AbstractC3738t9.a((EnumC3724s9) obj) == AbstractC3738t9.a(enumC3724s9)) {
            return;
        }
        Iterator it = this.f153669a.f151741b.iterator();
        while (it.hasNext()) {
            ((InterfaceC3766v9) it.next()).a(enumC3724s9);
        }
    }
}
