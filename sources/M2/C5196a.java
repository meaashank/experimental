package m2;

import android.os.Build;
import android.os.ext.SdkExtensions;
import e.InterfaceC4345t;
import e.T;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: m2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5196a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C5196a f221087a = new C5196a();

    /* JADX INFO: renamed from: m2.a$a, reason: collision with other inner class name */
    @T(30)
    public static final class C0834a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C0834a f221088a = new C0834a();

        @InterfaceC4345t
        public final int a() {
            return SdkExtensions.getExtensionVersion(1000000);
        }
    }

    public final int a() {
        if (Build.VERSION.SDK_INT >= 30) {
            return C0834a.f221088a.a();
        }
        return 0;
    }
}
