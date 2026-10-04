package com.prism.commons.utils;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import c6.C2947b;

/* JADX INFO: loaded from: classes5.dex */
public class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f162076a = "PREFERENCE_KEY_NEVER_SHOW_RATEUS";

    public class a implements DialogInterface.OnClickListener {
        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
        }
    }

    public class b implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f162077a;

        public b(Activity activity) {
            this.f162077a = activity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
            b0.f(this.f162077a, true);
        }
    }

    public class c implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f162078a;

        public c(d dVar) {
            this.f162078a = dVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
            this.f162078a.a();
        }
    }

    public interface d {
        void a();
    }

    public static /* synthetic */ void a(Activity activity, boolean z10) {
        g0.e(activity, activity.getPackageName(), z10);
        f(activity, true);
    }

    public static void b(Activity activity, String str, boolean z10, d dVar) {
        c(activity, str, z10, dVar, -1);
    }

    public static void c(Activity activity, String str, boolean z10, d dVar, int i10) {
        View viewInflate = activity.getLayoutInflater().inflate(C2947b.k.f129428V, (ViewGroup) null);
        AlertDialog.Builder builder = i10 < 0 ? new AlertDialog.Builder(activity) : new AlertDialog.Builder(activity, i10);
        builder.setIcon(0);
        builder.setTitle(activity.getString(C2947b.m.f129610g2, str));
        builder.setView(viewInflate);
        builder.setNegativeButton(C2947b.m.f129614h2, new a());
        if (z10) {
            builder.setNeutralButton(C2947b.m.f129622j2, new b(activity));
        }
        builder.setPositiveButton(C2947b.m.f129626k2, new c(dVar));
        builder.create().show();
    }

    public static void d(final Activity activity, String str, boolean z10, final boolean z11) {
        c(activity, str, z10, new d() { // from class: com.prism.commons.utils.a0
            @Override // com.prism.commons.utils.b0.d
            public final void a() {
                b0.a(activity, z11);
            }
        }, -1);
    }

    public static boolean e(Context context) {
        return C3846j.b().c(context, f162076a, false);
    }

    public static void f(Context context, boolean z10) {
        C3846j.b().j(context, f162076a, z10);
    }
}
