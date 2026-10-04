package x;

import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: x.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5775a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f240241d = "androidx.browser.trusted.sharing.KEY_TITLE";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f240242e = "androidx.browser.trusted.sharing.KEY_TEXT";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f240243f = "androidx.browser.trusted.sharing.KEY_URIS";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f240244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f240245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final List<Uri> f240246c;

    public C5775a(@Nullable String str, @Nullable String str2, @Nullable List<Uri> list) {
        this.f240244a = str;
        this.f240245b = str2;
        this.f240246c = list;
    }

    @NonNull
    public static C5775a a(@NonNull Bundle bundle) {
        return new C5775a(bundle.getString("androidx.browser.trusted.sharing.KEY_TITLE"), bundle.getString("androidx.browser.trusted.sharing.KEY_TEXT"), bundle.getParcelableArrayList(f240243f));
    }

    @NonNull
    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putString("androidx.browser.trusted.sharing.KEY_TITLE", this.f240244a);
        bundle.putString("androidx.browser.trusted.sharing.KEY_TEXT", this.f240245b);
        if (this.f240246c != null) {
            bundle.putParcelableArrayList(f240243f, new ArrayList<>(this.f240246c));
        }
        return bundle;
    }
}
