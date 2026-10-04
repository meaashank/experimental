package androidx.work;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.K;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes2.dex */
public interface j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SuppressLint({"SyntheticAccessor"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final b.c f120554a = new b.c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SuppressLint({"SyntheticAccessor"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final b.C0347b f120555b = new b.C0347b();

    public static abstract class b {

        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Throwable f120556a;

            public a(@NonNull Throwable exception) {
                this.f120556a = exception;
            }

            @NonNull
            public Throwable a() {
                return this.f120556a;
            }

            @NonNull
            public String toString() {
                return String.format("FAILURE (%s)", this.f120556a.getMessage());
            }
        }

        /* JADX INFO: renamed from: androidx.work.j$b$b, reason: collision with other inner class name */
        public static final class C0347b extends b {
            public C0347b() {
            }

            @NonNull
            public String toString() {
                return "IN_PROGRESS";
            }

            public C0347b(a aVar) {
            }
        }

        public static final class c extends b {
            public c() {
            }

            @NonNull
            public String toString() {
                return "SUCCESS";
            }

            public c(a aVar) {
            }
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public b() {
        }
    }

    @NonNull
    ListenableFuture<b.c> getResult();

    @NonNull
    K<b> getState();
}
