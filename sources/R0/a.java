package R0;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.S;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f67679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f67680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final Intent f67681c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f67682d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Bundle f67683e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final PendingIntent f67684f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f67685g;

    public a(@NonNull Context context, int i10, @NonNull Intent intent, int i11, boolean z10) {
        this(context, i10, intent, i11, null, z10);
    }

    @Nullable
    public final PendingIntent a() {
        Bundle bundle = this.f67683e;
        return bundle == null ? S.e(this.f67679a, this.f67680b, this.f67681c, this.f67682d, this.f67685g) : S.d(this.f67679a, this.f67680b, this.f67681c, this.f67682d, bundle, this.f67685g);
    }

    @NonNull
    public Context b() {
        return this.f67679a;
    }

    public int c() {
        return this.f67682d;
    }

    @NonNull
    public Intent d() {
        return this.f67681c;
    }

    @NonNull
    public Bundle e() {
        return this.f67683e;
    }

    @Nullable
    public PendingIntent f() {
        return this.f67684f;
    }

    public int g() {
        return this.f67680b;
    }

    public boolean h() {
        return this.f67685g;
    }

    public a(@NonNull Context context, int i10, @NonNull Intent intent, int i11, @Nullable Bundle bundle, boolean z10) {
        this.f67679a = context;
        this.f67680b = i10;
        this.f67681c = intent;
        this.f67682d = i11;
        this.f67683e = bundle;
        this.f67685g = z10;
        this.f67684f = a();
    }
}
