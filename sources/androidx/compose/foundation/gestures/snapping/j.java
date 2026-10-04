package androidx.compose.foundation.gestures.snapping;

import androidx.compose.runtime.T1;
import androidx.compose.runtime.internal.r;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@T1
public interface j {

    @r(parameters = 1)
    public static final class a implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f90105a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f90106b = 0;

        @Override // androidx.compose.foundation.gestures.snapping.j
        public int a(int i10, int i11, int i12, int i13, int i14, int i15) {
            return (((i10 - i12) - i13) / 2) - (i11 / 2);
        }

        @NotNull
        public String toString() {
            return "Center";
        }
    }

    @r(parameters = 1)
    public static final class b implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f90107a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f90108b = 0;

        @Override // androidx.compose.foundation.gestures.snapping.j
        public int a(int i10, int i11, int i12, int i13, int i14, int i15) {
            return ((i10 - i12) - i13) - i11;
        }

        @NotNull
        public String toString() {
            return "End";
        }
    }

    @r(parameters = 1)
    public static final class c implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f90109a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f90110b = 0;

        @Override // androidx.compose.foundation.gestures.snapping.j
        public int a(int i10, int i11, int i12, int i13, int i14, int i15) {
            return 0;
        }

        @NotNull
        public String toString() {
            return "Start";
        }
    }

    int a(int i10, int i11, int i12, int i13, int i14, int i15);
}
