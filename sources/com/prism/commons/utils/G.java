package com.prism.commons.utils;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import c6.C2947b;
import java.util.LinkedHashMap;
import java.util.Locale;
import q6.AbstractC5437a;

/* JADX INFO: loaded from: classes5.dex */
public class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f162031a = l0.b(G.class.getSimpleName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap<String, AbstractC5437a> f162032b = new LinkedHashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static r6.j<String> f162033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile String f162034d;

    public static /* synthetic */ void a(Activity activity, Intent intent, DialogInterface dialogInterface, int i10) {
        f162033c.n(activity, f162034d);
        Log.d(f162031a, "save user selected languageId: " + f162034d);
        Intent intent2 = new Intent(intent);
        intent2.setFlags(268468224);
        activity.startActivity(intent2);
    }

    public static /* synthetic */ void b(DialogInterface dialogInterface, int i10) {
    }

    public static /* synthetic */ void c(AbstractC5437a[] abstractC5437aArr, DialogInterface dialogInterface, int i10) {
        if (i10 < 0 || i10 >= abstractC5437aArr.length) {
            Log.w(f162031a, "wrong language selected");
        } else {
            f162034d = abstractC5437aArr[i10].b();
        }
    }

    public static String d() {
        AbstractC5437a abstractC5437aF = f(f162034d);
        return abstractC5437aF == null ? AbstractC5437a.C0864a.f226821a.a() : abstractC5437aF.a();
    }

    public static String e() {
        return "";
    }

    public static AbstractC5437a f(String str) {
        return f162032b.get(str);
    }

    public static void g(Context context, r6.j<String> jVar) {
        synchronized (G.class) {
            f162033c = jVar;
            f162034d = jVar.h(context);
            k(AbstractC5437a.C0864a.f226821a);
        }
    }

    public static boolean h(@NonNull Locale locale, @NonNull Locale locale2) {
        if (!locale.getLanguage().equals(locale2.getLanguage())) {
            return false;
        }
        if (TextUtils.isEmpty(locale.getCountry())) {
            return true;
        }
        return locale.getCountry().equals(locale2.getCountry());
    }

    public static /* synthetic */ void i(DialogInterface dialogInterface, int i10) {
    }

    public static void j(Context context) {
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        Configuration configuration = resources.getConfiguration();
        String str = f162031a;
        Log.d(str, "system locale: " + Locale.getDefault());
        if (Build.VERSION.SDK_INT >= 24) {
            Log.d(str, "system locales: " + Resources.getSystem().getConfiguration().getLocales());
            Log.d(str, "current locales: " + LocaleList.getDefault());
        }
        Log.d(str, "choiceLanguageId: " + f162034d + ", current: " + configuration.locale);
        if (TextUtils.isEmpty(f162034d)) {
            AbstractC5437a abstractC5437a = AbstractC5437a.C0864a.f226821a;
            if (abstractC5437a.d(configuration.locale)) {
                return;
            } else {
                abstractC5437a.e(configuration);
            }
        } else {
            AbstractC5437a abstractC5437aF = f(f162034d);
            if (abstractC5437aF == null) {
                Log.w(str, "choiceLanguageId not found, use system instead");
                synchronized (G.class) {
                    f162034d = "";
                    f162033c.n(context, f162034d);
                }
                return;
            }
            if (abstractC5437aF.d(configuration.locale)) {
                return;
            } else {
                abstractC5437aF.e(configuration);
            }
        }
        Log.d(str, "update lang to: " + configuration.locale);
        resources.updateConfiguration(configuration, displayMetrics);
    }

    public static void k(AbstractC5437a abstractC5437a) {
        f162032b.put(abstractC5437a.b(), abstractC5437a);
    }

    public static void l(final Activity activity, final Intent intent) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle(activity.getString(C2947b.m.f129504A2));
        LinkedHashMap<String, AbstractC5437a> linkedHashMap = f162032b;
        final AbstractC5437a[] abstractC5437aArr = (AbstractC5437a[]) linkedHashMap.values().toArray(new AbstractC5437a[linkedHashMap.size()]);
        String[] strArr = new String[abstractC5437aArr.length];
        int i10 = -1;
        for (int i11 = 0; i11 < abstractC5437aArr.length; i11++) {
            AbstractC5437a abstractC5437a = abstractC5437aArr[i11];
            if (i10 < 0 && f162034d.equals(abstractC5437a.b())) {
                i10 = i11;
            }
            strArr[i11] = abstractC5437a.c(activity);
        }
        builder.setSingleChoiceItems(strArr, i10 >= 0 ? i10 : 0, new DialogInterface.OnClickListener() { // from class: com.prism.commons.utils.D
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i12) {
                G.c(abstractC5437aArr, dialogInterface, i12);
            }
        });
        builder.setPositiveButton(activity.getString(C2947b.m.f129670v2), new DialogInterface.OnClickListener() { // from class: com.prism.commons.utils.E
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i12) {
                G.a(activity, intent, dialogInterface, i12);
            }
        });
        builder.setNegativeButton(activity.getString(C2947b.m.f129666u2), new F());
        builder.show();
    }
}
