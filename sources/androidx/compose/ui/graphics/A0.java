package androidx.compose.ui.graphics;

import android.graphics.Shader;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class A0 {

    public static final class a extends Y2 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Shader f100672e;

        public a(Shader shader) {
            this.f100672e = shader;
        }

        @Override // androidx.compose.ui.graphics.Y2
        @NotNull
        public Shader c(long j10) {
            return this.f100672e;
        }
    }

    @NotNull
    public static final Y2 a(@NotNull Shader shader) {
        return new a(shader);
    }
}
