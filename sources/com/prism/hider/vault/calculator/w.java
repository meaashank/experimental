package com.prism.hider.vault.calculator;

import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import rb.C5548b;

/* JADX INFO: loaded from: classes6.dex */
public class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List<b> f168580a = Arrays.asList(new b(new com.prism.hider.vault.commons.I(ClassicCalcSkinFragment.f168473q, C5548b.m.f235944p3, 0, 0), new C4264p()), new b(new com.prism.hider.vault.commons.I(F.f168510d, C5548b.m.f235954r3, 0, 0), new q()), new b(new com.prism.hider.vault.commons.I(G.f168511d, C5548b.m.f235959s3, 0, 0), new r()), new b(new com.prism.hider.vault.commons.I(C.f168420d, C5548b.m.f235939o3, 0, 0), new s()), new b(new com.prism.hider.vault.commons.I(J.f168520d, C5548b.m.f235969u3, 0, 0), new t()), new b(new com.prism.hider.vault.commons.I(I.f168519d, C5548b.m.f235964t3, 0, 0), new u()), new b(new com.prism.hider.vault.commons.I(E.f168509d, C5548b.m.f235949q3, 0, 0), new v()));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile com.prism.hider.vault.commons.H f168581b;

    public interface a {
        Fragment create();
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.prism.hider.vault.commons.I f168582a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a f168583b;

        public b(com.prism.hider.vault.commons.I i10, a aVar) {
            this.f168582a = i10;
            this.f168583b = aVar;
        }
    }

    public static Fragment a(String str) {
        for (b bVar : f168580a) {
            if (bVar.f168582a.b().equals(str)) {
                return bVar.f168583b.create();
            }
        }
        return new ClassicCalcSkinFragment();
    }

    public static com.prism.hider.vault.commons.H b() {
        if (f168581b == null) {
            synchronized (w.class) {
                try {
                    if (f168581b == null) {
                        ArrayList arrayList = new ArrayList();
                        Iterator<b> it = f168580a.iterator();
                        while (it.hasNext()) {
                            arrayList.add(it.next().f168582a);
                        }
                        f168581b = new com.prism.hider.vault.commons.H(arrayList);
                    }
                } finally {
                }
            }
        }
        return f168581b;
    }
}
