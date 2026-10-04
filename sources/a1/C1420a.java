package a1;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.C2507z0;
import androidx.core.view.M0;
import e.T;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: a1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C1420a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f84473c = "TREAT_AS_VIEW_TREE_APPEARING";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f84474d = "TREAT_AS_VIEW_TREE_APPEARED";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f84475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f84476b;

    /* JADX INFO: renamed from: a1.a$a, reason: collision with other inner class name */
    @T(23)
    public static class C0158a {
        public static Bundle a(ViewStructure viewStructure) {
            return viewStructure.getExtras();
        }
    }

    /* JADX INFO: renamed from: a1.a$b */
    @T(29)
    public static class b {
        public static AutofillId a(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j10) {
            return contentCaptureSession.newAutofillId(autofillId, j10);
        }

        public static ViewStructure b(ContentCaptureSession contentCaptureSession, View view) {
            return contentCaptureSession.newViewStructure(view);
        }

        public static ViewStructure c(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j10) {
            return contentCaptureSession.newVirtualViewStructure(autofillId, j10);
        }

        public static void d(ContentCaptureSession contentCaptureSession, ViewStructure viewStructure) {
            contentCaptureSession.notifyViewAppeared(viewStructure);
        }

        public static void e(ContentCaptureSession contentCaptureSession, AutofillId autofillId, CharSequence charSequence) {
            contentCaptureSession.notifyViewTextChanged(autofillId, charSequence);
        }

        public static void f(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long[] jArr) {
            contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
        }
    }

    /* JADX INFO: renamed from: a1.a$c */
    @T(34)
    public static class c {
        public static void a(ContentCaptureSession contentCaptureSession, List<ViewStructure> list) {
            contentCaptureSession.notifyViewsAppeared(list);
        }
    }

    @T(29)
    public C1420a(@NonNull ContentCaptureSession contentCaptureSession, @NonNull View view) {
        this.f84475a = contentCaptureSession;
        this.f84476b = view;
    }

    @NonNull
    @T(29)
    public static C1420a g(@NonNull ContentCaptureSession contentCaptureSession, @NonNull View view) {
        return new C1420a(contentCaptureSession, view);
    }

    @Nullable
    public AutofillId a(long j10) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        ContentCaptureSession contentCaptureSessionA = Y.c.a(this.f84475a);
        Z0.a aVarM = C2507z0.M(this.f84476b);
        Objects.requireNonNull(aVarM);
        return b.a(contentCaptureSessionA, aVarM.a(), j10);
    }

    @Nullable
    public M0 b(@NonNull AutofillId autofillId, long j10) {
        if (Build.VERSION.SDK_INT >= 29) {
            return new M0(b.c(Y.c.a(this.f84475a), autofillId, j10));
        }
        return null;
    }

    public void c(@NonNull AutofillId autofillId, @Nullable CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.e(Y.c.a(this.f84475a), autofillId, charSequence);
        }
    }

    public void d(@NonNull List<ViewStructure> list) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            c.a(Y.c.a(this.f84475a), list);
            return;
        }
        if (i10 >= 29) {
            ViewStructure viewStructureB = b.b(Y.c.a(this.f84475a), this.f84476b);
            viewStructureB.getExtras().putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
            b.d(Y.c.a(this.f84475a), viewStructureB);
            for (int i11 = 0; i11 < list.size(); i11++) {
                b.d(Y.c.a(this.f84475a), list.get(i11));
            }
            ViewStructure viewStructureB2 = b.b(Y.c.a(this.f84475a), this.f84476b);
            viewStructureB2.getExtras().putBoolean("TREAT_AS_VIEW_TREE_APPEARED", true);
            b.d(Y.c.a(this.f84475a), viewStructureB2);
        }
    }

    public void e(@NonNull long[] jArr) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            ContentCaptureSession contentCaptureSessionA = Y.c.a(this.f84475a);
            Z0.a aVarM = C2507z0.M(this.f84476b);
            Objects.requireNonNull(aVarM);
            b.f(contentCaptureSessionA, aVarM.a(), jArr);
            return;
        }
        if (i10 >= 29) {
            ViewStructure viewStructureB = b.b(Y.c.a(this.f84475a), this.f84476b);
            viewStructureB.getExtras().putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
            b.d(Y.c.a(this.f84475a), viewStructureB);
            ContentCaptureSession contentCaptureSessionA2 = Y.c.a(this.f84475a);
            Z0.a aVarM2 = C2507z0.M(this.f84476b);
            Objects.requireNonNull(aVarM2);
            b.f(contentCaptureSessionA2, aVarM2.a(), jArr);
            ViewStructure viewStructureB2 = b.b(Y.c.a(this.f84475a), this.f84476b);
            viewStructureB2.getExtras().putBoolean("TREAT_AS_VIEW_TREE_APPEARED", true);
            b.d(Y.c.a(this.f84475a), viewStructureB2);
        }
    }

    @NonNull
    @T(29)
    public ContentCaptureSession f() {
        return Y.c.a(this.f84475a);
    }
}
