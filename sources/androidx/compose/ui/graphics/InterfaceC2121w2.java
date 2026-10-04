package androidx.compose.ui.graphics;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.w2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2121w2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f101782a = a.f101783a;

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.w2$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f101783a = new a();

        public static InterfaceC2121w2 d(a aVar, float[] fArr, float f10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                f10 = 0.0f;
            }
            aVar.getClass();
            return C2006b0.c(fArr, f10);
        }

        @NotNull
        public final InterfaceC2121w2 a(@NotNull InterfaceC2121w2 interfaceC2121w2, @NotNull InterfaceC2121w2 interfaceC2121w22) {
            return C2006b0.a(interfaceC2121w2, interfaceC2121w22);
        }

        @NotNull
        public final InterfaceC2121w2 b(float f10) {
            return C2006b0.b(f10);
        }

        @NotNull
        public final InterfaceC2121w2 c(@NotNull float[] fArr, float f10) {
            return C2006b0.c(fArr, f10);
        }

        @NotNull
        public final InterfaceC2121w2 e(@NotNull Path path, float f10, float f11, int i10) {
            return C2006b0.d(path, f10, f11, i10);
        }
    }
}
