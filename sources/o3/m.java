package o3;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.O;
import com.bumptech.glide.load.engine.s;
import e.InterfaceC4346u;
import g3.C4446d;
import g3.C4447e;
import g3.InterfaceC4448f;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class m implements InterfaceC4448f<Uri, Drawable> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C4446d<Resources.Theme> f223215b = C4446d.f("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f223216c = "android";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f223217d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f223218e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f223219f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f223220g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f223221h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f223222i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f223223a;

    public m(Context context) {
        this.f223223a = context.getApplicationContext();
    }

    @Override // g3.InterfaceC4448f
    @Nullable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public s<Drawable> a(@NonNull Uri uri, int i10, int i11, @NonNull C4447e c4447e) {
        Drawable drawableC;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new IllegalStateException("Package name for " + uri + " is null or empty");
        }
        Context contextD = d(uri, authority);
        int iG = g(contextD, uri);
        Resources.Theme theme = authority.equals(this.f223223a.getPackageName()) ? (Resources.Theme) c4447e.c(f223215b) : null;
        if (theme == null) {
            drawableC = i.c(this.f223223a, contextD, iG, null);
        } else {
            Context context = this.f223223a;
            drawableC = i.c(context, context, iG, theme);
        }
        return l.d(drawableC);
    }

    @NonNull
    public final Context d(Uri uri, @NonNull String str) {
        if (str.equals(this.f223223a.getPackageName())) {
            return this.f223223a;
        }
        try {
            return this.f223223a.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            if (str.contains(this.f223223a.getPackageName())) {
                return this.f223223a;
            }
            throw new IllegalArgumentException(O.a("Failed to obtain context or unrecognized Uri format for: ", uri), e10);
        }
    }

    @InterfaceC4346u
    public final int e(Uri uri) {
        try {
            return Integer.parseInt(uri.getPathSegments().get(0));
        } catch (NumberFormatException e10) {
            throw new IllegalArgumentException(O.a("Unrecognized Uri format: ", uri), e10);
        }
    }

    @InterfaceC4346u
    public final int f(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        String authority = uri.getAuthority();
        String str = pathSegments.get(0);
        String str2 = pathSegments.get(1);
        int identifier = context.getResources().getIdentifier(str2, str, authority);
        if (identifier == 0) {
            identifier = Resources.getSystem().getIdentifier(str2, str, "android");
        }
        if (identifier != 0) {
            return identifier;
        }
        throw new IllegalArgumentException(O.a("Failed to find resource id for: ", uri));
    }

    @InterfaceC4346u
    public final int g(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return f(context, uri);
        }
        if (pathSegments.size() == 1) {
            return e(uri);
        }
        throw new IllegalArgumentException(O.a("Unrecognized Uri format: ", uri));
    }

    @Override // g3.InterfaceC4448f
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull Uri uri, @NonNull C4447e c4447e) {
        String scheme = uri.getScheme();
        return scheme != null && scheme.equals("android.resource");
    }
}
