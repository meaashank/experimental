package com.prism.commons.utils;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import c6.C2947b;
import com.google.android.material.snackbar.Snackbar;
import g6.C4455a;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f162138a = l0.b(r0.class.getSimpleName());

    public static /* synthetic */ void a(Activity activity, String str, int i10) {
        View childAt;
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(R.id.content);
        if (viewGroup == null || (childAt = viewGroup.getChildAt(0)) == null) {
            return;
        }
        final Snackbar snackbarMake = Snackbar.make(childAt, str, i10);
        snackbarMake.setAction(C2947b.m.f129682y2, new View.OnClickListener() { // from class: com.prism.commons.utils.p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                snackbarMake.dismiss();
            }
        });
        snackbarMake.show();
    }

    public static void d(Context context) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    public static void e(Context context, boolean z10) {
        List<ActivityManager.AppTask> appTasks;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null || (appTasks = activityManager.getAppTasks()) == null || appTasks.isEmpty()) {
            return;
        }
        I.b(f162138a, "setExcludeFromRecent for appTasks: %b", Boolean.valueOf(z10));
        try {
            for (ActivityManager.AppTask appTask : appTasks) {
                int i10 = appTask.getTaskInfo().affiliatedTaskId;
                appTask.setExcludeFromRecents(z10);
            }
        } catch (Throwable unused) {
        }
    }

    public static void f(final Activity activity, final String str, final int i10) {
        C4455a.b().b().execute(new Runnable() { // from class: com.prism.commons.utils.q0
            @Override // java.lang.Runnable
            public final void run() {
                r0.a(activity, str, i10);
            }
        });
    }

    public static void g(final Context context, final String str, final int i10) {
        C4455a.b().b().execute(new Runnable() { // from class: com.prism.commons.utils.o0
            @Override // java.lang.Runnable
            public final void run() {
                Toast.makeText(context, str, i10).show();
            }
        });
    }
}
