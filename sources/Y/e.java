package Y;

import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import e.InterfaceC4345t;
import e.T;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f79092a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f79093b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f79094c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f79095d = 4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f79096e = 8;

    @T(26)
    public static class a {
        @InterfaceC4345t
        public static AutofillId a(View view) {
            return view.getAutofillId();
        }
    }

    @T(29)
    public static class b {
        @InterfaceC4345t
        public static ContentCaptureSession a(View view) {
            return view.getContentCaptureSession();
        }
    }

    @T(30)
    public static class c {
        @InterfaceC4345t
        public static void a(View view, int i10) {
            view.setImportantForContentCapture(i10);
        }
    }

    @Nullable
    public static Y.b a(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new Y.b(a.a(view));
        }
        return null;
    }

    @Nullable
    public static d b(@NonNull View view) {
        ContentCaptureSession contentCaptureSessionA;
        if (Build.VERSION.SDK_INT < 29 || (contentCaptureSessionA = b.a(view)) == null) {
            return null;
        }
        return new d(contentCaptureSessionA, view);
    }

    public static void c(@NonNull View view, int i10) {
        if (Build.VERSION.SDK_INT >= 30) {
            c.a(view, i10);
        }
    }
}
