package Y;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import e.InterfaceC4345t;
import e.T;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f79088c = "TREAT_AS_VIEW_TREE_APPEARING";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f79089d = "TREAT_AS_VIEW_TREE_APPEARED";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f79090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f79091b;

    @T(23)
    public static class a {
        @InterfaceC4345t
        public static Bundle a(ViewStructure viewStructure) {
            return viewStructure.getExtras();
        }
    }

    @T(29)
    public static class b {
        @InterfaceC4345t
        public static AutofillId a(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j10) {
            return contentCaptureSession.newAutofillId(autofillId, j10);
        }

        @InterfaceC4345t
        public static ViewStructure b(ContentCaptureSession contentCaptureSession, View view) {
            return contentCaptureSession.newViewStructure(view);
        }

        @InterfaceC4345t
        public static ViewStructure c(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j10) {
            return contentCaptureSession.newVirtualViewStructure(autofillId, j10);
        }

        @InterfaceC4345t
        public static void d(ContentCaptureSession contentCaptureSession, ViewStructure viewStructure) {
            contentCaptureSession.notifyViewAppeared(viewStructure);
        }

        @InterfaceC4345t
        public static void e(ContentCaptureSession contentCaptureSession, AutofillId autofillId, CharSequence charSequence) {
            contentCaptureSession.notifyViewTextChanged(autofillId, charSequence);
        }

        @InterfaceC4345t
        public static void f(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long[] jArr) {
            contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
        }
    }

    @T(34)
    public static class c {
        @InterfaceC4345t
        public static void a(ContentCaptureSession contentCaptureSession, List<ViewStructure> list) {
            contentCaptureSession.notifyViewsAppeared(list);
        }
    }

    @T(29)
    public d(@NonNull ContentCaptureSession contentCaptureSession, @NonNull View view) {
        this.f79090a = contentCaptureSession;
        this.f79091b = view;
    }

    @NonNull
    @T(29)
    public static d g(@NonNull ContentCaptureSession contentCaptureSession, @NonNull View view) {
        return new d(contentCaptureSession, view);
    }

    @Nullable
    public AutofillId a(long j10) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        ContentCaptureSession contentCaptureSessionA = Y.c.a(this.f79090a);
        Y.b bVarA = e.a(this.f79091b);
        Objects.requireNonNull(bVarA);
        return b.a(contentCaptureSessionA, bVarA.a(), j10);
    }

    @Nullable
    public f b(@NonNull AutofillId autofillId, long j10) {
        if (Build.VERSION.SDK_INT >= 29) {
            return new f(b.c(Y.c.a(this.f79090a), autofillId, j10));
        }
        return null;
    }

    public void c(@NonNull AutofillId autofillId, @Nullable CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.e(Y.c.a(this.f79090a), autofillId, charSequence);
        }
    }

    public void d(@NonNull List<ViewStructure> list) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            c.a(Y.c.a(this.f79090a), list);
            return;
        }
        if (i10 >= 29) {
            ViewStructure viewStructureB = b.b(Y.c.a(this.f79090a), this.f79091b);
            a.a(viewStructureB).putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
            b.d(Y.c.a(this.f79090a), viewStructureB);
            for (int i11 = 0; i11 < list.size(); i11++) {
                b.d(Y.c.a(this.f79090a), list.get(i11));
            }
            ViewStructure viewStructureB2 = b.b(Y.c.a(this.f79090a), this.f79091b);
            a.a(viewStructureB2).putBoolean("TREAT_AS_VIEW_TREE_APPEARED", true);
            b.d(Y.c.a(this.f79090a), viewStructureB2);
        }
    }

    public void e(@NonNull long[] jArr) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            ContentCaptureSession contentCaptureSessionA = Y.c.a(this.f79090a);
            Y.b bVarA = e.a(this.f79091b);
            Objects.requireNonNull(bVarA);
            b.f(contentCaptureSessionA, bVarA.a(), jArr);
            return;
        }
        if (i10 >= 29) {
            ViewStructure viewStructureB = b.b(Y.c.a(this.f79090a), this.f79091b);
            a.a(viewStructureB).putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
            b.d(Y.c.a(this.f79090a), viewStructureB);
            ContentCaptureSession contentCaptureSessionA2 = Y.c.a(this.f79090a);
            Y.b bVarA2 = e.a(this.f79091b);
            Objects.requireNonNull(bVarA2);
            b.f(contentCaptureSessionA2, bVarA2.a(), jArr);
            ViewStructure viewStructureB2 = b.b(Y.c.a(this.f79090a), this.f79091b);
            a.a(viewStructureB2).putBoolean("TREAT_AS_VIEW_TREE_APPEARED", true);
            b.d(Y.c.a(this.f79090a), viewStructureB2);
        }
    }

    @NonNull
    @T(29)
    public ContentCaptureSession f() {
        return Y.c.a(this.f79090a);
    }
}
