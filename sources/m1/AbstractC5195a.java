package m1;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;

/* JADX INFO: renamed from: m1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5195a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f221078b = "DocumentFile";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final AbstractC5195a f221079a;

    public AbstractC5195a(@Nullable AbstractC5195a abstractC5195a) {
        this.f221079a = abstractC5195a;
    }

    @NonNull
    public static AbstractC5195a h(@NonNull File file) {
        return new c(null, file);
    }

    @Nullable
    public static AbstractC5195a i(@NonNull Context context, @NonNull Uri uri) {
        return new d(null, context, uri);
    }

    @Nullable
    public static AbstractC5195a j(@NonNull Context context, @NonNull Uri uri) {
        return new e(null, context, DocumentsContract.buildDocumentUriUsingTree(uri, DocumentsContract.getTreeDocumentId(uri)));
    }

    public static boolean p(@NonNull Context context, @Nullable Uri uri) {
        return DocumentsContract.isDocumentUri(context, uri);
    }

    public abstract boolean a();

    public abstract boolean b();

    @Nullable
    public abstract AbstractC5195a c(@NonNull String str);

    @Nullable
    public abstract AbstractC5195a d(@NonNull String str, @NonNull String str2);

    public abstract boolean e();

    public abstract boolean f();

    @Nullable
    public AbstractC5195a g(@NonNull String str) {
        for (AbstractC5195a abstractC5195a : u()) {
            if (str.equals(abstractC5195a.k())) {
                return abstractC5195a;
            }
        }
        return null;
    }

    @Nullable
    public abstract String k();

    @Nullable
    public AbstractC5195a l() {
        return this.f221079a;
    }

    @Nullable
    public abstract String m();

    @NonNull
    public abstract Uri n();

    public abstract boolean o();

    public abstract boolean q();

    public abstract boolean r();

    public abstract long s();

    public abstract long t();

    @NonNull
    public abstract AbstractC5195a[] u();

    public abstract boolean v(@NonNull String str);
}
