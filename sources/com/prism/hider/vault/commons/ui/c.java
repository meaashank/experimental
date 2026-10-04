package com.prism.hider.vault.commons.ui;

import android.content.Context;
import android.widget.FrameLayout;
import com.prism.hider.vault.commons.C4270f;
import com.prism.hider.vault.commons.H;
import com.prism.hider.vault.commons.I;
import com.prism.hider.vault.commons.J;
import com.prism.hider.vault.commons.ui.a;
import com.prism.hider.vault.commons.ui.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class c {

    public interface a {
        void a(I i10);
    }

    public static class b implements a.InterfaceC0689a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final I f173657a;

        public b(I i10) {
            this.f173657a = i10;
        }

        @Override // com.prism.hider.vault.commons.ui.a.InterfaceC0689a
        public CharSequence a(Context context) {
            return context.getString(this.f173657a.c());
        }

        @Override // com.prism.hider.vault.commons.ui.a.InterfaceC0689a
        public void b(FrameLayout frameLayout) {
            J j10 = C4270f.f168651e;
            if (j10 != null) {
                j10.b(frameLayout, this.f173657a.b());
            }
        }

        @Override // com.prism.hider.vault.commons.ui.a.InterfaceC0689a
        public String getId() {
            return this.f173657a.b();
        }
    }

    public static /* synthetic */ void a(H h10, Context context, a aVar, a.InterfaceC0689a interfaceC0689a) {
        h10.f(context, interfaceC0689a.getId());
        if (aVar != null) {
            aVar.a(((b) interfaceC0689a).f173657a);
        }
    }

    public static void b(final Context context, final H h10, final a aVar) {
        List<I> listE = h10.e();
        ArrayList arrayList = new ArrayList();
        Iterator<I> it = listE.iterator();
        while (it.hasNext()) {
            arrayList.add(new b(it.next()));
        }
        com.prism.hider.vault.commons.ui.a.g(context, context.getString(e.m.f176908F2), 2, 150, arrayList, h10.d(context), new a.d() { // from class: oa.h
            @Override // com.prism.hider.vault.commons.ui.a.d
            public final void a(a.InterfaceC0689a interfaceC0689a) {
                com.prism.hider.vault.commons.ui.c.a(h10, context, aVar, interfaceC0689a);
            }
        });
    }
}
