package androidx.navigation;

import androidx.navigation.NavDeepLink;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.navigation.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC2632u
@kotlin.jvm.internal.V({"SMAP\nNavDeepLinkDslBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDeepLinkDslBuilder.kt\nandroidx/navigation/NavDeepLinkDslBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,68:1\n1#2:69\n*E\n"})
public final class C2633v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final NavDeepLink.Builder f115339a = new NavDeepLink.Builder();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public String f115340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public String f115341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public String f115342d;

    @NotNull
    public final NavDeepLink a() {
        NavDeepLink.Builder builder = this.f115339a;
        String str = this.f115340b;
        if (str == null && this.f115341c == null && this.f115342d == null) {
            throw new IllegalStateException("The NavDeepLink must have an uri, action, and/or mimeType.");
        }
        if (str != null) {
            builder.setUriPattern(str);
        }
        String str2 = this.f115341c;
        if (str2 != null) {
            builder.setAction(str2);
        }
        String str3 = this.f115342d;
        if (str3 != null) {
            builder.setMimeType(str3);
        }
        return builder.build();
    }

    @Nullable
    public final String b() {
        return this.f115341c;
    }

    @Nullable
    public final String c() {
        return this.f115342d;
    }

    @Nullable
    public final String d() {
        return this.f115340b;
    }

    public final void e(@Nullable String str) {
        if (str != null && str.length() == 0) {
            throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.");
        }
        this.f115341c = str;
    }

    public final void f(@Nullable String str) {
        this.f115342d = str;
    }

    public final void g(@Nullable String str) {
        this.f115340b = str;
    }
}
