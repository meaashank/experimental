package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.graphics.drawable.Icon;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: classes2.dex */
public final class RemoteActionCompat implements C2.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public IconCompat f110953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public CharSequence f110954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public CharSequence f110955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public PendingIntent f110956d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean f110957e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean f110958f;

    @e.T(26)
    public static class a {
        public static RemoteAction a(Icon icon, CharSequence charSequence, CharSequence charSequence2, PendingIntent pendingIntent) {
            return new RemoteAction(icon, charSequence, charSequence2, pendingIntent);
        }

        public static PendingIntent b(RemoteAction remoteAction) {
            return remoteAction.getActionIntent();
        }

        public static CharSequence c(RemoteAction remoteAction) {
            return remoteAction.getContentDescription();
        }

        public static Icon d(RemoteAction remoteAction) {
            return remoteAction.getIcon();
        }

        public static CharSequence e(RemoteAction remoteAction) {
            return remoteAction.getTitle();
        }

        public static boolean f(RemoteAction remoteAction) {
            return remoteAction.isEnabled();
        }

        public static void g(RemoteAction remoteAction, boolean z10) {
            remoteAction.setEnabled(z10);
        }
    }

    @e.T(28)
    public static class b {
        public static void a(RemoteAction remoteAction, boolean z10) {
            remoteAction.setShouldShowIcon(z10);
        }

        public static boolean b(RemoteAction remoteAction) {
            return remoteAction.shouldShowIcon();
        }
    }

    public RemoteActionCompat(@NonNull IconCompat iconCompat, @NonNull CharSequence charSequence, @NonNull CharSequence charSequence2, @NonNull PendingIntent pendingIntent) {
        iconCompat.getClass();
        this.f110953a = iconCompat;
        charSequence.getClass();
        this.f110954b = charSequence;
        charSequence2.getClass();
        this.f110955c = charSequence2;
        pendingIntent.getClass();
        this.f110956d = pendingIntent;
        this.f110957e = true;
        this.f110958f = true;
    }

    @NonNull
    @e.T(26)
    public static RemoteActionCompat f(@NonNull RemoteAction remoteAction) {
        remoteAction.getClass();
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat(IconCompat.l(a.d(remoteAction)), a.e(remoteAction), a.c(remoteAction), a.b(remoteAction));
        remoteActionCompat.f110957e = a.f(remoteAction);
        if (Build.VERSION.SDK_INT >= 28) {
            remoteActionCompat.f110958f = b.b(remoteAction);
        }
        return remoteActionCompat;
    }

    @NonNull
    public PendingIntent g() {
        return this.f110956d;
    }

    @NonNull
    public CharSequence h() {
        return this.f110955c;
    }

    @NonNull
    public IconCompat i() {
        return this.f110953a;
    }

    @NonNull
    public CharSequence j() {
        return this.f110954b;
    }

    public boolean k() {
        return this.f110957e;
    }

    public void l(boolean z10) {
        this.f110957e = z10;
    }

    public void m(boolean z10) {
        this.f110958f = z10;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public boolean n() {
        return this.f110958f;
    }

    @NonNull
    @e.T(26)
    public RemoteAction o() {
        RemoteAction remoteActionA = a.a(this.f110953a.J(), this.f110954b, this.f110955c, this.f110956d);
        a.g(remoteActionA, this.f110957e);
        if (Build.VERSION.SDK_INT >= 28) {
            b.a(remoteActionA, this.f110958f);
        }
        return remoteActionA;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public RemoteActionCompat() {
    }

    public RemoteActionCompat(@NonNull RemoteActionCompat remoteActionCompat) {
        remoteActionCompat.getClass();
        this.f110953a = remoteActionCompat.f110953a;
        this.f110954b = remoteActionCompat.f110954b;
        this.f110955c = remoteActionCompat.f110955c;
        this.f110956d = remoteActionCompat.f110956d;
        this.f110957e = remoteActionCompat.f110957e;
        this.f110958f = remoteActionCompat.f110958f;
    }
}
