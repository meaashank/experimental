package u;

import android.app.PendingIntent;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import e.InterfaceC4346u;

/* JADX INFO: renamed from: u.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class C5630a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f239279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final PendingIntent f239280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @InterfaceC4346u
    public int f239281c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Uri f239282d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Runnable f239283e;

    public C5630a(@NonNull String str, @NonNull PendingIntent pendingIntent, @InterfaceC4346u int i10) {
        this.f239279a = str;
        this.f239280b = pendingIntent;
        this.f239281c = i10;
    }

    @NonNull
    public PendingIntent a() {
        PendingIntent pendingIntent = this.f239280b;
        if (pendingIntent != null) {
            return pendingIntent;
        }
        throw new IllegalStateException("Can't call getAction on BrowserActionItem with null action.");
    }

    public int b() {
        return this.f239281c;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Uri c() {
        return this.f239282d;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public Runnable d() {
        return this.f239283e;
    }

    @NonNull
    public String e() {
        return this.f239279a;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public C5630a(@NonNull String str, @NonNull PendingIntent pendingIntent, @NonNull Uri uri) {
        this.f239279a = str;
        this.f239280b = pendingIntent;
        this.f239282d = uri;
    }

    public C5630a(@NonNull String str, @NonNull Runnable runnable) {
        this.f239279a = str;
        this.f239280b = null;
        this.f239283e = runnable;
    }

    public C5630a(@NonNull String str, @NonNull PendingIntent pendingIntent) {
        this(str, pendingIntent, 0);
    }
}
