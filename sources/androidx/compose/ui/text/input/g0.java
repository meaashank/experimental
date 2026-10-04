package androidx.compose.ui.text.input;

import androidx.compose.runtime.InterfaceC1924k0;
import androidx.compose.runtime.T1;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.L;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
public interface g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f104800a = a.f104801a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f104801a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final g0 f104802b = new f0();

        public static final e0 b(AnnotatedString annotatedString) {
            L.f104710a.getClass();
            return new e0(annotatedString, L.a.f104712b);
        }

        @T1
        public static /* synthetic */ void d() {
        }

        @NotNull
        public final g0 c() {
            return f104802b;
        }
    }

    @NotNull
    e0 a(@NotNull AnnotatedString annotatedString);
}
