package androidx.compose.ui.text.font;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.ui.text.font.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nDeviceFontFamilyNameFont.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceFontFamilyNameFont.android.kt\nandroidx/compose/ui/text/font/DeviceFontFamilyName\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,136:1\n1#2:137\n*E\n"})
@dd.h
public final class C2320q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f104638a;

    public /* synthetic */ C2320q(String str) {
        this.f104638a = str;
    }

    public static final /* synthetic */ C2320q a(String str) {
        return new C2320q(str);
    }

    @NotNull
    public static String b(@NotNull String str) {
        if (str.length() > 0) {
            return str;
        }
        throw new IllegalArgumentException("name may not be empty");
    }

    public static boolean c(String str, Object obj) {
        return (obj instanceof C2320q) && kotlin.jvm.internal.G.g(str, ((C2320q) obj).f104638a);
    }

    public static final boolean d(String str, String str2) {
        return kotlin.jvm.internal.G.g(str, str2);
    }

    public static int f(String str) {
        return str.hashCode();
    }

    public static String g(String str) {
        return "DeviceFontFamilyName(name=" + str + ')';
    }

    @NotNull
    public final String e() {
        return this.f104638a;
    }

    public boolean equals(Object obj) {
        return c(this.f104638a, obj);
    }

    public final /* synthetic */ String h() {
        return this.f104638a;
    }

    public int hashCode() {
        return this.f104638a.hashCode();
    }

    public String toString() {
        return g(this.f104638a);
    }
}
