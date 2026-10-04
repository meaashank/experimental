package com.prism.hider.vault.commons.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.launcher3.dragndrop.g;
import com.prism.hider.vault.commons.InterfaceC4278n;
import com.prism.hider.vault.commons.q;
import com.prism.hider.vault.commons.t;
import com.prism.hider.vault.commons.ui.a;
import com.prism.hider.vault.commons.ui.e;
import e.T;
import java.util.ArrayList;
import java.util.List;
import oa.m;

/* JADX INFO: loaded from: classes6.dex */
public class b {

    public static class a implements a.InterfaceC0689a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q f173656a;

        public a(q qVar) {
            this.f173656a = qVar;
        }

        @Override // com.prism.hider.vault.commons.ui.a.InterfaceC0689a
        public CharSequence a(Context context) {
            return context.getString(this.f173656a.d());
        }

        @Override // com.prism.hider.vault.commons.ui.a.InterfaceC0689a
        public void b(FrameLayout frameLayout) {
            frameLayout.removeAllViews();
            Context context = frameLayout.getContext();
            ImageView imageView = new ImageView(context);
            if (Build.VERSION.SDK_INT >= 26) {
                imageView.setImageDrawable(b.e(context, this.f173656a.c()));
            } else {
                imageView.setImageResource(this.f173656a.c());
            }
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            int i10 = (int) (context.getResources().getDisplayMetrics().density * 6.0f);
            layoutParams.setMargins(i10, i10, i10, i10);
            frameLayout.addView(imageView, layoutParams);
        }

        @Override // com.prism.hider.vault.commons.ui.a.InterfaceC0689a
        public String getId() {
            return b.d(this.f173656a);
        }
    }

    public static /* synthetic */ void a(m mVar, a.InterfaceC0689a interfaceC0689a) {
        if (mVar != null) {
            mVar.a(((a) interfaceC0689a).f173656a);
        }
    }

    public static String d(q qVar) {
        return qVar.a().flattenToShortString();
    }

    @T(26)
    public static Drawable e(Context context, int i10) {
        Drawable drawable = context.getDrawable(i10);
        if (drawable == null || g.a(drawable)) {
            return drawable;
        }
        com.android.launcher3.graphics.d.a();
        return com.android.launcher3.graphics.c.a(null, oa.f.a(drawable, 0.16666667f));
    }

    public static void f(Context context, InterfaceC4278n interfaceC4278n, final m mVar) {
        t tVarD = interfaceC4278n.d(context);
        List<q> listI = tVarD.i(context);
        String strD = d(tVarD.g(context));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) listI;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            arrayList.add(new a((q) obj));
        }
        com.prism.hider.vault.commons.ui.a.g(context, context.getString(e.m.f176916H2), 3, 78, arrayList, strD, new a.d() { // from class: oa.g
            @Override // com.prism.hider.vault.commons.ui.a.d
            public final void a(a.InterfaceC0689a interfaceC0689a) {
                com.prism.hider.vault.commons.ui.b.a(mVar, interfaceC0689a);
            }
        });
    }
}
