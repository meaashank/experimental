package com.cookiegames.smartcookie.view;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.webkit.WebView;
import androidx.appcompat.app.AlertDialog;
import c4.C2902i;
import com.cookiegames.smartcookie.p;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@kotlin.jvm.internal.V({"SMAP\nTabInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabInitializer.kt\ncom/cookiegames/smartcookie/view/PermissionInitializer\n+ 2 AlertDialogExtensions.kt\ncom/cookiegames/smartcookie/extensions/AlertDialogExtensionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,224:1\n30#2:225\n1#3:226\n*S KotlinDebug\n*F\n+ 1 TabInitializer.kt\ncom/cookiegames/smartcookie/view/PermissionInitializer\n*L\n220#1:225\n220#1:226\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public final class r implements r0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f148517d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f148518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Activity f148519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final C3237i f148520c;

    public r(@NotNull String url, @NotNull Activity activity, @NotNull C3237i homePageInitializer) {
        kotlin.jvm.internal.G.p(url, "url");
        kotlin.jvm.internal.G.p(activity, "activity");
        kotlin.jvm.internal.G.p(homePageInitializer, "homePageInitializer");
        this.f148518a = url;
        this.f148519b = activity;
        this.f148520c = homePageInitializer;
    }

    public static final void d(r rVar, WebView webView, Map map, DialogInterface dialogInterface) {
        rVar.f148520c.a(webView, map);
    }

    public static final void e(r rVar, WebView webView, Map map, DialogInterface dialogInterface, int i10) {
        new s0(rVar.f148518a).a(webView, map);
    }

    @Override // com.cookiegames.smartcookie.view.r0
    public void a(@NotNull final WebView webView, @NotNull final Map<String, String> headers) {
        kotlin.jvm.internal.G.p(webView, "webView");
        kotlin.jvm.internal.G.p(headers, "headers");
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f148519b);
        builder.setTitle(p.s.Rh);
        builder.setMessage(p.s.f146018t9);
        builder.setCancelable(false);
        builder.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.cookiegames.smartcookie.view.p
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                r.d(this.f148507a, webView, headers, dialogInterface);
            }
        });
        builder.setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null);
        builder.setPositiveButton(p.s.f145784e0, new DialogInterface.OnClickListener() { // from class: com.cookiegames.smartcookie.view.q
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                r.e(this.f148511a, webView, headers, dialogInterface, i10);
            }
        });
        AlertDialog alertDialogShow = builder.show();
        Context context = builder.getContext();
        kotlin.jvm.internal.G.o(context, "getContext(...)");
        kotlin.jvm.internal.G.m(alertDialogShow);
        C2902i.i(context, alertDialogShow);
    }
}
